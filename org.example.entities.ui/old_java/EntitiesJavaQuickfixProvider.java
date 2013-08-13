package org.example.entities.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.example.entities.entities.EntitiesFactory;
import org.example.entities.entities.Entity;
import org.example.entities.entities.Model;
import org.example.entities.validation.EntitiesValidator;

/**
 * This is the Java implementation of the quickfix provider, but the one
 * that is being used is the one implemented in Xtend (EntitiesQuickfixProvider)
 * 
 * @author Lorenzo Bettini
 *
 */
public class EntitiesJavaQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(EntitiesValidator.HIERARCHY_CICLE)
	public void removeSuperType(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			"Remove supertype", // label
			"Remove supertype '" + issue.getData()[0] + "'", // description
			"delete_obj.gif", // icon
			new ISemanticModification() {
				public void apply(EObject element, IModificationContext context) {
					((Entity) element).setSuperType(null);
				}
			}
		);
	}

	@Fix(Diagnostic.LINKING_DIAGNOSTIC)
	public void createMissingEntity(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			"Create missing entity", // label
			"Create missing entity", // description
			"Entity.gif", // icon
			new ISemanticModification() {
				public void apply(EObject element, IModificationContext context) throws BadLocationException {
					 IXtextDocument xtextDocument = context.getXtextDocument();
					 String missingEntityName = xtextDocument.get(issue.getOffset(), issue.getLength());
					 Entity newEntity = EntitiesFactory.eINSTANCE.createEntity();
					 newEntity.setName(missingEntityName);
					 Entity currentEntity = EcoreUtil2.getContainerOfType(element, Entity.class);
					 Model model = (Model) currentEntity.eContainer();
					 model.getEntities().add(model.getEntities().indexOf(currentEntity)+1, newEntity);
				}
			}
		);
	}

}
