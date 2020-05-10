package sma.view.view.views;
import sma.ui.UiPackage.Literals;
import org.eclipse.swt.custom.ScrolledComposite;
import sma.ModelFactory;
import sma.domain.*;
import sma.domain.reparacionvehiculo.*;
import sma.domain.automatizacionrevision.*;
import sma.ui.*;
import sma.ui.viewmodels.*;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.*;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.*;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.*;
import sma.ui.viewmodels.contenedorloginviewmodel.*;

import sma.view.model.ModelFactoryModel;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.DateTime;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

/**
 * 
 * @author Grupo SINFOCI 
 *
 */
public class LoginViewPart  extends ViewPart {


        public static final String ID = "sma.view.views.Login";

		ModelFactoryModel mfm;
		UI ui;
		ModelFactory modelFactory;
		private DataBindingContext m_bindingContext;
		ContenedorLoginViewModel   contenedorloginViewModel;
		public Group groupDetalleLogin; 
		ContenedorDetalleLoginViewModel   contenedordetalleLoginViewModel;
		public Label lblUsuarioDetalleLogin; 
		public Text textUsuarioDetalleLogin; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public LoginViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setLoginViewPart(this);
		    cargarContenedores(); 
		    syncModel();
            constructorContenedorLoginViewPart();
          }
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm 								= ModelFactoryModel.getInstance(); 
            contenedorloginViewModel = mfm.getTheContenedorLoginViewModel();
            contenedordetalleLoginViewModel = mfm.getTheContenedorDetalleLoginViewModel();
      
}
      public void updateData(){
           mfm.cargar();
           cargarContenedores();
           try {
                initDataBindings();
         } catch (Exception e) {   
         }  
     }
	public void createPartControl(Composite parent) {
                ScrolledComposite sc = new ScrolledComposite(parent, SWT.H_SCROLL |	SWT.V_SCROLL | SWT.BORDER);		Composite container = formToolkit.createComposite(sc, SWT.NONE);

		sc.setContent(container);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setMinSize(container.computeSize(409, 373));
		formToolkit.paintBordersFor(container);

		groupDetalleLogin = new Group(container, SWT.NONE);
		groupDetalleLogin.setBounds(54,19,289,301);
		groupDetalleLogin.setText("Detalle Login");
		groupDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDetalleLogin);
		formToolkit.paintBordersFor(groupDetalleLogin);

        lblUsuarioDetalleLogin = formToolkit.createLabel(groupDetalleLogin,"usuario",SWT.NONE);
        lblUsuarioDetalleLogin.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblUsuarioDetalleLogin.setBounds(45,40,56,21);

        lblUsuarioDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textUsuarioDetalleLogin = formToolkit.createText(groupDetalleLogin, "New Text", SWT.NONE);
		textUsuarioDetalleLogin.setText("");
		textUsuarioDetalleLogin.setBounds(131,42,56,21);

		textUsuarioDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        try {
	       initDataBindings();
            }catch (Exception e) {
        }

   }      public void setFocus() {
         // Set the focus
    }
      protected DataBindingContext initDataBindings() {
//
        DataBindingContext bindingContext = new DataBindingContext();
        IObservableValue observeTextUsuarioDetalleLoginObserveWidget = WidgetProperties.text(SWT.Modify).observe(textUsuarioDetalleLogin);
        IObservableValue contenedordetalleLoginUsuarioDetalleLoginObserveValue = EMFObservables.observeValue(contenedordetalleLoginViewModel,ContenedorloginviewmodelPackage.Literals.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO);
        bindingContext.bindValue(observeTextUsuarioDetalleLoginObserveWidget,contenedordetalleLoginUsuarioDetalleLoginObserveValue, null, null);
        //

         return bindingContext;
//
      }
      public void constructorContenedorLoginViewPart (){
        //semantics

      }

      public void syncModel (){
        //semantics

      }

}
