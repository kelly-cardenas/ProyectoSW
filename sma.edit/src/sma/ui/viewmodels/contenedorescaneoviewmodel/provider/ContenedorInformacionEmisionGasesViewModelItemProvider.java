/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.provider;


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

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;

import sma.ui.viewmodels.provider.ViewModelItemProvider;

/**
 * This is the item provider adapter for a {@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorInformacionEmisionGasesViewModelItemProvider extends ViewModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformacionEmisionGasesViewModelItemProvider(AdapterFactory adapterFactory) {
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

			addGasesofensivosPropertyDescriptor(object);
			addGasesnocivosPropertyDescriptor(object);
			addEstadovehiculoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gasesofensivos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGasesofensivosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorInformacionEmisionGasesViewModel_gasesofensivos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorInformacionEmisionGasesViewModel_gasesofensivos_feature", "_UI_ContenedorInformacionEmisionGasesViewModel_type"),
				 ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gasesnocivos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGasesnocivosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorInformacionEmisionGasesViewModel_gasesnocivos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorInformacionEmisionGasesViewModel_gasesnocivos_feature", "_UI_ContenedorInformacionEmisionGasesViewModel_type"),
				 ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estadovehiculo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstadovehiculoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContenedorInformacionEmisionGasesViewModel_estadovehiculo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContenedorInformacionEmisionGasesViewModel_estadovehiculo_feature", "_UI_ContenedorInformacionEmisionGasesViewModel_type"),
				 ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ContenedorInformacionEmisionGasesViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorInformacionEmisionGasesViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContenedorInformacionEmisionGasesViewModel)object).getGasesofensivos();
		return label == null || label.length() == 0 ?
			getString("_UI_ContenedorInformacionEmisionGasesViewModel_type") :
			getString("_UI_ContenedorInformacionEmisionGasesViewModel_type") + " " + label;
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

		switch (notification.getFeatureID(ContenedorInformacionEmisionGasesViewModel.class)) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS:
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS:
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO:
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
