/**
 */
package architecture.impl;

import architecture.ArchitecturePackage;
import architecture.Component;

import architecture.Port;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getDependence <em>Dependence</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getSystemDependence <em>System Dependence</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getSubsystem <em>Subsystem</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getPortOfSystem <em>Port Of System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements architecture.System {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getDependence() <em>Dependence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependence()
	 * @generated
	 * @ordered
	 */
	protected EList<architecture.System> dependence;

	/**
	 * The cached value of the '{@link #getSystemDependence() <em>System Dependence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDependence()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> systemDependence;

	/**
	 * The cached value of the '{@link #getSubsystem() <em>Subsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<architecture.System> subsystem;

	/**
	 * The cached value of the '{@link #getPortOfSystem() <em>Port Of System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> portOfSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, ArchitecturePackage.SYSTEM__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecture.System> getDependence() {
		if (dependence == null) {
			dependence = new EObjectResolvingEList<architecture.System>(architecture.System.class, this, ArchitecturePackage.SYSTEM__DEPENDENCE);
		}
		return dependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getSystemDependence() {
		if (systemDependence == null) {
			systemDependence = new EObjectResolvingEList<Component>(Component.class, this, ArchitecturePackage.SYSTEM__SYSTEM_DEPENDENCE);
		}
		return systemDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecture.System> getSubsystem() {
		if (subsystem == null) {
			subsystem = new EObjectContainmentEList<architecture.System>(architecture.System.class, this, ArchitecturePackage.SYSTEM__SUBSYSTEM);
		}
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPortOfSystem() {
		if (portOfSystem == null) {
			portOfSystem = new EObjectContainmentEList<Port>(Port.class, this, ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM);
		}
		return portOfSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.SYSTEM__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.SYSTEM__SUBSYSTEM:
				return ((InternalEList<?>)getSubsystem()).basicRemove(otherEnd, msgs);
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				return ((InternalEList<?>)getPortOfSystem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.SYSTEM__NAME:
				return getName();
			case ArchitecturePackage.SYSTEM__COMPONENT:
				return getComponent();
			case ArchitecturePackage.SYSTEM__DEPENDENCE:
				return getDependence();
			case ArchitecturePackage.SYSTEM__SYSTEM_DEPENDENCE:
				return getSystemDependence();
			case ArchitecturePackage.SYSTEM__SUBSYSTEM:
				return getSubsystem();
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				return getPortOfSystem();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturePackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ArchitecturePackage.SYSTEM__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case ArchitecturePackage.SYSTEM__DEPENDENCE:
				getDependence().clear();
				getDependence().addAll((Collection<? extends architecture.System>)newValue);
				return;
			case ArchitecturePackage.SYSTEM__SYSTEM_DEPENDENCE:
				getSystemDependence().clear();
				getSystemDependence().addAll((Collection<? extends Component>)newValue);
				return;
			case ArchitecturePackage.SYSTEM__SUBSYSTEM:
				getSubsystem().clear();
				getSubsystem().addAll((Collection<? extends architecture.System>)newValue);
				return;
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				getPortOfSystem().clear();
				getPortOfSystem().addAll((Collection<? extends Port>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturePackage.SYSTEM__COMPONENT:
				getComponent().clear();
				return;
			case ArchitecturePackage.SYSTEM__DEPENDENCE:
				getDependence().clear();
				return;
			case ArchitecturePackage.SYSTEM__SYSTEM_DEPENDENCE:
				getSystemDependence().clear();
				return;
			case ArchitecturePackage.SYSTEM__SUBSYSTEM:
				getSubsystem().clear();
				return;
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				getPortOfSystem().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArchitecturePackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturePackage.SYSTEM__COMPONENT:
				return component != null && !component.isEmpty();
			case ArchitecturePackage.SYSTEM__DEPENDENCE:
				return dependence != null && !dependence.isEmpty();
			case ArchitecturePackage.SYSTEM__SYSTEM_DEPENDENCE:
				return systemDependence != null && !systemDependence.isEmpty();
			case ArchitecturePackage.SYSTEM__SUBSYSTEM:
				return subsystem != null && !subsystem.isEmpty();
			case ArchitecturePackage.SYSTEM__PORT_OF_SYSTEM:
				return portOfSystem != null && !portOfSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
