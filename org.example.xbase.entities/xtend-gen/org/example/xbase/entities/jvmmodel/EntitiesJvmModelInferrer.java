package org.example.xbase.entities.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.xbase.entities.entities.Attribute;
import org.example.xbase.entities.entities.Entity;
import org.example.xbase.entities.entities.Operation;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class EntitiesJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  protected void _infer(final Entity entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = entity.getName();
    String _plus = ("entities." + _name);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(entity, _plus);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        String _documentation = EntitiesJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(entity);
        EntitiesJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
        JvmParameterizedTypeReference _superType = entity.getSuperType();
        boolean _notEquals = (!Objects.equal(_superType, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _superType_1 = entity.getSuperType();
          JvmTypeReference _cloneWithProxies = EntitiesJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_superType_1);
          EntitiesJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
        }
        EList<Attribute> _attributes = entity.getAttributes();
        final Procedure1<Attribute> _function = new Procedure1<Attribute>() {
          public void apply(final Attribute a) {
            JvmTypeReference _elvis = null;
            JvmTypeReference _type = a.getType();
            if (_type != null) {
              _elvis = _type;
            } else {
              XExpression _initexpression = a.getInitexpression();
              JvmTypeReference _inferredType = null;
              if (_initexpression!=null) {
                _inferredType=EntitiesJvmModelInferrer.this._jvmTypesBuilder.inferredType(_initexpression);
              }
              _elvis = _inferredType;
            }
            final JvmTypeReference type = _elvis;
            EList<JvmMember> _members = it.getMembers();
            String _name = a.getName();
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                String _documentation = EntitiesJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(a);
                EntitiesJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                XExpression _initexpression = a.getInitexpression();
                boolean _notEquals = (!Objects.equal(_initexpression, null));
                if (_notEquals) {
                  XExpression _initexpression_1 = a.getInitexpression();
                  EntitiesJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _initexpression_1);
                }
              }
            };
            JvmField _field = EntitiesJvmModelInferrer.this._jvmTypesBuilder.toField(a, _name, type, _function);
            EntitiesJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
            EList<JvmMember> _members_1 = it.getMembers();
            String _name_1 = a.getName();
            JvmOperation _getter = EntitiesJvmModelInferrer.this._jvmTypesBuilder.toGetter(a, _name_1, type);
            EntitiesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
            EList<JvmMember> _members_2 = it.getMembers();
            String _name_2 = a.getName();
            JvmOperation _setter = EntitiesJvmModelInferrer.this._jvmTypesBuilder.toSetter(a, _name_2, type);
            EntitiesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _setter);
          }
        };
        IterableExtensions.<Attribute>forEach(_attributes, _function);
        EList<Operation> _operations = entity.getOperations();
        final Procedure1<Operation> _function_1 = new Procedure1<Operation>() {
          public void apply(final Operation op) {
            EList<JvmMember> _members = it.getMembers();
            String _name = op.getName();
            JvmTypeReference _elvis = null;
            JvmTypeReference _type = op.getType();
            if (_type != null) {
              _elvis = _type;
            } else {
              JvmTypeReference _inferredType = EntitiesJvmModelInferrer.this._jvmTypesBuilder.inferredType();
              _elvis = _inferredType;
            }
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                String _documentation = EntitiesJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(op);
                EntitiesJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                EList<JvmFormalParameter> _params = op.getParams();
                for (final JvmFormalParameter p : _params) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  String _name = p.getName();
                  JvmTypeReference _parameterType = p.getParameterType();
                  JvmFormalParameter _parameter = EntitiesJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                  EntitiesJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                }
                XExpression _body = op.getBody();
                EntitiesJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
              }
            };
            JvmOperation _method = EntitiesJvmModelInferrer.this._jvmTypesBuilder.toMethod(op, _name, _elvis, _function);
            EntitiesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          }
        };
        IterableExtensions.<Operation>forEach(_operations, _function_1);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeRef = EntitiesJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("return");
                _builder.newLine();
                _builder.append("\"entity ");
                String _name = entity.getName();
                _builder.append(_name, "");
                _builder.append(" {\\n\" +");
                _builder.newLineIfNotEmpty();
                {
                  EList<Attribute> _attributes = entity.getAttributes();
                  for(final Attribute a : _attributes) {
                    _builder.append("\t");
                    _builder.append("\"\\t");
                    String _name_1 = a.getName();
                    _builder.append(_name_1, "\t");
                    _builder.append(" = \" + ");
                    String _name_2 = a.getName();
                    _builder.append(_name_2, "\t");
                    _builder.append(".toString() + \"\\n\" +");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\"}\";");
                it.append(_builder);
              }
            };
            EntitiesJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
        JvmOperation _method = EntitiesJvmModelInferrer.this._jvmTypesBuilder.toMethod(entity, "toString", _typeRef, _function_2);
        EntitiesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  public void infer(final EObject entity, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (entity instanceof Entity) {
      _infer((Entity)entity, acceptor, isPreIndexingPhase);
      return;
    } else if (entity != null) {
      _infer(entity, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity, acceptor, isPreIndexingPhase).toString());
    }
  }
}
