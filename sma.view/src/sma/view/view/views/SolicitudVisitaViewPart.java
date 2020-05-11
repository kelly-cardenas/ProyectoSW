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
import sma.ui.viewmodels.contenedorescaneoviewmodel.*;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.*;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.*;

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
public class SolicitudVisitaViewPart  extends ViewPart {


        public static final String ID = "sma.view.views.SolicitudVisita";

		ModelFactoryModel mfm;
		UI ui;
		ModelFactory modelFactory;
		private DataBindingContext m_bindingContext;
		ContenedorSolicitudVisitaViewModel   contenedorsolicitudVisitaViewModel;
		public Group groupDatosCm; 
		ContenedorDatosCmViewModel   contenedordatosCmViewModel;
		public Label lblNombreCmDatosCm; 
		public Label lblNombreRepresentanteDatosCm; 
		public Label lblDireccionDatosCm; 
		public Text textNombreCmDatosCm; 
		public Text textNombreRepresentanteDatosCm; 
		public Text textDireccionDatosCm; 
		public Button btnSolicitarDatosCm;
 		public Button btnCancelarDatosCm;
 		public Group groupBusqueda; 
		ContenedorBusquedaViewModel   contenedorbusquedaViewModel;
		public Text textIdCmBusqueda; 
		public Button btnBuscarBusqueda;
 		public Text textPlacaVehiculoBusqueda; 
		public Label lblVehiculoarepararBusqueda; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public SolicitudVisitaViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setSolicitudVisitaViewPart(this);
		    cargarContenedores(); 
		    syncModel();
            constructorContenedorSolicitudVisitaViewPart();
          }
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm 								= ModelFactoryModel.getInstance(); 
            contenedorsolicitudVisitaViewModel = mfm.getTheContenedorSolicitudVisitaViewModel();
            contenedordatosCmViewModel = mfm.getTheContenedorDatosCmViewModel();
            contenedorbusquedaViewModel = mfm.getTheContenedorBusquedaViewModel();
      
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
		sc.setMinSize(container.computeSize(409, 409));
		formToolkit.paintBordersFor(container);

		groupDatosCm = new Group(container, SWT.NONE);
		groupDatosCm.setBounds(18,163,361,205);
		groupDatosCm.setText("DatosCm");
		groupDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDatosCm);
		formToolkit.paintBordersFor(groupDatosCm);

        lblNombreCmDatosCm = formToolkit.createLabel(groupDatosCm,"nombreCm",SWT.NONE);
        lblNombreCmDatosCm.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblNombreCmDatosCm.setBounds(19,18,73,25);

        lblNombreCmDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblNombreRepresentanteDatosCm = formToolkit.createLabel(groupDatosCm,"nombre Representante",SWT.NONE);
        lblNombreRepresentanteDatosCm.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblNombreRepresentanteDatosCm.setBounds(19,42,160,21);

        lblNombreRepresentanteDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblDireccionDatosCm = formToolkit.createLabel(groupDatosCm,"Direccion",SWT.NONE);
        lblDireccionDatosCm.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblDireccionDatosCm.setBounds(19,65,72,21);

        lblDireccionDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNombreCmDatosCm = formToolkit.createText(groupDatosCm, "New Text", SWT.NONE);
		textNombreCmDatosCm.setText("");
		textNombreCmDatosCm.setBounds(175,20,157,13);

		textNombreCmDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNombreRepresentanteDatosCm = formToolkit.createText(groupDatosCm, "New Text", SWT.NONE);
		textNombreRepresentanteDatosCm.setText("");
		textNombreRepresentanteDatosCm.setBounds(175,42,157,24);

		textNombreRepresentanteDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textDireccionDatosCm = formToolkit.createText(groupDatosCm, "New Text", SWT.NONE);
		textDireccionDatosCm.setText("");
		textDireccionDatosCm.setBounds(175,66,157,61);

		textDireccionDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnSolicitarDatosCm = formToolkit.createButton(groupDatosCm,"Solicitar",SWT.NONE);
		btnSolicitarDatosCm.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonSolicitarde la view SolicitudVisita
				        
      solicitarAction ( "event" );

		 }
		});
		btnSolicitarDatosCm.setBounds(187,150,72,21);

		btnSolicitarDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnCancelarDatosCm = formToolkit.createButton(groupDatosCm,"Cancelar",SWT.NONE);
		btnCancelarDatosCm.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonCancelarde la view SolicitudVisita
				        
      cancelarAction ( "event" );

		 }
		});
		btnCancelarDatosCm.setBounds(79,150,64,21);

		btnCancelarDatosCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupBusqueda = new Group(container, SWT.NONE);
		groupBusqueda.setBounds(30,19,337,121);
		groupBusqueda.setText("busqueda");
		groupBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupBusqueda);
		formToolkit.paintBordersFor(groupBusqueda);

		textIdCmBusqueda = formToolkit.createText(groupBusqueda, "New Text", SWT.NONE);
		textIdCmBusqueda.setText("");
		textIdCmBusqueda.setBounds(31,21,32,21);

		textIdCmBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnBuscarBusqueda = formToolkit.createButton(groupBusqueda,"Buscar",SWT.NONE);
		btnBuscarBusqueda.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonBuscarde la view SolicitudVisita
				        
      buscarAction ( "event" );

		 }
		});
		btnBuscarBusqueda.setBounds(190,23,48,21);

		btnBuscarBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textPlacaVehiculoBusqueda = formToolkit.createText(groupBusqueda, "New Text", SWT.NONE);
		textPlacaVehiculoBusqueda.setText("");
		textPlacaVehiculoBusqueda.setBounds(163,66,133,13);

		textPlacaVehiculoBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblVehiculoarepararBusqueda = formToolkit.createLabel(groupBusqueda,"vehiculo a reparar",SWT.NONE);
        lblVehiculoarepararBusqueda.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblVehiculoarepararBusqueda.setBounds(31,65,144,21);

        lblVehiculoarepararBusqueda.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

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
        IObservableValue observeTextNombreCmDatosCmObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNombreCmDatosCm);
        IObservableValue contenedordatosCmNombreCmDatosCmObserveValue = EMFObservables.observeValue(contenedordatosCmViewModel,ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM);
        bindingContext.bindValue(observeTextNombreCmDatosCmObserveWidget,contenedordatosCmNombreCmDatosCmObserveValue, null, null);
        //
        IObservableValue observeTextNombreRepresentanteDatosCmObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNombreRepresentanteDatosCm);
        IObservableValue contenedordatosCmNombreRepresentanteDatosCmObserveValue = EMFObservables.observeValue(contenedordatosCmViewModel,ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE);
        bindingContext.bindValue(observeTextNombreRepresentanteDatosCmObserveWidget,contenedordatosCmNombreRepresentanteDatosCmObserveValue, null, null);
        //
        IObservableValue observeTextDireccionDatosCmObserveWidget = WidgetProperties.text(SWT.Modify).observe(textDireccionDatosCm);
        IObservableValue contenedordatosCmDireccionDatosCmObserveValue = EMFObservables.observeValue(contenedordatosCmViewModel,ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION);
        bindingContext.bindValue(observeTextDireccionDatosCmObserveWidget,contenedordatosCmDireccionDatosCmObserveValue, null, null);
        //
        IObservableValue observeTextIdCmBusquedaObserveWidget = WidgetProperties.text(SWT.Modify).observe(textIdCmBusqueda);
        IObservableValue contenedorbusquedaIdCmBusquedaObserveValue = EMFObservables.observeValue(contenedorbusquedaViewModel,ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM);
        bindingContext.bindValue(observeTextIdCmBusquedaObserveWidget,contenedorbusquedaIdCmBusquedaObserveValue, null, null);
        //
        IObservableValue observeTextPlacaVehiculoBusquedaObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPlacaVehiculoBusqueda);
        IObservableValue contenedorbusquedaPlacaVehiculoBusquedaObserveValue = EMFObservables.observeValue(contenedorbusquedaViewModel,ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO);
        bindingContext.bindValue(observeTextPlacaVehiculoBusquedaObserveWidget,contenedorbusquedaPlacaVehiculoBusquedaObserveValue, null, null);
        //

         return bindingContext;
//
      }
      public void solicitarAction ( String  event ){
contenedorbusquedaViewModel.setPlacavehiculo(textPlacaVehiculoBusqueda.getText());	
    	  
    	  contenedorsolicitudVisitaViewModel.solicitarVisita();
    	  
    	  limpiarCampos();
    
    	  mfm.salvar();
      }

      public void cancelarAction ( String  event ){
textDireccionDatosCm.setText("");
    	  textIdCmBusqueda.setText("");
    	  textNombreCmDatosCm.setText("");
    	  textNombreRepresentanteDatosCm.setText("");
    	  textPlacaVehiculoBusqueda.setText("");
    	  
    	  
    	  contenedorbusquedaViewModel.setPlacavehiculo("");
    	  contenedorbusquedaViewModel.setIdcm("");
    	  contenedordatosCmViewModel.setDireccion("");
    	  contenedordatosCmViewModel.setNombrecm("");
    	  contenedordatosCmViewModel.setNombrerepresentante("");
      }

      public void buscarAction ( String  event ){
contenedorbusquedaViewModel.setIdcm(textIdCmBusqueda.getText());
    	  contenedorsolicitudVisitaViewModel.mostrarInfoCmSolicitudVisita(textIdCmBusqueda.getText());
    	  mfm.salvar();
      }

      public void constructorContenedorSolicitudVisitaViewPart (){
             limpiarCampos();
      }

      public void syncModel (){
             //semantics
      }

      public void limpiarCampos (){
             textDireccionDatosCm.setText("");
    	  textIdCmBusqueda.setText("");
    	  textNombreCmDatosCm.setText("");
    	  textNombreRepresentanteDatosCm.setText("");
    	  textPlacaVehiculoBusqueda.setText("");
    	  
    	  
    	  contenedorbusquedaViewModel.setPlacavehiculo("");
    	  contenedorbusquedaViewModel.setIdcm("");
    	  contenedordatosCmViewModel.setDireccion("");
    	  contenedordatosCmViewModel.setNombrecm("");
    	  contenedordatosCmViewModel.setNombrerepresentante("");
      }

}
