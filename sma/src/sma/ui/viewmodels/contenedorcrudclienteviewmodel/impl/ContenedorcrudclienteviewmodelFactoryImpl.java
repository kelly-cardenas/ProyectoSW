/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudclienteviewmodelFactoryImpl extends EFactoryImpl implements ContenedorcrudclienteviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorcrudclienteviewmodelFactory init() {
		try {
			ContenedorcrudclienteviewmodelFactory theContenedorcrudclienteviewmodelFactory = (ContenedorcrudclienteviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorcrudclienteviewmodelPackage.eNS_URI);
			if (theContenedorcrudclienteviewmodelFactory != null) {
				return theContenedorcrudclienteviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorcrudclienteviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclienteviewmodelFactoryImpl() {
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
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL: return createClienteViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL: return createContenedorCrudClienteViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL: return createContenedorDatosPersonalesViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL: return createContenedorDatosdelacuentaViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL: return createContenedorDetalleClienteViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL: return createContenedorMaestroClienteViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClienteViewModel createClienteViewModel() {
		ClienteViewModelImpl clienteViewModel = new ClienteViewModelImpl();
		return clienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCrudClienteViewModel createContenedorCrudClienteViewModel() {
		ContenedorCrudClienteViewModelImpl contenedorCrudClienteViewModel = new ContenedorCrudClienteViewModelImpl();
		return contenedorCrudClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatosPersonalesViewModel createContenedorDatosPersonalesViewModel() {
		ContenedorDatosPersonalesViewModelImpl contenedorDatosPersonalesViewModel = new ContenedorDatosPersonalesViewModelImpl();
		return contenedorDatosPersonalesViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatosdelacuentaViewModel createContenedorDatosdelacuentaViewModel() {
		ContenedorDatosdelacuentaViewModelImpl contenedorDatosdelacuentaViewModel = new ContenedorDatosdelacuentaViewModelImpl();
		return contenedorDatosdelacuentaViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleClienteViewModel createContenedorDetalleClienteViewModel() {
		ContenedorDetalleClienteViewModelImpl contenedorDetalleClienteViewModel = new ContenedorDetalleClienteViewModelImpl();
		return contenedorDetalleClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel createContenedorMaestroClienteViewModel() {
		ContenedorMaestroClienteViewModelImpl contenedorMaestroClienteViewModel = new ContenedorMaestroClienteViewModelImpl();
		return contenedorMaestroClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclienteviewmodelPackage getContenedorcrudclienteviewmodelPackage() {
		return (ContenedorcrudclienteviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorcrudclienteviewmodelPackage getPackage() {
		return ContenedorcrudclienteviewmodelPackage.eINSTANCE;
	}

} //ContenedorcrudclienteviewmodelFactoryImpl
