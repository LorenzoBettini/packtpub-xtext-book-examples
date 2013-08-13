package org.example.smalljava.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJProgram;

/**
 * If you enable this strategy, the NamesAreUniqueValidator will not
 * work as expected.
 */
@Singleton
@SuppressWarnings("all")
public class SmallJavaResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xifexpression = false;
    if ((eObject instanceof SJProgram)) {
      boolean _xblockexpression = false;
      {
        EList<SJClass> _classes = ((SJProgram) eObject).getClasses();
        final Procedure1<SJClass> _function = new Procedure1<SJClass>() {
            public void apply(final SJClass sjClass) {
              final QualifiedName fullyQualifiedName = SmallJavaResourceDescriptionsStrategy.this._iQualifiedNameProvider.getFullyQualifiedName(sjClass);
              boolean _notEquals = (!Objects.equal(fullyQualifiedName, null));
              if (_notEquals) {
                IEObjectDescription _create = EObjectDescription.create(fullyQualifiedName, sjClass);
                acceptor.accept(_create);
              }
            }
          };
        IterableExtensions.<SJClass>forEach(_classes, _function);
        _xblockexpression = (true);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
}
