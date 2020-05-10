/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.*;

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
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage
 * @generated
 */
public class ContenedorcrudcmviewmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudcmviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudcmviewmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudcmviewmodelPackage.eINSTANCE;
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL: {
				CentroMantViewModel centroMantViewModel = (CentroMantViewModel)theEObject;
				T result = caseCentroMantViewModel(centroMantViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL: {
				ContenedorCRUDCMViewModel contenedorCRUDCMViewModel = (ContenedorCRUDCMViewModel)theEObject;
				T result = caseContenedorCRUDCMViewModel(contenedorCRUDCMViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL: {
				ContenedorDetalleCMViewModel contenedorDetalleCMViewModel = (ContenedorDetalleCMViewModel)theEObject;
				T result = caseContenedorDetalleCMViewModel(contenedorDetalleCMViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL: {
				ContenedorInformacionCMViewModel contenedorInformacionCMViewModel = (ContenedorInformacionCMViewModel)theEObject;
				T result = caseContenedorInformacionCMViewModel(contenedorInformacionCMViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL: {
				ContenedorMaestroCMViewModel contenedorMaestroCMViewModel = (ContenedorMaestroCMViewModel)theEObject;
				T result = caseContenedorMaestroCMViewModel(contenedorMaestroCMViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL: {
				ContenedorUbicacionViewModel contenedorUbicacionViewModel = (ContenedorUbicacionViewModel)theEObject;
				T result = caseContenedorUbicacionViewModel(contenedorUbicacionViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centro Mant View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centro Mant View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentroMantViewModel(CentroMantViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor CRUDCM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor CRUDCM View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Detalle CM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Detalle CM View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Informacion CM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Informacion CM View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorInformacionCMViewModel(ContenedorInformacionCMViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Maestro CM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Maestro CM View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Ubicacion View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Ubicacion View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorUbicacionViewModel(ContenedorUbicacionViewModel object) {
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

} //ContenedorcrudcmviewmodelSwitch
