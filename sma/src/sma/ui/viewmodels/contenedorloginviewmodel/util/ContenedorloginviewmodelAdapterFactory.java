/**
 */
package sma.ui.viewmodels.contenedorloginviewmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sma.ui.viewmodels.contenedorloginviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage
 * @generated
 */
public class ContenedorloginviewmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContenedorloginviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorloginviewmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContenedorloginviewmodelPackage.eINSTANCE;
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
	protected ContenedorloginviewmodelSwitch<Adapter> modelSwitch =
		new ContenedorloginviewmodelSwitch<Adapter>() {
			@Override
			public Adapter caseContenedorDetalleLoginViewModel(ContenedorDetalleLoginViewModel object) {
				return createContenedorDetalleLoginViewModelAdapter();
			}
			@Override
			public Adapter caseContenedorLoginViewModel(ContenedorLoginViewModel object) {
				return createContenedorLoginViewModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel <em>Contenedor Detalle Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel
	 * @generated
	 */
	public Adapter createContenedorDetalleLoginViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel <em>Contenedor Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel
	 * @generated
	 */
	public Adapter createContenedorLoginViewModelAdapter() {
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

} //ContenedorloginviewmodelAdapterFactory
