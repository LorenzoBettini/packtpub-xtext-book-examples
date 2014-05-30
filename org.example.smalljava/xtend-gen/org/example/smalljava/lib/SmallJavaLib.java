package org.example.smalljava.lib;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.smalljava.scoping.SmallJavaIndex;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.util.SmallJavaModelUtil;

@SuppressWarnings("all")
public class SmallJavaLib {
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private SmallJavaIndex _smallJavaIndex;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public final static String LIB_PACKAGE = "smalljava.lang";
  
  public final static String LIB_OBJECT = (SmallJavaLib.LIB_PACKAGE + ".Object");
  
  public final static String LIB_STRING = (SmallJavaLib.LIB_PACKAGE + ".String");
  
  public final static String LIB_INTEGER = (SmallJavaLib.LIB_PACKAGE + ".Integer");
  
  public final static String LIB_BOOLEAN = (SmallJavaLib.LIB_PACKAGE + ".Boolean");
  
  public final static String MAIN_LIB = "smalljava/lang/mainlib.smalljava";
  
  public ResourceSet loadLib() {
    ResourceSet _xblockexpression = null;
    {
      Class<? extends SmallJavaLib> _class = this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      final InputStream stream = _classLoader.getResourceAsStream(SmallJavaLib.MAIN_LIB);
      ResourceSet _get = this.resourceSetProvider.get();
      final Procedure1<ResourceSet> _function = new Procedure1<ResourceSet>() {
        public void apply(final ResourceSet resourceSet) {
          try {
            URI _createURI = URI.createURI(SmallJavaLib.MAIN_LIB);
            final Resource resource = resourceSet.createResource(_createURI);
            Map<Object, Object> _loadOptions = resourceSet.getLoadOptions();
            resource.load(stream, _loadOptions);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      _xblockexpression = ObjectExtensions.<ResourceSet>operator_doubleArrow(_get, _function);
    }
    return _xblockexpression;
  }
  
  public ArrayList<SJClass> getClassHierarchyWithObject(final SJClass c) {
    ArrayList<SJClass> _xblockexpression = null;
    {
      ArrayList<SJClass> hierarchy = SmallJavaModelUtil.classHierarchy(c);
      SJClass _last = IterableExtensions.<SJClass>last(hierarchy);
      QualifiedName _fullyQualifiedName = null;
      if (_last!=null) {
        _fullyQualifiedName=this._iQualifiedNameProvider.getFullyQualifiedName(_last);
      }
      String _string = null;
      if (_fullyQualifiedName!=null) {
        _string=_fullyQualifiedName.toString();
      }
      boolean _notEquals = (!Objects.equal(_string, SmallJavaLib.LIB_OBJECT));
      if (_notEquals) {
        final SJClass smallJavaObjectClass = this.getSmallJavaObjectClass(c);
        boolean _notEquals_1 = (!Objects.equal(smallJavaObjectClass, null));
        if (_notEquals_1) {
          hierarchy.add(smallJavaObjectClass);
        }
      }
      _xblockexpression = hierarchy;
    }
    return _xblockexpression;
  }
  
  public SJClass getSuperclassOrObject(final SJClass c) {
    SJClass _elvis = null;
    SJClass _superclass = c.getSuperclass();
    if (_superclass != null) {
      _elvis = _superclass;
    } else {
      SJClass _smallJavaObjectClass = this.getSmallJavaObjectClass(c);
      _elvis = _smallJavaObjectClass;
    }
    return _elvis;
  }
  
  public SJClass getSmallJavaObjectClass(final EObject context) {
    SJClass _xblockexpression = null;
    {
      Iterable<IEObjectDescription> _visibleClassesDescriptions = this._smallJavaIndex.getVisibleClassesDescriptions(context);
      final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
        public Boolean apply(final IEObjectDescription it) {
          QualifiedName _qualifiedName = it.getQualifiedName();
          String _string = _qualifiedName.toString();
          return Boolean.valueOf(Objects.equal(_string, SmallJavaLib.LIB_OBJECT));
        }
      };
      final IEObjectDescription desc = IterableExtensions.<IEObjectDescription>findFirst(_visibleClassesDescriptions, _function);
      boolean _equals = Objects.equal(desc, null);
      if (_equals) {
        return null;
      }
      EObject o = desc.getEObjectOrProxy();
      boolean _eIsProxy = o.eIsProxy();
      if (_eIsProxy) {
        Resource _eResource = context.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        URI _eObjectURI = desc.getEObjectURI();
        EObject _eObject = _resourceSet.getEObject(_eObjectURI, true);
        o = _eObject;
      }
      _xblockexpression = ((SJClass) o);
    }
    return _xblockexpression;
  }
}
