/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sma.ui.viewmodels.ViewModel;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage
 * @generated
 */
public class ContenedorcontactarcmviewmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorcontactarcmviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcontactarcmviewmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorcontactarcmviewmodelPackage.eINSTANCE;
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
	protected ContenedorcontactarcmviewmodelSwitch<Adapter> modelSwitch =
		new ContenedorcontactarcmviewmodelSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel object) {
				return createContenedorCmrecomendadosViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorContactarCmViewModel(ContenedorContactarCmViewModel object) {
				return createContenedorContactarCmViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorUbicacionactualViewModel(ContenedorUbicacionactualViewModel object) {
				return createContenedorUbicacionactualViewModelAdapter();
			}
			@Override
			public Adapter caseListaCmViewModel(ListaCmViewModel object) {
				return createListaCmViewModelAdapter();
			}
			@Override
			public Adapter caseViewModel(ViewModel object) {
				return createViewModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel <em>Contenedor Cmrecomendados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel
	 * @generated
	 */
	public Adapter createContenedorCmrecomendadosViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel <em>Contenedor Contactar Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel
	 * @generated
	 */
	public Adapter createContenedorContactarCmViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel <em>Contenedor Ubicacionactual View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel
	 * @generated
	 */
	public Adapter createContenedorUbicacionactualViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel <em>Lista Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel
	 * @generated
	 */
	public Adapter createListaCmViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.ViewModel
	 * @generated
	 */
	public Adapter createViewModelAdapter() {
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

} //ContenedorcontactarcmviewmodelAdapterFactory
