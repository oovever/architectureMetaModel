/**
 */
package architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.System#getName <em>Name</em>}</li>
 *   <li>{@link architecture.System#getComponent <em>Component</em>}</li>
 *   <li>{@link architecture.System#getDependence <em>Dependence</em>}</li>
 *   <li>{@link architecture.System#getSystemDependence <em>System Dependence</em>}</li>
 *   <li>{@link architecture.System#getSubsystem <em>Subsystem</em>}</li>
 * </ul>
 *
 * @see architecture.ArchitecturePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see architecture.ArchitecturePackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecture.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see architecture.ArchitecturePackage#getSystem_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Dependence</b></em>' reference list.
	 * The list contents are of type {@link architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependence</em>' reference list.
	 * @see architecture.ArchitecturePackage#getSystem_Dependence()
	 * @model
	 * @generated
	 */
	EList<System> getDependence();

	/**
	 * Returns the value of the '<em><b>System Dependence</b></em>' reference list.
	 * The list contents are of type {@link architecture.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Dependence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Dependence</em>' reference list.
	 * @see architecture.ArchitecturePackage#getSystem_SystemDependence()
	 * @model
	 * @generated
	 */
	EList<Component> getSystemDependence();

	/**
	 * Returns the value of the '<em><b>Subsystem</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem</em>' containment reference list.
	 * @see architecture.ArchitecturePackage#getSystem_Subsystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<System> getSubsystem();

} // System
