/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sma.provider.ModelEditPlugin;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;

import sma.ui.viewmodels.provider.ViewModelItemProvider;

/**
 * This is the item provider adapter for a {@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorEscaneoViewModelItemProvider extends ViewModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorEscaneoViewModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL);
			childrenFeatures.add(ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL);
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
	 * This returns ContenedorEscaneoViewModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContenedorEscaneoViewModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ContenedorEscaneoViewModel_type");
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

		switch (notification.getFeatureID(ContenedorEscaneoViewModel.class)) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL:
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL:
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
				(ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL,
				 ContenedorescaneoviewmodelFactory.eINSTANCE.createContenedorSeleccionautoViewModel()));

		newChildDescriptors.add
			(createChildParameter
				(ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL,
				 ContenedorescaneoviewmodelFactory.eINSTANCE.createContenedorFallasViewModel()));
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
