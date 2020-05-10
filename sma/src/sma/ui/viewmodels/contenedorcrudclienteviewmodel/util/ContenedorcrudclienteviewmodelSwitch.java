/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage
 * @generated
 */
public class ContenedorcrudclienteviewmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudclienteviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclienteviewmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudclienteviewmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL: {
				ClienteViewModel clienteViewModel = (ClienteViewModel)theEObject;
				T result = caseClienteViewModel(clienteViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL: {
				ContenedorCrudClienteViewModel contenedorCrudClienteViewModel = (ContenedorCrudClienteViewModel)theEObject;
				T result = caseContenedorCrudClienteViewModel(contenedorCrudClienteViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL: {
				ContenedorDatosPersonalesViewModel contenedorDatosPersonalesViewModel = (ContenedorDatosPersonalesViewModel)theEObject;
				T result = caseContenedorDatosPersonalesViewModel(contenedorDatosPersonalesViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL: {
				ContenedorDatosdelacuentaViewModel contenedorDatosdelacuentaViewModel = (ContenedorDatosdelacuentaViewModel)theEObject;
				T result = caseContenedorDatosdelacuentaViewModel(contenedorDatosdelacuentaViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL: {
				ContenedorDetalleClienteViewModel contenedorDetalleClienteViewModel = (ContenedorDetalleClienteViewModel)theEObject;
				T result = caseContenedorDetalleClienteViewModel(contenedorDetalleClienteViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL: {
				ContenedorMaestroClienteViewModel contenedorMaestroClienteViewModel = (ContenedorMaestroClienteViewModel)theEObject;
				T result = caseContenedorMaestroClienteViewModel(contenedorMaestroClienteViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliente View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClienteViewModel(ClienteViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Crud Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Crud Cliente View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Datos Personales View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Datos Personales View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorDatosPersonalesViewModel(ContenedorDatosPersonalesViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Datosdelacuenta View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Datosdelacuenta View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorDatosdelacuentaViewModel(ContenedorDatosdelacuentaViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Detalle Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Detalle Cliente View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Maestro Cliente View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Maestro Cliente View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ContenedorcrudclienteviewmodelSwitch
