/**
 */
package sma.domain.reparacionvehiculo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.domain.reparacionvehiculo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReparacionvehiculoFactoryImpl extends EFactoryImpl implements ReparacionvehiculoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReparacionvehiculoFactory init() {
		try {
			ReparacionvehiculoFactory theReparacionvehiculoFactory = (ReparacionvehiculoFactory)EPackage.Registry.INSTANCE.getEFactory(ReparacionvehiculoPackage.eNS_URI);
			if (theReparacionvehiculoFactory != null) {
				return theReparacionvehiculoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReparacionvehiculoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReparacionvehiculoFactoryImpl() {
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
			case ReparacionvehiculoPackage.REPARACION: return createReparacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reparacion createReparacion() {
		ReparacionImpl reparacion = new ReparacionImpl();
		return reparacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReparacionvehiculoPackage getReparacionvehiculoPackage() {
		return (ReparacionvehiculoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReparacionvehiculoPackage getPackage() {
		return ReparacionvehiculoPackage.eINSTANCE;
	}

} //ReparacionvehiculoFactoryImpl
