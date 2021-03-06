/**
 */
package com.euclideanspace.xgener.gen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Inner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.xgener.gen.PrimaryInner#getPrimarytyp <em>Primarytyp</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.PrimaryInner#getConstruct <em>Construct</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.PrimaryInner#getConstruct2 <em>Construct2</em>}</li>
 *   <li>{@link com.euclideanspace.xgener.gen.PrimaryInner#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.xgener.gen.GenPackage#getPrimaryInner()
 * @model
 * @generated
 */
public interface PrimaryInner extends EObject
{
  /**
   * Returns the value of the '<em><b>Primarytyp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primarytyp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primarytyp</em>' attribute.
   * @see #setPrimarytyp(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrimaryInner_Primarytyp()
   * @model
   * @generated
   */
  String getPrimarytyp();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.PrimaryInner#getPrimarytyp <em>Primarytyp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primarytyp</em>' attribute.
   * @see #getPrimarytyp()
   * @generated
   */
  void setPrimarytyp(String value);

  /**
   * Returns the value of the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Construct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Construct</em>' attribute.
   * @see #setConstruct(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrimaryInner_Construct()
   * @model
   * @generated
   */
  String getConstruct();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.PrimaryInner#getConstruct <em>Construct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Construct</em>' attribute.
   * @see #getConstruct()
   * @generated
   */
  void setConstruct(String value);

  /**
   * Returns the value of the '<em><b>Construct2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Construct2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Construct2</em>' attribute.
   * @see #setConstruct2(String)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrimaryInner_Construct2()
   * @model
   * @generated
   */
  String getConstruct2();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.PrimaryInner#getConstruct2 <em>Construct2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Construct2</em>' attribute.
   * @see #getConstruct2()
   * @generated
   */
  void setConstruct2(String value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(MultString)
   * @see com.euclideanspace.xgener.gen.GenPackage#getPrimaryInner_Feature()
   * @model containment="true"
   * @generated
   */
  MultString getFeature();

  /**
   * Sets the value of the '{@link com.euclideanspace.xgener.gen.PrimaryInner#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(MultString value);

} // PrimaryInner
