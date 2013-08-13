/**
 */
package org.example.smalljava.smallJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.smalljava.smallJava.SJAccessLevel;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SmallJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SJ Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJMemberImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJMemberImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJMemberImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SJMemberImpl extends MinimalEObjectImpl.Container implements SJMember
{
  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final SJAccessLevel ACCESS_EDEFAULT = SJAccessLevel.PRIVATE;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected SJAccessLevel access = ACCESS_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected SJClass type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SJMemberImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmallJavaPackage.Literals.SJ_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJAccessLevel getAccess()
  {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(SJAccessLevel newAccess)
  {
    SJAccessLevel oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_MEMBER__ACCESS, oldAccess, access));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJClass getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (SJClass)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallJavaPackage.SJ_MEMBER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJClass basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(SJClass newType)
  {
    SJClass oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_MEMBER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_MEMBER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmallJavaPackage.SJ_MEMBER__ACCESS:
        return getAccess();
      case SmallJavaPackage.SJ_MEMBER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SmallJavaPackage.SJ_MEMBER__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmallJavaPackage.SJ_MEMBER__ACCESS:
        setAccess((SJAccessLevel)newValue);
        return;
      case SmallJavaPackage.SJ_MEMBER__TYPE:
        setType((SJClass)newValue);
        return;
      case SmallJavaPackage.SJ_MEMBER__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmallJavaPackage.SJ_MEMBER__ACCESS:
        setAccess(ACCESS_EDEFAULT);
        return;
      case SmallJavaPackage.SJ_MEMBER__TYPE:
        setType((SJClass)null);
        return;
      case SmallJavaPackage.SJ_MEMBER__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmallJavaPackage.SJ_MEMBER__ACCESS:
        return access != ACCESS_EDEFAULT;
      case SmallJavaPackage.SJ_MEMBER__TYPE:
        return type != null;
      case SmallJavaPackage.SJ_MEMBER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (access: ");
    result.append(access);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SJMemberImpl
