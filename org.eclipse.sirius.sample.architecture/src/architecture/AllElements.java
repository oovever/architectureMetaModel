/**
 */
package architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecture.AllElements#getComponent <em>Component</em>}</li>
 *   <li>{@link architecture.AllElements#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see architecture.ArchitecturePackage#getAllElements()
 * @model
 * @generated
 */
public interface AllElements extends EObject {
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
	 * @see architecture.ArchitecturePackage#getAllElements_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference list.
	 * The list contents are of type {@link architecture.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference list.
	 * @see architecture.ArchitecturePackage#getAllElements_System()
	 * @model containment="true"
	 * @generated
	 */
	EList<architecture.System> getSystem();

} // AllElements
