/**
 */
package sma.domain.automatizacionrevision;

import org.eclipse.emf.ecore.EObject;

import sma.domain.Automovil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.automatizacionrevision.sensor#getOwnerBy <em>Owner By</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.sensor#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.sensor#getInfoComp <em>Info Comp</em>}</li>
 * </ul>
 *
 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor()
 * @model
 * @generated
 */
public interface sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Automovil#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner By</em>' container reference.
	 * @see #setOwnerBy(Automovil)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_OwnerBy()
	 * @see sma.domain.Automovil#getSensor
	 * @model opposite="sensor" transient="false"
	 * @generated
	 */
	Automovil getOwnerBy();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.sensor#getOwnerBy <em>Owner By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner By</em>' container reference.
	 * @see #getOwnerBy()
	 * @generated
	 */
	void setOwnerBy(Automovil value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_Id()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.sensor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Info Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Comp</em>' attribute.
	 * @see #setInfoComp(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_InfoComp()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getInfoComp();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.sensor#getInfoComp <em>Info Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Comp</em>' attribute.
	 * @see #getInfoComp()
	 * @generated
	 */
	void setInfoComp(String value);

} // sensor
