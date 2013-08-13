package org.example.smalljava.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.smalljava.smallJava.SJAccessLevel;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.typing.SmallJavaTypeConformance;
import org.example.smalljava.util.SmallJavaModelUtil;

@SuppressWarnings("all")
public class SmallJavaAccessibility {
  @Inject
  @Extension
  private SmallJavaTypeConformance _smallJavaTypeConformance;
  
  public boolean isAccessibleFrom(final SJMember member, final EObject context) {
    boolean _xblockexpression = false;
    {
      final SJClass contextClass = SmallJavaModelUtil.containingClass(context);
      final SJClass memberClass = SmallJavaModelUtil.containingClass(member);
      boolean _switchResult = false;
      boolean _matched = false;
      if (!_matched) {
        boolean _equals = Objects.equal(contextClass, memberClass);
        if (_equals) {
          _matched=true;
          _switchResult = true;
        }
      }
      if (!_matched) {
        boolean _isSubclassOf = this._smallJavaTypeConformance.isSubclassOf(contextClass, memberClass);
        if (_isSubclassOf) {
          _matched=true;
          SJAccessLevel _access = member.getAccess();
          boolean _notEquals = (!Objects.equal(_access, SJAccessLevel.PRIVATE));
          _switchResult = _notEquals;
        }
      }
      if (!_matched) {
        SJAccessLevel _access_1 = member.getAccess();
        boolean _equals_1 = Objects.equal(_access_1, SJAccessLevel.PUBLIC);
        _switchResult = _equals_1;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
}
