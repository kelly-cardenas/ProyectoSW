/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage
 * @generated
 */
public class ContenedorregistrovehiculoviewmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorregistrovehiculoviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrovehiculoviewmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorregistrovehiculoviewmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorregistrovehiculoviewmodelSwitch<Adapter> modelSwitch =
		new ContenedorregistrovehiculoviewmodelSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorDetalleVehiculoViewModel(ContenedorDetalleVehiculoViewModel object) {
				return createContenedorDetalleVehiculoViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel object) {
				return createContenedorRegistroVehiculoViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel object) {
				return createContenedorVehiculosRegistradosViewModelAdapter();
			}
			@Override
			public Adapter caseVehiculoViewModel(VehiculoViewModel object) {
				return createVehiculoViewModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel <em>Contenedor Detalle Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel
	 * @generated
	 */
	public Adapter createContenedorDetalleVehiculoViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel <em>Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel
	 * @generated
	 */
	public Adapter createContenedorRegistroVehiculoViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel <em>Contenedor Vehiculos Registrados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel
	 * @generated
	 */
	public Adapter createContenedorVehiculosRegistradosViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel <em>Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel
	 * @generated
	 */
	public Adapter createVehiculoViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ContenedorregistrovehiculoviewmodelAdapterFactory
