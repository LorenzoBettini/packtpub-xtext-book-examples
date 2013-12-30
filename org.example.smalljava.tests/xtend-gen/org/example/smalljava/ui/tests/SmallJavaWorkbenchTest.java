package org.example.smalljava.ui.tests;

import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.ui.AbstractWorkbenchTest;
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil;
import org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class SmallJavaWorkbenchTest extends AbstractWorkbenchTest {
  private final String TEST_PROJECT = "mytestproject";
  
  @Before
  public void setUp() {
    try {
      super.setUp();
      this.createJavaProjectWithXtextNature();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void createJavaProjectWithXtextNature() {
    try {
      IJavaProject _createJavaProject = JavaProjectSetupUtil.createJavaProject(this.TEST_PROJECT);
      final Procedure1<IJavaProject> _function = new Procedure1<IJavaProject>() {
        public void apply(final IJavaProject it) {
          try {
            IProject _project = it.getProject();
            IResourcesSetupUtil.addNature(_project, XtextProjectHelper.NATURE_ID);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      ObjectExtensions.<IJavaProject>operator_doubleArrow(_createJavaProject, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void checkSmallJavaPrograms(final String program1, final String program2, final int expectedErrors) {
    try {
      String _plus = (this.TEST_PROJECT + "/src/test1.smalljava");
      final IFile file1 = IResourcesSetupUtil.createFile(_plus, program1);
      String _plus_1 = (this.TEST_PROJECT + "/src/test2.smalljava");
      final IFile file2 = IResourcesSetupUtil.createFile(_plus_1, program2);
      IResourcesSetupUtil.waitForAutoBuild();
      IMarker[] _findMarkers = file1.findMarkers(EValidator.MARKER, true, 
        IResource.DEPTH_INFINITE);
      int _size = ((List<IMarker>)Conversions.doWrapArray(_findMarkers)).size();
      Assert.assertEquals(expectedErrors, _size);
      IMarker[] _findMarkers_1 = file2.findMarkers(EValidator.MARKER, true, 
        IResource.DEPTH_INFINITE);
      int _size_1 = ((List<IMarker>)Conversions.doWrapArray(_findMarkers_1)).size();
      Assert.assertEquals(expectedErrors, _size_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidPrograms() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.pack;");
    _builder.newLine();
    _builder.append("class C {}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.pack;");
    _builder_1.newLine();
    _builder_1.append("class D {}");
    _builder_1.newLine();
    this.checkSmallJavaPrograms(_builder.toString(), _builder_1.toString(), 0);
  }
  
  @Test
  public void testNotValidPrograms() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package my.pack;");
    _builder.newLine();
    _builder.append("class D {}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.pack;");
    _builder_1.newLine();
    _builder_1.append("class D {}");
    _builder_1.newLine();
    this.checkSmallJavaPrograms(_builder.toString(), _builder_1.toString(), 1);
  }
}
