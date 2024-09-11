/**
 * generated by Xtext 2.36.0
 */
package org.xtext.example.term_project.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.term_project.Condition;
import org.xtext.example.term_project.RunStatement;
import org.xtext.example.term_project.SimulateStatement;
import org.xtext.example.term_project.Term_projectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulate Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.term_project.impl.SimulateStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.term_project.impl.SimulateStatementImpl#getRuns <em>Runs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulateStatementImpl extends MinimalEObjectImpl.Container implements SimulateStatement
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

  /**
   * The cached value of the '{@link #getRuns() <em>Runs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuns()
   * @generated
   * @ordered
   */
  protected EList<RunStatement> runs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimulateStatementImpl()
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
    return Term_projectPackage.Literals.SIMULATE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Term_projectPackage.SIMULATE_STATEMENT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Term_projectPackage.SIMULATE_STATEMENT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Term_projectPackage.SIMULATE_STATEMENT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Term_projectPackage.SIMULATE_STATEMENT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RunStatement> getRuns()
  {
    if (runs == null)
    {
      runs = new EObjectContainmentEList<RunStatement>(RunStatement.class, this, Term_projectPackage.SIMULATE_STATEMENT__RUNS);
    }
    return runs;
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
      case Term_projectPackage.SIMULATE_STATEMENT__CONDITION:
        return basicSetCondition(null, msgs);
      case Term_projectPackage.SIMULATE_STATEMENT__RUNS:
        return ((InternalEList<?>)getRuns()).basicRemove(otherEnd, msgs);
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
      case Term_projectPackage.SIMULATE_STATEMENT__CONDITION:
        return getCondition();
      case Term_projectPackage.SIMULATE_STATEMENT__RUNS:
        return getRuns();
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
      case Term_projectPackage.SIMULATE_STATEMENT__CONDITION:
        setCondition((Condition)newValue);
        return;
      case Term_projectPackage.SIMULATE_STATEMENT__RUNS:
        getRuns().clear();
        getRuns().addAll((Collection<? extends RunStatement>)newValue);
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
      case Term_projectPackage.SIMULATE_STATEMENT__CONDITION:
        setCondition((Condition)null);
        return;
      case Term_projectPackage.SIMULATE_STATEMENT__RUNS:
        getRuns().clear();
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
      case Term_projectPackage.SIMULATE_STATEMENT__CONDITION:
        return condition != null;
      case Term_projectPackage.SIMULATE_STATEMENT__RUNS:
        return runs != null && !runs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimulateStatementImpl
