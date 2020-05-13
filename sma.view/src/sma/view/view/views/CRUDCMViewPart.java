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
public class CRUDCMViewPart  extends ViewPart {


        public static final String ID = "sma.view.views.CRUDCM";

		ModelFactoryModel mfm;
		UI ui;
		ModelFactory modelFactory;
		private DataBindingContext m_bindingContext;
		ContenedorCRUDCMViewModel   contenedorcRUDCMViewModel;
		public Group groupDetalleCM; 
		ContenedorDetalleCMViewModel   contenedordetalleCMViewModel;
		public Button btnREGISTRARDetalleCM;
 		public Button btnCANCELARDetalleCM;
 		public Group groupInformacionCM; 
		ContenedorInformacionCMViewModel   contenedorinformacionCMViewModel;
		public Label lblNombreDelCMInformacionCM; 
		public Label lblNombredelrepresentanteInformacionCM; 
		public Label lblDescripcionInformacionCM; 
		public Text textNombreCMInformacionCM; 
		public Text textNombreRepresentanteInformacionCM; 
		public Text textDescripcionInformacionCM; 
		public Group groupUbicacion; 
		ContenedorUbicacionViewModel   contenedorubicacionViewModel;
		public Label lblPaisUbicacion; 
		public Label lblDepartamentoUbicacion; 
		public Label lblCiudadUbicacion; 
		public Label lblDireccionUbicacion; 
		public Text textPaisUbicacion; 
		public Text textDepartamentoUbicacion; 
		public Text textCiudadUbicacion; 
		public Text textDireccionUbicacion; 
		public Group groupMaestroCM; 
		ContenedorMaestroCMViewModel   contenedormaestroCMViewModel;
		public Table tableCentroMant;
 		public TableViewer tableViewerCentroMant;
 		CentroMantViewModel   centroMantViewModelSeleccionado; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public CRUDCMViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setCRUDCMViewPart(this);
		    cargarContenedores(); 
		    syncModel();
            constructorContenedorCRUDCMViewPart();
          }
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm 								= ModelFactoryModel.getInstance(); 
            contenedorcRUDCMViewModel = mfm.getTheContenedorCRUDCMViewModel();
            contenedordetalleCMViewModel = mfm.getTheCRUDCMgetTheContenedorDetalleCMViewModel();
            contenedorinformacionCMViewModel = mfm.getTheCRUDCMgetTheContenedorInformacionCMViewModel();
            contenedorubicacionViewModel = mfm.getTheCRUDCMgetTheContenedorUbicacionViewModel();
            contenedormaestroCMViewModel = mfm.getTheCRUDCMgetTheContenedorMaestroCMViewModel();
      
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
		sc.setMinSize(container.computeSize(757, 721));
		formToolkit.paintBordersFor(container);

		groupDetalleCM = new Group(container, SWT.NONE);
		groupDetalleCM.setBounds(78,19,577,445);
		groupDetalleCM.setText("Detalle CM");
		groupDetalleCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDetalleCM);
		formToolkit.paintBordersFor(groupDetalleCM);

		btnREGISTRARDetalleCM = formToolkit.createButton(groupDetalleCM,"REGISTRAR",SWT.NONE);
		btnREGISTRARDetalleCM.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonREGISTRARde la view CRUDCM
				        
	      registrarAction ( "event" );

		 }
		});
		btnREGISTRARDetalleCM.setBounds(319,390,72,21);

		btnREGISTRARDetalleCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnCANCELARDetalleCM = formToolkit.createButton(groupDetalleCM,"CANCELAR",SWT.NONE);
		btnCANCELARDetalleCM.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonCANCELARde la view CRUDCM
				        
	      cancelarAction ( "event" );

		 }
		});
		btnCANCELARDetalleCM.setBounds(163,390,64,21);

		btnCANCELARDetalleCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupInformacionCM = new Group(groupDetalleCM, SWT.NONE);
		groupInformacionCM.setBounds(55,30,457,193);
		groupInformacionCM.setText("Informacion CM");
		groupInformacionCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupInformacionCM);
		formToolkit.paintBordersFor(groupInformacionCM);

        lblNombreDelCMInformacionCM = formToolkit.createLabel(groupInformacionCM,"Nombre Del CM",SWT.NONE);
        lblNombreDelCMInformacionCM.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblNombreDelCMInformacionCM.setBounds(37,18,104,21);

        lblNombreDelCMInformacionCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblNombredelrepresentanteInformacionCM = formToolkit.createLabel(groupInformacionCM,"Nombre del representante",SWT.NONE);
        lblNombredelrepresentanteInformacionCM.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblNombredelrepresentanteInformacionCM.setBounds(37,54,192,21);

        lblNombredelrepresentanteInformacionCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblDescripcionInformacionCM = formToolkit.createLabel(groupInformacionCM,"Descripcion",SWT.NONE);
        lblDescripcionInformacionCM.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblDescripcionInformacionCM.setBounds(37,90,88,21);

        lblDescripcionInformacionCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNombreCMInformacionCM = formToolkit.createText(groupInformacionCM, "New Text", SWT.NONE);
		textNombreCMInformacionCM.setText("");
		textNombreCMInformacionCM.setBounds(211,17,193,25);

		textNombreCMInformacionCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNombreRepresentanteInformacionCM = formToolkit.createText(groupInformacionCM, "New Text", SWT.NONE);
		textNombreRepresentanteInformacionCM.setText("");
		textNombreRepresentanteInformacionCM.setBounds(211,53,193,25);

		textNombreRepresentanteInformacionCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textDescripcionInformacionCM = formToolkit.createText(groupInformacionCM, "New Text", SWT.NONE);
		textDescripcionInformacionCM.setText("");
		textDescripcionInformacionCM.setBounds(211,90,193,61);

		textDescripcionInformacionCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupUbicacion = new Group(groupDetalleCM, SWT.NONE);
		groupUbicacion.setBounds(55,234,457,145);
		groupUbicacion.setText("Ubicacion");
		groupUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupUbicacion);
		formToolkit.paintBordersFor(groupUbicacion);

        lblPaisUbicacion = formToolkit.createLabel(groupUbicacion,"Pais",SWT.NONE);
        lblPaisUbicacion.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblPaisUbicacion.setBounds(37,18,32,21);

        lblPaisUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblDepartamentoUbicacion = formToolkit.createLabel(groupUbicacion,"Departamento",SWT.NONE);
        lblDepartamentoUbicacion.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblDepartamentoUbicacion.setBounds(37,41,96,21);

        lblDepartamentoUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblCiudadUbicacion = formToolkit.createLabel(groupUbicacion,"Ciudad",SWT.NONE);
        lblCiudadUbicacion.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblCiudadUbicacion.setBounds(37,64,48,21);

        lblCiudadUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblDireccionUbicacion = formToolkit.createLabel(groupUbicacion,"Direccion",SWT.NONE);
        lblDireccionUbicacion.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblDireccionUbicacion.setBounds(37,87,72,21);

        lblDireccionUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textPaisUbicacion = formToolkit.createText(groupUbicacion, "New Text", SWT.NONE);
		textPaisUbicacion.setText("");
		textPaisUbicacion.setBounds(211,19,181,21);

		textPaisUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textDepartamentoUbicacion = formToolkit.createText(groupUbicacion, "New Text", SWT.NONE);
		textDepartamentoUbicacion.setText("");
		textDepartamentoUbicacion.setBounds(211,42,181,21);

		textDepartamentoUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textCiudadUbicacion = formToolkit.createText(groupUbicacion, "New Text", SWT.NONE);
		textCiudadUbicacion.setText("");
		textCiudadUbicacion.setBounds(211,65,181,21);

		textCiudadUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textDireccionUbicacion = formToolkit.createText(groupUbicacion, "New Text", SWT.NONE);
		textDireccionUbicacion.setText("");
		textDireccionUbicacion.setBounds(211,88,181,21);

		textDireccionUbicacion.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupMaestroCM = new Group(container, SWT.NONE);
		groupMaestroCM.setBounds(6,475,733,217);
		groupMaestroCM.setText("Maestro CM");
		groupMaestroCM.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupMaestroCM);
		formToolkit.paintBordersFor(groupMaestroCM);

		tableViewerCentroMant = new TableViewer(groupMaestroCM, SWT.BORDER | SWT.FULL_SELECTION);
		tableCentroMant = tableViewerCentroMant.getTable();
		tableCentroMant.setLinesVisible(true);
		tableCentroMant.setHeaderVisible(true);
		tableCentroMant.setBounds(7,18,709,169);
		tableCentroMant.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(tableCentroMant);

		tableCentroMant.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		    //TODO ActionTable ViewtableCentroMantde la viewCRUDCM
		         centroMantViewModelSeleccionado  = (CentroMantViewModel)e.item.getData();
		  } 
          });
		TableViewerColumn  tableViewerColumn4NombreCM = new TableViewerColumn(tableViewerCentroMant, SWT.NONE);
		TableColumn tblclmn4NombreCM = tableViewerColumn4NombreCM.getColumn();
		tblclmn4NombreCM.setWidth(100);
		tblclmn4NombreCM .setText("nombreCM                                     ");

		TableViewerColumn  tableViewerColumn5NombreRepresentante = new TableViewerColumn(tableViewerCentroMant, SWT.NONE);
		TableColumn tblclmn5NombreRepresentante = tableViewerColumn5NombreRepresentante.getColumn();
		tblclmn5NombreRepresentante.setWidth(100);
		tblclmn5NombreRepresentante .setText("nombreRepresentante                                                                          ");

		TableViewerColumn  tableViewerColumn6Ciudad = new TableViewerColumn(tableViewerCentroMant, SWT.NONE);
		TableColumn tblclmn6Ciudad = tableViewerColumn6Ciudad.getColumn();
		tblclmn6Ciudad.setWidth(100);
		tblclmn6Ciudad .setText("ciudad                                  ");

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
        IObservableValue observeTextNombreCMInformacionCMObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNombreCMInformacionCM);
        IObservableValue contenedorinformacionCMNombreCMInformacionCMObserveValue = EMFObservables.observeValue(contenedorinformacionCMViewModel,ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM);
        bindingContext.bindValue(observeTextNombreCMInformacionCMObserveWidget,contenedorinformacionCMNombreCMInformacionCMObserveValue, null, null);
        //
        IObservableValue observeTextNombreRepresentanteInformacionCMObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNombreRepresentanteInformacionCM);
        IObservableValue contenedorinformacionCMNombreRepresentanteInformacionCMObserveValue = EMFObservables.observeValue(contenedorinformacionCMViewModel,ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE);
        bindingContext.bindValue(observeTextNombreRepresentanteInformacionCMObserveWidget,contenedorinformacionCMNombreRepresentanteInformacionCMObserveValue, null, null);
        //
        IObservableValue observeTextDescripcionInformacionCMObserveWidget = WidgetProperties.text(SWT.Modify).observe(textDescripcionInformacionCM);
        IObservableValue contenedorinformacionCMDescripcionInformacionCMObserveValue = EMFObservables.observeValue(contenedorinformacionCMViewModel,ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION);
        bindingContext.bindValue(observeTextDescripcionInformacionCMObserveWidget,contenedorinformacionCMDescripcionInformacionCMObserveValue, null, null);
        //
        IObservableValue observeTextPaisUbicacionObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPaisUbicacion);
        IObservableValue contenedorubicacionPaisUbicacionObserveValue = EMFObservables.observeValue(contenedorubicacionViewModel,ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_UBICACION_VIEW_MODEL__PAIS);
        bindingContext.bindValue(observeTextPaisUbicacionObserveWidget,contenedorubicacionPaisUbicacionObserveValue, null, null);
        //
        IObservableValue observeTextDepartamentoUbicacionObserveWidget = WidgetProperties.text(SWT.Modify).observe(textDepartamentoUbicacion);
        IObservableValue contenedorubicacionDepartamentoUbicacionObserveValue = EMFObservables.observeValue(contenedorubicacionViewModel,ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO);
        bindingContext.bindValue(observeTextDepartamentoUbicacionObserveWidget,contenedorubicacionDepartamentoUbicacionObserveValue, null, null);
        //
        IObservableValue observeTextCiudadUbicacionObserveWidget = WidgetProperties.text(SWT.Modify).observe(textCiudadUbicacion);
        IObservableValue contenedorubicacionCiudadUbicacionObserveValue = EMFObservables.observeValue(contenedorubicacionViewModel,ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD);
        bindingContext.bindValue(observeTextCiudadUbicacionObserveWidget,contenedorubicacionCiudadUbicacionObserveValue, null, null);
        //
        IObservableValue observeTextDireccionUbicacionObserveWidget = WidgetProperties.text(SWT.Modify).observe(textDireccionUbicacion);
        IObservableValue contenedorubicacionDireccionUbicacionObserveValue = EMFObservables.observeValue(contenedorubicacionViewModel,ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION);
        bindingContext.bindValue(observeTextDireccionUbicacionObserveWidget,contenedorubicacionDireccionUbicacionObserveValue, null, null);
        //
        ObservableListContentProvider listContentProvider1 = new ObservableListContentProvider();
        IObservableMap[] observeMaps1= EMFObservables.observeMaps(listContentProvider1.getKnownElements(),
        new EStructuralFeature[]{ContenedorcrudcmviewmodelPackage.Literals.CENTRO_MANT_VIEW_MODEL__NOMBRECM,ContenedorcrudcmviewmodelPackage.Literals.CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE,ContenedorcrudcmviewmodelPackage.Literals.CENTRO_MANT_VIEW_MODEL__CIUDAD});
        tableViewerCentroMant.setLabelProvider(new ObservableMapLabelProvider(observeMaps1));
        tableViewerCentroMant.setContentProvider(listContentProvider1);

        //
        IObservableList observeList1= EMFObservables.observeList(Realm.getDefault(),contenedormaestroCMViewModel,
        ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT);
        tableViewerCentroMant.setInput(observeList1);
            //

         return bindingContext;
//
      }
      public void registrarAction ( String  event ){
String arreglo [][] = {{"Taller1", "Taller2", "Taller3"},
 				  {"Santiago sanchez", "Natalia suaza", "Alvaro cardona"},
 				  { "descripcion" ,"descripcion", "descripcion" },
 				  { "colombia" , "colombia", "colombia" },
 				  { "quindio", "risaralda", "antioquia" },
 				  { "armenia", "pereira", "medellin" },
 				  { "direccion", "direccion", "direccion" }};

		 for (int i = 0; i < 3; i++) {
			contenedorinformacionCMViewModel.setNombrecm(arreglo[0][i]);
		    contenedorinformacionCMViewModel.setNombrerepresentante(arreglo[1][i]);
		    contenedorinformacionCMViewModel.setDescripcion(arreglo[2][i]);
		    	  
		    contenedorubicacionViewModel.setPais( arreglo[3][i] );
		    contenedorubicacionViewModel.setDepartamento(arreglo[4][i]);
		    contenedorubicacionViewModel.setCiudad(arreglo[5][i]);
		    contenedorubicacionViewModel.setDireccion(arreglo[6][i]);
		    contenedorcRUDCMViewModel.registrarCm();
			 
		}

    	  
    	  
//			contenedorinformacionCMViewModel.setNombrecm(textNombreCMInformacionCM.getText());
//    	  contenedorinformacionCMViewModel.setNombrerepresentante(textNombreRepresentanteInformacionCM.getText());
//    	  contenedorinformacionCMViewModel.setDescripcion(textDescripcionInformacionCM.getText());
//    	  
//    	  contenedorubicacionViewModel.setPais( textPaisUbicacion.getText() );
//    	  contenedorubicacionViewModel.setDepartamento(textDepartamentoUbicacion.getText());
//    	  contenedorubicacionViewModel.setCiudad(textCiudadUbicacion.getText());
//    	  contenedorubicacionViewModel.setDireccion(textDireccionUbicacion.getText());
//    	  
    	 // contenedorcRUDCMViewModel.registrarCm();
    	  mfm.salvar();
    	  contenedorcRUDCMViewModel.actualizarCrudCm();
    	  limpiarCampos();
      }

      public void cancelarAction ( String  event ){
//semantics
      }

      public void constructorContenedorCRUDCMViewPart (){
             //semantics
      }

      public void syncModel (){
             //semantics
      }

      public void limpiarCampos (){
             textNombreCMInformacionCM.setText("");
    	  textNombreRepresentanteInformacionCM.setText("");
    	  textDescripcionInformacionCM.setText("");
    	  textPaisUbicacion.setText("");
    	  textDepartamentoUbicacion.setText("");
    	  textCiudadUbicacion.setText("");
    	  textDireccionUbicacion.setText("");
      }

}
