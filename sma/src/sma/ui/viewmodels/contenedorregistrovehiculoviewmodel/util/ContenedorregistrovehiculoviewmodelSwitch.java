/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.*;

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
 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage
 * @generated
 */
public class ContenedorregistrovehiculoviewmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorregistrovehiculoviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrovehiculoviewmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ContenedorregistrovehiculoviewmodelPackage.eINSTANCE;
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL: {
				ContenedorDetalleVehiculoViewModel contenedorDetalleVehiculoViewModel = (ContenedorDetalleVehiculoViewModel)theEObject;
				T result = caseContenedorDetalleVehiculoViewModel(contenedorDetalleVehiculoViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL: {
				ContenedorRegistroVehiculoViewModel contenedorRegistroVehiculoViewModel = (ContenedorRegistroVehiculoViewModel)theEObject;
				T result = caseContenedorRegistroVehiculoViewModel(contenedorRegistroVehiculoViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL: {
				ContenedorVehiculosRegistradosViewModel contenedorVehiculosRegistradosViewModel = (ContenedorVehiculosRegistradosViewModel)theEObject;
				T result = caseContenedorVehiculosRegistradosViewModel(contenedorVehiculosRegistradosViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL: {
				VehiculoViewModel vehiculoViewModel = (VehiculoViewModel)theEObject;
				T result = caseVehiculoViewModel(vehiculoViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Detalle Vehiculo View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Detalle Vehiculo View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorDetalleVehiculoViewModel(ContenedorDetalleVehiculoViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Registro Vehiculo View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Registro Vehiculo View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor Vehiculos Registrados View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor Vehiculos Registrados View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehiculo View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehiculo View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehiculoViewModel(VehiculoViewModel object) {
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

} //ContenedorregistrovehiculoviewmodelSwitch
