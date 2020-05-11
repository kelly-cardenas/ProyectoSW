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
public class EscaneoViewPart  extends ViewPart {


        public static final String ID = "sma.view.views.Escaneo";

		ModelFactoryModel mfm;
		UI ui;
		ModelFactory modelFactory;
		private DataBindingContext m_bindingContext;
		ContenedorEscaneoViewModel   contenedorescaneoViewModel;
		public Group groupSeleccionauto; 
		ContenedorSeleccionautoViewModel   contenedorseleccionautoViewModel;
		public Label lblVehiculoSeleccionauto; 
		public Button btnESCANEARSeleccionauto;
 		public Text textPlacaVehiculoSeleccionauto; 
		public Group groupFallas; 
		ContenedorFallasViewModel   contenedorfallasViewModel;
		public Label lblFallasFallas; 
		public Text textNumeroerroresFallas; 
		public Label lblEstadoFallas; 
		public Text textEstadoVehFallas; 
		public Table tableListaFallas;
 		public TableViewer tableViewerListaFallas;
 		ListaFallasViewModel   listaFallasViewModelSeleccionado; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public EscaneoViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setEscaneoViewPart(this);
		    cargarContenedores(); 
		    syncModel();
            constructorContenedorEscaneoViewPart();
          }
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm 								= ModelFactoryModel.getInstance(); 
            contenedorescaneoViewModel = mfm.getTheContenedorEscaneoViewModel();
            contenedorseleccionautoViewModel = mfm.getTheContenedorSeleccionautoViewModel();
            contenedorfallasViewModel = mfm.getTheContenedorFallasViewModel();
      
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
		sc.setMinSize(container.computeSize(529, 421));
		formToolkit.paintBordersFor(container);

		groupSeleccionauto = new Group(container, SWT.NONE);
		groupSeleccionauto.setBounds(18,31,481,121);
		groupSeleccionauto.setText("seleccion auto");
		groupSeleccionauto.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupSeleccionauto);
		formToolkit.paintBordersFor(groupSeleccionauto);

        lblVehiculoSeleccionauto = formToolkit.createLabel(groupSeleccionauto,"Vehiculo:",SWT.NONE);
        lblVehiculoSeleccionauto.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblVehiculoSeleccionauto.setBounds(79,30,109,25);

        lblVehiculoSeleccionauto.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnESCANEARSeleccionauto = formToolkit.createButton(groupSeleccionauto,"ESCANEAR",SWT.NONE);
		btnESCANEARSeleccionauto.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonESCANEARde la view Escaneo
				        
      eSCANEARAction ( "event" );

		 }
		});
		btnESCANEARSeleccionauto.setBounds(187,74,64,21);

		btnESCANEARSeleccionauto.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textPlacaVehiculoSeleccionauto = formToolkit.createText(groupSeleccionauto, "New Text", SWT.NONE);
		textPlacaVehiculoSeleccionauto.setText("");
		textPlacaVehiculoSeleccionauto.setBounds(259,30,145,25);

		textPlacaVehiculoSeleccionauto.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupFallas = new Group(container, SWT.NONE);
		groupFallas.setBounds(18,163,481,217);
		groupFallas.setText("fallas");
		groupFallas.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupFallas);
		formToolkit.paintBordersFor(groupFallas);

        lblFallasFallas = formToolkit.createLabel(groupFallas,"Fallas:",SWT.NONE);
        lblFallasFallas.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblFallasFallas.setBounds(21,31,35,21);

        lblFallasFallas.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textNumeroerroresFallas = formToolkit.createText(groupFallas, "New Text", SWT.NONE);
		textNumeroerroresFallas.setText("");
		textNumeroerroresFallas.setBounds(79,32,37,21);

		textNumeroerroresFallas.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblEstadoFallas = formToolkit.createLabel(groupFallas,"Estado",SWT.NONE);
        lblEstadoFallas.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblEstadoFallas.setBounds(247,31,45,21);

        lblEstadoFallas.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textEstadoVehFallas = formToolkit.createText(groupFallas, "New Text", SWT.NONE);
		textEstadoVehFallas.setText("");
		textEstadoVehFallas.setBounds(307,32,109,21);

		textEstadoVehFallas.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		tableViewerListaFallas = new TableViewer(groupFallas, SWT.BORDER | SWT.FULL_SELECTION);
		tableListaFallas = tableViewerListaFallas.getTable();
		tableListaFallas.setLinesVisible(true);
		tableListaFallas.setHeaderVisible(true);
		tableListaFallas.setBounds(7,66,457,121);
		tableListaFallas.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(tableListaFallas);

		tableListaFallas.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		    //TODO ActionTable ViewtableListaFallasde la viewEscaneo
		         listaFallasViewModelSeleccionado  = (ListaFallasViewModel)e.item.getData();
		  } 
          });
		TableViewerColumn  tableViewerColumn27Gravedad = new TableViewerColumn(tableViewerListaFallas, SWT.NONE);
		TableColumn tblclmn27Gravedad = tableViewerColumn27Gravedad.getColumn();
		tblclmn27Gravedad.setWidth(100);
		tblclmn27Gravedad .setText("gravedad");

		TableViewerColumn  tableViewerColumn28PiesaAveriada = new TableViewerColumn(tableViewerListaFallas, SWT.NONE);
		TableColumn tblclmn28PiesaAveriada = tableViewerColumn28PiesaAveriada.getColumn();
		tblclmn28PiesaAveriada.setWidth(100);
		tblclmn28PiesaAveriada .setText("piesaAveriada");

		TableViewerColumn  tableViewerColumn29Origen = new TableViewerColumn(tableViewerListaFallas, SWT.NONE);
		TableColumn tblclmn29Origen = tableViewerColumn29Origen.getColumn();
		tblclmn29Origen.setWidth(100);
		tblclmn29Origen .setText("origen");

		TableViewerColumn  tableViewerColumn30Descripcion = new TableViewerColumn(tableViewerListaFallas, SWT.NONE);
		TableColumn tblclmn30Descripcion = tableViewerColumn30Descripcion.getColumn();
		tblclmn30Descripcion.setWidth(100);
		tblclmn30Descripcion .setText("descripcion");

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
        IObservableValue observeTextPlacaVehiculoSeleccionautoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPlacaVehiculoSeleccionauto);
        IObservableValue contenedorseleccionautoPlacaVehiculoSeleccionautoObserveValue = EMFObservables.observeValue(contenedorseleccionautoViewModel,ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO);
        bindingContext.bindValue(observeTextPlacaVehiculoSeleccionautoObserveWidget,contenedorseleccionautoPlacaVehiculoSeleccionautoObserveValue, null, null);
        //
        IObservableValue observeTextNumeroerroresFallasObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNumeroerroresFallas);
        IObservableValue contenedorfallasNumeroerroresFallasObserveValue = EMFObservables.observeValue(contenedorfallasViewModel,ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES);
        bindingContext.bindValue(observeTextNumeroerroresFallasObserveWidget,contenedorfallasNumeroerroresFallasObserveValue, null, null);
        //
        IObservableValue observeTextEstadoVehFallasObserveWidget = WidgetProperties.text(SWT.Modify).observe(textEstadoVehFallas);
        IObservableValue contenedorfallasEstadoVehFallasObserveValue = EMFObservables.observeValue(contenedorfallasViewModel,ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH);
        bindingContext.bindValue(observeTextEstadoVehFallasObserveWidget,contenedorfallasEstadoVehFallasObserveValue, null, null);
        //
        ObservableListContentProvider listContentProvider8 = new ObservableListContentProvider();
        IObservableMap[] observeMaps8= EMFObservables.observeMaps(listContentProvider8.getKnownElements(),
        new EStructuralFeature[]{ContenedorescaneoviewmodelPackage.Literals.LISTA_FALLAS_VIEW_MODEL__GRAVEDAD,ContenedorescaneoviewmodelPackage.Literals.LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA,ContenedorescaneoviewmodelPackage.Literals.LISTA_FALLAS_VIEW_MODEL__ORIGEN,ContenedorescaneoviewmodelPackage.Literals.LISTA_FALLAS_VIEW_MODEL__DESCRIPCION});
        tableViewerListaFallas.setLabelProvider(new ObservableMapLabelProvider(observeMaps8));
        tableViewerListaFallas.setContentProvider(listContentProvider8);

        //
        IObservableList observeList8= EMFObservables.observeList(Realm.getDefault(),contenedorfallasViewModel,
        ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL);
        tableViewerListaFallas.setInput(observeList8);
            //

         return bindingContext;
//
      }
      public void eSCANEARAction ( String  event ){
contenedorseleccionautoViewModel.setPlacavehiculo(textPlacaVehiculoSeleccionauto.getText());
    	  contenedorescaneoViewModel.escanearVehiculo();
    	  
    	  contenedorescaneoViewModel.mostrarEstadoVehiculo();
      }

      public void constructorContenedorEscaneoViewPart (){
             //semantics
      }

      public void syncModel (){
             //semantics
      }

}
