package org.example.expressions.typing;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.Variable;

@SuppressWarnings("all")
public class ExpressionsModelUtil {
  public static List<Variable> variablesDefinedBefore(final AbstractElement e) {
    List<Variable> _xblockexpression = null;
    {
      ExpressionsModel _containerOfType = EcoreUtil2.<ExpressionsModel>getContainerOfType(e, ExpressionsModel.class);
      final EList<AbstractElement> allElements = _containerOfType.getElements();
      final Function1<AbstractElement,Boolean> _function = new Function1<AbstractElement,Boolean>() {
          public Boolean apply(final AbstractElement it) {
            boolean _isAncestor = EcoreUtil.isAncestor(it, e);
            return Boolean.valueOf(_isAncestor);
          }
        };
      final AbstractElement containingElement = IterableExtensions.<AbstractElement>findFirst(allElements, _function);
      int _indexOf = allElements.indexOf(containingElement);
      List<AbstractElement> _subList = allElements.subList(0, _indexOf);
      List<Variable> _typeSelect = EcoreUtil2.<Variable>typeSelect(_subList, Variable.class);
      _xblockexpression = (_typeSelect);
    }
    return _xblockexpression;
  }
}
