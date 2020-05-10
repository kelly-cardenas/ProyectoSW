/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage
 * @generated
 */
public class ContenedorcrudclienteviewmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudclienteviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclienteviewmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudclienteviewmodelPackage.eINSTANCE;
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
	protected ContenedorcrudclienteviewmodelSwitch<Adapter> modelSwitch =
		new ContenedorcrudclienteviewmodelSwitch<Adapter>() {
			@Override
			public Adapter caseClienteViewModel(ClienteViewModel object) {
				return createClienteViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel object) {
				return createContenedorCrudClienteViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorDatosPersonalesViewModel(ContenedorDatosPersonalesViewModel object) {
				return createContenedorDatosPersonalesViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorDatosdelacuentaViewModel(ContenedorDatosdelacuentaViewModel object) {
				return createContenedorDatosdelacuentaViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel object) {
				return createContenedorDetalleClienteViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel object) {
				return createContenedorMaestroClienteViewModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel <em>Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel
	 * @generated
	 */
	public Adapter createClienteViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel <em>Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel
	 * @generated
	 */
	public Adapter createContenedorCrudClienteViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel <em>Contenedor Datos Personales View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel
	 * @generated
	 */
	public Adapter createContenedorDatosPersonalesViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel <em>Contenedor Datosdelacuenta View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel
	 * @generated
	 */
	public Adapter createContenedorDatosdelacuentaViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel <em>Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel
	 * @generated
	 */
	public Adapter createContenedorDetalleClienteViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel <em>Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel
	 * @generated
	 */
	public Adapter createContenedorMaestroClienteViewModelAdapter() {
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

} //ContenedorcrudclienteviewmodelAdapterFactory
