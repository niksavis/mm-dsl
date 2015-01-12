/**
 */
package org.xtext.nv.dsl.mMDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Button Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#getButtonType()
 * @model
 * @generated
 */
public enum ButtonType implements Enumerator
{
  /**
   * The '<em><b>Ok</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OK_VALUE
   * @generated
   * @ordered
   */
  OK(0, "ok", "ok"),

  /**
   * The '<em><b>Okcancel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OKCANCEL_VALUE
   * @generated
   * @ordered
   */
  OKCANCEL(1, "okcancel", "ok-cancel"),

  /**
   * The '<em><b>Yesno</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YESNO_VALUE
   * @generated
   * @ordered
   */
  YESNO(2, "yesno", "yes-no"),

  /**
   * The '<em><b>Yesnocancel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YESNOCANCEL_VALUE
   * @generated
   * @ordered
   */
  YESNOCANCEL(3, "yesnocancel", "yes-no-cancel"),

  /**
   * The '<em><b>Retrycancel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RETRYCANCEL_VALUE
   * @generated
   * @ordered
   */
  RETRYCANCEL(4, "retrycancel", "retry-cancel"),

  /**
   * The '<em><b>Defok</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFOK_VALUE
   * @generated
   * @ordered
   */
  DEFOK(5, "defok", "def-ok"),

  /**
   * The '<em><b>Defcancel</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFCANCEL_VALUE
   * @generated
   * @ordered
   */
  DEFCANCEL(6, "defcancel", "def-cancel"),

  /**
   * The '<em><b>Defyes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFYES_VALUE
   * @generated
   * @ordered
   */
  DEFYES(7, "defyes", "def-yes"),

  /**
   * The '<em><b>Defno</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFNO_VALUE
   * @generated
   * @ordered
   */
  DEFNO(8, "defno", "def-no"),

  /**
   * The '<em><b>Defretry</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEFRETRY_VALUE
   * @generated
   * @ordered
   */
  DEFRETRY(9, "defretry", "def-retry");

  /**
   * The '<em><b>Ok</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ok</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OK
   * @model name="ok"
   * @generated
   * @ordered
   */
  public static final int OK_VALUE = 0;

  /**
   * The '<em><b>Okcancel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Okcancel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OKCANCEL
   * @model name="okcancel" literal="ok-cancel"
   * @generated
   * @ordered
   */
  public static final int OKCANCEL_VALUE = 1;

  /**
   * The '<em><b>Yesno</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Yesno</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YESNO
   * @model name="yesno" literal="yes-no"
   * @generated
   * @ordered
   */
  public static final int YESNO_VALUE = 2;

  /**
   * The '<em><b>Yesnocancel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Yesnocancel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YESNOCANCEL
   * @model name="yesnocancel" literal="yes-no-cancel"
   * @generated
   * @ordered
   */
  public static final int YESNOCANCEL_VALUE = 3;

  /**
   * The '<em><b>Retrycancel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Retrycancel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RETRYCANCEL
   * @model name="retrycancel" literal="retry-cancel"
   * @generated
   * @ordered
   */
  public static final int RETRYCANCEL_VALUE = 4;

  /**
   * The '<em><b>Defok</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Defok</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFOK
   * @model name="defok" literal="def-ok"
   * @generated
   * @ordered
   */
  public static final int DEFOK_VALUE = 5;

  /**
   * The '<em><b>Defcancel</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Defcancel</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFCANCEL
   * @model name="defcancel" literal="def-cancel"
   * @generated
   * @ordered
   */
  public static final int DEFCANCEL_VALUE = 6;

  /**
   * The '<em><b>Defyes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Defyes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFYES
   * @model name="defyes" literal="def-yes"
   * @generated
   * @ordered
   */
  public static final int DEFYES_VALUE = 7;

  /**
   * The '<em><b>Defno</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Defno</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFNO
   * @model name="defno" literal="def-no"
   * @generated
   * @ordered
   */
  public static final int DEFNO_VALUE = 8;

  /**
   * The '<em><b>Defretry</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Defretry</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFRETRY
   * @model name="defretry" literal="def-retry"
   * @generated
   * @ordered
   */
  public static final int DEFRETRY_VALUE = 9;

  /**
   * An array of all the '<em><b>Button Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ButtonType[] VALUES_ARRAY =
    new ButtonType[]
    {
      OK,
      OKCANCEL,
      YESNO,
      YESNOCANCEL,
      RETRYCANCEL,
      DEFOK,
      DEFCANCEL,
      DEFYES,
      DEFNO,
      DEFRETRY,
    };

  /**
   * A public read-only list of all the '<em><b>Button Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ButtonType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Button Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ButtonType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ButtonType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Button Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ButtonType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ButtonType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Button Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ButtonType get(int value)
  {
    switch (value)
    {
      case OK_VALUE: return OK;
      case OKCANCEL_VALUE: return OKCANCEL;
      case YESNO_VALUE: return YESNO;
      case YESNOCANCEL_VALUE: return YESNOCANCEL;
      case RETRYCANCEL_VALUE: return RETRYCANCEL;
      case DEFOK_VALUE: return DEFOK;
      case DEFCANCEL_VALUE: return DEFCANCEL;
      case DEFYES_VALUE: return DEFYES;
      case DEFNO_VALUE: return DEFNO;
      case DEFRETRY_VALUE: return DEFRETRY;
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
  private ButtonType(int value, String name, String literal)
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
  
} //ButtonType
