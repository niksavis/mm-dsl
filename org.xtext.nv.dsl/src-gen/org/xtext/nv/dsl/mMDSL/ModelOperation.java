/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelcreate <em>Modelcreate</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldelete <em>Modeldelete</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldiscard <em>Modeldiscard</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelsave <em>Modelsave</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelload <em>Modelload</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelisloaded <em>Modelisloaded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelOperation()
 * @model
 * @generated
 */
public interface ModelOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Modelcreate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelcreate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelcreate</em>' containment reference.
   * @see #setModelcreate(ModelCreate)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelOperation_Modelcreate()
   * @model containment="true"
   * @generated
   */
  ModelCreate getModelcreate();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelcreate <em>Modelcreate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modelcreate</em>' containment reference.
   * @see #getModelcreate()
   * @generated
   */
  void setModelcreate(ModelCreate value);

  /**
   * Returns the value of the '<em><b>Modeldelete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modeldelete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modeldelete</em>' containment reference.
   * @see #setModeldelete(ModelDelete)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelOperation_Modeldelete()
   * @model containment="true"
   * @generated
   */
  ModelDelete getModeldelete();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldelete <em>Modeldelete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modeldelete</em>' containment reference.
   * @see #getModeldelete()
   * @generated
   */
  void setModeldelete(ModelDelete value);

  /**
   * Returns the value of the '<em><b>Modeldiscard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modeldiscard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modeldiscard</em>' containment reference.
   * @see #setModeldiscard(ModelDiscard)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelOperation_Modeldiscard()
   * @model containment="true"
   * @generated
   */
  ModelDiscard getModeldiscard();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldiscard <em>Modeldiscard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modeldiscard</em>' containment reference.
   * @see #getModeldiscard()
   * @generated
   */
  void setModeldiscard(ModelDiscard value);

  /**
   * Returns the value of the '<em><b>Modelsave</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelsave</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelsave</em>' containment reference.
   * @see #setModelsave(ModelSave)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelOperation_Modelsave()
   * @model containment="true"
   * @generated
   */
  ModelSave getModelsave();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelsave <em>Modelsave</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modelsave</em>' containment reference.
   * @see #getModelsave()
   * @generated
   */
  void setModelsave(ModelSave value);

  /**
   * Returns the value of the '<em><b>Modelload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelload</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelload</em>' containment reference.
   * @see #setModelload(ModelLoad)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelOperation_Modelload()
   * @model containment="true"
   * @generated
   */
  ModelLoad getModelload();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelload <em>Modelload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modelload</em>' containment reference.
   * @see #getModelload()
   * @generated
   */
  void setModelload(ModelLoad value);

  /**
   * Returns the value of the '<em><b>Modelisloaded</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelisloaded</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelisloaded</em>' containment reference.
   * @see #setModelisloaded(ModelIsLoaded)
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getModelOperation_Modelisloaded()
   * @model containment="true"
   * @generated
   */
  ModelIsLoaded getModelisloaded();

  /**
   * Sets the value of the '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelisloaded <em>Modelisloaded</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modelisloaded</em>' containment reference.
   * @see #getModelisloaded()
   * @generated
   */
  void setModelisloaded(ModelIsLoaded value);

} // ModelOperation
