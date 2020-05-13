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
 *   <li>{@link sma.domain.automatizacionrevision.sensor#getIndiceEmisionGases <em>Indice Emision Gases</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.sensor#getImpacto <em>Impacto</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.sensor#getIndiceGasesOfensivos <em>Indice Gases Ofensivos</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.sensor#getIndiceGasesNocivos <em>Indice Gases Nocivos</em>}</li>
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
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_Id()
	 * @model default=" " dataType="sma.String"
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
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Comp</em>' attribute.
	 * @see #setInfoComp(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_InfoComp()
	 * @model default=" " dataType="sma.String"
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

	/**
	 * Returns the value of the '<em><b>Indice Emision Gases</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice Emision Gases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice Emision Gases</em>' attribute.
	 * @see #setIndiceEmisionGases(Integer)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_IndiceEmisionGases()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getIndiceEmisionGases();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.sensor#getIndiceEmisionGases <em>Indice Emision Gases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice Emision Gases</em>' attribute.
	 * @see #getIndiceEmisionGases()
	 * @generated
	 */
	void setIndiceEmisionGases(Integer value);

	/**
	 * Returns the value of the '<em><b>Impacto</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impacto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacto</em>' attribute.
	 * @see #setImpacto(Integer)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_Impacto()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getImpacto();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.sensor#getImpacto <em>Impacto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impacto</em>' attribute.
	 * @see #getImpacto()
	 * @generated
	 */
	void setImpacto(Integer value);

	/**
	 * Returns the value of the '<em><b>Indice Gases Ofensivos</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice Gases Ofensivos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice Gases Ofensivos</em>' attribute.
	 * @see #setIndiceGasesOfensivos(Integer)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_IndiceGasesOfensivos()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getIndiceGasesOfensivos();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.sensor#getIndiceGasesOfensivos <em>Indice Gases Ofensivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice Gases Ofensivos</em>' attribute.
	 * @see #getIndiceGasesOfensivos()
	 * @generated
	 */
	void setIndiceGasesOfensivos(Integer value);

	/**
	 * Returns the value of the '<em><b>Indice Gases Nocivos</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice Gases Nocivos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice Gases Nocivos</em>' attribute.
	 * @see #setIndiceGasesNocivos(Integer)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getsensor_IndiceGasesNocivos()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getIndiceGasesNocivos();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.sensor#getIndiceGasesNocivos <em>Indice Gases Nocivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice Gases Nocivos</em>' attribute.
	 * @see #getIndiceGasesNocivos()
	 * @generated
	 */
	void setIndiceGasesNocivos(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tsetIndiceGasesNocivos((int)Math.random()*600+50);\r\n\t\tsetIndiceGasesOfensivos((int)Math.random()*600 + 50);'"
	 * @generated
	 */
	void ActualizarIndiceGases();

} // sensor
