/**
 */
package architecture.impl;

import architecture.ArchitecturePackage;
import architecture.Component;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecture.impl.ComponentImpl#getDependence <em>Dependence</em>}</li>
 *   <li>{@link architecture.impl.ComponentImpl#getComponentDependence <em>Component Dependence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getDependence() <em>Dependence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependence()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> dependence;

	/**
	 * The cached value of the '{@link #getComponentDependence() <em>Component Dependence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDependence()
	 * @generated
	 * @ordered
	 */
	protected EList<architecture.System> componentDependence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getDependence() {
		if (dependence == null) {
			dependence = new EObjectResolvingEList<Component>(Component.class, this, ArchitecturePackage.COMPONENT__DEPENDENCE);
		}
		return dependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecture.System> getComponentDependence() {
		if (componentDependence == null) {
			componentDependence = new EObjectResolvingEList<architecture.System>(architecture.System.class, this, ArchitecturePackage.COMPONENT__COMPONENT_DEPENDENCE);
		}
		return componentDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.COMPONENT__NAME:
				return getName();
			case ArchitecturePackage.COMPONENT__DEPENDENCE:
				return getDependence();
			case ArchitecturePackage.COMPONENT__COMPONENT_DEPENDENCE:
				return getComponentDependence();
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
			case ArchitecturePackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ArchitecturePackage.COMPONENT__DEPENDENCE:
				getDependence().clear();
				getDependence().addAll((Collection<? extends Component>)newValue);
				return;
			case ArchitecturePackage.COMPONENT__COMPONENT_DEPENDENCE:
				getComponentDependence().clear();
				getComponentDependence().addAll((Collection<? extends architecture.System>)newValue);
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
			case ArchitecturePackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturePackage.COMPONENT__DEPENDENCE:
				getDependence().clear();
				return;
			case ArchitecturePackage.COMPONENT__COMPONENT_DEPENDENCE:
				getComponentDependence().clear();
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
			case ArchitecturePackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturePackage.COMPONENT__DEPENDENCE:
				return dependence != null && !dependence.isEmpty();
			case ArchitecturePackage.COMPONENT__COMPONENT_DEPENDENCE:
				return componentDependence != null && !componentDependence.isEmpty();
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

} //ComponentImpl
