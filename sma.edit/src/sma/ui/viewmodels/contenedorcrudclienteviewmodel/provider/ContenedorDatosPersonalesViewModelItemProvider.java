/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import sma.provider.ModelEditPlugin;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

/**
 * This is the item provider adapter for a {@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorDatosPersonalesViewModelItemProvider 
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
	public ContenedorDatosPersonalesViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addCedulaPropertyDescriptor(object);
			addNombrePropertyDescriptor(object);
			addApellidoPropertyDescriptor(object);
			addEdadPropertyDescriptor(object);
			addCorreoelectronicoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cedula feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCedulaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDatosPersonalesViewModel_cedula_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosPersonalesViewModel_cedula_feature", "_UI_ContenedorDatosPersonalesViewModel_type"),
				 ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA,
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
				 getString("_UI_ContenedorDatosPersonalesViewModel_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosPersonalesViewModel_nombre_feature", "_UI_ContenedorDatosPersonalesViewModel_type"),
				 ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Apellido feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApellidoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDatosPersonalesViewModel_apellido_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosPersonalesViewModel_apellido_feature", "_UI_ContenedorDatosPersonalesViewModel_type"),
				 ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDatosPersonalesViewModel_edad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosPersonalesViewModel_edad_feature", "_UI_ContenedorDatosPersonalesViewModel_type"),
				 ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Correoelectronico feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorreoelectronicoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDatosPersonalesViewModel_correoelectronico_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosPersonalesViewModel_correoelectronico_feature", "_UI_ContenedorDatosPersonalesViewModel_type"),
				 ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ContenedorDatosPersonalesViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorDatosPersonalesViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorDatosPersonalesViewModel)object).getCedula();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorDatosPersonalesViewModel_type") :
			getString("_UI_ContenedorDatosPersonalesViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorDatosPersonalesViewModel.class)) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA:
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE:
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO:
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD:
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
