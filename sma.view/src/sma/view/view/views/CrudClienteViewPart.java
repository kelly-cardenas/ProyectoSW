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
public class CrudClienteViewPart  extends ViewPart {


        public static final String ID = "sma.view.views.CrudCliente";

		ModelFactoryModel mfm;
		UI ui;
		ModelFactory modelFactory;
		private DataBindingContext m_bindingContext;
		ContenedorCrudClienteViewModel   contenedorcrudClienteViewModel;
		public Group groupDetalleCliente; 
		ContenedorDetalleClienteViewModel   contenedordetalleClienteViewModel;
		public Button btnCANCELARDetalleCliente;
 		public Button btnREGISTRARDetalleCliente;
 		public Group groupDatosPersonales; 
		ContenedorDatosPersonalesViewModel   contenedordatosPersonalesViewModel;
		public Label lblNombreDatosPersonales; 
		public Label lblDocumentoDeIdentificacionDatosPersonales; 
		public Label lblApellidosDatosPersonales; 
		public Label lblEdadDatosPersonales; 
		public Label lblEMailDatosPersonales; 
		public Text textCedulaDatosPersonales; 
		public Text textNombreDatosPersonales; 
		public Text textApellidoDatosPersonales; 
		public Text textEdadDatosPersonales; 
		public Text textCorreoElectronicoDatosPersonales; 
		public Group groupDatosdelacuenta; 
		ContenedorDatosdelacuentaViewModel   contenedordatosdelacuentaViewModel;
		public Label lblUsuarioDatosdelacuenta; 
		public Label lblContrasenaDatosdelacuenta; 
		public Text textUsuarioDatosdelacuenta; 
		public Text textContrasenaDatosdelacuenta; 
		public Group groupMaestroCliente; 
		ContenedorMaestroClienteViewModel   contenedormaestroClienteViewModel;
		public Table tableCliente;
 		public TableViewer tableViewerCliente;
 		ClienteViewModel   clienteViewModelSeleccionado; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public CrudClienteViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setCrudClienteViewPart(this);
		    cargarContenedores(); 
		    syncModel();
            constructorContenedorCrudClienteViewPart();
          }
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm 								= ModelFactoryModel.getInstance(); 
            contenedorcrudClienteViewModel = mfm.getTheContenedorCrudClienteViewModel();
            contenedordetalleClienteViewModel = mfm.getTheCrudClientegetTheContenedorDetalleClienteViewModel();
            contenedordatosPersonalesViewModel = mfm.getTheCrudClientegetTheContenedorDatosPersonalesViewModel();
            contenedordatosdelacuentaViewModel = mfm.getTheCrudClientegetTheContenedorDatosdelacuentaViewModel();
            contenedormaestroClienteViewModel = mfm.getTheCrudClientegetTheContenedorMaestroClienteViewModel();
      
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
		sc.setMinSize(container.computeSize(685, 637));
		formToolkit.paintBordersFor(container);

		groupDetalleCliente = new Group(container, SWT.NONE);
		groupDetalleCliente.setBounds(54,31,565,373);
		groupDetalleCliente.setText("Detalle Cliente");
		groupDetalleCliente.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDetalleCliente);
		formToolkit.paintBordersFor(groupDetalleCliente);

		btnCANCELARDetalleCliente = formToolkit.createButton(groupDetalleCliente,"CANCELAR",SWT.NONE);
		btnCANCELARDetalleCliente.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonCANCELARde la view CrudCliente
				        
	      cancelarAction ( "event" );

		 }
		});
		btnCANCELARDetalleCliente.setBounds(134,314,90,21);

		btnCANCELARDetalleCliente.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnREGISTRARDetalleCliente = formToolkit.createButton(groupDetalleCliente,"REGISTRAR",SWT.NONE);
		btnREGISTRARDetalleCliente.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonREGISTRARde la view CrudCliente
				        
	      registrarAction ( "event" );

		 }
		});
		btnREGISTRARDetalleCliente.setBounds(331,314,89,21);

		btnREGISTRARDetalleCliente.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupDatosPersonales = new Group(groupDetalleCliente, SWT.NONE);
		groupDatosPersonales.setBounds(43,18,469,169);
		groupDatosPersonales.setText("Datos Personales");
		groupDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDatosPersonales);
		formToolkit.paintBordersFor(groupDatosPersonales);

        lblNombreDatosPersonales = formToolkit.createLabel(groupDatosPersonales,"Nombre",SWT.NONE);
        lblNombreDatosPersonales.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblNombreDatosPersonales.setBounds(43,41,48,21);

        lblNombreDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblDocumentoDeIdentificacionDatosPersonales = formToolkit.createLabel(groupDatosPersonales,"Documento De Identificacion:",SWT.NONE);
        lblDocumentoDeIdentificacionDatosPersonales.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblDocumentoDeIdentificacionDatosPersonales.setBounds(43,19,224,21);

        lblDocumentoDeIdentificacionDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblApellidosDatosPersonales = formToolkit.createLabel(groupDatosPersonales,"Apellidos",SWT.NONE);
        lblApellidosDatosPersonales.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblApellidosDatosPersonales.setBounds(43,65,72,21);

        lblApellidosDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblEdadDatosPersonales = formToolkit.createLabel(groupDatosPersonales,"Edad:",SWT.NONE);
        lblEdadDatosPersonales.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblEdadDatosPersonales.setBounds(43,88,40,21);

        lblEdadDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblEMailDatosPersonales = formToolkit.createLabel(groupDatosPersonales,"E-Mail:",SWT.NONE);
        lblEMailDatosPersonales.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblEMailDatosPersonales.setBounds(43,111,56,21);

        lblEMailDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textCedulaDatosPersonales = formToolkit.createText(groupDatosPersonales, "New Text", SWT.NONE);
		textCedulaDatosPersonales.setText("");
		textCedulaDatosPersonales.setBounds(235,19,193,21);

		textCedulaDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNombreDatosPersonales = formToolkit.createText(groupDatosPersonales, "New Text", SWT.NONE);
		textNombreDatosPersonales.setText("");
		textNombreDatosPersonales.setBounds(237,42,187,21);

		textNombreDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textApellidoDatosPersonales = formToolkit.createText(groupDatosPersonales, "New Text", SWT.NONE);
		textApellidoDatosPersonales.setText("");
		textApellidoDatosPersonales.setBounds(237,66,187,21);

		textApellidoDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textEdadDatosPersonales = formToolkit.createText(groupDatosPersonales, "New Text", SWT.NONE);
		textEdadDatosPersonales.setText("");
		textEdadDatosPersonales.setBounds(237,89,187,21);

		textEdadDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textCorreoElectronicoDatosPersonales = formToolkit.createText(groupDatosPersonales, "New Text", SWT.NONE);
		textCorreoElectronicoDatosPersonales.setText("");
		textCorreoElectronicoDatosPersonales.setBounds(237,112,187,21);

		textCorreoElectronicoDatosPersonales.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupDatosdelacuenta = new Group(groupDetalleCliente, SWT.NONE);
		groupDatosdelacuenta.setBounds(43,198,469,97);
		groupDatosdelacuenta.setText("Datos de la cuenta");
		groupDatosdelacuenta.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDatosdelacuenta);
		formToolkit.paintBordersFor(groupDatosdelacuenta);

        lblUsuarioDatosdelacuenta = formToolkit.createLabel(groupDatosdelacuenta,"Usuario",SWT.NONE);
        lblUsuarioDatosdelacuenta.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblUsuarioDatosdelacuenta.setBounds(67,17,56,21);

        lblUsuarioDatosdelacuenta.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblContrasenaDatosdelacuenta = formToolkit.createLabel(groupDatosdelacuenta,"Contraseña",SWT.NONE);
        lblContrasenaDatosdelacuenta.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblContrasenaDatosdelacuenta.setBounds(67,48,80,21);

        lblContrasenaDatosdelacuenta.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textUsuarioDatosdelacuenta = formToolkit.createText(groupDatosdelacuenta, "New Text", SWT.NONE);
		textUsuarioDatosdelacuenta.setText("");
		textUsuarioDatosdelacuenta.setBounds(211,18,181,21);

		textUsuarioDatosdelacuenta.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textContrasenaDatosdelacuenta = formToolkit.createText(groupDatosdelacuenta, "New Text", SWT.NONE);
		textContrasenaDatosdelacuenta.setText("");
		textContrasenaDatosdelacuenta.setBounds(212,49,180,21);

		textContrasenaDatosdelacuenta.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupMaestroCliente = new Group(container, SWT.NONE);
		groupMaestroCliente.setBounds(30,415,613,193);
		groupMaestroCliente.setText("Maestro Cliente");
		groupMaestroCliente.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupMaestroCliente);
		formToolkit.paintBordersFor(groupMaestroCliente);

		tableViewerCliente = new TableViewer(groupMaestroCliente, SWT.BORDER | SWT.FULL_SELECTION);
		tableCliente = tableViewerCliente.getTable();
		tableCliente.setLinesVisible(true);
		tableCliente.setHeaderVisible(true);
		tableCliente.setBounds(19,18,562,145);
		tableCliente.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(tableCliente);

		tableCliente.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		    //TODO ActionTable ViewtableClientede la viewCrudCliente
		         clienteViewModelSeleccionado  = (ClienteViewModel)e.item.getData();
		  } 
          });
		TableViewerColumn  tableViewerColumn0Identificacion = new TableViewerColumn(tableViewerCliente, SWT.NONE);
		TableColumn tblclmn0Identificacion = tableViewerColumn0Identificacion.getColumn();
		tblclmn0Identificacion.setWidth(100);
		tblclmn0Identificacion .setText("identificacion");

		TableViewerColumn  tableViewerColumn1Nombre = new TableViewerColumn(tableViewerCliente, SWT.NONE);
		TableColumn tblclmn1Nombre = tableViewerColumn1Nombre.getColumn();
		tblclmn1Nombre.setWidth(100);
		tblclmn1Nombre .setText("Nombre                                                  ");

		TableViewerColumn  tableViewerColumn2Email = new TableViewerColumn(tableViewerCliente, SWT.NONE);
		TableColumn tblclmn2Email = tableViewerColumn2Email.getColumn();
		tblclmn2Email.setWidth(100);
		tblclmn2Email .setText("Email                                                     ");

		TableViewerColumn  tableViewerColumn3Edad = new TableViewerColumn(tableViewerCliente, SWT.NONE);
		TableColumn tblclmn3Edad = tableViewerColumn3Edad.getColumn();
		tblclmn3Edad.setWidth(100);
		tblclmn3Edad .setText("Edad");

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
        IObservableValue observeTextCedulaDatosPersonalesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textCedulaDatosPersonales);
        IObservableValue contenedordatosPersonalesCedulaDatosPersonalesObserveValue = EMFObservables.observeValue(contenedordatosPersonalesViewModel,ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA);
        bindingContext.bindValue(observeTextCedulaDatosPersonalesObserveWidget,contenedordatosPersonalesCedulaDatosPersonalesObserveValue, null, null);
        //
        IObservableValue observeTextNombreDatosPersonalesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNombreDatosPersonales);
        IObservableValue contenedordatosPersonalesNombreDatosPersonalesObserveValue = EMFObservables.observeValue(contenedordatosPersonalesViewModel,ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE);
        bindingContext.bindValue(observeTextNombreDatosPersonalesObserveWidget,contenedordatosPersonalesNombreDatosPersonalesObserveValue, null, null);
        //
        IObservableValue observeTextApellidoDatosPersonalesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textApellidoDatosPersonales);
        IObservableValue contenedordatosPersonalesApellidoDatosPersonalesObserveValue = EMFObservables.observeValue(contenedordatosPersonalesViewModel,ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO);
        bindingContext.bindValue(observeTextApellidoDatosPersonalesObserveWidget,contenedordatosPersonalesApellidoDatosPersonalesObserveValue, null, null);
        //
        IObservableValue observeTextEdadDatosPersonalesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textEdadDatosPersonales);
        IObservableValue contenedordatosPersonalesEdadDatosPersonalesObserveValue = EMFObservables.observeValue(contenedordatosPersonalesViewModel,ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD);
        bindingContext.bindValue(observeTextEdadDatosPersonalesObserveWidget,contenedordatosPersonalesEdadDatosPersonalesObserveValue, null, null);
        //
        IObservableValue observeTextCorreoElectronicoDatosPersonalesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textCorreoElectronicoDatosPersonales);
        IObservableValue contenedordatosPersonalesCorreoElectronicoDatosPersonalesObserveValue = EMFObservables.observeValue(contenedordatosPersonalesViewModel,ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO);
        bindingContext.bindValue(observeTextCorreoElectronicoDatosPersonalesObserveWidget,contenedordatosPersonalesCorreoElectronicoDatosPersonalesObserveValue, null, null);
        //
        IObservableValue observeTextUsuarioDatosdelacuentaObserveWidget = WidgetProperties.text(SWT.Modify).observe(textUsuarioDatosdelacuenta);
        IObservableValue contenedordatosdelacuentaUsuarioDatosdelacuentaObserveValue = EMFObservables.observeValue(contenedordatosdelacuentaViewModel,ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO);
        bindingContext.bindValue(observeTextUsuarioDatosdelacuentaObserveWidget,contenedordatosdelacuentaUsuarioDatosdelacuentaObserveValue, null, null);
        //
        IObservableValue observeTextContrasenaDatosdelacuentaObserveWidget = WidgetProperties.text(SWT.Modify).observe(textContrasenaDatosdelacuenta);
        IObservableValue contenedordatosdelacuentaContrasenaDatosdelacuentaObserveValue = EMFObservables.observeValue(contenedordatosdelacuentaViewModel,ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASENIA);
        bindingContext.bindValue(observeTextContrasenaDatosdelacuentaObserveWidget,contenedordatosdelacuentaContrasenaDatosdelacuentaObserveValue, null, null);
        //
        ObservableListContentProvider listContentProvider0 = new ObservableListContentProvider();
        IObservableMap[] observeMaps0= EMFObservables.observeMaps(listContentProvider0.getKnownElements(),
        new EStructuralFeature[]{ContenedorcrudclienteviewmodelPackage.Literals.CLIENTE_VIEW_MODEL__IDENTIFICACION,ContenedorcrudclienteviewmodelPackage.Literals.CLIENTE_VIEW_MODEL__NOMBRE,ContenedorcrudclienteviewmodelPackage.Literals.CLIENTE_VIEW_MODEL__EMAIL,ContenedorcrudclienteviewmodelPackage.Literals.CLIENTE_VIEW_MODEL__EDAD});
        tableViewerCliente.setLabelProvider(new ObservableMapLabelProvider(observeMaps0));
        tableViewerCliente.setContentProvider(listContentProvider0);

        //
        IObservableList observeList0= EMFObservables.observeList(Realm.getDefault(),contenedormaestroClienteViewModel,
        ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE);
        tableViewerCliente.setInput(observeList0);
            //

         return bindingContext;
//
      }
      public void cancelarAction ( String  event ){
//semantics
      }

      public void registrarAction ( String  event ){
String arreglo [][] = {{"1085445", "13565555", "1578665"},
	 				  {"Andres", "Alberto", "pepito"},
	 				  { "suarez" ,"soto", "perez" },
	 				  { "19" , "28", "35" },
	 				  { "mail", "mail", "mail" },
	 				  { "andres", "alberto", "pepito" },
	 				  { "password", "password", "password" }};

    		 for (int i = 0; i < 3; i++) {
    			 
    			 contenedordatosPersonalesViewModel.setCedula(arreglo[0][i]);
    	    	  contenedordatosPersonalesViewModel.setNombre(arreglo[1][i]);
    	    	  contenedordatosPersonalesViewModel.setApellido(arreglo[2][i]);
    	    	  contenedordatosPersonalesViewModel.setEdad(arreglo[3][i]);
    	    	  contenedordatosPersonalesViewModel.setCorreoelectronico(arreglo[4][i]);
    	    	  
    	    	  contenedordatosdelacuentaViewModel.setUsuario(arreglo[5][i]);
    	    	  contenedordatosdelacuentaViewModel.setContrasenia(arreglo[6][i]);
    	    	  contenedorcrudClienteViewModel.registrarCliente();
			}

    	  
//    	  contenedordatosPersonalesViewModel.setCedula(textCedulaDatosPersonales.getText());
//    	  contenedordatosPersonalesViewModel.setNombre(textNombreDatosPersonales.getText());
//    	  contenedordatosPersonalesViewModel.setApellido(textApellidoDatosPersonales.getText());
//    	  contenedordatosPersonalesViewModel.setEdad(textEdadDatosPersonales.getText());
//    	  contenedordatosPersonalesViewModel.setCorreoelectronico(textCorreoElectronicoDatosPersonales.getText());
//    	  
//    	  contenedordatosdelacuentaViewModel.setUsuario(textUsuarioDatosdelacuenta.getText());
//    	  contenedordatosdelacuentaViewModel.setContrasenia(textContraseñaDatosdelacuenta.getText());
    	  
    	 // contenedorcrudClienteViewModel.registrarCliente();
    	  mfm.salvar();
    	  contenedorcrudClienteViewModel.actualizarCrudCliente();
    	  mfm.salvar();
    	  System.out.println("se hace registro");
    	  limpiarCampos();
      }

      public void constructorContenedorCrudClienteViewPart (){
             //semantics
      }

      public void syncModel (){
             //semantics
      }

      public void limpiarCampos (){
             textCedulaDatosPersonales.setText("");
    	  textNombreDatosPersonales.setText("");
    	  textApellidoDatosPersonales.setText("");
    	  textEdadDatosPersonales.setText("");
    	  textCorreoElectronicoDatosPersonales.setText("");
    	  textUsuarioDatosdelacuenta.setText("");
    	  textContrasenaDatosdelacuenta.setText("");
      }

}
