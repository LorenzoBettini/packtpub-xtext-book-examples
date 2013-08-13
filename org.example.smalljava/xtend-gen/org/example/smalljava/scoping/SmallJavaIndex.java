package org.example.smalljava.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.example.smalljava.smallJava.SmallJavaPackage;

@SuppressWarnings("all")
public class SmallJavaIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private Manager cm;
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o) {
    List<IContainer> _visibleContainers = this.getVisibleContainers(o);
    final Function1<IContainer,Iterable<IEObjectDescription>> _function = new Function1<IContainer,Iterable<IEObjectDescription>>() {
        public Iterable<IEObjectDescription> apply(final IContainer container) {
          Iterable<IEObjectDescription> _exportedObjects = container.getExportedObjects();
          return _exportedObjects;
        }
      };
    List<Iterable<IEObjectDescription>> _map = ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(_visibleContainers, _function);
    Iterable<IEObjectDescription> _flatten = Iterables.<IEObjectDescription>concat(_map);
    return _flatten;
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    List<IContainer> _visibleContainers = this.getVisibleContainers(o);
    final Function1<IContainer,Iterable<IEObjectDescription>> _function = new Function1<IContainer,Iterable<IEObjectDescription>>() {
        public Iterable<IEObjectDescription> apply(final IContainer container) {
          Iterable<IEObjectDescription> _exportedObjectsByType = container.getExportedObjectsByType(type);
          return _exportedObjectsByType;
        }
      };
    List<Iterable<IEObjectDescription>> _map = ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(_visibleContainers, _function);
    Iterable<IEObjectDescription> _flatten = Iterables.<IEObjectDescription>concat(_map);
    return _flatten;
  }
  
  public Iterable<IEObjectDescription> getVisibleClassesDescriptions(final EObject o) {
    EClass _sJClass = SmallJavaPackage.eINSTANCE.getSJClass();
    Iterable<IEObjectDescription> _visibleEObjectDescriptions = this.getVisibleEObjectDescriptions(o, _sJClass);
    return _visibleEObjectDescriptions;
  }
  
  public List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      final IResourceDescription rd = index.getResourceDescription(_uRI);
      List<IContainer> _xifexpression = null;
      boolean _notEquals = (!Objects.equal(rd, null));
      if (_notEquals) {
        List<IContainer> _visibleContainers = this.cm.getVisibleContainers(rd, index);
        _xifexpression = _visibleContainers;
      } else {
        List<IContainer> _emptyList = CollectionLiterals.<IContainer>emptyList();
        _xifexpression = _emptyList;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      IResourceDescription _resourceDescription = index.getResourceDescription(_uRI);
      _xblockexpression = (_resourceDescription);
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject o) {
    IResourceDescription _resourceDescription = this.getResourceDescription(o);
    Iterable<IEObjectDescription> _exportedObjects = _resourceDescription.getExportedObjects();
    return _exportedObjects;
  }
}
