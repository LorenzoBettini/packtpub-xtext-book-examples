package org.example.entities.ui.tests;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.ui.AbstractEditorTest;
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil;
import org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.entities.EntitiesModelUtil;
import org.example.entities.entities.EntitiesFactory;
import org.example.entities.entities.Entity;
import org.example.entities.entities.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class EntitiesEditorTest extends AbstractEditorTest {
  private final String TEST_PROJECT = "mytestproject";
  
  protected String getEditorId() {
    return "org.example.entities.Entities";
  }
  
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
            JavaProjectSetupUtil.addSourceFolder(it, "entities-gen");
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
  
  public IFile createTestFile(final String contents) {
    try {
      return IResourcesSetupUtil.createFile((this.TEST_PROJECT + "/src/test.entities"), contents);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEntitiesEditor() {
    try {
      IFile _createTestFile = this.createTestFile("entity E {}");
      this.openEditor(_createTestFile);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEntitiesEditorContents() {
    try {
      IFile _createTestFile = this.createTestFile("entity E {}");
      XtextEditor _openEditor = this.openEditor(_createTestFile);
      IXtextDocument _document = _openEditor.getDocument();
      String _get = _document.get();
      Assert.assertEquals("entity E {}", _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEntitiesEditorContentsAsModel() {
    try {
      IFile _createTestFile = this.createTestFile("entity E {}");
      XtextEditor _openEditor = this.openEditor(_createTestFile);
      IXtextDocument _document = _openEditor.getDocument();
      final IUnitOfWork<Model, XtextResource> _function = new IUnitOfWork<Model, XtextResource>() {
        public Model exec(final XtextResource it) throws Exception {
          EList<EObject> _contents = it.getContents();
          EObject _get = _contents.get(0);
          return ((Model) _get);
        }
      };
      Model _readOnly = _document.<Model>readOnly(_function);
      EList<Entity> _entities = _readOnly.getEntities();
      Entity _get = _entities.get(0);
      String _name = _get.getName();
      Assert.assertEquals("E", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testChangeContents() {
    try {
      IFile _createTestFile = this.createTestFile("entity E {}");
      final XtextEditor editor = this.openEditor(_createTestFile);
      IXtextDocument _document = editor.getDocument();
      final IUnitOfWork<Boolean, XtextResource> _function = new IUnitOfWork<Boolean, XtextResource>() {
        public Boolean exec(final XtextResource it) throws Exception {
          boolean _xblockexpression = false;
          {
            EList<EObject> _contents = it.getContents();
            EObject _get = _contents.get(0);
            final Model model = ((Model) _get);
            EList<Entity> _entities = model.getEntities();
            final Entity currentEntity = _entities.get(0);
            EList<Entity> _entities_1 = model.getEntities();
            Entity _createEntity = EntitiesFactory.eINSTANCE.createEntity();
            final Procedure1<Entity> _function = new Procedure1<Entity>() {
              public void apply(final Entity it) {
                it.setName("Added");
                it.setSuperType(currentEntity);
              }
            };
            Entity _doubleArrow = ObjectExtensions.<Entity>operator_doubleArrow(_createEntity, _function);
            _xblockexpression = _entities_1.add(_doubleArrow);
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      _document.<Boolean>modify(_function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity E {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity Added extends E {");
      _builder.newLine();
      _builder.append("}");
      String _string = _builder.toString();
      IXtextDocument _document_1 = editor.getDocument();
      String _get = _document_1.get();
      Assert.assertEquals(_string, _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAddEntity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity E1 {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity E2 {}");
      IFile _createTestFile = this.createTestFile(_builder.toString());
      final XtextEditor editor = this.openEditor(_createTestFile);
      IXtextDocument _document = editor.getDocument();
      final IUnitOfWork<Entity, XtextResource> _function = new IUnitOfWork<Entity, XtextResource>() {
        public Entity exec(final XtextResource it) throws Exception {
          Entity _xblockexpression = null;
          {
            EList<EObject> _contents = it.getContents();
            EObject _get = _contents.get(0);
            EList<Entity> _entities = ((Model) _get).getEntities();
            final Entity currentEntity = _entities.get(0);
            _xblockexpression = EntitiesModelUtil.addEntityAfter(currentEntity, "Added");
          }
          return _xblockexpression;
        }
      };
      _document.<Entity>modify(_function);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("entity E1 {}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("entity Added {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("entity E2 {}");
      String _string = _builder_1.toString();
      IXtextDocument _document_1 = editor.getDocument();
      String _get = _document_1.get();
      Assert.assertEquals(_string, _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
