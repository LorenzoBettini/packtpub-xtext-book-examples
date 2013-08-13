/**
 */
package org.example.smalljava.smallJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJMember;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SmallJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SJ Member Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJMemberSelectionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJMemberSelectionImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJMemberSelectionImpl#isMethodinvocation <em>Methodinvocation</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJMemberSelectionImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SJMemberSelectionImpl extends SJExpressionImpl implements SJMemberSelection
{
  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected SJExpression receiver;

  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected SJMember member;

  /**
   * The default value of the '{@link #isMethodinvocation() <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodinvocation()
   * @generated
   * @ordered
   */
  protected static final boolean METHODINVOCATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMethodinvocation() <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodinvocation()
   * @generated
   * @ordered
   */
  protected boolean methodinvocation = METHODINVOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<SJExpression> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SJMemberSelectionImpl()
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
    return SmallJavaPackage.Literals.SJ_MEMBER_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJExpression getReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReceiver(SJExpression newReceiver, NotificationChain msgs)
  {
    SJExpression oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER, oldReceiver, newReceiver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(SJExpression newReceiver)
  {
    if (newReceiver != receiver)
    {
      NotificationChain msgs = null;
      if (receiver != null)
        msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER, null, msgs);
      if (newReceiver != null)
        msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER, null, msgs);
      msgs = basicSetReceiver(newReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER, newReceiver, newReceiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMember getMember()
  {
    if (member != null && member.eIsProxy())
    {
      InternalEObject oldMember = (InternalEObject)member;
      member = (SJMember)eResolveProxy(oldMember);
      if (member != oldMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallJavaPackage.SJ_MEMBER_SELECTION__MEMBER, oldMember, member));
      }
    }
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJMember basicGetMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(SJMember newMember)
  {
    SJMember oldMember = member;
    member = newMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_MEMBER_SELECTION__MEMBER, oldMember, member));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMethodinvocation()
  {
    return methodinvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodinvocation(boolean newMethodinvocation)
  {
    boolean oldMethodinvocation = methodinvocation;
    methodinvocation = newMethodinvocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_MEMBER_SELECTION__METHODINVOCATION, oldMethodinvocation, methodinvocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SJExpression> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<SJExpression>(SJExpression.class, this, SmallJavaPackage.SJ_MEMBER_SELECTION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER:
        return basicSetReceiver(null, msgs);
      case SmallJavaPackage.SJ_MEMBER_SELECTION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER:
        return getReceiver();
      case SmallJavaPackage.SJ_MEMBER_SELECTION__MEMBER:
        if (resolve) return getMember();
        return basicGetMember();
      case SmallJavaPackage.SJ_MEMBER_SELECTION__METHODINVOCATION:
        return isMethodinvocation();
      case SmallJavaPackage.SJ_MEMBER_SELECTION__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER:
        setReceiver((SJExpression)newValue);
        return;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__MEMBER:
        setMember((SJMember)newValue);
        return;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__METHODINVOCATION:
        setMethodinvocation((Boolean)newValue);
        return;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends SJExpression>)newValue);
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
      case SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER:
        setReceiver((SJExpression)null);
        return;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__MEMBER:
        setMember((SJMember)null);
        return;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__METHODINVOCATION:
        setMethodinvocation(METHODINVOCATION_EDEFAULT);
        return;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__ARGS:
        getArgs().clear();
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
      case SmallJavaPackage.SJ_MEMBER_SELECTION__RECEIVER:
        return receiver != null;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__MEMBER:
        return member != null;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__METHODINVOCATION:
        return methodinvocation != METHODINVOCATION_EDEFAULT;
      case SmallJavaPackage.SJ_MEMBER_SELECTION__ARGS:
        return args != null && !args.isEmpty();
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
    result.append(" (methodinvocation: ");
    result.append(methodinvocation);
    result.append(')');
    return result.toString();
  }

} //SJMemberSelectionImpl
