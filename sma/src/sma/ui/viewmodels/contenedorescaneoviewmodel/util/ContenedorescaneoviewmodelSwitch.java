/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sma.ui.viewmodels.ViewModel;

import sma.ui.viewmodels.contenedorescaneoviewmodel.*;

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
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage
 * @generated
 */
public class ContenedorescaneoviewmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorescaneoviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorescaneoviewmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ContenedorescaneoviewmodelPackage.eINSTANCE;
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL: {
				ContenedorEscaneoViewModel contenedorEscaneoViewModel = (ContenedorEscaneoViewModel)theEObject;
				T result = caseContenedorEscaneoViewModel(contenedorEscaneoViewModel);
				if (result == null) result = caseViewModel(contenedorEscaneoViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL: {
				ContenedorFallasViewModel contenedorFallasViewModel = (ContenedorFallasViewModel)theEObject;
				T result = caseContenedorFallasViewModel(contenedorFallasViewModel);
				if (result == null) result = caseViewModel(contenedorFallasViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL: {
				ContenedorSeleccionautoViewModel contenedorSeleccionautoViewModel = (ContenedorSeleccionautoViewModel)theEObject;
				T result = caseContenedorSeleccionautoViewModel(contenedorSeleccionautoViewModel);
				if (result == null) result = caseViewModel(contenedorSeleccionautoViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL: {
				ListaFallasViewModel listaFallasViewModel = (ListaFallasViewModel)theEObject;
				T result = caseListaFallasViewModel(listaFallasViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Escaneo View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Escaneo View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorEscaneoViewModel(ContenedorEscaneoViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Fallas View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Fallas View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorFallasViewModel(ContenedorFallasViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Seleccionauto View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Seleccionauto View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorSeleccionautoViewModel(ContenedorSeleccionautoViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lista Fallas View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lista Fallas View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListaFallasViewModel(ListaFallasViewModel object) {
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

} //ContenedorescaneoviewmodelSwitch
