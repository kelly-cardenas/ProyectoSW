/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorregistrovehiculoviewmodelFactoryImpl extends EFactoryImpl implements ContenedorregistrovehiculoviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorregistrovehiculoviewmodelFactory init() {
		try {
			ContenedorregistrovehiculoviewmodelFactory theContenedorregistrovehiculoviewmodelFactory = (ContenedorregistrovehiculoviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorregistrovehiculoviewmodelPackage.eNS_URI);
			if (theContenedorregistrovehiculoviewmodelFactory != null) {
				return theContenedorregistrovehiculoviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorregistrovehiculoviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrovehiculoviewmodelFactoryImpl() {
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL: return createContenedorDetalleVehiculoViewModel();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL: return createContenedorRegistroVehiculoViewModel();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL: return createContenedorVehiculosRegistradosViewModel();
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL: return createVehiculoViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleVehiculoViewModel createContenedorDetalleVehiculoViewModel() {
		ContenedorDetalleVehiculoViewModelImpl contenedorDetalleVehiculoViewModel = new ContenedorDetalleVehiculoViewModelImpl();
		return contenedorDetalleVehiculoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroVehiculoViewModel createContenedorRegistroVehiculoViewModel() {
		ContenedorRegistroVehiculoViewModelImpl contenedorRegistroVehiculoViewModel = new ContenedorRegistroVehiculoViewModelImpl();
		return contenedorRegistroVehiculoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorVehiculosRegistradosViewModel createContenedorVehiculosRegistradosViewModel() {
		ContenedorVehiculosRegistradosViewModelImpl contenedorVehiculosRegistradosViewModel = new ContenedorVehiculosRegistradosViewModelImpl();
		return contenedorVehiculosRegistradosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehiculoViewModel createVehiculoViewModel() {
		VehiculoViewModelImpl vehiculoViewModel = new VehiculoViewModelImpl();
		return vehiculoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrovehiculoviewmodelPackage getContenedorregistrovehiculoviewmodelPackage() {
		return (ContenedorregistrovehiculoviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorregistrovehiculoviewmodelPackage getPackage() {
		return ContenedorregistrovehiculoviewmodelPackage.eINSTANCE;
	}

} //ContenedorregistrovehiculoviewmodelFactoryImpl
