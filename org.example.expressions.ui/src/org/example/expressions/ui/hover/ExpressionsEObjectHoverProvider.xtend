package org.example.expressions.ui.hover

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.example.expressions.expressions.AbstractElement
import org.example.expressions.interpreter.ExpressionsInterpreter
import org.example.expressions.typing.ExpressionsTypeProvider
import org.eclipse.emf.ecore.util.Diagnostician
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class ExpressionsEObjectHoverProvider extends DefaultEObjectHoverProvider {
	
	@Inject extension ExpressionsTypeProvider
	@Inject extension ExpressionsInterpreter

	override getHoverInfoAsHtml(EObject o) {
		if (o instanceof AbstractElement &&
				o.programHasNoError) {
			val elem = o as AbstractElement
			return '''
			<p>
			type  : <b>«elem.typeFor.toString»</b> <br>
			value : <b>«elem.interpret.toString»</b>
			</p>
			'''
		} else
			return super.getHoverInfoAsHtml(o)
	}

	def programHasNoError(EObject o) {
		Diagnostician::INSTANCE.validate(o.rootContainer).
			children.empty
	}
}