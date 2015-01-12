/**
 */
package org.xtext.nv.dsl.mMDSL.impl;

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

import org.xtext.nv.dsl.mMDSL.BreakContinue;
import org.xtext.nv.dsl.mMDSL.ForLoop;
import org.xtext.nv.dsl.mMDSL.MMDSLPackage;
import org.xtext.nv.dsl.mMDSL.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ForLoopImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ForLoopImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ForLoopImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ForLoopImpl#getForblock <em>Forblock</em>}</li>
 *   <li>{@link org.xtext.nv.dsl.mMDSL.impl.ForLoopImpl#getBreakcontinue <em>Breakcontinue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForLoopImpl extends MinimalEObjectImpl.Container implements ForLoop
{
  /**
   * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected static final int START_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected int start = START_EDEFAULT;

  /**
   * The default value of the '{@link #getStop() <em>Stop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStop()
   * @generated
   * @ordered
   */
  protected static final int STOP_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStop() <em>Stop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStop()
   * @generated
   * @ordered
   */
  protected int stop = STOP_EDEFAULT;

  /**
   * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected static final int INTERVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected int interval = INTERVAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getForblock() <em>Forblock</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForblock()
   * @generated
   * @ordered
   */
  protected EList<Statement> forblock;

  /**
   * The cached value of the '{@link #getBreakcontinue() <em>Breakcontinue</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreakcontinue()
   * @generated
   * @ordered
   */
  protected EList<BreakContinue> breakcontinue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForLoopImpl()
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
    return MMDSLPackage.eINSTANCE.getForLoop();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(int newStart)
  {
    int oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FOR_LOOP__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStop()
  {
    return stop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStop(int newStop)
  {
    int oldStop = stop;
    stop = newStop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FOR_LOOP__STOP, oldStop, stop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInterval()
  {
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterval(int newInterval)
  {
    int oldInterval = interval;
    interval = newInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MMDSLPackage.FOR_LOOP__INTERVAL, oldInterval, interval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getForblock()
  {
    if (forblock == null)
    {
      forblock = new EObjectContainmentEList<Statement>(Statement.class, this, MMDSLPackage.FOR_LOOP__FORBLOCK);
    }
    return forblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BreakContinue> getBreakcontinue()
  {
    if (breakcontinue == null)
    {
      breakcontinue = new EObjectContainmentEList<BreakContinue>(BreakContinue.class, this, MMDSLPackage.FOR_LOOP__BREAKCONTINUE);
    }
    return breakcontinue;
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
      case MMDSLPackage.FOR_LOOP__FORBLOCK:
        return ((InternalEList<?>)getForblock()).basicRemove(otherEnd, msgs);
      case MMDSLPackage.FOR_LOOP__BREAKCONTINUE:
        return ((InternalEList<?>)getBreakcontinue()).basicRemove(otherEnd, msgs);
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
      case MMDSLPackage.FOR_LOOP__START:
        return getStart();
      case MMDSLPackage.FOR_LOOP__STOP:
        return getStop();
      case MMDSLPackage.FOR_LOOP__INTERVAL:
        return getInterval();
      case MMDSLPackage.FOR_LOOP__FORBLOCK:
        return getForblock();
      case MMDSLPackage.FOR_LOOP__BREAKCONTINUE:
        return getBreakcontinue();
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
      case MMDSLPackage.FOR_LOOP__START:
        setStart((Integer)newValue);
        return;
      case MMDSLPackage.FOR_LOOP__STOP:
        setStop((Integer)newValue);
        return;
      case MMDSLPackage.FOR_LOOP__INTERVAL:
        setInterval((Integer)newValue);
        return;
      case MMDSLPackage.FOR_LOOP__FORBLOCK:
        getForblock().clear();
        getForblock().addAll((Collection<? extends Statement>)newValue);
        return;
      case MMDSLPackage.FOR_LOOP__BREAKCONTINUE:
        getBreakcontinue().clear();
        getBreakcontinue().addAll((Collection<? extends BreakContinue>)newValue);
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
      case MMDSLPackage.FOR_LOOP__START:
        setStart(START_EDEFAULT);
        return;
      case MMDSLPackage.FOR_LOOP__STOP:
        setStop(STOP_EDEFAULT);
        return;
      case MMDSLPackage.FOR_LOOP__INTERVAL:
        setInterval(INTERVAL_EDEFAULT);
        return;
      case MMDSLPackage.FOR_LOOP__FORBLOCK:
        getForblock().clear();
        return;
      case MMDSLPackage.FOR_LOOP__BREAKCONTINUE:
        getBreakcontinue().clear();
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
      case MMDSLPackage.FOR_LOOP__START:
        return start != START_EDEFAULT;
      case MMDSLPackage.FOR_LOOP__STOP:
        return stop != STOP_EDEFAULT;
      case MMDSLPackage.FOR_LOOP__INTERVAL:
        return interval != INTERVAL_EDEFAULT;
      case MMDSLPackage.FOR_LOOP__FORBLOCK:
        return forblock != null && !forblock.isEmpty();
      case MMDSLPackage.FOR_LOOP__BREAKCONTINUE:
        return breakcontinue != null && !breakcontinue.isEmpty();
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
    result.append(" (start: ");
    result.append(start);
    result.append(", stop: ");
    result.append(stop);
    result.append(", interval: ");
    result.append(interval);
    result.append(')');
    return result.toString();
  }

} //ForLoopImpl
