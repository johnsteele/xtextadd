/**
 */
package com.euclideanspace.xgener.gen.impl;

import com.euclideanspace.xgener.gen.GenPackage;
import com.euclideanspace.xgener.gen.MultString;
import com.euclideanspace.xgener.gen.PrimaryInner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Inner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl#getPrimarytyp <em>Primarytyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl#getConstruct <em>Construct</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl#getConstruct2 <em>Construct2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.impl.PrimaryInnerImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryInnerImpl extends MinimalEObjectImpl.Container implements PrimaryInner
{
  /**
   * The default value of the '{@link #getPrimarytyp() <em>Primarytyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimarytyp()
   * @generated
   * @ordered
   */
  protected static final String PRIMARYTYP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimarytyp() <em>Primarytyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimarytyp()
   * @generated
   * @ordered
   */
  protected String primarytyp = PRIMARYTYP_EDEFAULT;

  /**
   * The default value of the '{@link #getConstruct() <em>Construct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstruct()
   * @generated
   * @ordered
   */
  protected static final String CONSTRUCT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstruct() <em>Construct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstruct()
   * @generated
   * @ordered
   */
  protected String construct = CONSTRUCT_EDEFAULT;

  /**
   * The default value of the '{@link #getConstruct2() <em>Construct2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstruct2()
   * @generated
   * @ordered
   */
  protected static final String CONSTRUCT2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstruct2() <em>Construct2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstruct2()
   * @generated
   * @ordered
   */
  protected String construct2 = CONSTRUCT2_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected MultString feature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryInnerImpl()
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
    return GenPackage.Literals.PRIMARY_INNER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimarytyp()
  {
    return primarytyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimarytyp(String newPrimarytyp)
  {
    String oldPrimarytyp = primarytyp;
    primarytyp = newPrimarytyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRIMARY_INNER__PRIMARYTYP, oldPrimarytyp, primarytyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstruct()
  {
    return construct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstruct(String newConstruct)
  {
    String oldConstruct = construct;
    construct = newConstruct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRIMARY_INNER__CONSTRUCT, oldConstruct, construct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstruct2()
  {
    return construct2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstruct2(String newConstruct2)
  {
    String oldConstruct2 = construct2;
    construct2 = newConstruct2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRIMARY_INNER__CONSTRUCT2, oldConstruct2, construct2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultString getFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeature(MultString newFeature, NotificationChain msgs)
  {
    MultString oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenPackage.PRIMARY_INNER__FEATURE, oldFeature, newFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(MultString newFeature)
  {
    if (newFeature != feature)
    {
      NotificationChain msgs = null;
      if (feature != null)
        msgs = ((InternalEObject)feature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRIMARY_INNER__FEATURE, null, msgs);
      if (newFeature != null)
        msgs = ((InternalEObject)newFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenPackage.PRIMARY_INNER__FEATURE, null, msgs);
      msgs = basicSetFeature(newFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenPackage.PRIMARY_INNER__FEATURE, newFeature, newFeature));
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
      case GenPackage.PRIMARY_INNER__FEATURE:
        return basicSetFeature(null, msgs);
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
      case GenPackage.PRIMARY_INNER__PRIMARYTYP:
        return getPrimarytyp();
      case GenPackage.PRIMARY_INNER__CONSTRUCT:
        return getConstruct();
      case GenPackage.PRIMARY_INNER__CONSTRUCT2:
        return getConstruct2();
      case GenPackage.PRIMARY_INNER__FEATURE:
        return getFeature();
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
      case GenPackage.PRIMARY_INNER__PRIMARYTYP:
        setPrimarytyp((String)newValue);
        return;
      case GenPackage.PRIMARY_INNER__CONSTRUCT:
        setConstruct((String)newValue);
        return;
      case GenPackage.PRIMARY_INNER__CONSTRUCT2:
        setConstruct2((String)newValue);
        return;
      case GenPackage.PRIMARY_INNER__FEATURE:
        setFeature((MultString)newValue);
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
      case GenPackage.PRIMARY_INNER__PRIMARYTYP:
        setPrimarytyp(PRIMARYTYP_EDEFAULT);
        return;
      case GenPackage.PRIMARY_INNER__CONSTRUCT:
        setConstruct(CONSTRUCT_EDEFAULT);
        return;
      case GenPackage.PRIMARY_INNER__CONSTRUCT2:
        setConstruct2(CONSTRUCT2_EDEFAULT);
        return;
      case GenPackage.PRIMARY_INNER__FEATURE:
        setFeature((MultString)null);
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
      case GenPackage.PRIMARY_INNER__PRIMARYTYP:
        return PRIMARYTYP_EDEFAULT == null ? primarytyp != null : !PRIMARYTYP_EDEFAULT.equals(primarytyp);
      case GenPackage.PRIMARY_INNER__CONSTRUCT:
        return CONSTRUCT_EDEFAULT == null ? construct != null : !CONSTRUCT_EDEFAULT.equals(construct);
      case GenPackage.PRIMARY_INNER__CONSTRUCT2:
        return CONSTRUCT2_EDEFAULT == null ? construct2 != null : !CONSTRUCT2_EDEFAULT.equals(construct2);
      case GenPackage.PRIMARY_INNER__FEATURE:
        return feature != null;
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
    result.append(" (primarytyp: ");
    result.append(primarytyp);
    result.append(", construct: ");
    result.append(construct);
    result.append(", construct2: ");
    result.append(construct2);
    result.append(')');
    return result.toString();
  }

} //PrimaryInnerImpl
