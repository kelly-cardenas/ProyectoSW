/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.ui.viewmodels.contenedorescaneoviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorescaneoviewmodelFactoryImpl extends EFactoryImpl implements ContenedorescaneoviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorescaneoviewmodelFactory init() {
		try {
			ContenedorescaneoviewmodelFactory theContenedorescaneoviewmodelFactory = (ContenedorescaneoviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorescaneoviewmodelPackage.eNS_URI);
			if (theContenedorescaneoviewmodelFactory != null) {
				return theContenedorescaneoviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorescaneoviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorescaneoviewmodelFactoryImpl() {
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL: return createContenedorEscaneoViewModel();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL: return createContenedorInformacionEmisionGasesViewModel();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL: return createContenedorSeleccionautoViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorEscaneoViewModel createContenedorEscaneoViewModel() {
		ContenedorEscaneoViewModelImpl contenedorEscaneoViewModel = new ContenedorEscaneoViewModelImpl();
		return contenedorEscaneoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformacionEmisionGasesViewModel createContenedorInformacionEmisionGasesViewModel() {
		ContenedorInformacionEmisionGasesViewModelImpl contenedorInformacionEmisionGasesViewModel = new ContenedorInformacionEmisionGasesViewModelImpl();
		return contenedorInformacionEmisionGasesViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorSeleccionautoViewModel createContenedorSeleccionautoViewModel() {
		ContenedorSeleccionautoViewModelImpl contenedorSeleccionautoViewModel = new ContenedorSeleccionautoViewModelImpl();
		return contenedorSeleccionautoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorescaneoviewmodelPackage getContenedorescaneoviewmodelPackage() {
		return (ContenedorescaneoviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorescaneoviewmodelPackage getPackage() {
		return ContenedorescaneoviewmodelPackage.eINSTANCE;
	}

} //ContenedorescaneoviewmodelFactoryImpl
