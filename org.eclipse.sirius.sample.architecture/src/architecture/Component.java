/**
 */
package architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.Component#getName <em>Name</em>}</li>
 *   <li>{@link architecture.Component#getDependence <em>Dependence</em>}</li>
 *   <li>{@link architecture.Component#getComponentDependence <em>Component Dependence</em>}</li>
 *   <li>{@link architecture.Component#getClass_ <em>Class</em>}</li>
 *   <li>{@link architecture.Component#getPortOfComponent <em>Port Of Component</em>}</li>
 * </ul>
 *
 * @see architecture.ArchitecturePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see architecture.ArchitecturePackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecture.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dependence</b></em>' reference list.
	 * The list contents are of type {@link architecture.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependence</em>' reference list.
	 * @see architecture.ArchitecturePackage#getComponent_Dependence()
	 * @model
	 * @generated
	 */
	EList<Component> getDependence();

	/**
	 * Returns the value of the '<em><b>Component Dependence</b></em>' reference list.
	 * The list contents are of type {@link architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Dependence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Dependence</em>' reference list.
	 * @see architecture.ArchitecturePackage#getComponent_ComponentDependence()
	 * @model
	 * @generated
	 */
	EList<architecture.System> getComponentDependence();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see architecture.ArchitecturePackage#getComponent_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<architecture.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Port Of Component</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Of Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Of Component</em>' containment reference list.
	 * @see architecture.ArchitecturePackage#getComponent_PortOfComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPortOfComponent();

} // Component
