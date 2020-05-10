/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sma.ui.viewmodels.ViewModel;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.*;

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
 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage
 * @generated
 */
public class ContenedorcontactarcmviewmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcontactarcmviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcontactarcmviewmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ContenedorcontactarcmviewmodelPackage.eINSTANCE;
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL: {
				ContenedorCmrecomendadosViewModel contenedorCmrecomendadosViewModel = (ContenedorCmrecomendadosViewModel)theEObject;
				T result = caseContenedorCmrecomendadosViewModel(contenedorCmrecomendadosViewModel);
				if (result == null) result = caseViewModel(contenedorCmrecomendadosViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL: {
				ContenedorContactarCmViewModel contenedorContactarCmViewModel = (ContenedorContactarCmViewModel)theEObject;
				T result = caseContenedorContactarCmViewModel(contenedorContactarCmViewModel);
				if (result == null) result = caseViewModel(contenedorContactarCmViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL: {
				ContenedorUbicacionactualViewModel contenedorUbicacionactualViewModel = (ContenedorUbicacionactualViewModel)theEObject;
				T result = caseContenedorUbicacionactualViewModel(contenedorUbicacionactualViewModel);
				if (result == null) result = caseViewModel(contenedorUbicacionactualViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL: {
				ListaCmViewModel listaCmViewModel = (ListaCmViewModel)theEObject;
				T result = caseListaCmViewModel(listaCmViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Cmrecomendados View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Cmrecomendados View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Contactar Cm View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Contactar Cm View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorContactarCmViewModel(ContenedorContactarCmViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Ubicacionactual View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Ubicacionactual View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorUbicacionactualViewModel(ContenedorUbicacionactualViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lista Cm View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lista Cm View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListaCmViewModel(ListaCmViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModel(ViewModel object) {
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

} //ContenedorcontactarcmviewmodelSwitch
