/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.provider;


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

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;

/**
 * This is the item provider adapter for a {@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorDetalleVehiculoViewModelItemProvider 
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
	public ContenedorDetalleVehiculoViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addPropietarioPropertyDescriptor(object);
			addMarcaPropertyDescriptor(object);
			addReferenciaPropertyDescriptor(object);
			addModeloPropertyDescriptor(object);
			addTipovehiculoPropertyDescriptor(object);
			addPlacaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Propietario feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropietarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleVehiculoViewModel_propietario_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleVehiculoViewModel_propietario_feature", "_UI_ContenedorDetalleVehiculoViewModel_type"),
				 ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Marca feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarcaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleVehiculoViewModel_marca_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleVehiculoViewModel_marca_feature", "_UI_ContenedorDetalleVehiculoViewModel_type"),
				 ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referencia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenciaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleVehiculoViewModel_referencia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleVehiculoViewModel_referencia_feature", "_UI_ContenedorDetalleVehiculoViewModel_type"),
				 ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modelo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModeloPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleVehiculoViewModel_modelo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleVehiculoViewModel_modelo_feature", "_UI_ContenedorDetalleVehiculoViewModel_type"),
				 ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipovehiculo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipovehiculoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleVehiculoViewModel_tipovehiculo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleVehiculoViewModel_tipovehiculo_feature", "_UI_ContenedorDetalleVehiculoViewModel_type"),
				 ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placa feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlacaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDetalleVehiculoViewModel_placa_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDetalleVehiculoViewModel_placa_feature", "_UI_ContenedorDetalleVehiculoViewModel_type"),
				 ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ContenedorDetalleVehiculoViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorDetalleVehiculoViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorDetalleVehiculoViewModel)object).getPropietario();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorDetalleVehiculoViewModel_type") :
			getString("_UI_ContenedorDetalleVehiculoViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorDetalleVehiculoViewModel.class)) {
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO:
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA:
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA:
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO:
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO:
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA:
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
