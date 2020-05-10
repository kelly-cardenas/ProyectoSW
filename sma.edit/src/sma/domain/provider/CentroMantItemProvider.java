/**
 */
package sma.domain.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sma.domain.CentroMant;
import sma.domain.DomainFactory;
import sma.domain.DomainPackage;

import sma.domain.reparacionvehiculo.ReparacionvehiculoFactory;

import sma.provider.ModelEditPlugin;

/**
 * This is the item provider adapter for a {@link sma.domain.CentroMant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CentroMantItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroMantItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addNombrePropertyDescriptor(object);
			addNombreRepresentantePropertyDescriptor(object);
			addDescripcionPropertyDescriptor(object);
			addUsuarioPropertyDescriptor(object);
			addContraseniaPropertyDescriptor(object);
			addIncrementalReparacionPropertyDescriptor(object);
			addUsuariosAtendidosPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_id_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_nombre_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre Representante feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombreRepresentantePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_nombreRepresentante_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_nombreRepresentante_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__NOMBRE_REPRESENTANTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Descripcion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescripcionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_descripcion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_descripcion_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__DESCRIPCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usuario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsuarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_usuario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_usuario_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__USUARIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contrasenia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContraseniaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_contrasenia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_contrasenia_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__CONTRASENIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incremental Reparacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncrementalReparacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_incrementalReparacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_incrementalReparacion_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__INCREMENTAL_REPARACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usuarios Atendidos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsuariosAtendidosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CentroMant_usuariosAtendidos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CentroMant_usuariosAtendidos_feature", "_UI_CentroMant_type"),
				 DomainPackage.Literals.CENTRO_MANT__USUARIOS_ATENDIDOS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DomainPackage.Literals.CENTRO_MANT__HISTORIAL_REPARACION);
			childrenFeatures.add(DomainPackage.Literals.CENTRO_MANT__UBICACION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CentroMant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CentroMant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CentroMant)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_CentroMant_type") :
			getString("_UI_CentroMant_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CentroMant.class)) {
			case DomainPackage.CENTRO_MANT__ID:
			case DomainPackage.CENTRO_MANT__NOMBRE:
			case DomainPackage.CENTRO_MANT__NOMBRE_REPRESENTANTE:
			case DomainPackage.CENTRO_MANT__DESCRIPCION:
			case DomainPackage.CENTRO_MANT__USUARIO:
			case DomainPackage.CENTRO_MANT__CONTRASENIA:
			case DomainPackage.CENTRO_MANT__INCREMENTAL_REPARACION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION:
			case DomainPackage.CENTRO_MANT__UBICACION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CENTRO_MANT__HISTORIAL_REPARACION,
				 ReparacionvehiculoFactory.eINSTANCE.createReparacion()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CENTRO_MANT__UBICACION,
				 DomainFactory.eINSTANCE.createUbicacionCM()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
