/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcontactarcmviewmodelFactoryImpl extends EFactoryImpl implements ContenedorcontactarcmviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorcontactarcmviewmodelFactory init() {
		try {
			ContenedorcontactarcmviewmodelFactory theContenedorcontactarcmviewmodelFactory = (ContenedorcontactarcmviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorcontactarcmviewmodelPackage.eNS_URI);
			if (theContenedorcontactarcmviewmodelFactory != null) {
				return theContenedorcontactarcmviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorcontactarcmviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcontactarcmviewmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL: return createContenedorCmrecomendadosViewModel();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL: return createContenedorContactarCmViewModel();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL: return createContenedorUbicacionactualViewModel();
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL: return createListaCmViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCmrecomendadosViewModel createContenedorCmrecomendadosViewModel() {
		ContenedorCmrecomendadosViewModelImpl contenedorCmrecomendadosViewModel = new ContenedorCmrecomendadosViewModelImpl();
		return contenedorCmrecomendadosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorContactarCmViewModel createContenedorContactarCmViewModel() {
		ContenedorContactarCmViewModelImpl contenedorContactarCmViewModel = new ContenedorContactarCmViewModelImpl();
		return contenedorContactarCmViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorUbicacionactualViewModel createContenedorUbicacionactualViewModel() {
		ContenedorUbicacionactualViewModelImpl contenedorUbicacionactualViewModel = new ContenedorUbicacionactualViewModelImpl();
		return contenedorUbicacionactualViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListaCmViewModel createListaCmViewModel() {
		ListaCmViewModelImpl listaCmViewModel = new ListaCmViewModelImpl();
		return listaCmViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcontactarcmviewmodelPackage getContenedorcontactarcmviewmodelPackage() {
		return (ContenedorcontactarcmviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorcontactarcmviewmodelPackage getPackage() {
		return ContenedorcontactarcmviewmodelPackage.eINSTANCE;
	}

} //ContenedorcontactarcmviewmodelFactoryImpl
