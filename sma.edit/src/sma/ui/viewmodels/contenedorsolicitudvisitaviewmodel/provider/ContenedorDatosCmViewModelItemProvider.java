/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sma.provider.ModelEditPlugin;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage;

import sma.ui.viewmodels.provider.ViewModelItemProvider;

/**
 * This is the item provider adapter for a {@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorDatosCmViewModelItemProvider extends ViewModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatosCmViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addNombrecmPropertyDescriptor(object);
			addNombrerepresentantePropertyDescriptor(object);
			addDireccionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombrecm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrecmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDatosCmViewModel_nombrecm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosCmViewModel_nombrecm_feature", "_UI_ContenedorDatosCmViewModel_type"),
				 ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombrerepresentante feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrerepresentantePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDatosCmViewModel_nombrerepresentante_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosCmViewModel_nombrerepresentante_feature", "_UI_ContenedorDatosCmViewModel_type"),
				 ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direccion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDireccionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorDatosCmViewModel_direccion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorDatosCmViewModel_direccion_feature", "_UI_ContenedorDatosCmViewModel_type"),
				 ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ContenedorDatosCmViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorDatosCmViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorDatosCmViewModel)object).getNombrecm();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorDatosCmViewModel_type") :
			getString("_UI_ContenedorDatosCmViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorDatosCmViewModel.class)) {
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM:
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION:
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
