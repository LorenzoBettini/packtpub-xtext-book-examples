package org.example.entities.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.example.entities.EntitiesModelUtil;
import org.example.entities.entities.Attribute;
import org.example.entities.entities.Entity;
import org.example.entities.validation.EntitiesValidator;

@SuppressWarnings("all")
public class EntitiesQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(EntitiesValidator.HIERARCHY_CYCLE)
  public void removeSuperType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Remove supertype \'");
    String[] _data = issue.getData();
    String _get = _data[0];
    _builder.append(_get, "");
    _builder.append("\' ");
    final ISemanticModification _function = new ISemanticModification() {
      @Override
      public void apply(final EObject element, final IModificationContext context) throws Exception {
        ((Entity) element).setSuperType(null);
      }
    };
    acceptor.accept(issue, 
      "Remove supertype", _builder.toString(), 
      "delete_obj.gif", _function);
  }
  
  @Fix(Diagnostic.LINKING_DIAGNOSTIC)
  public void createMissingEntity(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = new ISemanticModification() {
      @Override
      public void apply(final EObject element, final IModificationContext context) throws Exception {
        Entity _containerOfType = EcoreUtil2.<Entity>getContainerOfType(element, Entity.class);
        IXtextDocument _xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
        EntitiesModelUtil.addEntityAfter(_containerOfType, _get);
      }
    };
    acceptor.accept(issue, 
      "Create missing entity", 
      "Create missing entity", 
      "Entity.gif", _function);
  }
  
  @Fix(EntitiesValidator.INVALID_ENTITY_NAME)
  public void capitalizeEntityNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Capitalize first letter of \'" + _get);
    String _plus_1 = (_plus + "\'");
    final IModification _function = new IModification() {
      @Override
      public void apply(final IModificationContext context) throws Exception {
        final IXtextDocument xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        final String firstLetter = xtextDocument.get((_offset).intValue(), 1);
        Integer _offset_1 = issue.getOffset();
        String _firstUpper = StringExtensions.toFirstUpper(firstLetter);
        xtextDocument.replace((_offset_1).intValue(), 1, _firstUpper);
      }
    };
    acceptor.accept(issue, 
      "Capitalize first letter", _plus_1, 
      "Entity.gif", _function);
  }
  
  @Fix(EntitiesValidator.INVALID_ATTRIBUTE_NAME)
  public void uncapitalizeAttributeNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    String _plus = ("Uncapitalize first letter of \'" + _get);
    String _plus_1 = (_plus + "\'");
    final ISemanticModification _function = new ISemanticModification() {
      @Override
      public void apply(final EObject element, final IModificationContext context) throws Exception {
        String[] _data = issue.getData();
        String _get = _data[0];
        String _firstLower = StringExtensions.toFirstLower(_get);
        ((Attribute) element).setName(_firstLower);
      }
    };
    acceptor.accept(issue, 
      "Uncapitalize first letter", _plus_1, 
      "Attribute.gif", _function);
  }
}
