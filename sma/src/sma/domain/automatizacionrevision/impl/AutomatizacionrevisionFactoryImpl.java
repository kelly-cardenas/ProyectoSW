/**
 */
package sma.domain.automatizacionrevision.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sma.domain.automatizacionrevision.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomatizacionrevisionFactoryImpl extends EFactoryImpl implements AutomatizacionrevisionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AutomatizacionrevisionFactory init() {
		try {
			AutomatizacionrevisionFactory theAutomatizacionrevisionFactory = (AutomatizacionrevisionFactory)EPackage.Registry.INSTANCE.getEFactory(AutomatizacionrevisionPackage.eNS_URI);
			if (theAutomatizacionrevisionFactory != null) {
				return theAutomatizacionrevisionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AutomatizacionrevisionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatizacionrevisionFactoryImpl() {
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
			case AutomatizacionrevisionPackage.FALLA_MECANICA: return createFallaMecanica();
			case AutomatizacionrevisionPackage.SENSOR: return createsensor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FallaMecanica createFallaMecanica() {
		FallaMecanicaImpl fallaMecanica = new FallaMecanicaImpl();
		return fallaMecanica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sensor createsensor() {
		sensorImpl sensor = new sensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomatizacionrevisionPackage getAutomatizacionrevisionPackage() {
		return (AutomatizacionrevisionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AutomatizacionrevisionPackage getPackage() {
		return AutomatizacionrevisionPackage.eINSTANCE;
	}

} //AutomatizacionrevisionFactoryImpl
