package org.example.expressions.ui.hover;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.interpreter.ExpressionsInterpreter;
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.ExpressionsTypeProvider;

@SuppressWarnings("all")
public class ExpressionsEObjectHoverProvider extends DefaultEObjectHoverProvider {
  @Inject
  @Extension
  private ExpressionsTypeProvider _expressionsTypeProvider;
  
  @Inject
  @Extension
  private ExpressionsInterpreter _expressionsInterpreter;
  
  public String getHoverInfoAsHtml(final EObject o) {
    boolean _and = false;
    if (!(o instanceof AbstractElement)) {
      _and = false;
    } else {
      boolean _programHasNoError = this.programHasNoError(o);
      _and = _programHasNoError;
    }
    if (_and) {
      final AbstractElement elem = ((AbstractElement) o);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>");
      _builder.newLine();
      _builder.append("type  : <b>");
      ExpressionsType _typeFor = this._expressionsTypeProvider.typeFor(elem);
      String _string = _typeFor.toString();
      _builder.append(_string, "");
      _builder.append("</b> <br>");
      _builder.newLineIfNotEmpty();
      _builder.append("value : <b>");
      Object _interpret = this._expressionsInterpreter.interpret(elem);
      String _string_1 = _interpret.toString();
      _builder.append(_string_1, "");
      _builder.append("</b>");
      _builder.newLineIfNotEmpty();
      _builder.append("</p>");
      _builder.newLine();
      return _builder.toString();
    } else {
      return super.getHoverInfoAsHtml(o);
    }
  }
  
  public boolean programHasNoError(final EObject o) {
    EObject _rootContainer = EcoreUtil.getRootContainer(o);
    Diagnostic _validate = Diagnostician.INSTANCE.validate(_rootContainer);
    List<Diagnostic> _children = _validate.getChildren();
    return _children.isEmpty();
  }
}
