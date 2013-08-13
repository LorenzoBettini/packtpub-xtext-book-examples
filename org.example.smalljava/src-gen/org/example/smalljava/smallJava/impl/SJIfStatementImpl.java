/**
 */
package org.example.smalljava.smallJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJIfBlock;
import org.example.smalljava.smallJava.SJIfStatement;
import org.example.smalljava.smallJava.SmallJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SJ If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJIfStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJIfStatementImpl#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link org.example.smalljava.smallJava.impl.SJIfStatementImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SJIfStatementImpl extends SJStatementImpl implements SJIfStatement
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected SJExpression expression;

  /**
   * The cached value of the '{@link #getThenBlock() <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBlock()
   * @generated
   * @ordered
   */
  protected SJIfBlock thenBlock;

  /**
   * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBlock()
   * @generated
   * @ordered
   */
  protected SJIfBlock elseBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SJIfStatementImpl()
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
    return SmallJavaPackage.Literals.SJ_IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(SJExpression newExpression, NotificationChain msgs)
  {
    SJExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(SJExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJIfBlock getThenBlock()
  {
    return thenBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenBlock(SJIfBlock newThenBlock, NotificationChain msgs)
  {
    SJIfBlock oldThenBlock = thenBlock;
    thenBlock = newThenBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK, oldThenBlock, newThenBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenBlock(SJIfBlock newThenBlock)
  {
    if (newThenBlock != thenBlock)
    {
      NotificationChain msgs = null;
      if (thenBlock != null)
        msgs = ((InternalEObject)thenBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK, null, msgs);
      if (newThenBlock != null)
        msgs = ((InternalEObject)newThenBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK, null, msgs);
      msgs = basicSetThenBlock(newThenBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK, newThenBlock, newThenBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJIfBlock getElseBlock()
  {
    return elseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBlock(SJIfBlock newElseBlock, NotificationChain msgs)
  {
    SJIfBlock oldElseBlock = elseBlock;
    elseBlock = newElseBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK, oldElseBlock, newElseBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBlock(SJIfBlock newElseBlock)
  {
    if (newElseBlock != elseBlock)
    {
      NotificationChain msgs = null;
      if (elseBlock != null)
        msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK, null, msgs);
      if (newElseBlock != null)
        msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK, null, msgs);
      msgs = basicSetElseBlock(newElseBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK, newElseBlock, newElseBlock));
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
      case SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK:
        return basicSetThenBlock(null, msgs);
      case SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK:
        return basicSetElseBlock(null, msgs);
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
      case SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION:
        return getExpression();
      case SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK:
        return getThenBlock();
      case SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK:
        return getElseBlock();
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
      case SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION:
        setExpression((SJExpression)newValue);
        return;
      case SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK:
        setThenBlock((SJIfBlock)newValue);
        return;
      case SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK:
        setElseBlock((SJIfBlock)newValue);
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
      case SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION:
        setExpression((SJExpression)null);
        return;
      case SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK:
        setThenBlock((SJIfBlock)null);
        return;
      case SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK:
        setElseBlock((SJIfBlock)null);
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
      case SmallJavaPackage.SJ_IF_STATEMENT__EXPRESSION:
        return expression != null;
      case SmallJavaPackage.SJ_IF_STATEMENT__THEN_BLOCK:
        return thenBlock != null;
      case SmallJavaPackage.SJ_IF_STATEMENT__ELSE_BLOCK:
        return elseBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //SJIfStatementImpl
