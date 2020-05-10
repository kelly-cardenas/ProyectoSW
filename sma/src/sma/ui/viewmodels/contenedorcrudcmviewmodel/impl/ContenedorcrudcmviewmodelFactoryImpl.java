/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudcmviewmodelFactoryImpl extends EFactoryImpl implements ContenedorcrudcmviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorcrudcmviewmodelFactory init() {
		try {
			ContenedorcrudcmviewmodelFactory theContenedorcrudcmviewmodelFactory = (ContenedorcrudcmviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorcrudcmviewmodelPackage.eNS_URI);
			if (theContenedorcrudcmviewmodelFactory != null) {
				return theContenedorcrudcmviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorcrudcmviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudcmviewmodelFactoryImpl() {
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL: return createCentroMantViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL: return createContenedorCRUDCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL: return createContenedorDetalleCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL: return createContenedorInformacionCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL: return createContenedorMaestroCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL: return createContenedorUbicacionViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroMantViewModel createCentroMantViewModel() {
		CentroMantViewModelImpl centroMantViewModel = new CentroMantViewModelImpl();
		return centroMantViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDCMViewModel createContenedorCRUDCMViewModel() {
		ContenedorCRUDCMViewModelImpl contenedorCRUDCMViewModel = new ContenedorCRUDCMViewModelImpl();
		return contenedorCRUDCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleCMViewModel createContenedorDetalleCMViewModel() {
		ContenedorDetalleCMViewModelImpl contenedorDetalleCMViewModel = new ContenedorDetalleCMViewModelImpl();
		return contenedorDetalleCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformacionCMViewModel createContenedorInformacionCMViewModel() {
		ContenedorInformacionCMViewModelImpl contenedorInformacionCMViewModel = new ContenedorInformacionCMViewModelImpl();
		return contenedorInformacionCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroCMViewModel createContenedorMaestroCMViewModel() {
		ContenedorMaestroCMViewModelImpl contenedorMaestroCMViewModel = new ContenedorMaestroCMViewModelImpl();
		return contenedorMaestroCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorUbicacionViewModel createContenedorUbicacionViewModel() {
		ContenedorUbicacionViewModelImpl contenedorUbicacionViewModel = new ContenedorUbicacionViewModelImpl();
		return contenedorUbicacionViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudcmviewmodelPackage getContenedorcrudcmviewmodelPackage() {
		return (ContenedorcrudcmviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorcrudcmviewmodelPackage getPackage() {
		return ContenedorcrudcmviewmodelPackage.eINSTANCE;
	}

} //ContenedorcrudcmviewmodelFactoryImpl
