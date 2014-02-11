package org.example.swtbot.smalljava.tests;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.*;
import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SmallJavaProjectWizardTests {

	protected static final String TEST_PROJECT = "MyTestProject";
	protected static SWTWorkbenchBot bot;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		try {
			bot.viewByTitle("Welcome").close();
		} catch (WidgetNotFoundException e) {
			// OK, no Welcome view, that's fine :)
		}

		// Change the perspective via the Open Perspective dialog
		bot.menu("Window").menu("Open Perspective").menu("Other...").click();
		SWTBotShell openPerspectiveShell = bot.shell("Open Perspective");
		openPerspectiveShell.activate();

		// select the dialog
		bot.table().select("Plug-in Development");
		bot.button("OK").click();

		// in SwtBot 2.2.0 we must use viewByPartName instead of viewByTitle
		bot.viewByPartName("Error Log").close();
		bot.viewByPartName("Problems").show();
	}

	@AfterClass
	public static void afterClass() {
		bot.resetWorkbench();
	}
	
	@After
	public void runAfterEveryTest() throws CoreException {
		cleanWorkspace();
		waitForAutoBuild();
	}

	@Test
	public void canCreateANewSmallJavaProject() throws Exception {
		createProjectAndAssertNoErrorMarker("SmallJava Project");
	}

	@Test
	public void testDuplicateClassError() throws CoreException {
		createProjectAndAssertNoErrorMarker("SmallJava Project");
		SWTBotEditor editor = bot.editorByTitle("example.smalljava");
		editor.toTextEditor().setText(
				"package smalljava.lang;\nclass Object {}"
		);
		editor.save();
		waitForAutoBuild();
		assertErrorsInProject(1);
	}

	protected void disableBuildAutomatically() {
		clickOnBuildAutomatically(false);
	}

	protected void enableBuildAutomatically() {
		clickOnBuildAutomatically(true);
	}

	private void clickOnBuildAutomatically(boolean shouldBeEnabled) {
		if (buildAutomaticallyMenu().isChecked() == shouldBeEnabled)
			return;
		// see http://www.eclipse.org/forums/index.php/mv/msg/165852/#msg_525521
		// for the reason why we need to specify 1
		buildAutomaticallyMenu().click();
		assertEquals(shouldBeEnabled, buildAutomaticallyMenu().isChecked());
	}

	private SWTBotMenu buildAutomaticallyMenu() {
		return bot.menu("Project", 1).menu("Build Automatically");
	}

	protected boolean isProjectCreated(String name) {
		try {
			getProjectTreeItem(name);
			return true;
		} catch (WidgetNotFoundException e) {
			return false;
		}
	}

	protected static SWTBotTree getProjectTree() {
		SWTBotView packageExplorer = getPackageExplorer();
		SWTBotTree tree = packageExplorer.bot().tree();
		return tree;
	}

	protected static SWTBotView getPackageExplorer() {
		SWTBotView view = bot.viewByTitle("Package Explorer");
		return view;
	}

	protected SWTBotTreeItem getProjectTreeItem(String myTestProject) {
		return getProjectTree().getTreeItem(myTestProject);
	}

	protected void assertErrorsInProject(int numOfErrors) throws CoreException {
		IMarker[] markers = root().findMarkers(IMarker.PROBLEM, true,
				IResource.DEPTH_INFINITE);
		List<IMarker> errorMarkers = new LinkedList<IMarker>();
		for (int i = 0; i < markers.length; i++) {
			IMarker iMarker = markers[i];
			if (iMarker.getAttribute(IMarker.SEVERITY).toString()
					.equals("" + IMarker.SEVERITY_ERROR)) {
				errorMarkers.add(iMarker);
			}
		}
		assertEquals(
				"error markers: " + printMarkers(errorMarkers), numOfErrors,
				errorMarkers.size());
	}

	private String printMarkers(List<IMarker> errorMarkers) {
		StringBuffer buffer = new StringBuffer();
		for (IMarker iMarker : errorMarkers) {
			try {
				buffer.append(iMarker.getAttribute(IMarker.MESSAGE) + "\n");
				buffer.append(iMarker.getAttribute(IMarker.SEVERITY) + "\n");
			} catch (CoreException e) {
			}
		}
		return buffer.toString();
	}

	protected void createProjectAndAssertNoErrorMarker(String projectType)
			throws CoreException {
		bot.menu("File").menu("New").menu("Project...").click();

		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		bot.tree().expandNode("Xtext").select(projectType);
		bot.button("Next >").click();

		bot.textWithLabel("Project name:").setText(TEST_PROJECT);

		bot.button("Finish").click();

		// creation of a project might require some time
		bot.waitUntil(shellCloses(shell), 50000);
		assertTrue("Project doesn't exist", isProjectCreated(TEST_PROJECT));

		waitForAutoBuild();
		assertErrorsInProject(0);
	}

}