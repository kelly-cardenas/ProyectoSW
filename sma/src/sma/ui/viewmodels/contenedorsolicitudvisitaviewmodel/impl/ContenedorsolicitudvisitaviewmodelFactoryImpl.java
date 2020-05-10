/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorsolicitudvisitaviewmodelFactoryImpl extends EFactoryImpl implements ContenedorsolicitudvisitaviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorsolicitudvisitaviewmodelFactory init() {
		try {
			ContenedorsolicitudvisitaviewmodelFactory theContenedorsolicitudvisitaviewmodelFactory = (ContenedorsolicitudvisitaviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI);
			if (theContenedorsolicitudvisitaviewmodelFactory != null) {
				return theContenedorsolicitudvisitaviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorsolicitudvisitaviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorsolicitudvisitaviewmodelFactoryImpl() {
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL: return createContenedorBusquedaViewModel();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL: return createContenedorDatosCmViewModel();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL: return createContenedorSolicitudVisitaViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel createContenedorBusquedaViewModel() {
		ContenedorBusquedaViewModelImpl contenedorBusquedaViewModel = new ContenedorBusquedaViewModelImpl();
		return contenedorBusquedaViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatosCmViewModel createContenedorDatosCmViewModel() {
		ContenedorDatosCmViewModelImpl contenedorDatosCmViewModel = new ContenedorDatosCmViewModelImpl();
		return contenedorDatosCmViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorSolicitudVisitaViewModel createContenedorSolicitudVisitaViewModel() {
		ContenedorSolicitudVisitaViewModelImpl contenedorSolicitudVisitaViewModel = new ContenedorSolicitudVisitaViewModelImpl();
		return contenedorSolicitudVisitaViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorsolicitudvisitaviewmodelPackage getContenedorsolicitudvisitaviewmodelPackage() {
		return (ContenedorsolicitudvisitaviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorsolicitudvisitaviewmodelPackage getPackage() {
		return ContenedorsolicitudvisitaviewmodelPackage.eINSTANCE;
	}

} //ContenedorsolicitudvisitaviewmodelFactoryImpl
