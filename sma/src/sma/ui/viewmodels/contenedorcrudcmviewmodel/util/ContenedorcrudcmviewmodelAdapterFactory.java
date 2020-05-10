/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage
 * @generated
 */
public class ContenedorcrudcmviewmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcrudcmviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudcmviewmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorcrudcmviewmodelPackage.eINSTANCE;
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
	protected ContenedorcrudcmviewmodelSwitch<Adapter> modelSwitch =
		new ContenedorcrudcmviewmodelSwitch<Adapter>() {
			@Override
			public Adapter caseCentroMantViewModel(CentroMantViewModel object) {
				return createCentroMantViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel object) {
				return createContenedorCRUDCMViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel object) {
				return createContenedorDetalleCMViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorInformacionCMViewModel(ContenedorInformacionCMViewModel object) {
				return createContenedorInformacionCMViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel object) {
				return createContenedorMaestroCMViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorUbicacionViewModel(ContenedorUbicacionViewModel object) {
				return createContenedorUbicacionViewModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel <em>Centro Mant View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel
	 * @generated
	 */
	public Adapter createCentroMantViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel <em>Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel
	 * @generated
	 */
	public Adapter createContenedorCRUDCMViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel <em>Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel
	 * @generated
	 */
	public Adapter createContenedorDetalleCMViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel <em>Contenedor Informacion CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel
	 * @generated
	 */
	public Adapter createContenedorInformacionCMViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel <em>Contenedor Maestro CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel
	 * @generated
	 */
	public Adapter createContenedorMaestroCMViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel <em>Contenedor Ubicacion View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel
	 * @generated
	 */
	public Adapter createContenedorUbicacionViewModelAdapter() {
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

} //ContenedorcrudcmviewmodelAdapterFactory
