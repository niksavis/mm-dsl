/**
 */
package org.xtext.nv.dsl.mMDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.nv.dsl.mMDSL.MMDSLFactory
 * @model kind="package"
 * @generated
 */
public interface MMDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mMDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/nv/dsl/MMDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mMDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MMDSLPackage eINSTANCE = org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RootImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Methodname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__METHODNAME = 0;

  /**
   * The feature id for the '<em><b>Includelibrarytype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__INCLUDELIBRARYTYPE = 1;

  /**
   * The feature id for the '<em><b>Embedplatformtype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__EMBEDPLATFORMTYPE = 2;

  /**
   * The feature id for the '<em><b>Embedcodetype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__EMBEDCODETYPE = 3;

  /**
   * The feature id for the '<em><b>Includelibrary</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__INCLUDELIBRARY = 4;

  /**
   * The feature id for the '<em><b>Embedcode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__EMBEDCODE = 5;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__METHOD = 6;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.MethodNameImpl <em>Method Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.MethodNameImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getMethodName()
   * @generated
   */
  int METHOD_NAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Method Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.IncludeLibraryImpl <em>Include Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.IncludeLibraryImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getIncludeLibrary()
   * @generated
   */
  int INCLUDE_LIBRARY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_LIBRARY__NAME = 0;

  /**
   * The feature id for the '<em><b>Includelibrarytype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_LIBRARY__INCLUDELIBRARYTYPE = 1;

  /**
   * The number of structural features of the '<em>Include Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_LIBRARY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.IncludeLibraryTypeImpl <em>Include Library Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.IncludeLibraryTypeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getIncludeLibraryType()
   * @generated
   */
  int INCLUDE_LIBRARY_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_LIBRARY_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Include Library Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_LIBRARY_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EmbedCodeImpl <em>Embed Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EmbedCodeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEmbedCode()
   * @generated
   */
  int EMBED_CODE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_CODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Embedplatformtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_CODE__EMBEDPLATFORMTYPE = 1;

  /**
   * The feature id for the '<em><b>Embedcodetype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_CODE__EMBEDCODETYPE = 2;

  /**
   * The feature id for the '<em><b>Embeddedcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_CODE__EMBEDDEDCODE = 3;

  /**
   * The number of structural features of the '<em>Embed Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_CODE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EmbedPlatformTypeImpl <em>Embed Platform Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EmbedPlatformTypeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEmbedPlatformType()
   * @generated
   */
  int EMBED_PLATFORM_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_PLATFORM_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Embed Platform Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_PLATFORM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EmbedCodeTypeImpl <em>Embed Code Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EmbedCodeTypeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEmbedCodeType()
   * @generated
   */
  int EMBED_CODE_TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_CODE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Embed Code Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_CODE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.InsertEmbedCodeImpl <em>Insert Embed Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.InsertEmbedCodeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getInsertEmbedCode()
   * @generated
   */
  int INSERT_EMBED_CODE = 7;

  /**
   * The feature id for the '<em><b>Codesnippetname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_EMBED_CODE__CODESNIPPETNAME = 0;

  /**
   * The number of structural features of the '<em>Insert Embed Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_EMBED_CODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.MethodImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 8;

  /**
   * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ENUMERATION = 0;

  /**
   * The feature id for the '<em><b>Symbolstyle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__SYMBOLSTYLE = 1;

  /**
   * The feature id for the '<em><b>Symbolclass</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__SYMBOLCLASS = 2;

  /**
   * The feature id for the '<em><b>Symbolrelation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__SYMBOLRELATION = 3;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__METAMODEL = 4;

  /**
   * The feature id for the '<em><b>Algorithm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ALGORITHM = 5;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__EVENT = 6;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EnumerationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Enumvalues</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ENUMVALUES = 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.MetamodelImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 10;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__CLASS = 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__RELATION = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Modeltype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__MODELTYPE = 3;

  /**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Parentclassname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PARENTCLASSNAME = 1;

  /**
   * The feature id for the '<em><b>Symbolclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SYMBOLCLASS = 2;

  /**
   * The feature id for the '<em><b>Classattribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CLASSATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Insertembedcode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INSERTEMBEDCODE = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__REFERENCE = 6;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RelationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parentrelationname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__PARENTRELATIONNAME = 1;

  /**
   * The feature id for the '<em><b>Symbolrelation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SYMBOLRELATION = 2;

  /**
   * The feature id for the '<em><b>Fromclassname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__FROMCLASSNAME = 3;

  /**
   * The feature id for the '<em><b>Toclassname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TOCLASSNAME = 4;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Insertembedcode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__INSERTEMBEDCODE = 6;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AttributeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ACCESS = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassAttributeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClassAttribute()
   * @generated
   */
  int CLASS_ATTRIBUTE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Class Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ReferenceImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Refname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REFNAME = 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RefNameImpl <em>Ref Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RefNameImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRefName()
   * @generated
   */
  int REF_NAME = 16;

  /**
   * The feature id for the '<em><b>Modeltypename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_NAME__MODELTYPENAME = 0;

  /**
   * The feature id for the '<em><b>Classname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_NAME__CLASSNAME = 1;

  /**
   * The number of structural features of the '<em>Ref Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.TypeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getType()
   * @generated
   */
  int TYPE = 17;

  /**
   * The feature id for the '<em><b>Simpletype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SIMPLETYPE = 0;

  /**
   * The feature id for the '<em><b>Enumtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ENUMTYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EnumTypeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Enum Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelTypeImpl <em>Model Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelTypeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelType()
   * @generated
   */
  int MODEL_TYPE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Classname</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__CLASSNAME = 1;

  /**
   * The feature id for the '<em><b>Relationname</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__RELATIONNAME = 2;

  /**
   * The feature id for the '<em><b>Modename</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__MODENAME = 3;

  /**
   * The number of structural features of the '<em>Model Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModeImpl <em>Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModeImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getMode()
   * @generated
   */
  int MODE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Classname</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__CLASSNAME = 1;

  /**
   * The feature id for the '<em><b>Relationname</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__RELATIONNAME = 2;

  /**
   * The number of structural features of the '<em>Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SymbolClassImpl <em>Symbol Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SymbolClassImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSymbolClass()
   * @generated
   */
  int SYMBOL_CLASS = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Globalstyle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_CLASS__GLOBALSTYLE = 1;

  /**
   * The feature id for the '<em><b>Svgcommand</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_CLASS__SVGCOMMAND = 2;

  /**
   * The number of structural features of the '<em>Symbol Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SymbolRelationImpl <em>Symbol Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SymbolRelationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSymbolRelation()
   * @generated
   */
  int SYMBOL_RELATION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Globalstyle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_RELATION__GLOBALSTYLE = 1;

  /**
   * The feature id for the '<em><b>Svgcommandsfrom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_RELATION__SVGCOMMANDSFROM = 2;

  /**
   * The feature id for the '<em><b>Svgcommandsmiddle</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_RELATION__SVGCOMMANDSMIDDLE = 3;

  /**
   * The feature id for the '<em><b>Svgcommandsto</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_RELATION__SVGCOMMANDSTO = 4;

  /**
   * The number of structural features of the '<em>Symbol Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_RELATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl <em>SVG Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SVGCommandImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSVGCommand()
   * @generated
   */
  int SVG_COMMAND = 23;

  /**
   * The feature id for the '<em><b>Insertembedcode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__INSERTEMBEDCODE = 0;

  /**
   * The feature id for the '<em><b>Rectangle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__RECTANGLE = 1;

  /**
   * The feature id for the '<em><b>Circle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__CIRCLE = 2;

  /**
   * The feature id for the '<em><b>Ellipse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__ELLIPSE = 3;

  /**
   * The feature id for the '<em><b>Line</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__LINE = 4;

  /**
   * The feature id for the '<em><b>Polyline</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__POLYLINE = 5;

  /**
   * The feature id for the '<em><b>Polygon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__POLYGON = 6;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__PATH = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__TEXT = 8;

  /**
   * The feature id for the '<em><b>Symbolstyle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__SYMBOLSTYLE = 9;

  /**
   * The feature id for the '<em><b>Symbolstyleref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND__SYMBOLSTYLEREF = 10;

  /**
   * The number of structural features of the '<em>SVG Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_COMMAND_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RectangleImpl <em>Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RectangleImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 24;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__Y = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__WIDTH = 2;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__HEIGHT = 3;

  /**
   * The number of structural features of the '<em>Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.CircleImpl <em>Circle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.CircleImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getCircle()
   * @generated
   */
  int CIRCLE = 25;

  /**
   * The feature id for the '<em><b>Cx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE__CX = 0;

  /**
   * The feature id for the '<em><b>Cy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE__CY = 1;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE__R = 2;

  /**
   * The number of structural features of the '<em>Circle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CIRCLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EllipseImpl <em>Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EllipseImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEllipse()
   * @generated
   */
  int ELLIPSE = 26;

  /**
   * The feature id for the '<em><b>Cx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__CX = 0;

  /**
   * The feature id for the '<em><b>Cy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__CY = 1;

  /**
   * The feature id for the '<em><b>Rx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__RX = 2;

  /**
   * The feature id for the '<em><b>Ry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__RY = 3;

  /**
   * The number of structural features of the '<em>Ellipse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.LineImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getLine()
   * @generated
   */
  int LINE = 27;

  /**
   * The feature id for the '<em><b>X1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__X1 = 0;

  /**
   * The feature id for the '<em><b>Y1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__Y1 = 1;

  /**
   * The feature id for the '<em><b>X2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__X2 = 2;

  /**
   * The feature id for the '<em><b>Y2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__Y2 = 3;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PolylineImpl <em>Polyline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PolylineImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPolyline()
   * @generated
   */
  int POLYLINE = 28;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE__POINTS = 0;

  /**
   * The number of structural features of the '<em>Polyline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYLINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PolygonImpl <em>Polygon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PolygonImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPolygon()
   * @generated
   */
  int POLYGON = 29;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__POINTS = 0;

  /**
   * The number of structural features of the '<em>Polygon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPath()
   * @generated
   */
  int PATH = 30;

  /**
   * The feature id for the '<em><b>Pathdata</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__PATHDATA = 0;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.TextImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getText()
   * @generated
   */
  int TEXT = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__VALUE = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__X = 1;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__Y = 2;

  /**
   * The feature id for the '<em><b>Fontfamily</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__FONTFAMILY = 3;

  /**
   * The feature id for the '<em><b>Fontsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__FONTSIZE = 4;

  /**
   * The feature id for the '<em><b>Fillcolor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__FILLCOLOR = 5;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathDataImpl <em>Path Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathDataImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPathData()
   * @generated
   */
  int PATH_DATA = 32;

  /**
   * The feature id for the '<em><b>Moveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__MOVETO = 0;

  /**
   * The feature id for the '<em><b>Lineto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__LINETO = 1;

  /**
   * The feature id for the '<em><b>Horizontallineto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__HORIZONTALLINETO = 2;

  /**
   * The feature id for the '<em><b>Verticallineto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__VERTICALLINETO = 3;

  /**
   * The feature id for the '<em><b>Curveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__CURVETO = 4;

  /**
   * The feature id for the '<em><b>Smoothcurveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__SMOOTHCURVETO = 5;

  /**
   * The feature id for the '<em><b>Quadraticbeziercurve</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__QUADRATICBEZIERCURVE = 6;

  /**
   * The feature id for the '<em><b>Smoothquadraticbeziercurveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__SMOOTHQUADRATICBEZIERCURVETO = 7;

  /**
   * The feature id for the '<em><b>Ellipticalarc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__ELLIPTICALARC = 8;

  /**
   * The feature id for the '<em><b>Closepath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA__CLOSEPATH = 9;

  /**
   * The number of structural features of the '<em>Path Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_DATA_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.MoveToImpl <em>Move To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.MoveToImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getMoveTo()
   * @generated
   */
  int MOVE_TO = 33;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_TO__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Move To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_TO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.LineToImpl <em>Line To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.LineToImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getLineTo()
   * @generated
   */
  int LINE_TO = 34;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_TO__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Line To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_TO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.HorizontalLineToImpl <em>Horizontal Line To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.HorizontalLineToImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getHorizontalLineTo()
   * @generated
   */
  int HORIZONTAL_LINE_TO = 35;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LINE_TO__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Horizontal Line To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LINE_TO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.VerticalLineToImpl <em>Vertical Line To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.VerticalLineToImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getVerticalLineTo()
   * @generated
   */
  int VERTICAL_LINE_TO = 36;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LINE_TO__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Vertical Line To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LINE_TO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.CurveToImpl <em>Curve To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.CurveToImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getCurveTo()
   * @generated
   */
  int CURVE_TO = 37;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVE_TO__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Curve To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVE_TO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SmoothCurveToImpl <em>Smooth Curve To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SmoothCurveToImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSmoothCurveTo()
   * @generated
   */
  int SMOOTH_CURVE_TO = 38;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVE_TO__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Smooth Curve To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVE_TO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.QuadraticBezierCurveImpl <em>Quadratic Bezier Curve</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.QuadraticBezierCurveImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getQuadraticBezierCurve()
   * @generated
   */
  int QUADRATIC_BEZIER_CURVE = 39;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVE__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Quadratic Bezier Curve</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SmoothQuadraticBezierCurveToImpl <em>Smooth Quadratic Bezier Curve To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SmoothQuadraticBezierCurveToImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSmoothQuadraticBezierCurveTo()
   * @generated
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVE_TO = 40;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVE_TO__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Smooth Quadratic Bezier Curve To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVE_TO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EllipticalArcImpl <em>Elliptical Arc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EllipticalArcImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEllipticalArc()
   * @generated
   */
  int ELLIPTICAL_ARC = 41;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Elliptical Arc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PointsImpl <em>Points</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PointsImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPoints()
   * @generated
   */
  int POINTS = 42;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS__Y = 1;

  /**
   * The number of structural features of the '<em>Points</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersHVImpl <em>Path Parameters HV</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathParametersHVImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPathParametersHV()
   * @generated
   */
  int PATH_PARAMETERS_HV = 43;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_HV__X = 0;

  /**
   * The number of structural features of the '<em>Path Parameters HV</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_HV_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersMLTImpl <em>Path Parameters MLT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathParametersMLTImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPathParametersMLT()
   * @generated
   */
  int PATH_PARAMETERS_MLT = 44;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_MLT__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_MLT__Y = 1;

  /**
   * The number of structural features of the '<em>Path Parameters MLT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_MLT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersSImpl <em>Path Parameters S</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathParametersSImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPathParametersS()
   * @generated
   */
  int PATH_PARAMETERS_S = 45;

  /**
   * The feature id for the '<em><b>X2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_S__X2 = 0;

  /**
   * The feature id for the '<em><b>Y2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_S__Y2 = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_S__X = 2;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_S__Y = 3;

  /**
   * The number of structural features of the '<em>Path Parameters S</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_S_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersQImpl <em>Path Parameters Q</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathParametersQImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPathParametersQ()
   * @generated
   */
  int PATH_PARAMETERS_Q = 46;

  /**
   * The feature id for the '<em><b>X1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_Q__X1 = 0;

  /**
   * The feature id for the '<em><b>Y1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_Q__Y1 = 1;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_Q__X = 2;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_Q__Y = 3;

  /**
   * The number of structural features of the '<em>Path Parameters Q</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_Q_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl <em>Path Parameters C</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathParametersCImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPathParametersC()
   * @generated
   */
  int PATH_PARAMETERS_C = 47;

  /**
   * The feature id for the '<em><b>X1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_C__X1 = 0;

  /**
   * The feature id for the '<em><b>Y1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_C__Y1 = 1;

  /**
   * The feature id for the '<em><b>X2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_C__X2 = 2;

  /**
   * The feature id for the '<em><b>Y2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_C__Y2 = 3;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_C__X = 4;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_C__Y = 5;

  /**
   * The number of structural features of the '<em>Path Parameters C</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_C_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl <em>Path Parameters A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.PathParametersAImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getPathParametersA()
   * @generated
   */
  int PATH_PARAMETERS_A = 48;

  /**
   * The feature id for the '<em><b>Rx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A__RX = 0;

  /**
   * The feature id for the '<em><b>Ry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A__RY = 1;

  /**
   * The feature id for the '<em><b>Xaxisrot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A__XAXISROT = 2;

  /**
   * The feature id for the '<em><b>Largearcflag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A__LARGEARCFLAG = 3;

  /**
   * The feature id for the '<em><b>Sweepflag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A__SWEEPFLAG = 4;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A__X = 5;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A__Y = 6;

  /**
   * The number of structural features of the '<em>Path Parameters A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_PARAMETERS_A_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl <em>Symbol Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SymbolStyleImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSymbolStyle()
   * @generated
   */
  int SYMBOL_STYLE = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Fillcolor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE__FILLCOLOR = 1;

  /**
   * The feature id for the '<em><b>Strokecolor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE__STROKECOLOR = 2;

  /**
   * The feature id for the '<em><b>Strokewidth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE__STROKEWIDTH = 3;

  /**
   * The feature id for the '<em><b>Fontfamily</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE__FONTFAMILY = 4;

  /**
   * The feature id for the '<em><b>Fontsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE__FONTSIZE = 5;

  /**
   * The feature id for the '<em><b>Insertembedcode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE__INSERTEMBEDCODE = 6;

  /**
   * The number of structural features of the '<em>Symbol Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_STYLE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FillColorImpl <em>Fill Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FillColorImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFillColor()
   * @generated
   */
  int FILL_COLOR = 50;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_COLOR__COLOR = 0;

  /**
   * The feature id for the '<em><b>Hexcolor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_COLOR__HEXCOLOR = 1;

  /**
   * The number of structural features of the '<em>Fill Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_COLOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.StrokeColorImpl <em>Stroke Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.StrokeColorImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getStrokeColor()
   * @generated
   */
  int STROKE_COLOR = 51;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STROKE_COLOR__COLOR = 0;

  /**
   * The feature id for the '<em><b>Hexcolor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STROKE_COLOR__HEXCOLOR = 1;

  /**
   * The number of structural features of the '<em>Stroke Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STROKE_COLOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FontFamilyImpl <em>Font Family</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FontFamilyImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFontFamily()
   * @generated
   */
  int FONT_FAMILY = 52;

  /**
   * The feature id for the '<em><b>Fontstr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY__FONTSTR = 0;

  /**
   * The feature id for the '<em><b>Font</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY__FONT = 1;

  /**
   * The number of structural features of the '<em>Font Family</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FAMILY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmImpl <em>Algorithm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AlgorithmImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAlgorithm()
   * @generated
   */
  int ALGORITHM = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM__NAME = 0;

  /**
   * The feature id for the '<em><b>Stmnt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM__STMNT = 1;

  /**
   * The number of structural features of the '<em>Algorithm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.StatementImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 54;

  /**
   * The feature id for the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SELECTION = 0;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__LOOP = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Algorithmoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ALGORITHMOPERATION = 3;

  /**
   * The feature id for the '<em><b>Insertembedcode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__INSERTEMBEDCODE = 4;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SelectionStatementImpl <em>Selection Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SelectionStatementImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSelectionStatement()
   * @generated
   */
  int SELECTION_STATEMENT = 55;

  /**
   * The feature id for the '<em><b>Ifcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__IFCONDITION = 0;

  /**
   * The feature id for the '<em><b>Ifblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__IFBLOCK = 1;

  /**
   * The feature id for the '<em><b>Elseifcondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__ELSEIFCONDITION = 2;

  /**
   * The feature id for the '<em><b>Elseifblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__ELSEIFBLOCK = 3;

  /**
   * The feature id for the '<em><b>Elseblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT__ELSEBLOCK = 4;

  /**
   * The number of structural features of the '<em>Selection Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.LoopStatementImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getLoopStatement()
   * @generated
   */
  int LOOP_STATEMENT = 56;

  /**
   * The feature id for the '<em><b>Whiletloop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__WHILETLOOP = 0;

  /**
   * The feature id for the '<em><b>Forloop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__FORLOOP = 1;

  /**
   * The number of structural features of the '<em>Loop Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.WhileLoopImpl <em>While Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.WhileLoopImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getWhileLoop()
   * @generated
   */
  int WHILE_LOOP = 57;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Whileblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP__WHILEBLOCK = 1;

  /**
   * The feature id for the '<em><b>Breakcontinue</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP__BREAKCONTINUE = 2;

  /**
   * The number of structural features of the '<em>While Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ForLoopImpl <em>For Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ForLoopImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getForLoop()
   * @generated
   */
  int FOR_LOOP = 58;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__START = 0;

  /**
   * The feature id for the '<em><b>Stop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__STOP = 1;

  /**
   * The feature id for the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__INTERVAL = 2;

  /**
   * The feature id for the '<em><b>Forblock</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__FORBLOCK = 3;

  /**
   * The feature id for the '<em><b>Breakcontinue</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__BREAKCONTINUE = 4;

  /**
   * The number of structural features of the '<em>For Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.BreakContinueImpl <em>Break Continue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.BreakContinueImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getBreakContinue()
   * @generated
   */
  int BREAK_CONTINUE = 59;

  /**
   * The feature id for the '<em><b>Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_CONTINUE__BREAK = 0;

  /**
   * The feature id for the '<em><b>Continue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_CONTINUE__CONTINUE = 1;

  /**
   * The number of structural features of the '<em>Break Continue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_CONTINUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.VariableImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 60;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Opassing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__OPASSING = 1;

  /**
   * The feature id for the '<em><b>Varstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARSTATEMENT = 2;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE = 3;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl <em>Var Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.VarStatementImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getVarStatement()
   * @generated
   */
  int VAR_STATEMENT = 61;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Algorithmoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__ALGORITHMOPERATION = 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__CLASS = 2;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Symbolclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__SYMBOLCLASS = 5;

  /**
   * The feature id for the '<em><b>Symbolrelation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__SYMBOLRELATION = 6;

  /**
   * The feature id for the '<em><b>Symbolstyle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__SYMBOLSTYLE = 7;

  /**
   * The feature id for the '<em><b>Embeddedcode</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__EMBEDDEDCODE = 8;

  /**
   * The feature id for the '<em><b>Modeltype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT__MODELTYPE = 9;

  /**
   * The number of structural features of the '<em>Var Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_STATEMENT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorAssignImpl <em>Operator Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorAssignImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorAssign()
   * @generated
   */
  int OPERATOR_ASSIGN = 62;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ASSIGN__ASSIGN = 0;

  /**
   * The feature id for the '<em><b>Multyassign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ASSIGN__MULTYASSIGN = 1;

  /**
   * The number of structural features of the '<em>Operator Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ASSIGN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultyAssignImpl <em>Operator Multy Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorMultyAssignImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorMultyAssign()
   * @generated
   */
  int OPERATOR_MULTY_ASSIGN = 63;

  /**
   * The feature id for the '<em><b>Addassign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTY_ASSIGN__ADDASSIGN = 0;

  /**
   * The feature id for the '<em><b>Subassign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTY_ASSIGN__SUBASSIGN = 1;

  /**
   * The feature id for the '<em><b>Multiassign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTY_ASSIGN__MULTIASSIGN = 2;

  /**
   * The feature id for the '<em><b>Divassign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTY_ASSIGN__DIVASSIGN = 3;

  /**
   * The number of structural features of the '<em>Operator Multy Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTY_ASSIGN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorUnaryImpl <em>Operator Unary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorUnaryImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorUnary()
   * @generated
   */
  int OPERATOR_UNARY = 64;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_UNARY__NOT = 0;

  /**
   * The number of structural features of the '<em>Operator Unary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_UNARY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorMultiplyImpl <em>Operator Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorMultiplyImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorMultiply()
   * @generated
   */
  int OPERATOR_MULTIPLY = 65;

  /**
   * The feature id for the '<em><b>Multiply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTIPLY__MULTIPLY = 0;

  /**
   * The feature id for the '<em><b>Divide</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTIPLY__DIVIDE = 1;

  /**
   * The feature id for the '<em><b>Modulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTIPLY__MODULO = 2;

  /**
   * The number of structural features of the '<em>Operator Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_MULTIPLY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorAddImpl <em>Operator Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorAddImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorAdd()
   * @generated
   */
  int OPERATOR_ADD = 66;

  /**
   * The feature id for the '<em><b>Add</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ADD__ADD = 0;

  /**
   * The feature id for the '<em><b>Subtract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ADD__SUBTRACT = 1;

  /**
   * The number of structural features of the '<em>Operator Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_ADD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorCompareImpl <em>Operator Compare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorCompareImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorCompare()
   * @generated
   */
  int OPERATOR_COMPARE = 67;

  /**
   * The feature id for the '<em><b>Greaterequal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_COMPARE__GREATEREQUAL = 0;

  /**
   * The feature id for the '<em><b>Lesserequal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_COMPARE__LESSEREQUAL = 1;

  /**
   * The feature id for the '<em><b>Greater</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_COMPARE__GREATER = 2;

  /**
   * The feature id for the '<em><b>Lesser</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_COMPARE__LESSER = 3;

  /**
   * The number of structural features of the '<em>Operator Compare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_COMPARE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorEqualImpl <em>Operator Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorEqualImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorEqual()
   * @generated
   */
  int OPERATOR_EQUAL = 68;

  /**
   * The feature id for the '<em><b>Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EQUAL__EQUAL = 0;

  /**
   * The feature id for the '<em><b>Notequal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EQUAL__NOTEQUAL = 1;

  /**
   * The number of structural features of the '<em>Operator Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_EQUAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorAndImpl <em>Operator And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorAndImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorAnd()
   * @generated
   */
  int OPERATOR_AND = 69;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_AND__AND = 0;

  /**
   * The number of structural features of the '<em>Operator And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_AND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OperatorOrImpl <em>Operator Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OperatorOrImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOperatorOr()
   * @generated
   */
  int OPERATOR_OR = 70;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_OR__OR = 0;

  /**
   * The number of structural features of the '<em>Operator Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_OR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ExprImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 71;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR = 0;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ExpressionImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 72;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERAND = 1;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ATOMIC = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TRUE = 4;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__FALSE = 5;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE_STRING = 7;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE_REAL_NUMBER = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 9;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 10;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl <em>Algorithm Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AlgorithmOperationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAlgorithmOperation()
   * @generated
   */
  int ALGORITHM_OPERATION = 73;

  /**
   * The feature id for the '<em><b>Fileoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_OPERATION__FILEOPERATION = 0;

  /**
   * The feature id for the '<em><b>Diroperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_OPERATION__DIROPERATION = 1;

  /**
   * The feature id for the '<em><b>Simpleui</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_OPERATION__SIMPLEUI = 2;

  /**
   * The feature id for the '<em><b>Modeloperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_OPERATION__MODELOPERATION = 3;

  /**
   * The feature id for the '<em><b>Instanceoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_OPERATION__INSTANCEOPERATION = 4;

  /**
   * The feature id for the '<em><b>Attributeoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_OPERATION__ATTRIBUTEOPERATION = 5;

  /**
   * The number of structural features of the '<em>Algorithm Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALGORITHM_OPERATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FileOperationImpl <em>File Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FileOperationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFileOperation()
   * @generated
   */
  int FILE_OPERATION = 74;

  /**
   * The feature id for the '<em><b>Filecopy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_OPERATION__FILECOPY = 0;

  /**
   * The feature id for the '<em><b>Filedelete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_OPERATION__FILEDELETE = 1;

  /**
   * The feature id for the '<em><b>Filecreate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_OPERATION__FILECREATE = 2;

  /**
   * The feature id for the '<em><b>Fileread</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_OPERATION__FILEREAD = 3;

  /**
   * The feature id for the '<em><b>Filewrite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_OPERATION__FILEWRITE = 4;

  /**
   * The number of structural features of the '<em>File Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_OPERATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FileCopyImpl <em>File Copy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FileCopyImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFileCopy()
   * @generated
   */
  int FILE_COPY = 75;

  /**
   * The feature id for the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_COPY__SRC = 0;

  /**
   * The feature id for the '<em><b>Dest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_COPY__DEST = 1;

  /**
   * The number of structural features of the '<em>File Copy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_COPY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FileDeleteImpl <em>File Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FileDeleteImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFileDelete()
   * @generated
   */
  int FILE_DELETE = 76;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_DELETE__FILENAME = 0;

  /**
   * The number of structural features of the '<em>File Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_DELETE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FileCreateImpl <em>File Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FileCreateImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFileCreate()
   * @generated
   */
  int FILE_CREATE = 77;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_CREATE__FILENAME = 0;

  /**
   * The number of structural features of the '<em>File Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_CREATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FileReadImpl <em>File Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FileReadImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFileRead()
   * @generated
   */
  int FILE_READ = 78;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_READ__FILENAME = 0;

  /**
   * The number of structural features of the '<em>File Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_READ_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.FileWriteImpl <em>File Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.FileWriteImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFileWrite()
   * @generated
   */
  int FILE_WRITE = 79;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_WRITE__FILENAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_WRITE__TEXT = 1;

  /**
   * The feature id for the '<em><b>Append</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_WRITE__APPEND = 2;

  /**
   * The number of structural features of the '<em>File Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_WRITE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.DirOperationImpl <em>Dir Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.DirOperationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getDirOperation()
   * @generated
   */
  int DIR_OPERATION = 80;

  /**
   * The feature id for the '<em><b>Dirsetworking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_OPERATION__DIRSETWORKING = 0;

  /**
   * The feature id for the '<em><b>Dirgetworking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_OPERATION__DIRGETWORKING = 1;

  /**
   * The feature id for the '<em><b>Dircreate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_OPERATION__DIRCREATE = 2;

  /**
   * The feature id for the '<em><b>Dirdelete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_OPERATION__DIRDELETE = 3;

  /**
   * The feature id for the '<em><b>Dirlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_OPERATION__DIRLIST = 4;

  /**
   * The number of structural features of the '<em>Dir Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_OPERATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.DirSetWorkingImpl <em>Dir Set Working</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.DirSetWorkingImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getDirSetWorking()
   * @generated
   */
  int DIR_SET_WORKING = 81;

  /**
   * The feature id for the '<em><b>Dirname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_SET_WORKING__DIRNAME = 0;

  /**
   * The number of structural features of the '<em>Dir Set Working</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_SET_WORKING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.DirGetWorkingImpl <em>Dir Get Working</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.DirGetWorkingImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getDirGetWorking()
   * @generated
   */
  int DIR_GET_WORKING = 82;

  /**
   * The number of structural features of the '<em>Dir Get Working</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_GET_WORKING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.DirCreateImpl <em>Dir Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.DirCreateImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getDirCreate()
   * @generated
   */
  int DIR_CREATE = 83;

  /**
   * The feature id for the '<em><b>Dirname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_CREATE__DIRNAME = 0;

  /**
   * The number of structural features of the '<em>Dir Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_CREATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.DirDeleteImpl <em>Dir Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.DirDeleteImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getDirDelete()
   * @generated
   */
  int DIR_DELETE = 84;

  /**
   * The feature id for the '<em><b>Dirname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_DELETE__DIRNAME = 0;

  /**
   * The number of structural features of the '<em>Dir Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_DELETE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.DirListImpl <em>Dir List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.DirListImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getDirList()
   * @generated
   */
  int DIR_LIST = 85;

  /**
   * The feature id for the '<em><b>Dirname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_LIST__DIRNAME = 0;

  /**
   * The number of structural features of the '<em>Dir List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl <em>Simple UI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.SimpleUIImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSimpleUI()
   * @generated
   */
  int SIMPLE_UI = 86;

  /**
   * The feature id for the '<em><b>Editbox</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_UI__EDITBOX = 0;

  /**
   * The feature id for the '<em><b>Infobox</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_UI__INFOBOX = 1;

  /**
   * The feature id for the '<em><b>Errorbox</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_UI__ERRORBOX = 2;

  /**
   * The feature id for the '<em><b>Warningbox</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_UI__WARNINGBOX = 3;

  /**
   * The feature id for the '<em><b>Viewbox</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_UI__VIEWBOX = 4;

  /**
   * The feature id for the '<em><b>Itemoperation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_UI__ITEMOPERATION = 5;

  /**
   * The number of structural features of the '<em>Simple UI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_UI_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EditBoxImpl <em>Edit Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EditBoxImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEditBox()
   * @generated
   */
  int EDIT_BOX = 87;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_BOX__TITLE = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_BOX__TEXT = 1;

  /**
   * The feature id for the '<em><b>Okbuttontext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_BOX__OKBUTTONTEXT = 2;

  /**
   * The number of structural features of the '<em>Edit Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_BOX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.InfoBoxImpl <em>Info Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.InfoBoxImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getInfoBox()
   * @generated
   */
  int INFO_BOX = 88;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_BOX__TITLE = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_BOX__TEXT = 1;

  /**
   * The number of structural features of the '<em>Info Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_BOX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ErrorBoxImpl <em>Error Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ErrorBoxImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getErrorBox()
   * @generated
   */
  int ERROR_BOX = 89;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BOX__TITLE = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BOX__TEXT = 1;

  /**
   * The feature id for the '<em><b>Buttontype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BOX__BUTTONTYPE = 2;

  /**
   * The number of structural features of the '<em>Error Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BOX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.WarningBoxImpl <em>Warning Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.WarningBoxImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getWarningBox()
   * @generated
   */
  int WARNING_BOX = 90;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARNING_BOX__TITLE = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARNING_BOX__TEXT = 1;

  /**
   * The feature id for the '<em><b>Buttontype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARNING_BOX__BUTTONTYPE = 2;

  /**
   * The number of structural features of the '<em>Warning Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WARNING_BOX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ViewBoxImpl <em>View Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ViewBoxImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getViewBox()
   * @generated
   */
  int VIEW_BOX = 91;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_BOX__TITLE = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_BOX__TEXT = 1;

  /**
   * The number of structural features of the '<em>View Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_BOX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ItemOperationImpl <em>Item Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ItemOperationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getItemOperation()
   * @generated
   */
  int ITEM_OPERATION = 92;

  /**
   * The feature id for the '<em><b>Menuitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_OPERATION__MENUITEM = 0;

  /**
   * The feature id for the '<em><b>Contextitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_OPERATION__CONTEXTITEM = 1;

  /**
   * The number of structural features of the '<em>Item Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.MenuItemImpl <em>Menu Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.MenuItemImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getMenuItem()
   * @generated
   */
  int MENU_ITEM = 93;

  /**
   * The feature id for the '<em><b>Insertmenuitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ITEM__INSERTMENUITEM = 0;

  /**
   * The feature id for the '<em><b>Removemenuitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ITEM__REMOVEMENUITEM = 1;

  /**
   * The number of structural features of the '<em>Menu Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.InsertMenuItemImpl <em>Insert Menu Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.InsertMenuItemImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getInsertMenuItem()
   * @generated
   */
  int INSERT_MENU_ITEM = 94;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_MENU_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Menu</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_MENU_ITEM__MENU = 1;

  /**
   * The number of structural features of the '<em>Insert Menu Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_MENU_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RemoveMenuItemImpl <em>Remove Menu Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RemoveMenuItemImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRemoveMenuItem()
   * @generated
   */
  int REMOVE_MENU_ITEM = 95;

  /**
   * The feature id for the '<em><b>Menuitemname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_MENU_ITEM__MENUITEMNAME = 0;

  /**
   * The number of structural features of the '<em>Remove Menu Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_MENU_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ContextItemImpl <em>Context Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ContextItemImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getContextItem()
   * @generated
   */
  int CONTEXT_ITEM = 96;

  /**
   * The feature id for the '<em><b>Insertcontextitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_ITEM__INSERTCONTEXTITEM = 0;

  /**
   * The feature id for the '<em><b>Removecontextitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_ITEM__REMOVECONTEXTITEM = 1;

  /**
   * The number of structural features of the '<em>Context Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.InsertContextItemImpl <em>Insert Context Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.InsertContextItemImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getInsertContextItem()
   * @generated
   */
  int INSERT_CONTEXT_ITEM = 97;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_CONTEXT_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_CONTEXT_ITEM__CONTEXT = 1;

  /**
   * The number of structural features of the '<em>Insert Context Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_CONTEXT_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RemoveContextItemImpl <em>Remove Context Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RemoveContextItemImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRemoveContextItem()
   * @generated
   */
  int REMOVE_CONTEXT_ITEM = 98;

  /**
   * The feature id for the '<em><b>Contextitem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_CONTEXT_ITEM__CONTEXTITEM = 0;

  /**
   * The number of structural features of the '<em>Remove Context Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_CONTEXT_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl <em>Model Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelOperationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelOperation()
   * @generated
   */
  int MODEL_OPERATION = 99;

  /**
   * The feature id for the '<em><b>Modelcreate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION__MODELCREATE = 0;

  /**
   * The feature id for the '<em><b>Modeldelete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION__MODELDELETE = 1;

  /**
   * The feature id for the '<em><b>Modeldiscard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION__MODELDISCARD = 2;

  /**
   * The feature id for the '<em><b>Modelsave</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION__MODELSAVE = 3;

  /**
   * The feature id for the '<em><b>Modelload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION__MODELLOAD = 4;

  /**
   * The feature id for the '<em><b>Modelisloaded</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION__MODELISLOADED = 5;

  /**
   * The number of structural features of the '<em>Model Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelCreateImpl <em>Model Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelCreateImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelCreate()
   * @generated
   */
  int MODEL_CREATE = 100;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CREATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Modeltype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CREATE__MODELTYPE = 1;

  /**
   * The number of structural features of the '<em>Model Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CREATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelDeleteImpl <em>Model Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelDeleteImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelDelete()
   * @generated
   */
  int MODEL_DELETE = 101;

  /**
   * The feature id for the '<em><b>Modelname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DELETE__MODELNAME = 0;

  /**
   * The number of structural features of the '<em>Model Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DELETE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelDiscardImpl <em>Model Discard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelDiscardImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelDiscard()
   * @generated
   */
  int MODEL_DISCARD = 102;

  /**
   * The feature id for the '<em><b>Modelname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DISCARD__MODELNAME = 0;

  /**
   * The number of structural features of the '<em>Model Discard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DISCARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelSaveImpl <em>Model Save</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelSaveImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelSave()
   * @generated
   */
  int MODEL_SAVE = 103;

  /**
   * The feature id for the '<em><b>Modelname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SAVE__MODELNAME = 0;

  /**
   * The number of structural features of the '<em>Model Save</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_SAVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelLoadImpl <em>Model Load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelLoadImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelLoad()
   * @generated
   */
  int MODEL_LOAD = 104;

  /**
   * The feature id for the '<em><b>Modelname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_LOAD__MODELNAME = 0;

  /**
   * The number of structural features of the '<em>Model Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_LOAD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ModelIsLoadedImpl <em>Model Is Loaded</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ModelIsLoadedImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getModelIsLoaded()
   * @generated
   */
  int MODEL_IS_LOADED = 105;

  /**
   * The feature id for the '<em><b>Modelname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IS_LOADED__MODELNAME = 0;

  /**
   * The number of structural features of the '<em>Model Is Loaded</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_IS_LOADED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.InstanceOperationImpl <em>Instance Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.InstanceOperationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getInstanceOperation()
   * @generated
   */
  int INSTANCE_OPERATION = 106;

  /**
   * The feature id for the '<em><b>Classinstance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OPERATION__CLASSINSTANCE = 0;

  /**
   * The feature id for the '<em><b>Relationinstance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OPERATION__RELATIONINSTANCE = 1;

  /**
   * The number of structural features of the '<em>Instance Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceImpl <em>Class Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassInstanceImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClassInstance()
   * @generated
   */
  int CLASS_INSTANCE = 107;

  /**
   * The feature id for the '<em><b>Classinstancecreate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__CLASSINSTANCECREATE = 0;

  /**
   * The feature id for the '<em><b>Classinstancedelete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__CLASSINSTANCEDELETE = 1;

  /**
   * The feature id for the '<em><b>Classinstanceget</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__CLASSINSTANCEGET = 2;

  /**
   * The feature id for the '<em><b>Classinstanceset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__CLASSINSTANCESET = 3;

  /**
   * The feature id for the '<em><b>Classinstancegetall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__CLASSINSTANCEGETALL = 4;

  /**
   * The number of structural features of the '<em>Class Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceCreateImpl <em>Class Instance Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassInstanceCreateImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClassInstanceCreate()
   * @generated
   */
  int CLASS_INSTANCE_CREATE = 108;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_CREATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Nameofclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_CREATE__NAMEOFCLASS = 1;

  /**
   * The number of structural features of the '<em>Class Instance Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_CREATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceDeleteImpl <em>Class Instance Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassInstanceDeleteImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClassInstanceDelete()
   * @generated
   */
  int CLASS_INSTANCE_DELETE = 109;

  /**
   * The feature id for the '<em><b>Nameofclassinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_DELETE__NAMEOFCLASSINSTANCE = 0;

  /**
   * The number of structural features of the '<em>Class Instance Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_DELETE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceGetImpl <em>Class Instance Get</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassInstanceGetImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClassInstanceGet()
   * @generated
   */
  int CLASS_INSTANCE_GET = 110;

  /**
   * The feature id for the '<em><b>Nameofclassinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_GET__NAMEOFCLASSINSTANCE = 0;

  /**
   * The number of structural features of the '<em>Class Instance Get</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_GET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceGetAllImpl <em>Class Instance Get All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassInstanceGetAllImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClassInstanceGetAll()
   * @generated
   */
  int CLASS_INSTANCE_GET_ALL = 111;

  /**
   * The feature id for the '<em><b>Nameofclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_GET_ALL__NAMEOFCLASS = 0;

  /**
   * The number of structural features of the '<em>Class Instance Get All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_GET_ALL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.ClassInstanceSetImpl <em>Class Instance Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.ClassInstanceSetImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getClassInstanceSet()
   * @generated
   */
  int CLASS_INSTANCE_SET = 112;

  /**
   * The feature id for the '<em><b>Nameofclassinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_SET__NAMEOFCLASSINSTANCE = 0;

  /**
   * The number of structural features of the '<em>Class Instance Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceImpl <em>Relation Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RelationInstanceImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRelationInstance()
   * @generated
   */
  int RELATION_INSTANCE = 113;

  /**
   * The feature id for the '<em><b>Relationinstancecreate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE__RELATIONINSTANCECREATE = 0;

  /**
   * The feature id for the '<em><b>Relationinstancedelete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE__RELATIONINSTANCEDELETE = 1;

  /**
   * The feature id for the '<em><b>Relationinstanceget</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE__RELATIONINSTANCEGET = 2;

  /**
   * The feature id for the '<em><b>Relationinstanceset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE__RELATIONINSTANCESET = 3;

  /**
   * The feature id for the '<em><b>Relationinstancegetall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE__RELATIONINSTANCEGETALL = 4;

  /**
   * The number of structural features of the '<em>Relation Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceCreateImpl <em>Relation Instance Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RelationInstanceCreateImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRelationInstanceCreate()
   * @generated
   */
  int RELATION_INSTANCE_CREATE = 114;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_CREATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Nameofrelation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_CREATE__NAMEOFRELATION = 1;

  /**
   * The feature id for the '<em><b>Classinstancefrom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_CREATE__CLASSINSTANCEFROM = 2;

  /**
   * The feature id for the '<em><b>Classinstanceto</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_CREATE__CLASSINSTANCETO = 3;

  /**
   * The number of structural features of the '<em>Relation Instance Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_CREATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceDeleteImpl <em>Relation Instance Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RelationInstanceDeleteImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRelationInstanceDelete()
   * @generated
   */
  int RELATION_INSTANCE_DELETE = 115;

  /**
   * The feature id for the '<em><b>Nameofrelationinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_DELETE__NAMEOFRELATIONINSTANCE = 0;

  /**
   * The number of structural features of the '<em>Relation Instance Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_DELETE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceGetImpl <em>Relation Instance Get</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RelationInstanceGetImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRelationInstanceGet()
   * @generated
   */
  int RELATION_INSTANCE_GET = 116;

  /**
   * The feature id for the '<em><b>Nameofrelationinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_GET__NAMEOFRELATIONINSTANCE = 0;

  /**
   * The number of structural features of the '<em>Relation Instance Get</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_GET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceGetAllImpl <em>Relation Instance Get All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RelationInstanceGetAllImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRelationInstanceGetAll()
   * @generated
   */
  int RELATION_INSTANCE_GET_ALL = 117;

  /**
   * The feature id for the '<em><b>Nameofrelation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_GET_ALL__NAMEOFRELATION = 0;

  /**
   * The number of structural features of the '<em>Relation Instance Get All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_GET_ALL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.RelationInstanceSetImpl <em>Relation Instance Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.RelationInstanceSetImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getRelationInstanceSet()
   * @generated
   */
  int RELATION_INSTANCE_SET = 118;

  /**
   * The feature id for the '<em><b>Nameofrelationinstance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_SET__NAMEOFRELATIONINSTANCE = 0;

  /**
   * The number of structural features of the '<em>Relation Instance Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_INSTANCE_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AttributeOperationImpl <em>Attribute Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AttributeOperationImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAttributeOperation()
   * @generated
   */
  int ATTRIBUTE_OPERATION = 119;

  /**
   * The feature id for the '<em><b>Attributename</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION__ATTRIBUTENAME = 0;

  /**
   * The feature id for the '<em><b>Attributeget</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION__ATTRIBUTEGET = 1;

  /**
   * The feature id for the '<em><b>Attributeset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION__ATTRIBUTESET = 2;

  /**
   * The number of structural features of the '<em>Attribute Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AttributeGetImpl <em>Attribute Get</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AttributeGetImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAttributeGet()
   * @generated
   */
  int ATTRIBUTE_GET = 120;

  /**
   * The feature id for the '<em><b>Attrgetparams</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GET__ATTRGETPARAMS = 0;

  /**
   * The number of structural features of the '<em>Attribute Get</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_GET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AttributeSetImpl <em>Attribute Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AttributeSetImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAttributeSet()
   * @generated
   */
  int ATTRIBUTE_SET = 121;

  /**
   * The feature id for the '<em><b>Attrsetparams</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SET__ATTRSETPARAMS = 0;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SET__VALUE_STRING = 1;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SET__VALUE_REAL_NUMBER = 2;

  /**
   * The feature id for the '<em><b>Value Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SET__VALUE_VARIABLE = 3;

  /**
   * The number of structural features of the '<em>Attribute Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_SET_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EventImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 122;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Algorithmname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ALGORITHMNAME = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.OrExpressionImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 123;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__ATOMIC = EXPRESSION__ATOMIC;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__TRUE = EXPRESSION__TRUE;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__FALSE = EXPRESSION__FALSE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__VARIABLE = EXPRESSION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__VALUE_STRING = EXPRESSION__VALUE_STRING;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__VALUE_REAL_NUMBER = EXPRESSION__VALUE_REAL_NUMBER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AndExpressionImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 124;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__ATOMIC = EXPRESSION__ATOMIC;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__TRUE = EXPRESSION__TRUE;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__FALSE = EXPRESSION__FALSE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__VARIABLE = EXPRESSION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__VALUE_STRING = EXPRESSION__VALUE_STRING;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__VALUE_REAL_NUMBER = EXPRESSION__VALUE_REAL_NUMBER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.EqualExpressionImpl <em>Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.EqualExpressionImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEqualExpression()
   * @generated
   */
  int EQUAL_EXPRESSION = 125;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__ATOMIC = EXPRESSION__ATOMIC;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__TRUE = EXPRESSION__TRUE;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__FALSE = EXPRESSION__FALSE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__VARIABLE = EXPRESSION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__VALUE_STRING = EXPRESSION__VALUE_STRING;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__VALUE_REAL_NUMBER = EXPRESSION__VALUE_REAL_NUMBER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.CompareExpressionImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getCompareExpression()
   * @generated
   */
  int COMPARE_EXPRESSION = 126;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__ATOMIC = EXPRESSION__ATOMIC;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__TRUE = EXPRESSION__TRUE;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__FALSE = EXPRESSION__FALSE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__VARIABLE = EXPRESSION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__VALUE_STRING = EXPRESSION__VALUE_STRING;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__VALUE_REAL_NUMBER = EXPRESSION__VALUE_REAL_NUMBER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Compare Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.AdditionExpressionImpl <em>Addition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.AdditionExpressionImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAdditionExpression()
   * @generated
   */
  int ADDITION_EXPRESSION = 127;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__ATOMIC = EXPRESSION__ATOMIC;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__TRUE = EXPRESSION__TRUE;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__FALSE = EXPRESSION__FALSE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__VARIABLE = EXPRESSION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__VALUE_STRING = EXPRESSION__VALUE_STRING;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__VALUE_REAL_NUMBER = EXPRESSION__VALUE_REAL_NUMBER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Addition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.impl.MultiplicationExpressionImpl <em>Multiplication Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.impl.MultiplicationExpressionImpl
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getMultiplicationExpression()
   * @generated
   */
  int MULTIPLICATION_EXPRESSION = 128;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__ATOMIC = EXPRESSION__ATOMIC;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__TRUE = EXPRESSION__TRUE;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__FALSE = EXPRESSION__FALSE;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__VARIABLE = EXPRESSION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__VALUE_STRING = EXPRESSION__VALUE_STRING;

  /**
   * The feature id for the '<em><b>Value Real Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__VALUE_REAL_NUMBER = EXPRESSION__VALUE_REAL_NUMBER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Multiplication Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.AccessType <em>Access Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.AccessType
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAccessType()
   * @generated
   */
  int ACCESS_TYPE = 129;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.SimpleType <em>Simple Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.SimpleType
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 130;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.Font <em>Font</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.Font
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getFont()
   * @generated
   */
  int FONT = 131;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.Color
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getColor()
   * @generated
   */
  int COLOR = 132;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.ButtonType <em>Button Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.ButtonType
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getButtonType()
   * @generated
   */
  int BUTTON_TYPE = 133;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.AttrGetParams <em>Attr Get Params</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.AttrGetParams
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAttrGetParams()
   * @generated
   */
  int ATTR_GET_PARAMS = 134;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.AttrSetParams <em>Attr Set Params</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.AttrSetParams
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getAttrSetParams()
   * @generated
   */
  int ATTR_SET_PARAMS = 135;

  /**
   * The meta object id for the '{@link org.xtext.nv.dsl.mMDSL.EventName <em>Event Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.nv.dsl.mMDSL.EventName
   * @see org.xtext.nv.dsl.mMDSL.impl.MMDSLPackageImpl#getEventName()
   * @generated
   */
  int EVENT_NAME = 136;


  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Root#getMethodname <em>Methodname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Methodname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root#getMethodname()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Methodname();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Root#getIncludelibrarytype <em>Includelibrarytype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includelibrarytype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root#getIncludelibrarytype()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Includelibrarytype();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Root#getEmbedplatformtype <em>Embedplatformtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Embedplatformtype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root#getEmbedplatformtype()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Embedplatformtype();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Root#getEmbedcodetype <em>Embedcodetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Embedcodetype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root#getEmbedcodetype()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Embedcodetype();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Root#getIncludelibrary <em>Includelibrary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includelibrary</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root#getIncludelibrary()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Includelibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Root#getEmbedcode <em>Embedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Embedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root#getEmbedcode()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Embedcode();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Root#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Root#getMethod()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Method();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.MethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MethodName
   * @generated
   */
  EClass getMethodName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.MethodName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MethodName#getName()
   * @see #getMethodName()
   * @generated
   */
  EAttribute getMethodName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary <em>Include Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Library</em>'.
   * @see org.xtext.nv.dsl.mMDSL.IncludeLibrary
   * @generated
   */
  EClass getIncludeLibrary();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.IncludeLibrary#getName()
   * @see #getIncludeLibrary()
   * @generated
   */
  EAttribute getIncludeLibrary_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.IncludeLibrary#getIncludelibrarytype <em>Includelibrarytype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Includelibrarytype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.IncludeLibrary#getIncludelibrarytype()
   * @see #getIncludeLibrary()
   * @generated
   */
  EReference getIncludeLibrary_Includelibrarytype();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.IncludeLibraryType <em>Include Library Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Library Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.IncludeLibraryType
   * @generated
   */
  EClass getIncludeLibraryType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.IncludeLibraryType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.IncludeLibraryType#getName()
   * @see #getIncludeLibraryType()
   * @generated
   */
  EAttribute getIncludeLibraryType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.EmbedCode <em>Embed Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embed Code</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCode
   * @generated
   */
  EClass getEmbedCode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCode#getName()
   * @see #getEmbedCode()
   * @generated
   */
  EAttribute getEmbedCode_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedplatformtype <em>Embedplatformtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Embedplatformtype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedplatformtype()
   * @see #getEmbedCode()
   * @generated
   */
  EReference getEmbedCode_Embedplatformtype();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedcodetype <em>Embedcodetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Embedcodetype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbedcodetype()
   * @see #getEmbedCode()
   * @generated
   */
  EReference getEmbedCode_Embedcodetype();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbeddedcode <em>Embeddedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Embeddedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCode#getEmbeddedcode()
   * @see #getEmbedCode()
   * @generated
   */
  EAttribute getEmbedCode_Embeddedcode();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.EmbedPlatformType <em>Embed Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embed Platform Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedPlatformType
   * @generated
   */
  EClass getEmbedPlatformType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.EmbedPlatformType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedPlatformType#getName()
   * @see #getEmbedPlatformType()
   * @generated
   */
  EAttribute getEmbedPlatformType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.EmbedCodeType <em>Embed Code Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embed Code Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCodeType
   * @generated
   */
  EClass getEmbedCodeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.EmbedCodeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EmbedCodeType#getName()
   * @see #getEmbedCodeType()
   * @generated
   */
  EAttribute getEmbedCodeType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.InsertEmbedCode <em>Insert Embed Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Embed Code</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertEmbedCode
   * @generated
   */
  EClass getInsertEmbedCode();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.InsertEmbedCode#getCodesnippetname <em>Codesnippetname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Codesnippetname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertEmbedCode#getCodesnippetname()
   * @see #getInsertEmbedCode()
   * @generated
   */
  EReference getInsertEmbedCode_Codesnippetname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Method#getEnumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumeration</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method#getEnumeration()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Enumeration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Method#getSymbolstyle <em>Symbolstyle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Symbolstyle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method#getSymbolstyle()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Symbolstyle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Method#getSymbolclass <em>Symbolclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Symbolclass</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method#getSymbolclass()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Symbolclass();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Method#getSymbolrelation <em>Symbolrelation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Symbolrelation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method#getSymbolrelation()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Symbolrelation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Method#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metamodel</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method#getMetamodel()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Metamodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Method#getAlgorithm <em>Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Algorithm</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method#getAlgorithm()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Algorithm();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Method#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Method#getEvent()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Event();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Enumeration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Enumeration#getName()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.nv.dsl.mMDSL.Enumeration#getEnumvalues <em>Enumvalues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Enumvalues</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Enumeration#getEnumvalues()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Enumvalues();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Metamodel#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Metamodel#getClass_()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Class();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Metamodel#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Metamodel#getRelation()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Relation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Metamodel#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Metamodel#getAttribute()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Metamodel#getModeltype <em>Modeltype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modeltype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Metamodel#getModeltype()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Modeltype();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Class#getParentclassname <em>Parentclassname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parentclassname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class#getParentclassname()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Parentclassname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Class#getSymbolclass <em>Symbolclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbolclass</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class#getSymbolclass()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Symbolclass();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Class#getClassattribute <em>Classattribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classattribute</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class#getClassattribute()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Classattribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Class#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class#getAttribute()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Class#getInsertembedcode <em>Insertembedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Insertembedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class#getInsertembedcode()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Insertembedcode();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Class#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Class#getReference()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Reference();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Relation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation#getName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Relation#getParentrelationname <em>Parentrelationname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parentrelationname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation#getParentrelationname()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Parentrelationname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Relation#getSymbolrelation <em>Symbolrelation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbolrelation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation#getSymbolrelation()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Symbolrelation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Relation#getFromclassname <em>Fromclassname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fromclassname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation#getFromclassname()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Fromclassname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Relation#getToclassname <em>Toclassname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Toclassname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation#getToclassname()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Toclassname();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Relation#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation#getAttribute()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Relation#getInsertembedcode <em>Insertembedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Insertembedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Relation#getInsertembedcode()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Insertembedcode();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Attribute#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Attribute#getAccess()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Access();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ClassAttribute <em>Class Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Attribute</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassAttribute
   * @generated
   */
  EClass getClassAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ClassAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassAttribute#getName()
   * @see #getClassAttribute()
   * @generated
   */
  EAttribute getClassAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ClassAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassAttribute#getType()
   * @see #getClassAttribute()
   * @generated
   */
  EReference getClassAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Reference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Reference#getName()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Reference#getRefname <em>Refname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Refname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Reference#getRefname()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Refname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RefName <em>Ref Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RefName
   * @generated
   */
  EClass getRefName();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RefName#getModeltypename <em>Modeltypename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modeltypename</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RefName#getModeltypename()
   * @see #getRefName()
   * @generated
   */
  EReference getRefName_Modeltypename();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RefName#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Classname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RefName#getClassname()
   * @see #getRefName()
   * @generated
   */
  EReference getRefName_Classname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Type#getSimpletype <em>Simpletype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simpletype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Type#getSimpletype()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Simpletype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Type#getEnumtype <em>Enumtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumtype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Type#getEnumtype()
   * @see #getType()
   * @generated
   */
  EReference getType_Enumtype();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.EnumType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EnumType#getName()
   * @see #getEnumType()
   * @generated
   */
  EReference getEnumType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelType
   * @generated
   */
  EClass getModelType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ModelType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelType#getName()
   * @see #getModelType()
   * @generated
   */
  EAttribute getModelType_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.nv.dsl.mMDSL.ModelType#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Classname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelType#getClassname()
   * @see #getModelType()
   * @generated
   */
  EReference getModelType_Classname();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.nv.dsl.mMDSL.ModelType#getRelationname <em>Relationname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Relationname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelType#getRelationname()
   * @see #getModelType()
   * @generated
   */
  EReference getModelType_Relationname();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.ModelType#getModename <em>Modename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modename</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelType#getModename()
   * @see #getModelType()
   * @generated
   */
  EReference getModelType_Modename();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Mode
   * @generated
   */
  EClass getMode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Mode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Mode#getName()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.nv.dsl.mMDSL.Mode#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Classname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Mode#getClassname()
   * @see #getMode()
   * @generated
   */
  EReference getMode_Classname();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.nv.dsl.mMDSL.Mode#getRelationname <em>Relationname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Relationname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Mode#getRelationname()
   * @see #getMode()
   * @generated
   */
  EReference getMode_Relationname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SymbolClass <em>Symbol Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Class</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolClass
   * @generated
   */
  EClass getSymbolClass();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolClass#getName()
   * @see #getSymbolClass()
   * @generated
   */
  EAttribute getSymbolClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getGlobalstyle <em>Globalstyle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Globalstyle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolClass#getGlobalstyle()
   * @see #getSymbolClass()
   * @generated
   */
  EReference getSymbolClass_Globalstyle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SymbolClass#getSvgcommand <em>Svgcommand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Svgcommand</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolClass#getSvgcommand()
   * @see #getSymbolClass()
   * @generated
   */
  EReference getSymbolClass_Svgcommand();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation <em>Symbol Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Relation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolRelation
   * @generated
   */
  EClass getSymbolRelation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolRelation#getName()
   * @see #getSymbolRelation()
   * @generated
   */
  EAttribute getSymbolRelation_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getGlobalstyle <em>Globalstyle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Globalstyle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolRelation#getGlobalstyle()
   * @see #getSymbolRelation()
   * @generated
   */
  EReference getSymbolRelation_Globalstyle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsfrom <em>Svgcommandsfrom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Svgcommandsfrom</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsfrom()
   * @see #getSymbolRelation()
   * @generated
   */
  EReference getSymbolRelation_Svgcommandsfrom();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsmiddle <em>Svgcommandsmiddle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Svgcommandsmiddle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsmiddle()
   * @see #getSymbolRelation()
   * @generated
   */
  EReference getSymbolRelation_Svgcommandsmiddle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsto <em>Svgcommandsto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Svgcommandsto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolRelation#getSvgcommandsto()
   * @see #getSymbolRelation()
   * @generated
   */
  EReference getSymbolRelation_Svgcommandsto();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SVGCommand <em>SVG Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SVG Command</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand
   * @generated
   */
  EClass getSVGCommand();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getInsertembedcode <em>Insertembedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Insertembedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getInsertembedcode()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Insertembedcode();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getRectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rectangle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getRectangle()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Rectangle();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getCircle <em>Circle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Circle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getCircle()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Circle();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getEllipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ellipse</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getEllipse()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Ellipse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Line</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getLine()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Line();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getPolyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Polyline</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getPolyline()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Polyline();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getPolygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Polygon</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getPolygon()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Polygon();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getPath()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Path();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getText()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getSymbolstyle <em>Symbolstyle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Symbolstyle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getSymbolstyle()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Symbolstyle();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.SVGCommand#getSymbolstyleref <em>Symbolstyleref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbolstyleref</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SVGCommand#getSymbolstyleref()
   * @see #getSVGCommand()
   * @generated
   */
  EReference getSVGCommand_Symbolstyleref();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rectangle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Rectangle
   * @generated
   */
  EClass getRectangle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Rectangle#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Rectangle#getX()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Rectangle#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Rectangle#getY()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Y();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Rectangle#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Rectangle#getWidth()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Width();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Rectangle#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Rectangle#getHeight()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Height();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Circle <em>Circle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Circle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Circle
   * @generated
   */
  EClass getCircle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Circle#getCx <em>Cx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cx</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Circle#getCx()
   * @see #getCircle()
   * @generated
   */
  EAttribute getCircle_Cx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Circle#getCy <em>Cy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cy</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Circle#getCy()
   * @see #getCircle()
   * @generated
   */
  EAttribute getCircle_Cy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Circle#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Circle#getR()
   * @see #getCircle()
   * @generated
   */
  EAttribute getCircle_R();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ellipse</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Ellipse
   * @generated
   */
  EClass getEllipse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Ellipse#getCx <em>Cx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cx</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Ellipse#getCx()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Cx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Ellipse#getCy <em>Cy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cy</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Ellipse#getCy()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Cy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Ellipse#getRx <em>Rx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rx</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Ellipse#getRx()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Rx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Ellipse#getRy <em>Ry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ry</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Ellipse#getRy()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Ry();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Line#getX1 <em>X1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X1</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Line#getX1()
   * @see #getLine()
   * @generated
   */
  EAttribute getLine_X1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Line#getY1 <em>Y1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y1</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Line#getY1()
   * @see #getLine()
   * @generated
   */
  EAttribute getLine_Y1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Line#getX2 <em>X2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X2</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Line#getX2()
   * @see #getLine()
   * @generated
   */
  EAttribute getLine_X2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Line#getY2 <em>Y2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y2</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Line#getY2()
   * @see #getLine()
   * @generated
   */
  EAttribute getLine_Y2();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Polyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polyline</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Polyline
   * @generated
   */
  EClass getPolyline();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Polyline#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Polyline#getPoints()
   * @see #getPolyline()
   * @generated
   */
  EReference getPolyline_Points();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Polygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polygon</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Polygon
   * @generated
   */
  EClass getPolygon();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Polygon#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Polygon#getPoints()
   * @see #getPolygon()
   * @generated
   */
  EReference getPolygon_Points();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Path#getPathdata <em>Pathdata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pathdata</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Path#getPathdata()
   * @see #getPath()
   * @generated
   */
  EReference getPath_Pathdata();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Text#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Text#getValue()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Text#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Text#getX()
   * @see #getText()
   * @generated
   */
  EAttribute getText_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Text#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Text#getY()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Y();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Text#getFontfamily <em>Fontfamily</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fontfamily</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Text#getFontfamily()
   * @see #getText()
   * @generated
   */
  EReference getText_Fontfamily();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Text#getFontsize <em>Fontsize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fontsize</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Text#getFontsize()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Fontsize();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Text#getFillcolor <em>Fillcolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fillcolor</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Text#getFillcolor()
   * @see #getText()
   * @generated
   */
  EReference getText_Fillcolor();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.PathData <em>Path Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Data</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData
   * @generated
   */
  EClass getPathData();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getMoveto <em>Moveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Moveto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getMoveto()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Moveto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getLineto <em>Lineto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lineto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getLineto()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Lineto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getHorizontallineto <em>Horizontallineto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horizontallineto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getHorizontallineto()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Horizontallineto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getVerticallineto <em>Verticallineto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verticallineto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getVerticallineto()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Verticallineto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getCurveto <em>Curveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Curveto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getCurveto()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Curveto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getSmoothcurveto <em>Smoothcurveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Smoothcurveto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getSmoothcurveto()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Smoothcurveto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getQuadraticbeziercurve <em>Quadraticbeziercurve</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quadraticbeziercurve</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getQuadraticbeziercurve()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Quadraticbeziercurve();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getSmoothquadraticbeziercurveto <em>Smoothquadraticbeziercurveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Smoothquadraticbeziercurveto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getSmoothquadraticbeziercurveto()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Smoothquadraticbeziercurveto();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.PathData#getEllipticalarc <em>Ellipticalarc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ellipticalarc</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getEllipticalarc()
   * @see #getPathData()
   * @generated
   */
  EReference getPathData_Ellipticalarc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathData#getClosepath <em>Closepath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Closepath</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathData#getClosepath()
   * @see #getPathData()
   * @generated
   */
  EAttribute getPathData_Closepath();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.MoveTo <em>Move To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Move To</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MoveTo
   * @generated
   */
  EClass getMoveTo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.MoveTo#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MoveTo#getParameters()
   * @see #getMoveTo()
   * @generated
   */
  EReference getMoveTo_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.LineTo <em>Line To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line To</em>'.
   * @see org.xtext.nv.dsl.mMDSL.LineTo
   * @generated
   */
  EClass getLineTo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.LineTo#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.LineTo#getParameters()
   * @see #getLineTo()
   * @generated
   */
  EReference getLineTo_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.HorizontalLineTo <em>Horizontal Line To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Horizontal Line To</em>'.
   * @see org.xtext.nv.dsl.mMDSL.HorizontalLineTo
   * @generated
   */
  EClass getHorizontalLineTo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.HorizontalLineTo#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.HorizontalLineTo#getParameters()
   * @see #getHorizontalLineTo()
   * @generated
   */
  EReference getHorizontalLineTo_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.VerticalLineTo <em>Vertical Line To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertical Line To</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VerticalLineTo
   * @generated
   */
  EClass getVerticalLineTo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.VerticalLineTo#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VerticalLineTo#getParameters()
   * @see #getVerticalLineTo()
   * @generated
   */
  EReference getVerticalLineTo_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.CurveTo <em>Curve To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Curve To</em>'.
   * @see org.xtext.nv.dsl.mMDSL.CurveTo
   * @generated
   */
  EClass getCurveTo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.CurveTo#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.CurveTo#getParameters()
   * @see #getCurveTo()
   * @generated
   */
  EReference getCurveTo_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SmoothCurveTo <em>Smooth Curve To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smooth Curve To</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SmoothCurveTo
   * @generated
   */
  EClass getSmoothCurveTo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SmoothCurveTo#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SmoothCurveTo#getParameters()
   * @see #getSmoothCurveTo()
   * @generated
   */
  EReference getSmoothCurveTo_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve <em>Quadratic Bezier Curve</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quadratic Bezier Curve</em>'.
   * @see org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve
   * @generated
   */
  EClass getQuadraticBezierCurve();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.QuadraticBezierCurve#getParameters()
   * @see #getQuadraticBezierCurve()
   * @generated
   */
  EReference getQuadraticBezierCurve_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo <em>Smooth Quadratic Bezier Curve To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smooth Quadratic Bezier Curve To</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo
   * @generated
   */
  EClass getSmoothQuadraticBezierCurveTo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SmoothQuadraticBezierCurveTo#getParameters()
   * @see #getSmoothQuadraticBezierCurveTo()
   * @generated
   */
  EReference getSmoothQuadraticBezierCurveTo_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.EllipticalArc <em>Elliptical Arc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elliptical Arc</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EllipticalArc
   * @generated
   */
  EClass getEllipticalArc();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.EllipticalArc#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EllipticalArc#getParameters()
   * @see #getEllipticalArc()
   * @generated
   */
  EReference getEllipticalArc_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Points <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Points</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Points
   * @generated
   */
  EClass getPoints();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Points#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Points#getX()
   * @see #getPoints()
   * @generated
   */
  EAttribute getPoints_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Points#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Points#getY()
   * @see #getPoints()
   * @generated
   */
  EAttribute getPoints_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.PathParametersHV <em>Path Parameters HV</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Parameters HV</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersHV
   * @generated
   */
  EClass getPathParametersHV();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersHV#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersHV#getX()
   * @see #getPathParametersHV()
   * @generated
   */
  EAttribute getPathParametersHV_X();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.PathParametersMLT <em>Path Parameters MLT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Parameters MLT</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersMLT
   * @generated
   */
  EClass getPathParametersMLT();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersMLT#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersMLT#getX()
   * @see #getPathParametersMLT()
   * @generated
   */
  EAttribute getPathParametersMLT_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersMLT#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersMLT#getY()
   * @see #getPathParametersMLT()
   * @generated
   */
  EAttribute getPathParametersMLT_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.PathParametersS <em>Path Parameters S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Parameters S</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersS
   * @generated
   */
  EClass getPathParametersS();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersS#getX2 <em>X2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X2</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersS#getX2()
   * @see #getPathParametersS()
   * @generated
   */
  EAttribute getPathParametersS_X2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersS#getY2 <em>Y2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y2</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersS#getY2()
   * @see #getPathParametersS()
   * @generated
   */
  EAttribute getPathParametersS_Y2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersS#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersS#getX()
   * @see #getPathParametersS()
   * @generated
   */
  EAttribute getPathParametersS_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersS#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersS#getY()
   * @see #getPathParametersS()
   * @generated
   */
  EAttribute getPathParametersS_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.PathParametersQ <em>Path Parameters Q</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Parameters Q</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersQ
   * @generated
   */
  EClass getPathParametersQ();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersQ#getX1 <em>X1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X1</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersQ#getX1()
   * @see #getPathParametersQ()
   * @generated
   */
  EAttribute getPathParametersQ_X1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersQ#getY1 <em>Y1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y1</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersQ#getY1()
   * @see #getPathParametersQ()
   * @generated
   */
  EAttribute getPathParametersQ_Y1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersQ#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersQ#getX()
   * @see #getPathParametersQ()
   * @generated
   */
  EAttribute getPathParametersQ_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersQ#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersQ#getY()
   * @see #getPathParametersQ()
   * @generated
   */
  EAttribute getPathParametersQ_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.PathParametersC <em>Path Parameters C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Parameters C</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC
   * @generated
   */
  EClass getPathParametersC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersC#getX1 <em>X1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X1</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC#getX1()
   * @see #getPathParametersC()
   * @generated
   */
  EAttribute getPathParametersC_X1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersC#getY1 <em>Y1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y1</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC#getY1()
   * @see #getPathParametersC()
   * @generated
   */
  EAttribute getPathParametersC_Y1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersC#getX2 <em>X2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X2</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC#getX2()
   * @see #getPathParametersC()
   * @generated
   */
  EAttribute getPathParametersC_X2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersC#getY2 <em>Y2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y2</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC#getY2()
   * @see #getPathParametersC()
   * @generated
   */
  EAttribute getPathParametersC_Y2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersC#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC#getX()
   * @see #getPathParametersC()
   * @generated
   */
  EAttribute getPathParametersC_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersC#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersC#getY()
   * @see #getPathParametersC()
   * @generated
   */
  EAttribute getPathParametersC_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.PathParametersA <em>Path Parameters A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Parameters A</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA
   * @generated
   */
  EClass getPathParametersA();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersA#getRx <em>Rx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rx</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA#getRx()
   * @see #getPathParametersA()
   * @generated
   */
  EAttribute getPathParametersA_Rx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersA#getRy <em>Ry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ry</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA#getRy()
   * @see #getPathParametersA()
   * @generated
   */
  EAttribute getPathParametersA_Ry();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersA#getXaxisrot <em>Xaxisrot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xaxisrot</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA#getXaxisrot()
   * @see #getPathParametersA()
   * @generated
   */
  EAttribute getPathParametersA_Xaxisrot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersA#getLargearcflag <em>Largearcflag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Largearcflag</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA#getLargearcflag()
   * @see #getPathParametersA()
   * @generated
   */
  EAttribute getPathParametersA_Largearcflag();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersA#getSweepflag <em>Sweepflag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sweepflag</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA#getSweepflag()
   * @see #getPathParametersA()
   * @generated
   */
  EAttribute getPathParametersA_Sweepflag();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersA#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA#getX()
   * @see #getPathParametersA()
   * @generated
   */
  EAttribute getPathParametersA_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.PathParametersA#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.nv.dsl.mMDSL.PathParametersA#getY()
   * @see #getPathParametersA()
   * @generated
   */
  EAttribute getPathParametersA_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle <em>Symbol Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Style</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle
   * @generated
   */
  EClass getSymbolStyle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle#getName()
   * @see #getSymbolStyle()
   * @generated
   */
  EAttribute getSymbolStyle_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFillcolor <em>Fillcolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fillcolor</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle#getFillcolor()
   * @see #getSymbolStyle()
   * @generated
   */
  EReference getSymbolStyle_Fillcolor();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokecolor <em>Strokecolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Strokecolor</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokecolor()
   * @see #getSymbolStyle()
   * @generated
   */
  EReference getSymbolStyle_Strokecolor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokewidth <em>Strokewidth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strokewidth</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle#getStrokewidth()
   * @see #getSymbolStyle()
   * @generated
   */
  EAttribute getSymbolStyle_Strokewidth();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontfamily <em>Fontfamily</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fontfamily</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontfamily()
   * @see #getSymbolStyle()
   * @generated
   */
  EReference getSymbolStyle_Fontfamily();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontsize <em>Fontsize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fontsize</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle#getFontsize()
   * @see #getSymbolStyle()
   * @generated
   */
  EAttribute getSymbolStyle_Fontsize();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SymbolStyle#getInsertembedcode <em>Insertembedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Insertembedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SymbolStyle#getInsertembedcode()
   * @see #getSymbolStyle()
   * @generated
   */
  EReference getSymbolStyle_Insertembedcode();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FillColor <em>Fill Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill Color</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FillColor
   * @generated
   */
  EClass getFillColor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FillColor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FillColor#getColor()
   * @see #getFillColor()
   * @generated
   */
  EAttribute getFillColor_Color();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FillColor#getHexcolor <em>Hexcolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hexcolor</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FillColor#getHexcolor()
   * @see #getFillColor()
   * @generated
   */
  EAttribute getFillColor_Hexcolor();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.StrokeColor <em>Stroke Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stroke Color</em>'.
   * @see org.xtext.nv.dsl.mMDSL.StrokeColor
   * @generated
   */
  EClass getStrokeColor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.StrokeColor#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.xtext.nv.dsl.mMDSL.StrokeColor#getColor()
   * @see #getStrokeColor()
   * @generated
   */
  EAttribute getStrokeColor_Color();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.StrokeColor#getHexcolor <em>Hexcolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hexcolor</em>'.
   * @see org.xtext.nv.dsl.mMDSL.StrokeColor#getHexcolor()
   * @see #getStrokeColor()
   * @generated
   */
  EAttribute getStrokeColor_Hexcolor();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FontFamily <em>Font Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Family</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FontFamily
   * @generated
   */
  EClass getFontFamily();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FontFamily#getFontstr <em>Fontstr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fontstr</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FontFamily#getFontstr()
   * @see #getFontFamily()
   * @generated
   */
  EAttribute getFontFamily_Fontstr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FontFamily#getFont <em>Font</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Font</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FontFamily#getFont()
   * @see #getFontFamily()
   * @generated
   */
  EAttribute getFontFamily_Font();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Algorithm <em>Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Algorithm</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Algorithm
   * @generated
   */
  EClass getAlgorithm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Algorithm#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Algorithm#getName()
   * @see #getAlgorithm()
   * @generated
   */
  EAttribute getAlgorithm_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.Algorithm#getStmnt <em>Stmnt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmnt</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Algorithm#getStmnt()
   * @see #getAlgorithm()
   * @generated
   */
  EReference getAlgorithm_Stmnt();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Statement#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Statement#getSelection()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Selection();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Statement#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Statement#getLoop()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Loop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Statement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Statement#getVariable()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Statement#getAlgorithmoperation <em>Algorithmoperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Algorithmoperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Statement#getAlgorithmoperation()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Algorithmoperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Statement#getInsertembedcode <em>Insertembedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Insertembedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Statement#getInsertembedcode()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Insertembedcode();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement <em>Selection Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Statement</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SelectionStatement
   * @generated
   */
  EClass getSelectionStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getIfcondition <em>Ifcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifcondition</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SelectionStatement#getIfcondition()
   * @see #getSelectionStatement()
   * @generated
   */
  EReference getSelectionStatement_Ifcondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getIfblock <em>Ifblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ifblock</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SelectionStatement#getIfblock()
   * @see #getSelectionStatement()
   * @generated
   */
  EReference getSelectionStatement_Ifblock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseifcondition <em>Elseifcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseifcondition</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseifcondition()
   * @see #getSelectionStatement()
   * @generated
   */
  EReference getSelectionStatement_Elseifcondition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseifblock <em>Elseifblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseifblock</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseifblock()
   * @see #getSelectionStatement()
   * @generated
   */
  EReference getSelectionStatement_Elseifblock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseblock <em>Elseblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseblock</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SelectionStatement#getElseblock()
   * @see #getSelectionStatement()
   * @generated
   */
  EReference getSelectionStatement_Elseblock();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.LoopStatement <em>Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Statement</em>'.
   * @see org.xtext.nv.dsl.mMDSL.LoopStatement
   * @generated
   */
  EClass getLoopStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.LoopStatement#getWhiletloop <em>Whiletloop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Whiletloop</em>'.
   * @see org.xtext.nv.dsl.mMDSL.LoopStatement#getWhiletloop()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_Whiletloop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.LoopStatement#getForloop <em>Forloop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forloop</em>'.
   * @see org.xtext.nv.dsl.mMDSL.LoopStatement#getForloop()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_Forloop();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.WhileLoop <em>While Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Loop</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WhileLoop
   * @generated
   */
  EClass getWhileLoop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.WhileLoop#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WhileLoop#getCondition()
   * @see #getWhileLoop()
   * @generated
   */
  EReference getWhileLoop_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.WhileLoop#getWhileblock <em>Whileblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Whileblock</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WhileLoop#getWhileblock()
   * @see #getWhileLoop()
   * @generated
   */
  EReference getWhileLoop_Whileblock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.WhileLoop#getBreakcontinue <em>Breakcontinue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Breakcontinue</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WhileLoop#getBreakcontinue()
   * @see #getWhileLoop()
   * @generated
   */
  EReference getWhileLoop_Breakcontinue();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ForLoop <em>For Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Loop</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ForLoop
   * @generated
   */
  EClass getForLoop();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ForLoop#getStart()
   * @see #getForLoop()
   * @generated
   */
  EAttribute getForLoop_Start();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getStop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stop</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ForLoop#getStop()
   * @see #getForLoop()
   * @generated
   */
  EAttribute getForLoop_Stop();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interval</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ForLoop#getInterval()
   * @see #getForLoop()
   * @generated
   */
  EAttribute getForLoop_Interval();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getForblock <em>Forblock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Forblock</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ForLoop#getForblock()
   * @see #getForLoop()
   * @generated
   */
  EReference getForLoop_Forblock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.nv.dsl.mMDSL.ForLoop#getBreakcontinue <em>Breakcontinue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Breakcontinue</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ForLoop#getBreakcontinue()
   * @see #getForLoop()
   * @generated
   */
  EReference getForLoop_Breakcontinue();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.BreakContinue <em>Break Continue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Continue</em>'.
   * @see org.xtext.nv.dsl.mMDSL.BreakContinue
   * @generated
   */
  EClass getBreakContinue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.BreakContinue#getBreak <em>Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Break</em>'.
   * @see org.xtext.nv.dsl.mMDSL.BreakContinue#getBreak()
   * @see #getBreakContinue()
   * @generated
   */
  EAttribute getBreakContinue_Break();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.BreakContinue#getContinue <em>Continue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Continue</em>'.
   * @see org.xtext.nv.dsl.mMDSL.BreakContinue#getContinue()
   * @see #getBreakContinue()
   * @generated
   */
  EAttribute getBreakContinue_Continue();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Variable#getOpassing <em>Opassing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opassing</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Variable#getOpassing()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Opassing();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Variable#getVarstatement <em>Varstatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Varstatement</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Variable#getVarstatement()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Varstatement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Variable#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Variable#getVariable()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Variable();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.VarStatement <em>Var Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Statement</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement
   * @generated
   */
  EClass getVarStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getExpression()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getAlgorithmoperation <em>Algorithmoperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Algorithmoperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getAlgorithmoperation()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Algorithmoperation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getClass_()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Class();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getAttribute()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Attribute();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getReference()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Reference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolclass <em>Symbolclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbolclass</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolclass()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Symbolclass();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolrelation <em>Symbolrelation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbolrelation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolrelation()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Symbolrelation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolstyle <em>Symbolstyle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbolstyle</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getSymbolstyle()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Symbolstyle();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getEmbeddedcode <em>Embeddedcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Embeddedcode</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getEmbeddedcode()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Embeddedcode();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.VarStatement#getModeltype <em>Modeltype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modeltype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.VarStatement#getModeltype()
   * @see #getVarStatement()
   * @generated
   */
  EReference getVarStatement_Modeltype();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorAssign <em>Operator Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Assign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAssign
   * @generated
   */
  EClass getOperatorAssign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorAssign#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAssign#getAssign()
   * @see #getOperatorAssign()
   * @generated
   */
  EAttribute getOperatorAssign_Assign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.OperatorAssign#getMultyassign <em>Multyassign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multyassign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAssign#getMultyassign()
   * @see #getOperatorAssign()
   * @generated
   */
  EReference getOperatorAssign_Multyassign();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorMultyAssign <em>Operator Multy Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Multy Assign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultyAssign
   * @generated
   */
  EClass getOperatorMultyAssign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getAddassign <em>Addassign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addassign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getAddassign()
   * @see #getOperatorMultyAssign()
   * @generated
   */
  EAttribute getOperatorMultyAssign_Addassign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getSubassign <em>Subassign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subassign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getSubassign()
   * @see #getOperatorMultyAssign()
   * @generated
   */
  EAttribute getOperatorMultyAssign_Subassign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getMultiassign <em>Multiassign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiassign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getMultiassign()
   * @see #getOperatorMultyAssign()
   * @generated
   */
  EAttribute getOperatorMultyAssign_Multiassign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getDivassign <em>Divassign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Divassign</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultyAssign#getDivassign()
   * @see #getOperatorMultyAssign()
   * @generated
   */
  EAttribute getOperatorMultyAssign_Divassign();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorUnary <em>Operator Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Unary</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorUnary
   * @generated
   */
  EClass getOperatorUnary();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorUnary#getNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorUnary#getNot()
   * @see #getOperatorUnary()
   * @generated
   */
  EAttribute getOperatorUnary_Not();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply <em>Operator Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Multiply</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultiply
   * @generated
   */
  EClass getOperatorMultiply();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getMultiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiply</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultiply#getMultiply()
   * @see #getOperatorMultiply()
   * @generated
   */
  EAttribute getOperatorMultiply_Multiply();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getDivide <em>Divide</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Divide</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultiply#getDivide()
   * @see #getOperatorMultiply()
   * @generated
   */
  EAttribute getOperatorMultiply_Divide();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorMultiply#getModulo <em>Modulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modulo</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorMultiply#getModulo()
   * @see #getOperatorMultiply()
   * @generated
   */
  EAttribute getOperatorMultiply_Modulo();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorAdd <em>Operator Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Add</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAdd
   * @generated
   */
  EClass getOperatorAdd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorAdd#getAdd <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAdd#getAdd()
   * @see #getOperatorAdd()
   * @generated
   */
  EAttribute getOperatorAdd_Add();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorAdd#getSubtract <em>Subtract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subtract</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAdd#getSubtract()
   * @see #getOperatorAdd()
   * @generated
   */
  EAttribute getOperatorAdd_Subtract();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorCompare <em>Operator Compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Compare</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorCompare
   * @generated
   */
  EClass getOperatorCompare();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorCompare#getGreaterequal <em>Greaterequal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Greaterequal</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorCompare#getGreaterequal()
   * @see #getOperatorCompare()
   * @generated
   */
  EAttribute getOperatorCompare_Greaterequal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorCompare#getLesserequal <em>Lesserequal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lesserequal</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorCompare#getLesserequal()
   * @see #getOperatorCompare()
   * @generated
   */
  EAttribute getOperatorCompare_Lesserequal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorCompare#getGreater <em>Greater</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Greater</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorCompare#getGreater()
   * @see #getOperatorCompare()
   * @generated
   */
  EAttribute getOperatorCompare_Greater();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorCompare#getLesser <em>Lesser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lesser</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorCompare#getLesser()
   * @see #getOperatorCompare()
   * @generated
   */
  EAttribute getOperatorCompare_Lesser();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorEqual <em>Operator Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Equal</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorEqual
   * @generated
   */
  EClass getOperatorEqual();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorEqual#getEqual <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equal</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorEqual#getEqual()
   * @see #getOperatorEqual()
   * @generated
   */
  EAttribute getOperatorEqual_Equal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorEqual#getNotequal <em>Notequal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Notequal</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorEqual#getNotequal()
   * @see #getOperatorEqual()
   * @generated
   */
  EAttribute getOperatorEqual_Notequal();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorAnd <em>Operator And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator And</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAnd
   * @generated
   */
  EClass getOperatorAnd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorAnd#getAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorAnd#getAnd()
   * @see #getOperatorAnd()
   * @generated
   */
  EAttribute getOperatorAnd_And();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OperatorOr <em>Operator Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator Or</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorOr
   * @generated
   */
  EClass getOperatorOr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.OperatorOr#getOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OperatorOr#getOr()
   * @see #getOperatorOr()
   * @generated
   */
  EAttribute getOperatorOr_Or();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Expr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expr#getExpr()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Expression#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getOperand()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Operand();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Expression#getAtomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atomic</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getAtomic()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Atomic();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Expression#getTrue <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>True</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getTrue()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_True();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Expression#getFalse <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>False</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getFalse()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_False();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Expression#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getVariable()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Expression#getValueString <em>Value String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value String</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getValueString()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_ValueString();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Expression#getValueRealNumber <em>Value Real Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Real Number</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getValueRealNumber()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_ValueRealNumber();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation <em>Algorithm Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Algorithm Operation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation
   * @generated
   */
  EClass getAlgorithmOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getFileoperation <em>Fileoperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fileoperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getFileoperation()
   * @see #getAlgorithmOperation()
   * @generated
   */
  EReference getAlgorithmOperation_Fileoperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getDiroperation <em>Diroperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Diroperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getDiroperation()
   * @see #getAlgorithmOperation()
   * @generated
   */
  EReference getAlgorithmOperation_Diroperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getSimpleui <em>Simpleui</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simpleui</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getSimpleui()
   * @see #getAlgorithmOperation()
   * @generated
   */
  EReference getAlgorithmOperation_Simpleui();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getModeloperation <em>Modeloperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modeloperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getModeloperation()
   * @see #getAlgorithmOperation()
   * @generated
   */
  EReference getAlgorithmOperation_Modeloperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getInstanceoperation <em>Instanceoperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instanceoperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getInstanceoperation()
   * @see #getAlgorithmOperation()
   * @generated
   */
  EReference getAlgorithmOperation_Instanceoperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getAttributeoperation <em>Attributeoperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributeoperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AlgorithmOperation#getAttributeoperation()
   * @see #getAlgorithmOperation()
   * @generated
   */
  EReference getAlgorithmOperation_Attributeoperation();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FileOperation <em>File Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Operation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileOperation
   * @generated
   */
  EClass getFileOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilecopy <em>Filecopy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filecopy</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileOperation#getFilecopy()
   * @see #getFileOperation()
   * @generated
   */
  EReference getFileOperation_Filecopy();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFiledelete <em>Filedelete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filedelete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileOperation#getFiledelete()
   * @see #getFileOperation()
   * @generated
   */
  EReference getFileOperation_Filedelete();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilecreate <em>Filecreate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filecreate</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileOperation#getFilecreate()
   * @see #getFileOperation()
   * @generated
   */
  EReference getFileOperation_Filecreate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFileread <em>Fileread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fileread</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileOperation#getFileread()
   * @see #getFileOperation()
   * @generated
   */
  EReference getFileOperation_Fileread();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.FileOperation#getFilewrite <em>Filewrite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filewrite</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileOperation#getFilewrite()
   * @see #getFileOperation()
   * @generated
   */
  EReference getFileOperation_Filewrite();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FileCopy <em>File Copy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Copy</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileCopy
   * @generated
   */
  EClass getFileCopy();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileCopy#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Src</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileCopy#getSrc()
   * @see #getFileCopy()
   * @generated
   */
  EAttribute getFileCopy_Src();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileCopy#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dest</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileCopy#getDest()
   * @see #getFileCopy()
   * @generated
   */
  EAttribute getFileCopy_Dest();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FileDelete <em>File Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Delete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileDelete
   * @generated
   */
  EClass getFileDelete();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileDelete#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileDelete#getFilename()
   * @see #getFileDelete()
   * @generated
   */
  EAttribute getFileDelete_Filename();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FileCreate <em>File Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Create</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileCreate
   * @generated
   */
  EClass getFileCreate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileCreate#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileCreate#getFilename()
   * @see #getFileCreate()
   * @generated
   */
  EAttribute getFileCreate_Filename();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FileRead <em>File Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Read</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileRead
   * @generated
   */
  EClass getFileRead();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileRead#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileRead#getFilename()
   * @see #getFileRead()
   * @generated
   */
  EAttribute getFileRead_Filename();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.FileWrite <em>File Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Write</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileWrite
   * @generated
   */
  EClass getFileWrite();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileWrite#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileWrite#getFilename()
   * @see #getFileWrite()
   * @generated
   */
  EAttribute getFileWrite_Filename();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileWrite#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileWrite#getText()
   * @see #getFileWrite()
   * @generated
   */
  EAttribute getFileWrite_Text();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.FileWrite#getAppend <em>Append</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Append</em>'.
   * @see org.xtext.nv.dsl.mMDSL.FileWrite#getAppend()
   * @see #getFileWrite()
   * @generated
   */
  EAttribute getFileWrite_Append();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.DirOperation <em>Dir Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dir Operation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirOperation
   * @generated
   */
  EClass getDirOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.DirOperation#getDirsetworking <em>Dirsetworking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dirsetworking</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirOperation#getDirsetworking()
   * @see #getDirOperation()
   * @generated
   */
  EReference getDirOperation_Dirsetworking();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.DirOperation#getDirgetworking <em>Dirgetworking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dirgetworking</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirOperation#getDirgetworking()
   * @see #getDirOperation()
   * @generated
   */
  EReference getDirOperation_Dirgetworking();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.DirOperation#getDircreate <em>Dircreate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dircreate</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirOperation#getDircreate()
   * @see #getDirOperation()
   * @generated
   */
  EReference getDirOperation_Dircreate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.DirOperation#getDirdelete <em>Dirdelete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dirdelete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirOperation#getDirdelete()
   * @see #getDirOperation()
   * @generated
   */
  EReference getDirOperation_Dirdelete();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.DirOperation#getDirlist <em>Dirlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dirlist</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirOperation#getDirlist()
   * @see #getDirOperation()
   * @generated
   */
  EReference getDirOperation_Dirlist();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.DirSetWorking <em>Dir Set Working</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dir Set Working</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirSetWorking
   * @generated
   */
  EClass getDirSetWorking();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.DirSetWorking#getDirname <em>Dirname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirSetWorking#getDirname()
   * @see #getDirSetWorking()
   * @generated
   */
  EAttribute getDirSetWorking_Dirname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.DirGetWorking <em>Dir Get Working</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dir Get Working</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirGetWorking
   * @generated
   */
  EClass getDirGetWorking();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.DirCreate <em>Dir Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dir Create</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirCreate
   * @generated
   */
  EClass getDirCreate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.DirCreate#getDirname <em>Dirname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirCreate#getDirname()
   * @see #getDirCreate()
   * @generated
   */
  EAttribute getDirCreate_Dirname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.DirDelete <em>Dir Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dir Delete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirDelete
   * @generated
   */
  EClass getDirDelete();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.DirDelete#getDirname <em>Dirname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirDelete#getDirname()
   * @see #getDirDelete()
   * @generated
   */
  EAttribute getDirDelete_Dirname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.DirList <em>Dir List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dir List</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirList
   * @generated
   */
  EClass getDirList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.DirList#getDirname <em>Dirname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.DirList#getDirname()
   * @see #getDirList()
   * @generated
   */
  EAttribute getDirList_Dirname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.SimpleUI <em>Simple UI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple UI</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI
   * @generated
   */
  EClass getSimpleUI();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SimpleUI#getEditbox <em>Editbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Editbox</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI#getEditbox()
   * @see #getSimpleUI()
   * @generated
   */
  EReference getSimpleUI_Editbox();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SimpleUI#getInfobox <em>Infobox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infobox</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI#getInfobox()
   * @see #getSimpleUI()
   * @generated
   */
  EReference getSimpleUI_Infobox();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SimpleUI#getErrorbox <em>Errorbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Errorbox</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI#getErrorbox()
   * @see #getSimpleUI()
   * @generated
   */
  EReference getSimpleUI_Errorbox();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SimpleUI#getWarningbox <em>Warningbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Warningbox</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI#getWarningbox()
   * @see #getSimpleUI()
   * @generated
   */
  EReference getSimpleUI_Warningbox();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SimpleUI#getViewbox <em>Viewbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Viewbox</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI#getViewbox()
   * @see #getSimpleUI()
   * @generated
   */
  EReference getSimpleUI_Viewbox();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.SimpleUI#getItemoperation <em>Itemoperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Itemoperation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleUI#getItemoperation()
   * @see #getSimpleUI()
   * @generated
   */
  EReference getSimpleUI_Itemoperation();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.EditBox <em>Edit Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edit Box</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EditBox
   * @generated
   */
  EClass getEditBox();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.EditBox#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EditBox#getTitle()
   * @see #getEditBox()
   * @generated
   */
  EAttribute getEditBox_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.EditBox#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EditBox#getText()
   * @see #getEditBox()
   * @generated
   */
  EAttribute getEditBox_Text();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.EditBox#getOkbuttontext <em>Okbuttontext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Okbuttontext</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EditBox#getOkbuttontext()
   * @see #getEditBox()
   * @generated
   */
  EAttribute getEditBox_Okbuttontext();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.InfoBox <em>Info Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Info Box</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InfoBox
   * @generated
   */
  EClass getInfoBox();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.InfoBox#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InfoBox#getTitle()
   * @see #getInfoBox()
   * @generated
   */
  EAttribute getInfoBox_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.InfoBox#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InfoBox#getText()
   * @see #getInfoBox()
   * @generated
   */
  EAttribute getInfoBox_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ErrorBox <em>Error Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Box</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ErrorBox
   * @generated
   */
  EClass getErrorBox();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ErrorBox#getTitle()
   * @see #getErrorBox()
   * @generated
   */
  EAttribute getErrorBox_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ErrorBox#getText()
   * @see #getErrorBox()
   * @generated
   */
  EAttribute getErrorBox_Text();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ErrorBox#getButtontype <em>Buttontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buttontype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ErrorBox#getButtontype()
   * @see #getErrorBox()
   * @generated
   */
  EAttribute getErrorBox_Buttontype();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.WarningBox <em>Warning Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Warning Box</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WarningBox
   * @generated
   */
  EClass getWarningBox();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.WarningBox#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WarningBox#getTitle()
   * @see #getWarningBox()
   * @generated
   */
  EAttribute getWarningBox_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.WarningBox#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WarningBox#getText()
   * @see #getWarningBox()
   * @generated
   */
  EAttribute getWarningBox_Text();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.WarningBox#getButtontype <em>Buttontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Buttontype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.WarningBox#getButtontype()
   * @see #getWarningBox()
   * @generated
   */
  EAttribute getWarningBox_Buttontype();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ViewBox <em>View Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Box</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ViewBox
   * @generated
   */
  EClass getViewBox();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ViewBox#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ViewBox#getTitle()
   * @see #getViewBox()
   * @generated
   */
  EAttribute getViewBox_Title();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ViewBox#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ViewBox#getText()
   * @see #getViewBox()
   * @generated
   */
  EAttribute getViewBox_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ItemOperation <em>Item Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Operation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ItemOperation
   * @generated
   */
  EClass getItemOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ItemOperation#getMenuitem <em>Menuitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Menuitem</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ItemOperation#getMenuitem()
   * @see #getItemOperation()
   * @generated
   */
  EReference getItemOperation_Menuitem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ItemOperation#getContextitem <em>Contextitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contextitem</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ItemOperation#getContextitem()
   * @see #getItemOperation()
   * @generated
   */
  EReference getItemOperation_Contextitem();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.MenuItem <em>Menu Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu Item</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MenuItem
   * @generated
   */
  EClass getMenuItem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.MenuItem#getInsertmenuitem <em>Insertmenuitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Insertmenuitem</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MenuItem#getInsertmenuitem()
   * @see #getMenuItem()
   * @generated
   */
  EReference getMenuItem_Insertmenuitem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.MenuItem#getRemovemenuitem <em>Removemenuitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Removemenuitem</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MenuItem#getRemovemenuitem()
   * @see #getMenuItem()
   * @generated
   */
  EReference getMenuItem_Removemenuitem();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.InsertMenuItem <em>Insert Menu Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Menu Item</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertMenuItem
   * @generated
   */
  EClass getInsertMenuItem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.InsertMenuItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertMenuItem#getName()
   * @see #getInsertMenuItem()
   * @generated
   */
  EAttribute getInsertMenuItem_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.InsertMenuItem#getMenu <em>Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Menu</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertMenuItem#getMenu()
   * @see #getInsertMenuItem()
   * @generated
   */
  EAttribute getInsertMenuItem_Menu();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RemoveMenuItem <em>Remove Menu Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove Menu Item</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RemoveMenuItem
   * @generated
   */
  EClass getRemoveMenuItem();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RemoveMenuItem#getMenuitemname <em>Menuitemname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Menuitemname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RemoveMenuItem#getMenuitemname()
   * @see #getRemoveMenuItem()
   * @generated
   */
  EReference getRemoveMenuItem_Menuitemname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ContextItem <em>Context Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Item</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ContextItem
   * @generated
   */
  EClass getContextItem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ContextItem#getInsertcontextitem <em>Insertcontextitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Insertcontextitem</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ContextItem#getInsertcontextitem()
   * @see #getContextItem()
   * @generated
   */
  EReference getContextItem_Insertcontextitem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ContextItem#getRemovecontextitem <em>Removecontextitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Removecontextitem</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ContextItem#getRemovecontextitem()
   * @see #getContextItem()
   * @generated
   */
  EReference getContextItem_Removecontextitem();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.InsertContextItem <em>Insert Context Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Context Item</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertContextItem
   * @generated
   */
  EClass getInsertContextItem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.InsertContextItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertContextItem#getName()
   * @see #getInsertContextItem()
   * @generated
   */
  EAttribute getInsertContextItem_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.InsertContextItem#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InsertContextItem#getContext()
   * @see #getInsertContextItem()
   * @generated
   */
  EAttribute getInsertContextItem_Context();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RemoveContextItem <em>Remove Context Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove Context Item</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RemoveContextItem
   * @generated
   */
  EClass getRemoveContextItem();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RemoveContextItem#getContextitem <em>Contextitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Contextitem</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RemoveContextItem#getContextitem()
   * @see #getRemoveContextItem()
   * @generated
   */
  EReference getRemoveContextItem_Contextitem();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelOperation <em>Model Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Operation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation
   * @generated
   */
  EClass getModelOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelcreate <em>Modelcreate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modelcreate</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation#getModelcreate()
   * @see #getModelOperation()
   * @generated
   */
  EReference getModelOperation_Modelcreate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldelete <em>Modeldelete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modeldelete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldelete()
   * @see #getModelOperation()
   * @generated
   */
  EReference getModelOperation_Modeldelete();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldiscard <em>Modeldiscard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modeldiscard</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation#getModeldiscard()
   * @see #getModelOperation()
   * @generated
   */
  EReference getModelOperation_Modeldiscard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelsave <em>Modelsave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modelsave</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation#getModelsave()
   * @see #getModelOperation()
   * @generated
   */
  EReference getModelOperation_Modelsave();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelload <em>Modelload</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modelload</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation#getModelload()
   * @see #getModelOperation()
   * @generated
   */
  EReference getModelOperation_Modelload();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ModelOperation#getModelisloaded <em>Modelisloaded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modelisloaded</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelOperation#getModelisloaded()
   * @see #getModelOperation()
   * @generated
   */
  EReference getModelOperation_Modelisloaded();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelCreate <em>Model Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Create</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelCreate
   * @generated
   */
  EClass getModelCreate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ModelCreate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelCreate#getName()
   * @see #getModelCreate()
   * @generated
   */
  EAttribute getModelCreate_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ModelCreate#getModeltype <em>Modeltype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modeltype</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelCreate#getModeltype()
   * @see #getModelCreate()
   * @generated
   */
  EReference getModelCreate_Modeltype();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelDelete <em>Model Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Delete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelDelete
   * @generated
   */
  EClass getModelDelete();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ModelDelete#getModelname <em>Modelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modelname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelDelete#getModelname()
   * @see #getModelDelete()
   * @generated
   */
  EReference getModelDelete_Modelname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelDiscard <em>Model Discard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Discard</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelDiscard
   * @generated
   */
  EClass getModelDiscard();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ModelDiscard#getModelname <em>Modelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modelname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelDiscard#getModelname()
   * @see #getModelDiscard()
   * @generated
   */
  EReference getModelDiscard_Modelname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelSave <em>Model Save</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Save</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelSave
   * @generated
   */
  EClass getModelSave();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ModelSave#getModelname <em>Modelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modelname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelSave#getModelname()
   * @see #getModelSave()
   * @generated
   */
  EReference getModelSave_Modelname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelLoad <em>Model Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Load</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelLoad
   * @generated
   */
  EClass getModelLoad();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ModelLoad#getModelname <em>Modelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modelname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelLoad#getModelname()
   * @see #getModelLoad()
   * @generated
   */
  EReference getModelLoad_Modelname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ModelIsLoaded <em>Model Is Loaded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Is Loaded</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelIsLoaded
   * @generated
   */
  EClass getModelIsLoaded();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ModelIsLoaded#getModelname <em>Modelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modelname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ModelIsLoaded#getModelname()
   * @see #getModelIsLoaded()
   * @generated
   */
  EReference getModelIsLoaded_Modelname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.InstanceOperation <em>Instance Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Operation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InstanceOperation
   * @generated
   */
  EClass getInstanceOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.InstanceOperation#getClassinstance <em>Classinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InstanceOperation#getClassinstance()
   * @see #getInstanceOperation()
   * @generated
   */
  EReference getInstanceOperation_Classinstance();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.InstanceOperation#getRelationinstance <em>Relationinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.InstanceOperation#getRelationinstance()
   * @see #getInstanceOperation()
   * @generated
   */
  EReference getInstanceOperation_Relationinstance();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ClassInstance <em>Class Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Instance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstance
   * @generated
   */
  EClass getClassInstance();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstancecreate <em>Classinstancecreate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classinstancecreate</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstancecreate()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Classinstancecreate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstancedelete <em>Classinstancedelete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classinstancedelete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstancedelete()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Classinstancedelete();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstanceget <em>Classinstanceget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classinstanceget</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstanceget()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Classinstanceget();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstanceset <em>Classinstanceset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classinstanceset</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstanceset()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Classinstanceset();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstancegetall <em>Classinstancegetall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classinstancegetall</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstance#getClassinstancegetall()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Classinstancegetall();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate <em>Class Instance Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Instance Create</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceCreate
   * @generated
   */
  EClass getClassInstanceCreate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getName()
   * @see #getClassInstanceCreate()
   * @generated
   */
  EAttribute getClassInstanceCreate_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getNameofclass <em>Nameofclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofclass</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceCreate#getNameofclass()
   * @see #getClassInstanceCreate()
   * @generated
   */
  EReference getClassInstanceCreate_Nameofclass();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceDelete <em>Class Instance Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Instance Delete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceDelete
   * @generated
   */
  EClass getClassInstanceDelete();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceDelete#getNameofclassinstance <em>Nameofclassinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofclassinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceDelete#getNameofclassinstance()
   * @see #getClassInstanceDelete()
   * @generated
   */
  EReference getClassInstanceDelete_Nameofclassinstance();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGet <em>Class Instance Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Instance Get</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceGet
   * @generated
   */
  EClass getClassInstanceGet();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGet#getNameofclassinstance <em>Nameofclassinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofclassinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceGet#getNameofclassinstance()
   * @see #getClassInstanceGet()
   * @generated
   */
  EReference getClassInstanceGet_Nameofclassinstance();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll <em>Class Instance Get All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Instance Get All</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll
   * @generated
   */
  EClass getClassInstanceGetAll();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll#getNameofclass <em>Nameofclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofclass</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceGetAll#getNameofclass()
   * @see #getClassInstanceGetAll()
   * @generated
   */
  EReference getClassInstanceGetAll_Nameofclass();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceSet <em>Class Instance Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Instance Set</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceSet
   * @generated
   */
  EClass getClassInstanceSet();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.ClassInstanceSet#getNameofclassinstance <em>Nameofclassinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofclassinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ClassInstanceSet#getNameofclassinstance()
   * @see #getClassInstanceSet()
   * @generated
   */
  EReference getClassInstanceSet_Nameofclassinstance();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RelationInstance <em>Relation Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Instance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstance
   * @generated
   */
  EClass getRelationInstance();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstancecreate <em>Relationinstancecreate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationinstancecreate</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstancecreate()
   * @see #getRelationInstance()
   * @generated
   */
  EReference getRelationInstance_Relationinstancecreate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstancedelete <em>Relationinstancedelete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationinstancedelete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstancedelete()
   * @see #getRelationInstance()
   * @generated
   */
  EReference getRelationInstance_Relationinstancedelete();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstanceget <em>Relationinstanceget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationinstanceget</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstanceget()
   * @see #getRelationInstance()
   * @generated
   */
  EReference getRelationInstance_Relationinstanceget();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstanceset <em>Relationinstanceset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationinstanceset</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstanceset()
   * @see #getRelationInstance()
   * @generated
   */
  EReference getRelationInstance_Relationinstanceset();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstancegetall <em>Relationinstancegetall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationinstancegetall</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstance#getRelationinstancegetall()
   * @see #getRelationInstance()
   * @generated
   */
  EReference getRelationInstance_Relationinstancegetall();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate <em>Relation Instance Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Instance Create</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceCreate
   * @generated
   */
  EClass getRelationInstanceCreate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getName()
   * @see #getRelationInstanceCreate()
   * @generated
   */
  EAttribute getRelationInstanceCreate_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getNameofrelation <em>Nameofrelation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofrelation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getNameofrelation()
   * @see #getRelationInstanceCreate()
   * @generated
   */
  EReference getRelationInstanceCreate_Nameofrelation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstancefrom <em>Classinstancefrom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Classinstancefrom</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstancefrom()
   * @see #getRelationInstanceCreate()
   * @generated
   */
  EReference getRelationInstanceCreate_Classinstancefrom();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstanceto <em>Classinstanceto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Classinstanceto</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceCreate#getClassinstanceto()
   * @see #getRelationInstanceCreate()
   * @generated
   */
  EReference getRelationInstanceCreate_Classinstanceto();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceDelete <em>Relation Instance Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Instance Delete</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceDelete
   * @generated
   */
  EClass getRelationInstanceDelete();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceDelete#getNameofrelationinstance <em>Nameofrelationinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofrelationinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceDelete#getNameofrelationinstance()
   * @see #getRelationInstanceDelete()
   * @generated
   */
  EReference getRelationInstanceDelete_Nameofrelationinstance();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGet <em>Relation Instance Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Instance Get</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceGet
   * @generated
   */
  EClass getRelationInstanceGet();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGet#getNameofrelationinstance <em>Nameofrelationinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofrelationinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceGet#getNameofrelationinstance()
   * @see #getRelationInstanceGet()
   * @generated
   */
  EReference getRelationInstanceGet_Nameofrelationinstance();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll <em>Relation Instance Get All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Instance Get All</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll
   * @generated
   */
  EClass getRelationInstanceGetAll();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll#getNameofrelation <em>Nameofrelation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofrelation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceGetAll#getNameofrelation()
   * @see #getRelationInstanceGetAll()
   * @generated
   */
  EReference getRelationInstanceGetAll_Nameofrelation();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceSet <em>Relation Instance Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Instance Set</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceSet
   * @generated
   */
  EClass getRelationInstanceSet();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.RelationInstanceSet#getNameofrelationinstance <em>Nameofrelationinstance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nameofrelationinstance</em>'.
   * @see org.xtext.nv.dsl.mMDSL.RelationInstanceSet#getNameofrelationinstance()
   * @see #getRelationInstanceSet()
   * @generated
   */
  EReference getRelationInstanceSet_Nameofrelationinstance();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation <em>Attribute Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Operation</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeOperation
   * @generated
   */
  EClass getAttributeOperation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributename <em>Attributename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attributename</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributename()
   * @see #getAttributeOperation()
   * @generated
   */
  EReference getAttributeOperation_Attributename();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeget <em>Attributeget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributeget</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeget()
   * @see #getAttributeOperation()
   * @generated
   */
  EReference getAttributeOperation_Attributeget();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeset <em>Attributeset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributeset</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeOperation#getAttributeset()
   * @see #getAttributeOperation()
   * @generated
   */
  EReference getAttributeOperation_Attributeset();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.AttributeGet <em>Attribute Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Get</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeGet
   * @generated
   */
  EClass getAttributeGet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.AttributeGet#getAttrgetparams <em>Attrgetparams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attrgetparams</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeGet#getAttrgetparams()
   * @see #getAttributeGet()
   * @generated
   */
  EAttribute getAttributeGet_Attrgetparams();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.AttributeSet <em>Attribute Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Set</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeSet
   * @generated
   */
  EClass getAttributeSet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getAttrsetparams <em>Attrsetparams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attrsetparams</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeSet#getAttrsetparams()
   * @see #getAttributeSet()
   * @generated
   */
  EAttribute getAttributeSet_Attrsetparams();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueString <em>Value String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value String</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeSet#getValueString()
   * @see #getAttributeSet()
   * @generated
   */
  EAttribute getAttributeSet_ValueString();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueRealNumber <em>Value Real Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Real Number</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeSet#getValueRealNumber()
   * @see #getAttributeSet()
   * @generated
   */
  EAttribute getAttributeSet_ValueRealNumber();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.AttributeSet#getValueVariable <em>Value Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value Variable</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttributeSet#getValueVariable()
   * @see #getAttributeSet()
   * @generated
   */
  EReference getAttributeSet_ValueVariable();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.nv.dsl.mMDSL.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.nv.dsl.mMDSL.Event#getAlgorithmname <em>Algorithmname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Algorithmname</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Event#getAlgorithmname()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Algorithmname();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.EqualExpression <em>Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EqualExpression
   * @generated
   */
  EClass getEqualExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.CompareExpression <em>Compare Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.CompareExpression
   * @generated
   */
  EClass getCompareExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.AdditionExpression <em>Addition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AdditionExpression
   * @generated
   */
  EClass getAdditionExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.nv.dsl.mMDSL.MultiplicationExpression <em>Multiplication Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Expression</em>'.
   * @see org.xtext.nv.dsl.mMDSL.MultiplicationExpression
   * @generated
   */
  EClass getMultiplicationExpression();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.AccessType <em>Access Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AccessType
   * @generated
   */
  EEnum getAccessType();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Simple Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.SimpleType
   * @generated
   */
  EEnum getSimpleType();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.Font <em>Font</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Font</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Font
   * @generated
   */
  EEnum getFont();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color</em>'.
   * @see org.xtext.nv.dsl.mMDSL.Color
   * @generated
   */
  EEnum getColor();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.ButtonType <em>Button Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Button Type</em>'.
   * @see org.xtext.nv.dsl.mMDSL.ButtonType
   * @generated
   */
  EEnum getButtonType();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.AttrGetParams <em>Attr Get Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attr Get Params</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttrGetParams
   * @generated
   */
  EEnum getAttrGetParams();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.AttrSetParams <em>Attr Set Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attr Set Params</em>'.
   * @see org.xtext.nv.dsl.mMDSL.AttrSetParams
   * @generated
   */
  EEnum getAttrSetParams();

  /**
   * Returns the meta object for enum '{@link org.xtext.nv.dsl.mMDSL.EventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Event Name</em>'.
   * @see org.xtext.nv.dsl.mMDSL.EventName
   * @generated
   */
  EEnum getEventName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MMDSLFactory getMMDSLFactory();

} //MMDSLPackage
