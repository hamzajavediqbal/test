/**
 */
package no.ntnu.idi.tdt4250.tt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campus Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getClassroom <em>Classroom</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampusBuilding()
 * @model
 * @generated
 */
public interface CampusBuilding extends EObject {
	/**
	 * Returns the value of the '<em><b>Classroom</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classroom</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampusBuilding_Classroom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getClassroom();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampusBuilding_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampusBuilding_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // CampusBuilding
