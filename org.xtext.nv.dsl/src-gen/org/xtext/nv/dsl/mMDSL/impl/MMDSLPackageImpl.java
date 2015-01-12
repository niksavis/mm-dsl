/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.xtext.nv.dsl.mMDSL.MMDSLFactory;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MMDSLPackageImpl extends EPackageImpl implements MMDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "mMDSL.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeLibraryTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embedCodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embedPlatformTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embedCodeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertEmbedCodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metamodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass svgCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rectangleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass circleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ellipseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass polylineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass polygonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horizontalLineToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verticalLineToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass curveToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smoothCurveToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quadraticBezierCurveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smoothQuadraticBezierCurveToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ellipticalArcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathParametersHVEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathParametersMLTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathParametersSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathParametersQEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathParametersCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathParametersAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fillColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strokeColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontFamilyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass algorithmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileLoopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forLoopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakContinueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorAssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorMultyAssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorUnaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorMultiplyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorAddEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorCompareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass algorithmOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileCopyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileDeleteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileCreateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileReadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileWriteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirSetWorkingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirGetWorkingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirCreateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirDeleteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleUIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infoBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass warningBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertMenuItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass removeMenuItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertContextItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass removeContextItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelCreateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelDeleteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelDiscardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelSaveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelLoadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelIsLoadedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classInstanceCreateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classInstanceDeleteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classInstanceGetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classInstanceGetAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classInstanceSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationInstanceCreateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationInstanceDeleteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationInstanceGetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationInstanceGetAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationInstanceSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeGetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compareExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum simpleTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fontEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum buttonTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attrGetParamsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attrSetParamsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum eventNameEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.nv.dsl.mMDSL.MMDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MMDSLPackageImpl()
  {
    super(eNS_URI, MMDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MMDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static MMDSLPackage init()
  {
    if (isInited) return (MMDSLPackage)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI);

    // Obtain or create and register package
    MMDSLPackageImpl theMMDSLPackage = (MMDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MMDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MMDSLPackageImpl());

    isInited = true;

    // Load packages
    theMMDSLPackage.loadPackage();

    // Fix loaded packages
    theMMDSLPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theMMDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MMDSLPackage.eNS_URI, theMMDSLPackage);
    return theMMDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoot()
  {
    if (rootEClass == null)
    {
      rootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(0);
    }
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Methodname()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Includelibrarytype()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Embedplatformtype()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Embedcodetype()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Includelibrary()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Embedcode()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Method()
  {
        return (EReference)getRoot().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodName()
  {
    if (methodNameEClass == null)
    {
      methodNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(1);
    }
    return methodNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodName_Name()
  {
        return (EAttribute)getMethodName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeLibrary()
  {
    if (includeLibraryEClass == null)
    {
      includeLibraryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(2);
    }
    return includeLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeLibrary_Name()
  {
        return (EAttribute)getIncludeLibrary().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncludeLibrary_Includelibrarytype()
  {
        return (EReference)getIncludeLibrary().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeLibraryType()
  {
    if (includeLibraryTypeEClass == null)
    {
      includeLibraryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(3);
    }
    return includeLibraryTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeLibraryType_Name()
  {
        return (EAttribute)getIncludeLibraryType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbedCode()
  {
    if (embedCodeEClass == null)
    {
      embedCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(4);
    }
    return embedCodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmbedCode_Name()
  {
        return (EAttribute)getEmbedCode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbedCode_Embedplatformtype()
  {
        return (EReference)getEmbedCode().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbedCode_Embedcodetype()
  {
        return (EReference)getEmbedCode().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmbedCode_Embeddedcode()
  {
        return (EAttribute)getEmbedCode().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbedPlatformType()
  {
    if (embedPlatformTypeEClass == null)
    {
      embedPlatformTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(5);
    }
    return embedPlatformTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmbedPlatformType_Name()
  {
        return (EAttribute)getEmbedPlatformType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbedCodeType()
  {
    if (embedCodeTypeEClass == null)
    {
      embedCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(6);
    }
    return embedCodeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmbedCodeType_Name()
  {
        return (EAttribute)getEmbedCodeType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertEmbedCode()
  {
    if (insertEmbedCodeEClass == null)
    {
      insertEmbedCodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(7);
    }
    return insertEmbedCodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertEmbedCode_Codesnippetname()
  {
        return (EReference)getInsertEmbedCode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    if (methodEClass == null)
    {
      methodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(8);
    }
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Enumeration()
  {
        return (EReference)getMethod().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Symbolstyle()
  {
        return (EReference)getMethod().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Symbolclass()
  {
        return (EReference)getMethod().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Symbolrelation()
  {
        return (EReference)getMethod().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Metamodel()
  {
        return (EReference)getMethod().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Algorithm()
  {
        return (EReference)getMethod().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Event()
  {
        return (EReference)getMethod().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeration()
  {
    if (enumerationEClass == null)
    {
      enumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(9);
    }
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumeration_Name()
  {
        return (EAttribute)getEnumeration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumeration_Enumvalues()
  {
        return (EAttribute)getEnumeration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetamodel()
  {
    if (metamodelEClass == null)
    {
      metamodelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(10);
    }
    return metamodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodel_Class()
  {
        return (EReference)getMetamodel().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodel_Relation()
  {
        return (EReference)getMetamodel().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodel_Attribute()
  {
        return (EReference)getMetamodel().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodel_Modeltype()
  {
        return (EReference)getMetamodel().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    if (classEClass == null)
    {
      classEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(11);
    }
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Name()
  {
        return (EAttribute)getClass_().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Parentclassname()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Symbolclass()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Classattribute()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Attribute()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Insertembedcode()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Reference()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    if (relationEClass == null)
    {
      relationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(12);
    }
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Name()
  {
        return (EAttribute)getRelation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Parentrelationname()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Symbolrelation()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Fromclassname()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Toclassname()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Attribute()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Insertembedcode()
  {
        return (EReference)getRelation().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    if (attributeEClass == null)
    {
      attributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(13);
    }
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Type()
  {
        return (EReference)getAttribute().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Access()
  {
        return (EAttribute)getAttribute().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassAttribute()
  {
    if (classAttributeEClass == null)
    {
      classAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(15);
    }
    return classAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassAttribute_Name()
  {
        return (EAttribute)getClassAttribute().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAttribute_Type()
  {
        return (EReference)getClassAttribute().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    if (referenceEClass == null)
    {
      referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(16);
    }
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_Name()
  {
        return (EAttribute)getReference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Refname()
  {
        return (EReference)getReference().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefName()
  {
    if (refNameEClass == null)
    {
      refNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(17);
    }
    return refNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefName_Modeltypename()
  {
        return (EReference)getRefName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefName_Classname()
  {
        return (EReference)getRefName().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    if (typeEClass == null)
    {
      typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(18);
    }
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Simpletype()
  {
        return (EAttribute)getType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Enumtype()
  {
        return (EReference)getType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumType()
  {
    if (enumTypeEClass == null)
    {
      enumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(20);
    }
    return enumTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumType_Name()
  {
        return (EReference)getEnumType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelType()
  {
    if (modelTypeEClass == null)
    {
      modelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(21);
    }
    return modelTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelType_Name()
  {
        return (EAttribute)getModelType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelType_Classname()
  {
        return (EReference)getModelType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelType_Relationname()
  {
        return (EReference)getModelType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelType_Modename()
  {
        return (EReference)getModelType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMode()
  {
    if (modeEClass == null)
    {
      modeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(22);
    }
    return modeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Name()
  {
        return (EAttribute)getMode().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMode_Classname()
  {
        return (EReference)getMode().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMode_Relationname()
  {
        return (EReference)getMode().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolClass()
  {
    if (symbolClassEClass == null)
    {
      symbolClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(23);
    }
    return symbolClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolClass_Name()
  {
        return (EAttribute)getSymbolClass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolClass_Globalstyle()
  {
        return (EReference)getSymbolClass().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolClass_Svgcommand()
  {
        return (EReference)getSymbolClass().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolRelation()
  {
    if (symbolRelationEClass == null)
    {
      symbolRelationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(24);
    }
    return symbolRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolRelation_Name()
  {
        return (EAttribute)getSymbolRelation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolRelation_Globalstyle()
  {
        return (EReference)getSymbolRelation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolRelation_Svgcommandsfrom()
  {
        return (EReference)getSymbolRelation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolRelation_Svgcommandsmiddle()
  {
        return (EReference)getSymbolRelation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolRelation_Svgcommandsto()
  {
        return (EReference)getSymbolRelation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSVGCommand()
  {
    if (svgCommandEClass == null)
    {
      svgCommandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(25);
    }
    return svgCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Insertembedcode()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Rectangle()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Circle()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Ellipse()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Line()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Polyline()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Polygon()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Path()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Text()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Symbolstyle()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGCommand_Symbolstyleref()
  {
        return (EReference)getSVGCommand().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRectangle()
  {
    if (rectangleEClass == null)
    {
      rectangleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(26);
    }
    return rectangleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_X()
  {
        return (EAttribute)getRectangle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_Y()
  {
        return (EAttribute)getRectangle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_Width()
  {
        return (EAttribute)getRectangle().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_Height()
  {
        return (EAttribute)getRectangle().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCircle()
  {
    if (circleEClass == null)
    {
      circleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(27);
    }
    return circleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCircle_Cx()
  {
        return (EAttribute)getCircle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCircle_Cy()
  {
        return (EAttribute)getCircle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCircle_R()
  {
        return (EAttribute)getCircle().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEllipse()
  {
    if (ellipseEClass == null)
    {
      ellipseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(28);
    }
    return ellipseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Cx()
  {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Cy()
  {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Rx()
  {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Ry()
  {
        return (EAttribute)getEllipse().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLine()
  {
    if (lineEClass == null)
    {
      lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(29);
    }
    return lineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLine_X1()
  {
        return (EAttribute)getLine().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLine_Y1()
  {
        return (EAttribute)getLine().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLine_X2()
  {
        return (EAttribute)getLine().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLine_Y2()
  {
        return (EAttribute)getLine().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolyline()
  {
    if (polylineEClass == null)
    {
      polylineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(30);
    }
    return polylineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolyline_Points()
  {
        return (EReference)getPolyline().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolygon()
  {
    if (polygonEClass == null)
    {
      polygonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(31);
    }
    return polygonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolygon_Points()
  {
        return (EReference)getPolygon().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPath()
  {
    if (pathEClass == null)
    {
      pathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(32);
    }
    return pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPath_Pathdata()
  {
        return (EReference)getPath().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    if (textEClass == null)
    {
      textEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(33);
    }
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Value()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_X()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Y()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getText_Fontfamily()
  {
        return (EReference)getText().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Fontsize()
  {
        return (EAttribute)getText().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getText_Fillcolor()
  {
        return (EReference)getText().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathData()
  {
    if (pathDataEClass == null)
    {
      pathDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(34);
    }
    return pathDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Moveto()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Lineto()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Horizontallineto()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Verticallineto()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Curveto()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Smoothcurveto()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Quadraticbeziercurve()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Smoothquadraticbeziercurveto()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathData_Ellipticalarc()
  {
        return (EReference)getPathData().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathData_Closepath()
  {
        return (EAttribute)getPathData().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoveTo()
  {
    if (moveToEClass == null)
    {
      moveToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(35);
    }
    return moveToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMoveTo_Parameters()
  {
        return (EReference)getMoveTo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineTo()
  {
    if (lineToEClass == null)
    {
      lineToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(36);
    }
    return lineToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLineTo_Parameters()
  {
        return (EReference)getLineTo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHorizontalLineTo()
  {
    if (horizontalLineToEClass == null)
    {
      horizontalLineToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(37);
    }
    return horizontalLineToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHorizontalLineTo_Parameters()
  {
        return (EReference)getHorizontalLineTo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerticalLineTo()
  {
    if (verticalLineToEClass == null)
    {
      verticalLineToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(38);
    }
    return verticalLineToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerticalLineTo_Parameters()
  {
        return (EReference)getVerticalLineTo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCurveTo()
  {
    if (curveToEClass == null)
    {
      curveToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(39);
    }
    return curveToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCurveTo_Parameters()
  {
        return (EReference)getCurveTo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmoothCurveTo()
  {
    if (smoothCurveToEClass == null)
    {
      smoothCurveToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(40);
    }
    return smoothCurveToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmoothCurveTo_Parameters()
  {
        return (EReference)getSmoothCurveTo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuadraticBezierCurve()
  {
    if (quadraticBezierCurveEClass == null)
    {
      quadraticBezierCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(41);
    }
    return quadraticBezierCurveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuadraticBezierCurve_Parameters()
  {
        return (EReference)getQuadraticBezierCurve().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmoothQuadraticBezierCurveTo()
  {
    if (smoothQuadraticBezierCurveToEClass == null)
    {
      smoothQuadraticBezierCurveToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(42);
    }
    return smoothQuadraticBezierCurveToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmoothQuadraticBezierCurveTo_Parameters()
  {
        return (EReference)getSmoothQuadraticBezierCurveTo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEllipticalArc()
  {
    if (ellipticalArcEClass == null)
    {
      ellipticalArcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(43);
    }
    return ellipticalArcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEllipticalArc_Parameters()
  {
        return (EReference)getEllipticalArc().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoints()
  {
    if (pointsEClass == null)
    {
      pointsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(44);
    }
    return pointsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoints_X()
  {
        return (EAttribute)getPoints().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoints_Y()
  {
        return (EAttribute)getPoints().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathParametersHV()
  {
    if (pathParametersHVEClass == null)
    {
      pathParametersHVEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(45);
    }
    return pathParametersHVEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersHV_X()
  {
        return (EAttribute)getPathParametersHV().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathParametersMLT()
  {
    if (pathParametersMLTEClass == null)
    {
      pathParametersMLTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(46);
    }
    return pathParametersMLTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersMLT_X()
  {
        return (EAttribute)getPathParametersMLT().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersMLT_Y()
  {
        return (EAttribute)getPathParametersMLT().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathParametersS()
  {
    if (pathParametersSEClass == null)
    {
      pathParametersSEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(47);
    }
    return pathParametersSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersS_X2()
  {
        return (EAttribute)getPathParametersS().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersS_Y2()
  {
        return (EAttribute)getPathParametersS().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersS_X()
  {
        return (EAttribute)getPathParametersS().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersS_Y()
  {
        return (EAttribute)getPathParametersS().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathParametersQ()
  {
    if (pathParametersQEClass == null)
    {
      pathParametersQEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(48);
    }
    return pathParametersQEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersQ_X1()
  {
        return (EAttribute)getPathParametersQ().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersQ_Y1()
  {
        return (EAttribute)getPathParametersQ().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersQ_X()
  {
        return (EAttribute)getPathParametersQ().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersQ_Y()
  {
        return (EAttribute)getPathParametersQ().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathParametersC()
  {
    if (pathParametersCEClass == null)
    {
      pathParametersCEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(49);
    }
    return pathParametersCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersC_X1()
  {
        return (EAttribute)getPathParametersC().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersC_Y1()
  {
        return (EAttribute)getPathParametersC().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersC_X2()
  {
        return (EAttribute)getPathParametersC().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersC_Y2()
  {
        return (EAttribute)getPathParametersC().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersC_X()
  {
        return (EAttribute)getPathParametersC().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersC_Y()
  {
        return (EAttribute)getPathParametersC().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathParametersA()
  {
    if (pathParametersAEClass == null)
    {
      pathParametersAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(50);
    }
    return pathParametersAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersA_Rx()
  {
        return (EAttribute)getPathParametersA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersA_Ry()
  {
        return (EAttribute)getPathParametersA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersA_Xaxisrot()
  {
        return (EAttribute)getPathParametersA().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersA_Largearcflag()
  {
        return (EAttribute)getPathParametersA().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersA_Sweepflag()
  {
        return (EAttribute)getPathParametersA().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersA_X()
  {
        return (EAttribute)getPathParametersA().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathParametersA_Y()
  {
        return (EAttribute)getPathParametersA().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolStyle()
  {
    if (symbolStyleEClass == null)
    {
      symbolStyleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(51);
    }
    return symbolStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolStyle_Name()
  {
        return (EAttribute)getSymbolStyle().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolStyle_Fillcolor()
  {
        return (EReference)getSymbolStyle().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolStyle_Strokecolor()
  {
        return (EReference)getSymbolStyle().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolStyle_Strokewidth()
  {
        return (EAttribute)getSymbolStyle().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolStyle_Fontfamily()
  {
        return (EReference)getSymbolStyle().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolStyle_Fontsize()
  {
        return (EAttribute)getSymbolStyle().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolStyle_Insertembedcode()
  {
        return (EReference)getSymbolStyle().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFillColor()
  {
    if (fillColorEClass == null)
    {
      fillColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(52);
    }
    return fillColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFillColor_Color()
  {
        return (EAttribute)getFillColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFillColor_Hexcolor()
  {
        return (EAttribute)getFillColor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStrokeColor()
  {
    if (strokeColorEClass == null)
    {
      strokeColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(53);
    }
    return strokeColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrokeColor_Color()
  {
        return (EAttribute)getStrokeColor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrokeColor_Hexcolor()
  {
        return (EAttribute)getStrokeColor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontFamily()
  {
    if (fontFamilyEClass == null)
    {
      fontFamilyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(54);
    }
    return fontFamilyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontFamily_Fontstr()
  {
        return (EAttribute)getFontFamily().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontFamily_Font()
  {
        return (EAttribute)getFontFamily().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlgorithm()
  {
    if (algorithmEClass == null)
    {
      algorithmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(57);
    }
    return algorithmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlgorithm_Name()
  {
        return (EAttribute)getAlgorithm().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgorithm_Stmnt()
  {
        return (EReference)getAlgorithm().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    if (statementEClass == null)
    {
      statementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(58);
    }
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Selection()
  {
        return (EReference)getStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Loop()
  {
        return (EReference)getStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Variable()
  {
        return (EReference)getStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Algorithmoperation()
  {
        return (EReference)getStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Insertembedcode()
  {
        return (EReference)getStatement().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionStatement()
  {
    if (selectionStatementEClass == null)
    {
      selectionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(59);
    }
    return selectionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionStatement_Ifcondition()
  {
        return (EReference)getSelectionStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionStatement_Ifblock()
  {
        return (EReference)getSelectionStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionStatement_Elseifcondition()
  {
        return (EReference)getSelectionStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionStatement_Elseifblock()
  {
        return (EReference)getSelectionStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectionStatement_Elseblock()
  {
        return (EReference)getSelectionStatement().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopStatement()
  {
    if (loopStatementEClass == null)
    {
      loopStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(60);
    }
    return loopStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopStatement_Whiletloop()
  {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopStatement_Forloop()
  {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileLoop()
  {
    if (whileLoopEClass == null)
    {
      whileLoopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(61);
    }
    return whileLoopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileLoop_Condition()
  {
        return (EReference)getWhileLoop().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileLoop_Whileblock()
  {
        return (EReference)getWhileLoop().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileLoop_Breakcontinue()
  {
        return (EReference)getWhileLoop().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForLoop()
  {
    if (forLoopEClass == null)
    {
      forLoopEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(62);
    }
    return forLoopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForLoop_Start()
  {
        return (EAttribute)getForLoop().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForLoop_Stop()
  {
        return (EAttribute)getForLoop().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForLoop_Interval()
  {
        return (EAttribute)getForLoop().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoop_Forblock()
  {
        return (EReference)getForLoop().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForLoop_Breakcontinue()
  {
        return (EReference)getForLoop().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakContinue()
  {
    if (breakContinueEClass == null)
    {
      breakContinueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(63);
    }
    return breakContinueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBreakContinue_Break()
  {
        return (EAttribute)getBreakContinue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBreakContinue_Continue()
  {
        return (EAttribute)getBreakContinue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    if (variableEClass == null)
    {
      variableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(64);
    }
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
        return (EAttribute)getVariable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Opassing()
  {
        return (EReference)getVariable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Varstatement()
  {
        return (EReference)getVariable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Variable()
  {
        return (EReference)getVariable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarStatement()
  {
    if (varStatementEClass == null)
    {
      varStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(65);
    }
    return varStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Expression()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Algorithmoperation()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Class()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Attribute()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Reference()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Symbolclass()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Symbolrelation()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Symbolstyle()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Embeddedcode()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarStatement_Modeltype()
  {
        return (EReference)getVarStatement().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorAssign()
  {
    if (operatorAssignEClass == null)
    {
      operatorAssignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(66);
    }
    return operatorAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorAssign_Assign()
  {
        return (EAttribute)getOperatorAssign().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperatorAssign_Multyassign()
  {
        return (EReference)getOperatorAssign().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorMultyAssign()
  {
    if (operatorMultyAssignEClass == null)
    {
      operatorMultyAssignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(67);
    }
    return operatorMultyAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorMultyAssign_Addassign()
  {
        return (EAttribute)getOperatorMultyAssign().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorMultyAssign_Subassign()
  {
        return (EAttribute)getOperatorMultyAssign().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorMultyAssign_Multiassign()
  {
        return (EAttribute)getOperatorMultyAssign().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorMultyAssign_Divassign()
  {
        return (EAttribute)getOperatorMultyAssign().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorUnary()
  {
    if (operatorUnaryEClass == null)
    {
      operatorUnaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(68);
    }
    return operatorUnaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorUnary_Not()
  {
        return (EAttribute)getOperatorUnary().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorMultiply()
  {
    if (operatorMultiplyEClass == null)
    {
      operatorMultiplyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(69);
    }
    return operatorMultiplyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorMultiply_Multiply()
  {
        return (EAttribute)getOperatorMultiply().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorMultiply_Divide()
  {
        return (EAttribute)getOperatorMultiply().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorMultiply_Modulo()
  {
        return (EAttribute)getOperatorMultiply().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorAdd()
  {
    if (operatorAddEClass == null)
    {
      operatorAddEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(70);
    }
    return operatorAddEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorAdd_Add()
  {
        return (EAttribute)getOperatorAdd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorAdd_Subtract()
  {
        return (EAttribute)getOperatorAdd().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorCompare()
  {
    if (operatorCompareEClass == null)
    {
      operatorCompareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(71);
    }
    return operatorCompareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorCompare_Greaterequal()
  {
        return (EAttribute)getOperatorCompare().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorCompare_Lesserequal()
  {
        return (EAttribute)getOperatorCompare().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorCompare_Greater()
  {
        return (EAttribute)getOperatorCompare().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorCompare_Lesser()
  {
        return (EAttribute)getOperatorCompare().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorEqual()
  {
    if (operatorEqualEClass == null)
    {
      operatorEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(72);
    }
    return operatorEqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorEqual_Equal()
  {
        return (EAttribute)getOperatorEqual().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorEqual_Notequal()
  {
        return (EAttribute)getOperatorEqual().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorAnd()
  {
    if (operatorAndEClass == null)
    {
      operatorAndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(73);
    }
    return operatorAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorAnd_And()
  {
        return (EAttribute)getOperatorAnd().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorOr()
  {
    if (operatorOrEClass == null)
    {
      operatorOrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(74);
    }
    return operatorOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorOr_Or()
  {
        return (EAttribute)getOperatorOr().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    if (exprEClass == null)
    {
      exprEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(75);
    }
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_Expr()
  {
        return (EReference)getExpr().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    if (expressionEClass == null)
    {
      expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(76);
    }
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Op()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Operand()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Atomic()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Expression()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_True()
  {
        return (EAttribute)getExpression().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_False()
  {
        return (EAttribute)getExpression().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Variable()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_ValueString()
  {
        return (EAttribute)getExpression().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_ValueRealNumber()
  {
        return (EAttribute)getExpression().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Left()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Right()
  {
        return (EReference)getExpression().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlgorithmOperation()
  {
    if (algorithmOperationEClass == null)
    {
      algorithmOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(77);
    }
    return algorithmOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgorithmOperation_Fileoperation()
  {
        return (EReference)getAlgorithmOperation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgorithmOperation_Diroperation()
  {
        return (EReference)getAlgorithmOperation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgorithmOperation_Simpleui()
  {
        return (EReference)getAlgorithmOperation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgorithmOperation_Modeloperation()
  {
        return (EReference)getAlgorithmOperation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgorithmOperation_Instanceoperation()
  {
        return (EReference)getAlgorithmOperation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlgorithmOperation_Attributeoperation()
  {
        return (EReference)getAlgorithmOperation().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileOperation()
  {
    if (fileOperationEClass == null)
    {
      fileOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(78);
    }
    return fileOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFileOperation_Filecopy()
  {
        return (EReference)getFileOperation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFileOperation_Filedelete()
  {
        return (EReference)getFileOperation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFileOperation_Filecreate()
  {
        return (EReference)getFileOperation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFileOperation_Fileread()
  {
        return (EReference)getFileOperation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFileOperation_Filewrite()
  {
        return (EReference)getFileOperation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileCopy()
  {
    if (fileCopyEClass == null)
    {
      fileCopyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(79);
    }
    return fileCopyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileCopy_Src()
  {
        return (EAttribute)getFileCopy().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileCopy_Dest()
  {
        return (EAttribute)getFileCopy().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileDelete()
  {
    if (fileDeleteEClass == null)
    {
      fileDeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(80);
    }
    return fileDeleteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileDelete_Filename()
  {
        return (EAttribute)getFileDelete().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileCreate()
  {
    if (fileCreateEClass == null)
    {
      fileCreateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(81);
    }
    return fileCreateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileCreate_Filename()
  {
        return (EAttribute)getFileCreate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileRead()
  {
    if (fileReadEClass == null)
    {
      fileReadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(82);
    }
    return fileReadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileRead_Filename()
  {
        return (EAttribute)getFileRead().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileWrite()
  {
    if (fileWriteEClass == null)
    {
      fileWriteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(83);
    }
    return fileWriteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileWrite_Filename()
  {
        return (EAttribute)getFileWrite().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileWrite_Text()
  {
        return (EAttribute)getFileWrite().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileWrite_Append()
  {
        return (EAttribute)getFileWrite().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirOperation()
  {
    if (dirOperationEClass == null)
    {
      dirOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(84);
    }
    return dirOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirOperation_Dirsetworking()
  {
        return (EReference)getDirOperation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirOperation_Dirgetworking()
  {
        return (EReference)getDirOperation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirOperation_Dircreate()
  {
        return (EReference)getDirOperation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirOperation_Dirdelete()
  {
        return (EReference)getDirOperation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirOperation_Dirlist()
  {
        return (EReference)getDirOperation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirSetWorking()
  {
    if (dirSetWorkingEClass == null)
    {
      dirSetWorkingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(85);
    }
    return dirSetWorkingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirSetWorking_Dirname()
  {
        return (EAttribute)getDirSetWorking().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirGetWorking()
  {
    if (dirGetWorkingEClass == null)
    {
      dirGetWorkingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(86);
    }
    return dirGetWorkingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirCreate()
  {
    if (dirCreateEClass == null)
    {
      dirCreateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(87);
    }
    return dirCreateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirCreate_Dirname()
  {
        return (EAttribute)getDirCreate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirDelete()
  {
    if (dirDeleteEClass == null)
    {
      dirDeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(88);
    }
    return dirDeleteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirDelete_Dirname()
  {
        return (EAttribute)getDirDelete().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirList()
  {
    if (dirListEClass == null)
    {
      dirListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(89);
    }
    return dirListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirList_Dirname()
  {
        return (EAttribute)getDirList().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleUI()
  {
    if (simpleUIEClass == null)
    {
      simpleUIEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(90);
    }
    return simpleUIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleUI_Editbox()
  {
        return (EReference)getSimpleUI().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleUI_Infobox()
  {
        return (EReference)getSimpleUI().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleUI_Errorbox()
  {
        return (EReference)getSimpleUI().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleUI_Warningbox()
  {
        return (EReference)getSimpleUI().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleUI_Viewbox()
  {
        return (EReference)getSimpleUI().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleUI_Itemoperation()
  {
        return (EReference)getSimpleUI().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditBox()
  {
    if (editBoxEClass == null)
    {
      editBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(91);
    }
    return editBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditBox_Title()
  {
        return (EAttribute)getEditBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditBox_Text()
  {
        return (EAttribute)getEditBox().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditBox_Okbuttontext()
  {
        return (EAttribute)getEditBox().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfoBox()
  {
    if (infoBoxEClass == null)
    {
      infoBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(92);
    }
    return infoBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfoBox_Title()
  {
        return (EAttribute)getInfoBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfoBox_Text()
  {
        return (EAttribute)getInfoBox().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorBox()
  {
    if (errorBoxEClass == null)
    {
      errorBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(93);
    }
    return errorBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getErrorBox_Title()
  {
        return (EAttribute)getErrorBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getErrorBox_Text()
  {
        return (EAttribute)getErrorBox().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getErrorBox_Buttontype()
  {
        return (EAttribute)getErrorBox().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWarningBox()
  {
    if (warningBoxEClass == null)
    {
      warningBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(94);
    }
    return warningBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWarningBox_Title()
  {
        return (EAttribute)getWarningBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWarningBox_Text()
  {
        return (EAttribute)getWarningBox().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWarningBox_Buttontype()
  {
        return (EAttribute)getWarningBox().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewBox()
  {
    if (viewBoxEClass == null)
    {
      viewBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(96);
    }
    return viewBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewBox_Title()
  {
        return (EAttribute)getViewBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewBox_Text()
  {
        return (EAttribute)getViewBox().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemOperation()
  {
    if (itemOperationEClass == null)
    {
      itemOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(97);
    }
    return itemOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemOperation_Menuitem()
  {
        return (EReference)getItemOperation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemOperation_Contextitem()
  {
        return (EReference)getItemOperation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuItem()
  {
    if (menuItemEClass == null)
    {
      menuItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(98);
    }
    return menuItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuItem_Insertmenuitem()
  {
        return (EReference)getMenuItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuItem_Removemenuitem()
  {
        return (EReference)getMenuItem().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertMenuItem()
  {
    if (insertMenuItemEClass == null)
    {
      insertMenuItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(99);
    }
    return insertMenuItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertMenuItem_Name()
  {
        return (EAttribute)getInsertMenuItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertMenuItem_Menu()
  {
        return (EAttribute)getInsertMenuItem().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoveMenuItem()
  {
    if (removeMenuItemEClass == null)
    {
      removeMenuItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(100);
    }
    return removeMenuItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRemoveMenuItem_Menuitemname()
  {
        return (EReference)getRemoveMenuItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextItem()
  {
    if (contextItemEClass == null)
    {
      contextItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(101);
    }
    return contextItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextItem_Insertcontextitem()
  {
        return (EReference)getContextItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextItem_Removecontextitem()
  {
        return (EReference)getContextItem().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertContextItem()
  {
    if (insertContextItemEClass == null)
    {
      insertContextItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(102);
    }
    return insertContextItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertContextItem_Name()
  {
        return (EAttribute)getInsertContextItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertContextItem_Context()
  {
        return (EAttribute)getInsertContextItem().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoveContextItem()
  {
    if (removeContextItemEClass == null)
    {
      removeContextItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(103);
    }
    return removeContextItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRemoveContextItem_Contextitem()
  {
        return (EReference)getRemoveContextItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelOperation()
  {
    if (modelOperationEClass == null)
    {
      modelOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(104);
    }
    return modelOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelOperation_Modelcreate()
  {
        return (EReference)getModelOperation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelOperation_Modeldelete()
  {
        return (EReference)getModelOperation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelOperation_Modeldiscard()
  {
        return (EReference)getModelOperation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelOperation_Modelsave()
  {
        return (EReference)getModelOperation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelOperation_Modelload()
  {
        return (EReference)getModelOperation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelOperation_Modelisloaded()
  {
        return (EReference)getModelOperation().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelCreate()
  {
    if (modelCreateEClass == null)
    {
      modelCreateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(105);
    }
    return modelCreateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelCreate_Name()
  {
        return (EAttribute)getModelCreate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelCreate_Modeltype()
  {
        return (EReference)getModelCreate().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelDelete()
  {
    if (modelDeleteEClass == null)
    {
      modelDeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(106);
    }
    return modelDeleteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelDelete_Modelname()
  {
        return (EReference)getModelDelete().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelDiscard()
  {
    if (modelDiscardEClass == null)
    {
      modelDiscardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(107);
    }
    return modelDiscardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelDiscard_Modelname()
  {
        return (EReference)getModelDiscard().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelSave()
  {
    if (modelSaveEClass == null)
    {
      modelSaveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(108);
    }
    return modelSaveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelSave_Modelname()
  {
        return (EReference)getModelSave().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelLoad()
  {
    if (modelLoadEClass == null)
    {
      modelLoadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(109);
    }
    return modelLoadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelLoad_Modelname()
  {
        return (EReference)getModelLoad().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelIsLoaded()
  {
    if (modelIsLoadedEClass == null)
    {
      modelIsLoadedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(110);
    }
    return modelIsLoadedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelIsLoaded_Modelname()
  {
        return (EReference)getModelIsLoaded().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceOperation()
  {
    if (instanceOperationEClass == null)
    {
      instanceOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(111);
    }
    return instanceOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceOperation_Classinstance()
  {
        return (EReference)getInstanceOperation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstanceOperation_Relationinstance()
  {
        return (EReference)getInstanceOperation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassInstance()
  {
    if (classInstanceEClass == null)
    {
      classInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(112);
    }
    return classInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Classinstancecreate()
  {
        return (EReference)getClassInstance().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Classinstancedelete()
  {
        return (EReference)getClassInstance().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Classinstanceget()
  {
        return (EReference)getClassInstance().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Classinstanceset()
  {
        return (EReference)getClassInstance().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Classinstancegetall()
  {
        return (EReference)getClassInstance().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassInstanceCreate()
  {
    if (classInstanceCreateEClass == null)
    {
      classInstanceCreateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(113);
    }
    return classInstanceCreateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassInstanceCreate_Name()
  {
        return (EAttribute)getClassInstanceCreate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstanceCreate_Nameofclass()
  {
        return (EReference)getClassInstanceCreate().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassInstanceDelete()
  {
    if (classInstanceDeleteEClass == null)
    {
      classInstanceDeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(114);
    }
    return classInstanceDeleteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstanceDelete_Nameofclassinstance()
  {
        return (EReference)getClassInstanceDelete().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassInstanceGet()
  {
    if (classInstanceGetEClass == null)
    {
      classInstanceGetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(115);
    }
    return classInstanceGetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstanceGet_Nameofclassinstance()
  {
        return (EReference)getClassInstanceGet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassInstanceGetAll()
  {
    if (classInstanceGetAllEClass == null)
    {
      classInstanceGetAllEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(116);
    }
    return classInstanceGetAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstanceGetAll_Nameofclass()
  {
        return (EReference)getClassInstanceGetAll().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassInstanceSet()
  {
    if (classInstanceSetEClass == null)
    {
      classInstanceSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(117);
    }
    return classInstanceSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstanceSet_Nameofclassinstance()
  {
        return (EReference)getClassInstanceSet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationInstance()
  {
    if (relationInstanceEClass == null)
    {
      relationInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(118);
    }
    return relationInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstance_Relationinstancecreate()
  {
        return (EReference)getRelationInstance().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstance_Relationinstancedelete()
  {
        return (EReference)getRelationInstance().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstance_Relationinstanceget()
  {
        return (EReference)getRelationInstance().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstance_Relationinstanceset()
  {
        return (EReference)getRelationInstance().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstance_Relationinstancegetall()
  {
        return (EReference)getRelationInstance().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationInstanceCreate()
  {
    if (relationInstanceCreateEClass == null)
    {
      relationInstanceCreateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(119);
    }
    return relationInstanceCreateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationInstanceCreate_Name()
  {
        return (EAttribute)getRelationInstanceCreate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstanceCreate_Nameofrelation()
  {
        return (EReference)getRelationInstanceCreate().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstanceCreate_Classinstancefrom()
  {
        return (EReference)getRelationInstanceCreate().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstanceCreate_Classinstanceto()
  {
        return (EReference)getRelationInstanceCreate().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationInstanceDelete()
  {
    if (relationInstanceDeleteEClass == null)
    {
      relationInstanceDeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(120);
    }
    return relationInstanceDeleteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstanceDelete_Nameofrelationinstance()
  {
        return (EReference)getRelationInstanceDelete().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationInstanceGet()
  {
    if (relationInstanceGetEClass == null)
    {
      relationInstanceGetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(121);
    }
    return relationInstanceGetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstanceGet_Nameofrelationinstance()
  {
        return (EReference)getRelationInstanceGet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationInstanceGetAll()
  {
    if (relationInstanceGetAllEClass == null)
    {
      relationInstanceGetAllEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(122);
    }
    return relationInstanceGetAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstanceGetAll_Nameofrelation()
  {
        return (EReference)getRelationInstanceGetAll().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationInstanceSet()
  {
    if (relationInstanceSetEClass == null)
    {
      relationInstanceSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(123);
    }
    return relationInstanceSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationInstanceSet_Nameofrelationinstance()
  {
        return (EReference)getRelationInstanceSet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeOperation()
  {
    if (attributeOperationEClass == null)
    {
      attributeOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(124);
    }
    return attributeOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeOperation_Attributename()
  {
        return (EReference)getAttributeOperation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeOperation_Attributeget()
  {
        return (EReference)getAttributeOperation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeOperation_Attributeset()
  {
        return (EReference)getAttributeOperation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeGet()
  {
    if (attributeGetEClass == null)
    {
      attributeGetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(125);
    }
    return attributeGetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeGet_Attrgetparams()
  {
        return (EAttribute)getAttributeGet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeSet()
  {
    if (attributeSetEClass == null)
    {
      attributeSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(127);
    }
    return attributeSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeSet_Attrsetparams()
  {
        return (EAttribute)getAttributeSet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeSet_ValueString()
  {
        return (EAttribute)getAttributeSet().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeSet_ValueRealNumber()
  {
        return (EAttribute)getAttributeSet().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeSet_ValueVariable()
  {
        return (EReference)getAttributeSet().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    if (eventEClass == null)
    {
      eventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(129);
    }
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Name()
  {
        return (EAttribute)getEvent().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Algorithmname()
  {
        return (EReference)getEvent().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpression()
  {
    if (orExpressionEClass == null)
    {
      orExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(131);
    }
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    if (andExpressionEClass == null)
    {
      andExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(132);
    }
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualExpression()
  {
    if (equalExpressionEClass == null)
    {
      equalExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(133);
    }
    return equalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompareExpression()
  {
    if (compareExpressionEClass == null)
    {
      compareExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(134);
    }
    return compareExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditionExpression()
  {
    if (additionExpressionEClass == null)
    {
      additionExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(135);
    }
    return additionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicationExpression()
  {
    if (multiplicationExpressionEClass == null)
    {
      multiplicationExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(136);
    }
    return multiplicationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessType()
  {
    if (accessTypeEEnum == null)
    {
      accessTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(14);
    }
    return accessTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSimpleType()
  {
    if (simpleTypeEEnum == null)
    {
      simpleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(19);
    }
    return simpleTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFont()
  {
    if (fontEEnum == null)
    {
      fontEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(55);
    }
    return fontEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    if (colorEEnum == null)
    {
      colorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(56);
    }
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getButtonType()
  {
    if (buttonTypeEEnum == null)
    {
      buttonTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(95);
    }
    return buttonTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttrGetParams()
  {
    if (attrGetParamsEEnum == null)
    {
      attrGetParamsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(126);
    }
    return attrGetParamsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttrSetParams()
  {
    if (attrSetParamsEEnum == null)
    {
      attrSetParamsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(128);
    }
    return attrSetParamsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEventName()
  {
    if (eventNameEEnum == null)
    {
      eventNameEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MMDSLPackage.eNS_URI).getEClassifiers().get(130);
    }
    return eventNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MMDSLFactory getMMDSLFactory()
  {
    return (MMDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.xtext.nv.dsl.mMDSL." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //MMDSLPackageImpl
