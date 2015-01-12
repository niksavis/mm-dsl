/**
 */
package org.xtext.nv.dsl.mMDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getEventName()
 * @model
 * @generated
 */
public enum EventName implements Enumerator
{
  /**
   * The '<em><b>Beforecreatemodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORECREATEMODEL_VALUE
   * @generated
   * @ordered
   */
  BEFORECREATEMODEL(0, "beforecreatemodel", "BeforeCreateModel"),

  /**
   * The '<em><b>Beforecreaterelationinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORECREATERELATIONINSTANCE_VALUE
   * @generated
   * @ordered
   */
  BEFORECREATERELATIONINSTANCE(1, "beforecreaterelationinstance", "BeforeCreateRelationInstance"),

  /**
   * The '<em><b>Beforedeleteinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFOREDELETEINSTANCE_VALUE
   * @generated
   * @ordered
   */
  BEFOREDELETEINSTANCE(2, "beforedeleteinstance", "BeforeDeleteInstance"),

  /**
   * The '<em><b>Beforedeletemodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFOREDELETEMODEL_VALUE
   * @generated
   * @ordered
   */
  BEFOREDELETEMODEL(3, "beforedeletemodel", "BeforeDeleteModel"),

  /**
   * The '<em><b>Beforediscardmodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFOREDISCARDMODEL_VALUE
   * @generated
   * @ordered
   */
  BEFOREDISCARDMODEL(4, "beforediscardmodel", "BeforeDiscardModel"),

  /**
   * The '<em><b>Beforesavemodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEFORESAVEMODEL_VALUE
   * @generated
   * @ordered
   */
  BEFORESAVEMODEL(5, "beforesavemodel", "BeforeSaveModel"),

  /**
   * The '<em><b>Createinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CREATEINSTANCE_VALUE
   * @generated
   * @ordered
   */
  CREATEINSTANCE(6, "createinstance", "CreateInstance"),

  /**
   * The '<em><b>Createmodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CREATEMODEL_VALUE
   * @generated
   * @ordered
   */
  CREATEMODEL(7, "createmodel", "CreateModel"),

  /**
   * The '<em><b>Createrelationinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CREATERELATIONINSTANCE_VALUE
   * @generated
   * @ordered
   */
  CREATERELATIONINSTANCE(8, "createrelationinstance", "CreateRelationInstance"),

  /**
   * The '<em><b>Deleteinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELETEINSTANCE_VALUE
   * @generated
   * @ordered
   */
  DELETEINSTANCE(9, "deleteinstance", "DeleteInstance"),

  /**
   * The '<em><b>Deletemodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELETEMODEL_VALUE
   * @generated
   * @ordered
   */
  DELETEMODEL(10, "deletemodel", "DeleteModel"),

  /**
   * The '<em><b>Deleterelationinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELETERELATIONINSTANCE_VALUE
   * @generated
   * @ordered
   */
  DELETERELATIONINSTANCE(11, "deleterelationinstance", "DeleteRelationInstance"),

  /**
   * The '<em><b>Discardinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISCARDINSTANCE_VALUE
   * @generated
   * @ordered
   */
  DISCARDINSTANCE(12, "discardinstance", "DiscardInstance"),

  /**
   * The '<em><b>Discardmodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISCARDMODEL_VALUE
   * @generated
   * @ordered
   */
  DISCARDMODEL(13, "discardmodel", "DiscardModel"),

  /**
   * The '<em><b>Openmodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OPENMODEL_VALUE
   * @generated
   * @ordered
   */
  OPENMODEL(14, "openmodel", "OpenModel"),

  /**
   * The '<em><b>Renameinstance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RENAMEINSTANCE_VALUE
   * @generated
   * @ordered
   */
  RENAMEINSTANCE(15, "renameinstance", "RenameInstance"),

  /**
   * The '<em><b>Savemodel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAVEMODEL_VALUE
   * @generated
   * @ordered
   */
  SAVEMODEL(16, "savemodel", "SaveModel"),

  /**
   * The '<em><b>Setattributevalue</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SETATTRIBUTEVALUE_VALUE
   * @generated
   * @ordered
   */
  SETATTRIBUTEVALUE(17, "setattributevalue", "SetAttributeValue"),

  /**
   * The '<em><b>Aftercreatemodelingconnector</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AFTERCREATEMODELINGCONNECTOR_VALUE
   * @generated
   * @ordered
   */
  AFTERCREATEMODELINGCONNECTOR(18, "aftercreatemodelingconnector", "AfterCreateModelingConnector"),

  /**
   * The '<em><b>Aftercreatemodelingnode</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AFTERCREATEMODELINGNODE_VALUE
   * @generated
   * @ordered
   */
  AFTERCREATEMODELINGNODE(19, "aftercreatemodelingnode", "AfterCreateModelingNode"),

  /**
   * The '<em><b>Aftereditattributevalue</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AFTEREDITATTRIBUTEVALUE_VALUE
   * @generated
   * @ordered
   */
  AFTEREDITATTRIBUTEVALUE(20, "aftereditattributevalue", "AfterEditAttributeValue"),

  /**
   * The '<em><b>Toolinitialized</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOOLINITIALIZED_VALUE
   * @generated
   * @ordered
   */
  TOOLINITIALIZED(21, "toolinitialized", "ToolInitialized");

  /**
   * The '<em><b>Beforecreatemodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beforecreatemodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFORECREATEMODEL
   * @model name="beforecreatemodel" literal="BeforeCreateModel"
   * @generated
   * @ordered
   */
  public static final int BEFORECREATEMODEL_VALUE = 0;

  /**
   * The '<em><b>Beforecreaterelationinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beforecreaterelationinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFORECREATERELATIONINSTANCE
   * @model name="beforecreaterelationinstance" literal="BeforeCreateRelationInstance"
   * @generated
   * @ordered
   */
  public static final int BEFORECREATERELATIONINSTANCE_VALUE = 1;

  /**
   * The '<em><b>Beforedeleteinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beforedeleteinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFOREDELETEINSTANCE
   * @model name="beforedeleteinstance" literal="BeforeDeleteInstance"
   * @generated
   * @ordered
   */
  public static final int BEFOREDELETEINSTANCE_VALUE = 2;

  /**
   * The '<em><b>Beforedeletemodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beforedeletemodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFOREDELETEMODEL
   * @model name="beforedeletemodel" literal="BeforeDeleteModel"
   * @generated
   * @ordered
   */
  public static final int BEFOREDELETEMODEL_VALUE = 3;

  /**
   * The '<em><b>Beforediscardmodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beforediscardmodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFOREDISCARDMODEL
   * @model name="beforediscardmodel" literal="BeforeDiscardModel"
   * @generated
   * @ordered
   */
  public static final int BEFOREDISCARDMODEL_VALUE = 4;

  /**
   * The '<em><b>Beforesavemodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beforesavemodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEFORESAVEMODEL
   * @model name="beforesavemodel" literal="BeforeSaveModel"
   * @generated
   * @ordered
   */
  public static final int BEFORESAVEMODEL_VALUE = 5;

  /**
   * The '<em><b>Createinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Createinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CREATEINSTANCE
   * @model name="createinstance" literal="CreateInstance"
   * @generated
   * @ordered
   */
  public static final int CREATEINSTANCE_VALUE = 6;

  /**
   * The '<em><b>Createmodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Createmodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CREATEMODEL
   * @model name="createmodel" literal="CreateModel"
   * @generated
   * @ordered
   */
  public static final int CREATEMODEL_VALUE = 7;

  /**
   * The '<em><b>Createrelationinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Createrelationinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CREATERELATIONINSTANCE
   * @model name="createrelationinstance" literal="CreateRelationInstance"
   * @generated
   * @ordered
   */
  public static final int CREATERELATIONINSTANCE_VALUE = 8;

  /**
   * The '<em><b>Deleteinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deleteinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELETEINSTANCE
   * @model name="deleteinstance" literal="DeleteInstance"
   * @generated
   * @ordered
   */
  public static final int DELETEINSTANCE_VALUE = 9;

  /**
   * The '<em><b>Deletemodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deletemodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELETEMODEL
   * @model name="deletemodel" literal="DeleteModel"
   * @generated
   * @ordered
   */
  public static final int DELETEMODEL_VALUE = 10;

  /**
   * The '<em><b>Deleterelationinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deleterelationinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELETERELATIONINSTANCE
   * @model name="deleterelationinstance" literal="DeleteRelationInstance"
   * @generated
   * @ordered
   */
  public static final int DELETERELATIONINSTANCE_VALUE = 11;

  /**
   * The '<em><b>Discardinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Discardinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISCARDINSTANCE
   * @model name="discardinstance" literal="DiscardInstance"
   * @generated
   * @ordered
   */
  public static final int DISCARDINSTANCE_VALUE = 12;

  /**
   * The '<em><b>Discardmodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Discardmodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISCARDMODEL
   * @model name="discardmodel" literal="DiscardModel"
   * @generated
   * @ordered
   */
  public static final int DISCARDMODEL_VALUE = 13;

  /**
   * The '<em><b>Openmodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Openmodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OPENMODEL
   * @model name="openmodel" literal="OpenModel"
   * @generated
   * @ordered
   */
  public static final int OPENMODEL_VALUE = 14;

  /**
   * The '<em><b>Renameinstance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Renameinstance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RENAMEINSTANCE
   * @model name="renameinstance" literal="RenameInstance"
   * @generated
   * @ordered
   */
  public static final int RENAMEINSTANCE_VALUE = 15;

  /**
   * The '<em><b>Savemodel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Savemodel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAVEMODEL
   * @model name="savemodel" literal="SaveModel"
   * @generated
   * @ordered
   */
  public static final int SAVEMODEL_VALUE = 16;

  /**
   * The '<em><b>Setattributevalue</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Setattributevalue</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SETATTRIBUTEVALUE
   * @model name="setattributevalue" literal="SetAttributeValue"
   * @generated
   * @ordered
   */
  public static final int SETATTRIBUTEVALUE_VALUE = 17;

  /**
   * The '<em><b>Aftercreatemodelingconnector</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Aftercreatemodelingconnector</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AFTERCREATEMODELINGCONNECTOR
   * @model name="aftercreatemodelingconnector" literal="AfterCreateModelingConnector"
   * @generated
   * @ordered
   */
  public static final int AFTERCREATEMODELINGCONNECTOR_VALUE = 18;

  /**
   * The '<em><b>Aftercreatemodelingnode</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Aftercreatemodelingnode</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AFTERCREATEMODELINGNODE
   * @model name="aftercreatemodelingnode" literal="AfterCreateModelingNode"
   * @generated
   * @ordered
   */
  public static final int AFTERCREATEMODELINGNODE_VALUE = 19;

  /**
   * The '<em><b>Aftereditattributevalue</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Aftereditattributevalue</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AFTEREDITATTRIBUTEVALUE
   * @model name="aftereditattributevalue" literal="AfterEditAttributeValue"
   * @generated
   * @ordered
   */
  public static final int AFTEREDITATTRIBUTEVALUE_VALUE = 20;

  /**
   * The '<em><b>Toolinitialized</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Toolinitialized</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOOLINITIALIZED
   * @model name="toolinitialized" literal="ToolInitialized"
   * @generated
   * @ordered
   */
  public static final int TOOLINITIALIZED_VALUE = 21;

  /**
   * An array of all the '<em><b>Event Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EventName[] VALUES_ARRAY =
    new EventName[]
    {
      BEFORECREATEMODEL,
      BEFORECREATERELATIONINSTANCE,
      BEFOREDELETEINSTANCE,
      BEFOREDELETEMODEL,
      BEFOREDISCARDMODEL,
      BEFORESAVEMODEL,
      CREATEINSTANCE,
      CREATEMODEL,
      CREATERELATIONINSTANCE,
      DELETEINSTANCE,
      DELETEMODEL,
      DELETERELATIONINSTANCE,
      DISCARDINSTANCE,
      DISCARDMODEL,
      OPENMODEL,
      RENAMEINSTANCE,
      SAVEMODEL,
      SETATTRIBUTEVALUE,
      AFTERCREATEMODELINGCONNECTOR,
      AFTERCREATEMODELINGNODE,
      AFTEREDITATTRIBUTEVALUE,
      TOOLINITIALIZED,
    };

  /**
   * A public read-only list of all the '<em><b>Event Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EventName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Event Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EventName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EventName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Event Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EventName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EventName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Event Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EventName get(int value)
  {
    switch (value)
    {
      case BEFORECREATEMODEL_VALUE: return BEFORECREATEMODEL;
      case BEFORECREATERELATIONINSTANCE_VALUE: return BEFORECREATERELATIONINSTANCE;
      case BEFOREDELETEINSTANCE_VALUE: return BEFOREDELETEINSTANCE;
      case BEFOREDELETEMODEL_VALUE: return BEFOREDELETEMODEL;
      case BEFOREDISCARDMODEL_VALUE: return BEFOREDISCARDMODEL;
      case BEFORESAVEMODEL_VALUE: return BEFORESAVEMODEL;
      case CREATEINSTANCE_VALUE: return CREATEINSTANCE;
      case CREATEMODEL_VALUE: return CREATEMODEL;
      case CREATERELATIONINSTANCE_VALUE: return CREATERELATIONINSTANCE;
      case DELETEINSTANCE_VALUE: return DELETEINSTANCE;
      case DELETEMODEL_VALUE: return DELETEMODEL;
      case DELETERELATIONINSTANCE_VALUE: return DELETERELATIONINSTANCE;
      case DISCARDINSTANCE_VALUE: return DISCARDINSTANCE;
      case DISCARDMODEL_VALUE: return DISCARDMODEL;
      case OPENMODEL_VALUE: return OPENMODEL;
      case RENAMEINSTANCE_VALUE: return RENAMEINSTANCE;
      case SAVEMODEL_VALUE: return SAVEMODEL;
      case SETATTRIBUTEVALUE_VALUE: return SETATTRIBUTEVALUE;
      case AFTERCREATEMODELINGCONNECTOR_VALUE: return AFTERCREATEMODELINGCONNECTOR;
      case AFTERCREATEMODELINGNODE_VALUE: return AFTERCREATEMODELINGNODE;
      case AFTEREDITATTRIBUTEVALUE_VALUE: return AFTEREDITATTRIBUTEVALUE;
      case TOOLINITIALIZED_VALUE: return TOOLINITIALIZED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EventName(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EventName
