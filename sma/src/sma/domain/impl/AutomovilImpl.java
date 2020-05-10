/**
 */
package sma.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sma.domain.Automovil;
import sma.domain.DomainPackage;
import sma.domain.Usuario;

import sma.domain.automatizacionrevision.AutomatizacionrevisionPackage;
import sma.domain.automatizacionrevision.FallaMecanica;
import sma.domain.automatizacionrevision.sensor;

import sma.domain.reparacionvehiculo.Reparacion;
import sma.domain.reparacionvehiculo.ReparacionvehiculoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automovil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getPlaca <em>Placa</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getMarca <em>Marca</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getTipoUso <em>Tipo Uso</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getReparacionesHechas <em>Reparaciones Hechas</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getPropietario <em>Propietario</em>}</li>
 *   <li>{@link sma.domain.impl.AutomovilImpl#getListaDeFallas <em>Lista De Fallas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomovilImpl extends EObjectImpl implements Automovil {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaca() <em>Placa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaca()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPlaca() <em>Placa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaca()
	 * @generated
	 * @ordered
	 */
	protected String placa = PLACA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected static final String MARCA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected String marca = MARCA_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MODELO_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected Integer modelo = MODELO_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCIA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected String referencia = REFERENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoUso() <em>Tipo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUso()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_USO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTipoUso() <em>Tipo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUso()
	 * @generated
	 * @ordered
	 */
	protected String tipoUso = TIPO_USO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReparacionesHechas() <em>Reparaciones Hechas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReparacionesHechas()
	 * @generated
	 * @ordered
	 */
	protected EList<Reparacion> reparacionesHechas;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected sensor sensor;

	/**
	 * The cached value of the '{@link #getPropietario() <em>Propietario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropietario()
	 * @generated
	 * @ordered
	 */
	protected Usuario propietario;

	/**
	 * The cached value of the '{@link #getListaDeFallas() <em>Lista De Fallas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaDeFallas()
	 * @generated
	 * @ordered
	 */
	protected EList<FallaMecanica> listaDeFallas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomovilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.AUTOMOVIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaca(String newPlaca) {
		String oldPlaca = placa;
		placa = newPlaca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__PLACA, oldPlaca, placa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarca(String newMarca) {
		String oldMarca = marca;
		marca = newMarca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__MARCA, oldMarca, marca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getModelo() {
		return modelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelo(Integer newModelo) {
		Integer oldModelo = modelo;
		modelo = newModelo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__MODELO, oldModelo, modelo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencia(String newReferencia) {
		String oldReferencia = referencia;
		referencia = newReferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__REFERENCIA, oldReferencia, referencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoUso() {
		return tipoUso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoUso(String newTipoUso) {
		String oldTipoUso = tipoUso;
		tipoUso = newTipoUso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__TIPO_USO, oldTipoUso, tipoUso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reparacion> getReparacionesHechas() {
		if (reparacionesHechas == null) {
			reparacionesHechas = new EObjectWithInverseResolvingEList<Reparacion>(Reparacion.class, this, DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS, ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL);
		}
		return reparacionesHechas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sensor getSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensor(sensor newSensor, NotificationChain msgs) {
		sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__SENSOR, oldSensor, newSensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(sensor newSensor) {
		if (newSensor != sensor) {
			NotificationChain msgs = null;
			if (sensor != null)
				msgs = ((InternalEObject)sensor).eInverseRemove(this, AutomatizacionrevisionPackage.SENSOR__OWNER_BY, sensor.class, msgs);
			if (newSensor != null)
				msgs = ((InternalEObject)newSensor).eInverseAdd(this, AutomatizacionrevisionPackage.SENSOR__OWNER_BY, sensor.class, msgs);
			msgs = basicSetSensor(newSensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__SENSOR, newSensor, newSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario getPropietario() {
		if (propietario != null && propietario.eIsProxy()) {
			InternalEObject oldPropietario = (InternalEObject)propietario;
			propietario = (Usuario)eResolveProxy(oldPropietario);
			if (propietario != oldPropietario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.AUTOMOVIL__PROPIETARIO, oldPropietario, propietario));
			}
		}
		return propietario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario basicGetPropietario() {
		return propietario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropietario(Usuario newPropietario, NotificationChain msgs) {
		Usuario oldPropietario = propietario;
		propietario = newPropietario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__PROPIETARIO, oldPropietario, newPropietario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropietario(Usuario newPropietario) {
		if (newPropietario != propietario) {
			NotificationChain msgs = null;
			if (propietario != null)
				msgs = ((InternalEObject)propietario).eInverseRemove(this, DomainPackage.USUARIO__AUTOMOVILES, Usuario.class, msgs);
			if (newPropietario != null)
				msgs = ((InternalEObject)newPropietario).eInverseAdd(this, DomainPackage.USUARIO__AUTOMOVILES, Usuario.class, msgs);
			msgs = basicSetPropietario(newPropietario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.AUTOMOVIL__PROPIETARIO, newPropietario, newPropietario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FallaMecanica> getListaDeFallas() {
		if (listaDeFallas == null) {
			listaDeFallas = new EObjectContainmentWithInverseEList<FallaMecanica>(FallaMecanica.class, this, DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS, AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL);
		}
		return listaDeFallas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void hacerEscaneo() {
		//TODO asignarFallas
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReparacionesHechas()).basicAdd(otherEnd, msgs);
			case DomainPackage.AUTOMOVIL__SENSOR:
				if (sensor != null)
					msgs = ((InternalEObject)sensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.AUTOMOVIL__SENSOR, null, msgs);
				return basicSetSensor((sensor)otherEnd, msgs);
			case DomainPackage.AUTOMOVIL__PROPIETARIO:
				if (propietario != null)
					msgs = ((InternalEObject)propietario).eInverseRemove(this, DomainPackage.USUARIO__AUTOMOVILES, Usuario.class, msgs);
				return basicSetPropietario((Usuario)otherEnd, msgs);
			case DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaDeFallas()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS:
				return ((InternalEList<?>)getReparacionesHechas()).basicRemove(otherEnd, msgs);
			case DomainPackage.AUTOMOVIL__SENSOR:
				return basicSetSensor(null, msgs);
			case DomainPackage.AUTOMOVIL__PROPIETARIO:
				return basicSetPropietario(null, msgs);
			case DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS:
				return ((InternalEList<?>)getListaDeFallas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.AUTOMOVIL__ID:
				return getId();
			case DomainPackage.AUTOMOVIL__PLACA:
				return getPlaca();
			case DomainPackage.AUTOMOVIL__MARCA:
				return getMarca();
			case DomainPackage.AUTOMOVIL__MODELO:
				return getModelo();
			case DomainPackage.AUTOMOVIL__REFERENCIA:
				return getReferencia();
			case DomainPackage.AUTOMOVIL__TIPO_USO:
				return getTipoUso();
			case DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS:
				return getReparacionesHechas();
			case DomainPackage.AUTOMOVIL__SENSOR:
				return getSensor();
			case DomainPackage.AUTOMOVIL__PROPIETARIO:
				if (resolve) return getPropietario();
				return basicGetPropietario();
			case DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS:
				return getListaDeFallas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.AUTOMOVIL__ID:
				setId((String)newValue);
				return;
			case DomainPackage.AUTOMOVIL__PLACA:
				setPlaca((String)newValue);
				return;
			case DomainPackage.AUTOMOVIL__MARCA:
				setMarca((String)newValue);
				return;
			case DomainPackage.AUTOMOVIL__MODELO:
				setModelo((Integer)newValue);
				return;
			case DomainPackage.AUTOMOVIL__REFERENCIA:
				setReferencia((String)newValue);
				return;
			case DomainPackage.AUTOMOVIL__TIPO_USO:
				setTipoUso((String)newValue);
				return;
			case DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS:
				getReparacionesHechas().clear();
				getReparacionesHechas().addAll((Collection<? extends Reparacion>)newValue);
				return;
			case DomainPackage.AUTOMOVIL__SENSOR:
				setSensor((sensor)newValue);
				return;
			case DomainPackage.AUTOMOVIL__PROPIETARIO:
				setPropietario((Usuario)newValue);
				return;
			case DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS:
				getListaDeFallas().clear();
				getListaDeFallas().addAll((Collection<? extends FallaMecanica>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainPackage.AUTOMOVIL__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.AUTOMOVIL__PLACA:
				setPlaca(PLACA_EDEFAULT);
				return;
			case DomainPackage.AUTOMOVIL__MARCA:
				setMarca(MARCA_EDEFAULT);
				return;
			case DomainPackage.AUTOMOVIL__MODELO:
				setModelo(MODELO_EDEFAULT);
				return;
			case DomainPackage.AUTOMOVIL__REFERENCIA:
				setReferencia(REFERENCIA_EDEFAULT);
				return;
			case DomainPackage.AUTOMOVIL__TIPO_USO:
				setTipoUso(TIPO_USO_EDEFAULT);
				return;
			case DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS:
				getReparacionesHechas().clear();
				return;
			case DomainPackage.AUTOMOVIL__SENSOR:
				setSensor((sensor)null);
				return;
			case DomainPackage.AUTOMOVIL__PROPIETARIO:
				setPropietario((Usuario)null);
				return;
			case DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS:
				getListaDeFallas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainPackage.AUTOMOVIL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.AUTOMOVIL__PLACA:
				return PLACA_EDEFAULT == null ? placa != null : !PLACA_EDEFAULT.equals(placa);
			case DomainPackage.AUTOMOVIL__MARCA:
				return MARCA_EDEFAULT == null ? marca != null : !MARCA_EDEFAULT.equals(marca);
			case DomainPackage.AUTOMOVIL__MODELO:
				return MODELO_EDEFAULT == null ? modelo != null : !MODELO_EDEFAULT.equals(modelo);
			case DomainPackage.AUTOMOVIL__REFERENCIA:
				return REFERENCIA_EDEFAULT == null ? referencia != null : !REFERENCIA_EDEFAULT.equals(referencia);
			case DomainPackage.AUTOMOVIL__TIPO_USO:
				return TIPO_USO_EDEFAULT == null ? tipoUso != null : !TIPO_USO_EDEFAULT.equals(tipoUso);
			case DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS:
				return reparacionesHechas != null && !reparacionesHechas.isEmpty();
			case DomainPackage.AUTOMOVIL__SENSOR:
				return sensor != null;
			case DomainPackage.AUTOMOVIL__PROPIETARIO:
				return propietario != null;
			case DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS:
				return listaDeFallas != null && !listaDeFallas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", placa: ");
		result.append(placa);
		result.append(", marca: ");
		result.append(marca);
		result.append(", modelo: ");
		result.append(modelo);
		result.append(", referencia: ");
		result.append(referencia);
		result.append(", tipoUso: ");
		result.append(tipoUso);
		result.append(')');
		return result.toString();
	}

} //AutomovilImpl
