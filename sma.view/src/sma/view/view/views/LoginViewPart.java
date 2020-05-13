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
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.*;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.*;
import sma.ui.viewmodels.contenedorescaneoviewmodel.*;

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
		public Label lblContraseniaDetalleLogin; 
		public Text textContraseniaDetalleLogin; 
		public Button btnLoginDetalleLogin;
 		public Button btnLogoutDetalleLogin;
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
            contenedordetalleLoginViewModel = mfm.getTheLogingetTheContenedorDetalleLoginViewModel();
      
         }
      public void updateData(){
           if(!mfm.getEstado().equals("ACTUALIZADO")) {
               mfm.cargar();
           };
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
		sc.setMinSize(container.computeSize(517, 253));
		formToolkit.paintBordersFor(container);

		groupDetalleLogin = new Group(container, SWT.NONE);
		groupDetalleLogin.setBounds(54,43,397,193);
		groupDetalleLogin.setText("Detalle Login");
		groupDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDetalleLogin);
		formToolkit.paintBordersFor(groupDetalleLogin);

        lblUsuarioDetalleLogin = formToolkit.createLabel(groupDetalleLogin,"Usuario",SWT.NONE);
        lblUsuarioDetalleLogin.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblUsuarioDetalleLogin.setBounds(43,41,56,21);

        lblUsuarioDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textUsuarioDetalleLogin = formToolkit.createText(groupDetalleLogin, "New Text", SWT.NONE);
		textUsuarioDetalleLogin.setText("");
		textUsuarioDetalleLogin.setBounds(151,42,193,21);

		textUsuarioDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblContraseniaDetalleLogin = formToolkit.createLabel(groupDetalleLogin,"Contrasenia",SWT.NONE);
        lblContraseniaDetalleLogin.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblContraseniaDetalleLogin.setBounds(43,77,88,21);

        lblContraseniaDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textContraseniaDetalleLogin = formToolkit.createText(groupDetalleLogin, "New Text", SWT.NONE);
		textContraseniaDetalleLogin.setText("");
		textContraseniaDetalleLogin.setBounds(151,78,193,21);

		textContraseniaDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnLoginDetalleLogin = formToolkit.createButton(groupDetalleLogin,"Login",SWT.NONE);
		btnLoginDetalleLogin.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonLoginde la view Login
				        
	      loginAction ( "event" );

		 }
		});
		btnLoginDetalleLogin.setBounds(79,126,40,21);

		btnLoginDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnLogoutDetalleLogin = formToolkit.createButton(groupDetalleLogin,"Logout",SWT.NONE);
		btnLogoutDetalleLogin.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonLogoutde la view Login
				        
	      logoutAction ( "event" );

		 }
		});
		btnLogoutDetalleLogin.setBounds(235,126,56,21);

		btnLogoutDetalleLogin.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        try {
	       initDataBindings();
          }catch (Exception e) {
        }

      }
     public void setFocus() {
           // Set the focus
     }
      protected DataBindingContext initDataBindings() {
//
        DataBindingContext bindingContext = new DataBindingContext();
        IObservableValue observeTextUsuarioDetalleLoginObserveWidget = WidgetProperties.text(SWT.Modify).observe(textUsuarioDetalleLogin);
        IObservableValue contenedordetalleLoginUsuarioDetalleLoginObserveValue = EMFObservables.observeValue(contenedordetalleLoginViewModel,ContenedorloginviewmodelPackage.Literals.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO);
        bindingContext.bindValue(observeTextUsuarioDetalleLoginObserveWidget,contenedordetalleLoginUsuarioDetalleLoginObserveValue, null, null);
        //
        IObservableValue observeTextContraseniaDetalleLoginObserveWidget = WidgetProperties.text(SWT.Modify).observe(textContraseniaDetalleLogin);
        IObservableValue contenedordetalleLoginContraseniaDetalleLoginObserveValue = EMFObservables.observeValue(contenedordetalleLoginViewModel,ContenedorloginviewmodelPackage.Literals.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__CONTRASENIA);
        bindingContext.bindValue(observeTextContraseniaDetalleLoginObserveWidget,contenedordetalleLoginContraseniaDetalleLoginObserveValue, null, null);
        //

         return bindingContext;
//
      }
      public void loginAction ( String  event ){
           //semantics

      }

      public void logoutAction ( String  event ){
           //semantics

      }

      public void constructorContenedorLoginViewPart (){
                          //semantics

      }

      public void syncModel (){
                          //semantics

      }

}
