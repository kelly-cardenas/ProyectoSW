/**
 */
package sma.ui.viewmodels.contenedorloginviewmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.ui.viewmodels.contenedorloginviewmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorloginviewmodelFactoryImpl extends EFactoryImpl implements ContenedorloginviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContenedorloginviewmodelFactory init() {
		try {
			ContenedorloginviewmodelFactory theContenedorloginviewmodelFactory = (ContenedorloginviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ContenedorloginviewmodelPackage.eNS_URI);
			if (theContenedorloginviewmodelFactory != null) {
				return theContenedorloginviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContenedorloginviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorloginviewmodelFactoryImpl() {
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL: return createContenedorDetalleLoginViewModel();
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL: return createContenedorLoginViewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleLoginViewModel createContenedorDetalleLoginViewModel() {
		ContenedorDetalleLoginViewModelImpl contenedorDetalleLoginViewModel = new ContenedorDetalleLoginViewModelImpl();
		return contenedorDetalleLoginViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorLoginViewModel createContenedorLoginViewModel() {
		ContenedorLoginViewModelImpl contenedorLoginViewModel = new ContenedorLoginViewModelImpl();
		return contenedorLoginViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorloginviewmodelPackage getContenedorloginviewmodelPackage() {
		return (ContenedorloginviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContenedorloginviewmodelPackage getPackage() {
		return ContenedorloginviewmodelPackage.eINSTANCE;
	}

} //ContenedorloginviewmodelFactoryImpl
