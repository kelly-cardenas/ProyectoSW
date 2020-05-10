/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.provider;


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

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;

import sma.ui.viewmodels.provider.ViewModelItemProvider;

/**
 * This is the item provider adapter for a {@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorUbicacionactualViewModelItemProvider extends ViewModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorUbicacionactualViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addPaisPropertyDescriptor(object);
			addDepartamentoPropertyDescriptor(object);
			addCiudadPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pais feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorUbicacionactualViewModel_pais_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorUbicacionactualViewModel_pais_feature", "_UI_ContenedorUbicacionactualViewModel_type"),
				 ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Departamento feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepartamentoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorUbicacionactualViewModel_departamento_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorUbicacionactualViewModel_departamento_feature", "_UI_ContenedorUbicacionactualViewModel_type"),
				 ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ciudad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCiudadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorUbicacionactualViewModel_ciudad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorUbicacionactualViewModel_ciudad_feature", "_UI_ContenedorUbicacionactualViewModel_type"),
				 ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ContenedorUbicacionactualViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorUbicacionactualViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorUbicacionactualViewModel)object).getPais();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorUbicacionactualViewModel_type") :
			getString("_UI_ContenedorUbicacionactualViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorUbicacionactualViewModel.class)) {
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS:
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO:
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD:
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
