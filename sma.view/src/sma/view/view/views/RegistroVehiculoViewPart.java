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
public class RegistroVehiculoViewPart  extends ViewPart {


        public static final String ID = "sma.view.views.RegistroVehiculo";

		ModelFactoryModel mfm;
		UI ui;
		ModelFactory modelFactory;
		private DataBindingContext m_bindingContext;
		ContenedorRegistroVehiculoViewModel   contenedorregistroVehiculoViewModel;
		public Group groupDetalleVehiculo; 
		ContenedorDetalleVehiculoViewModel   contenedordetalleVehiculoViewModel;
		public Label lblPropietarioDetalleVehiculo; 
		public Text textPropietarioDetalleVehiculo; 
		public Label lblMarcaDetalleVehiculo; 
		public Label lblReferenciaDetalleVehiculo; 
		public Label lblModeloDetalleVehiculo; 
		public Label lblTipodeVehiculoDetalleVehiculo; 
		public Label lblPlacaDetalleVehiculo; 
		public Text textMarcaDetalleVehiculo; 
		public Text textReferenciaDetalleVehiculo; 
		public Text textModeloDetalleVehiculo; 
		public Text textTipovehiculoDetalleVehiculo; 
		public Text textPlacaDetalleVehiculo; 
		public Button btnREGISTRARDetalleVehiculo;
 		public Button btnCANCELARDetalleVehiculo;
 		public Group groupVehiculosRegistrados; 
		ContenedorVehiculosRegistradosViewModel   contenedorvehiculosRegistradosViewModel;
		public Table tableVehiculo;
 		public TableViewer tableViewerVehiculo;
 		VehiculoViewModel   vehiculoViewModelSeleccionado; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public RegistroVehiculoViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setRegistroVehiculoViewPart(this);
		    cargarContenedores(); 
		    syncModel();
            constructorContenedorRegistroVehiculoViewPart();
          }
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm 								= ModelFactoryModel.getInstance(); 
            contenedorregistroVehiculoViewModel = mfm.getTheContenedorRegistroVehiculoViewModel();
            contenedordetalleVehiculoViewModel = mfm.getTheContenedorDetalleVehiculoViewModel();
            contenedorvehiculosRegistradosViewModel = mfm.getTheContenedorVehiculosRegistradosViewModel();
      
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
		sc.setMinSize(container.computeSize(613, 529));
		formToolkit.paintBordersFor(container);

		groupDetalleVehiculo = new Group(container, SWT.NONE);
		groupDetalleVehiculo.setBounds(78,19,445,253);
		groupDetalleVehiculo.setText("Detalle Vehiculo");
		groupDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupDetalleVehiculo);
		formToolkit.paintBordersFor(groupDetalleVehiculo);

        lblPropietarioDetalleVehiculo = formToolkit.createLabel(groupDetalleVehiculo,"Propietario",SWT.NONE);
        lblPropietarioDetalleVehiculo.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblPropietarioDetalleVehiculo.setBounds(204,18,88,21);

        lblPropietarioDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textPropietarioDetalleVehiculo = formToolkit.createText(groupDetalleVehiculo, "New Text", SWT.NONE);
		textPropietarioDetalleVehiculo.setText("");
		textPropietarioDetalleVehiculo.setBounds(273,18,154,24);

		textPropietarioDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblMarcaDetalleVehiculo = formToolkit.createLabel(groupDetalleVehiculo,"Marca",SWT.NONE);
        lblMarcaDetalleVehiculo.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblMarcaDetalleVehiculo.setBounds(67,53,40,21);

        lblMarcaDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblReferenciaDetalleVehiculo = formToolkit.createLabel(groupDetalleVehiculo,"Referencia",SWT.NONE);
        lblReferenciaDetalleVehiculo.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblReferenciaDetalleVehiculo.setBounds(67,77,80,21);

        lblReferenciaDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblModeloDetalleVehiculo = formToolkit.createLabel(groupDetalleVehiculo,"Modelo",SWT.NONE);
        lblModeloDetalleVehiculo.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblModeloDetalleVehiculo.setBounds(66,100,85,5);

        lblModeloDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblTipodeVehiculoDetalleVehiculo = formToolkit.createLabel(groupDetalleVehiculo,"Tipo de Vehiculo",SWT.NONE);
        lblTipodeVehiculoDetalleVehiculo.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblTipodeVehiculoDetalleVehiculo.setBounds(65,126,128,21);

        lblTipodeVehiculoDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblPlacaDetalleVehiculo = formToolkit.createLabel(groupDetalleVehiculo,"Placa",SWT.NONE);
        lblPlacaDetalleVehiculo.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblPlacaDetalleVehiculo.setBounds(67,150,40,21);

        lblPlacaDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textMarcaDetalleVehiculo = formToolkit.createText(groupDetalleVehiculo, "New Text", SWT.NONE);
		textMarcaDetalleVehiculo.setText("");
		textMarcaDetalleVehiculo.setBounds(199,53,169,21);

		textMarcaDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textReferenciaDetalleVehiculo = formToolkit.createText(groupDetalleVehiculo, "New Text", SWT.NONE);
		textReferenciaDetalleVehiculo.setText("");
		textReferenciaDetalleVehiculo.setBounds(199,78,169,21);

		textReferenciaDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textModeloDetalleVehiculo = formToolkit.createText(groupDetalleVehiculo, "New Text", SWT.NONE);
		textModeloDetalleVehiculo.setText("");
		textModeloDetalleVehiculo.setBounds(199,105,169,21);

		textModeloDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textTipovehiculoDetalleVehiculo = formToolkit.createText(groupDetalleVehiculo, "New Text", SWT.NONE);
		textTipovehiculoDetalleVehiculo.setText("");
		textTipovehiculoDetalleVehiculo.setBounds(199,127,169,21);

		textTipovehiculoDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textPlacaDetalleVehiculo = formToolkit.createText(groupDetalleVehiculo, "New Text", SWT.NONE);
		textPlacaDetalleVehiculo.setText("");
		textPlacaDetalleVehiculo.setBounds(199,151,169,21);

		textPlacaDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnREGISTRARDetalleVehiculo = formToolkit.createButton(groupDetalleVehiculo,"REGISTRAR",SWT.NONE);
		btnREGISTRARDetalleVehiculo.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonREGISTRARde la view RegistroVehiculo
				        
      registrarAction ( "event" );

		 }
		});
		btnREGISTRARDetalleVehiculo.setBounds(259,198,72,21);

		btnREGISTRARDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		btnCANCELARDetalleVehiculo = formToolkit.createButton(groupDetalleVehiculo,"CANCELAR",SWT.NONE);
		btnCANCELARDetalleVehiculo.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonCANCELARde la view RegistroVehiculo
				        
      cancelarAction ( "event" );

		 }
		});
		btnCANCELARDetalleVehiculo.setBounds(91,198,64,21);

		btnCANCELARDetalleVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupVehiculosRegistrados = new Group(container, SWT.NONE);
		groupVehiculosRegistrados.setBounds(18,283,565,217);
		groupVehiculosRegistrados.setText("Vehiculos Registrados");
		groupVehiculosRegistrados.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupVehiculosRegistrados);
		formToolkit.paintBordersFor(groupVehiculosRegistrados);

		tableViewerVehiculo = new TableViewer(groupVehiculosRegistrados, SWT.BORDER | SWT.FULL_SELECTION);
		tableVehiculo = tableViewerVehiculo.getTable();
		tableVehiculo.setLinesVisible(true);
		tableVehiculo.setHeaderVisible(true);
		tableVehiculo.setBounds(7,18,541,169);
		tableVehiculo.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(tableVehiculo);

		tableVehiculo.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		    //TODO ActionTable ViewtableVehiculode la viewRegistroVehiculo
		         vehiculoViewModelSeleccionado  = (VehiculoViewModel)e.item.getData();
		  } 
          });
		TableViewerColumn  tableViewerColumn7Marca = new TableViewerColumn(tableViewerVehiculo, SWT.NONE);
		TableColumn tblclmn7Marca = tableViewerColumn7Marca.getColumn();
		tblclmn7Marca.setWidth(100);
		tblclmn7Marca .setText("marca");

		TableViewerColumn  tableViewerColumn8Referencia = new TableViewerColumn(tableViewerVehiculo, SWT.NONE);
		TableColumn tblclmn8Referencia = tableViewerColumn8Referencia.getColumn();
		tblclmn8Referencia.setWidth(100);
		tblclmn8Referencia .setText("referencia");

		TableViewerColumn  tableViewerColumn9Placa = new TableViewerColumn(tableViewerVehiculo, SWT.NONE);
		TableColumn tblclmn9Placa = tableViewerColumn9Placa.getColumn();
		tblclmn9Placa.setWidth(100);
		tblclmn9Placa .setText("placa");

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
        IObservableValue observeTextPropietarioDetalleVehiculoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPropietarioDetalleVehiculo);
        IObservableValue contenedordetalleVehiculoPropietarioDetalleVehiculoObserveValue = EMFObservables.observeValue(contenedordetalleVehiculoViewModel,ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO);
        bindingContext.bindValue(observeTextPropietarioDetalleVehiculoObserveWidget,contenedordetalleVehiculoPropietarioDetalleVehiculoObserveValue, null, null);
        //
        IObservableValue observeTextMarcaDetalleVehiculoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textMarcaDetalleVehiculo);
        IObservableValue contenedordetalleVehiculoMarcaDetalleVehiculoObserveValue = EMFObservables.observeValue(contenedordetalleVehiculoViewModel,ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA);
        bindingContext.bindValue(observeTextMarcaDetalleVehiculoObserveWidget,contenedordetalleVehiculoMarcaDetalleVehiculoObserveValue, null, null);
        //
        IObservableValue observeTextReferenciaDetalleVehiculoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textReferenciaDetalleVehiculo);
        IObservableValue contenedordetalleVehiculoReferenciaDetalleVehiculoObserveValue = EMFObservables.observeValue(contenedordetalleVehiculoViewModel,ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA);
        bindingContext.bindValue(observeTextReferenciaDetalleVehiculoObserveWidget,contenedordetalleVehiculoReferenciaDetalleVehiculoObserveValue, null, null);
        //
        IObservableValue observeTextModeloDetalleVehiculoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textModeloDetalleVehiculo);
        IObservableValue contenedordetalleVehiculoModeloDetalleVehiculoObserveValue = EMFObservables.observeValue(contenedordetalleVehiculoViewModel,ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO);
        bindingContext.bindValue(observeTextModeloDetalleVehiculoObserveWidget,contenedordetalleVehiculoModeloDetalleVehiculoObserveValue, null, null);
        //
        IObservableValue observeTextTipovehiculoDetalleVehiculoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textTipovehiculoDetalleVehiculo);
        IObservableValue contenedordetalleVehiculoTipovehiculoDetalleVehiculoObserveValue = EMFObservables.observeValue(contenedordetalleVehiculoViewModel,ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO);
        bindingContext.bindValue(observeTextTipovehiculoDetalleVehiculoObserveWidget,contenedordetalleVehiculoTipovehiculoDetalleVehiculoObserveValue, null, null);
        //
        IObservableValue observeTextPlacaDetalleVehiculoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPlacaDetalleVehiculo);
        IObservableValue contenedordetalleVehiculoPlacaDetalleVehiculoObserveValue = EMFObservables.observeValue(contenedordetalleVehiculoViewModel,ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA);
        bindingContext.bindValue(observeTextPlacaDetalleVehiculoObserveWidget,contenedordetalleVehiculoPlacaDetalleVehiculoObserveValue, null, null);
        //
        ObservableListContentProvider listContentProvider2 = new ObservableListContentProvider();
        IObservableMap[] observeMaps2= EMFObservables.observeMaps(listContentProvider2.getKnownElements(),
        new EStructuralFeature[]{ContenedorregistrovehiculoviewmodelPackage.Literals.VEHICULO_VIEW_MODEL__MARCA                            ,ContenedorregistrovehiculoviewmodelPackage.Literals.VEHICULO_VIEW_MODEL__REFERENCIA                                              ,ContenedorregistrovehiculoviewmodelPackage.Literals.VEHICULO_VIEW_MODEL__PLACA                                                 });
        tableViewerVehiculo.setLabelProvider(new ObservableMapLabelProvider(observeMaps2));
        tableViewerVehiculo.setContentProvider(listContentProvider2);

        //
        IObservableList observeList2= EMFObservables.observeList(Realm.getDefault(),contenedorvehiculosRegistradosViewModel,
        ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__LISTA_VEHICULO_VIEW_MODEL);
        tableViewerVehiculo.setInput(observeList2);
            //

         return bindingContext;
//
      }
      public void registrarAction ( String  event ){
String arreglo [][] = {{"chevrolet", "audi", "bmw"},
    			 				  {"2012", "2015", "2014"},
    			 				  { "crf323" ,"sem257", "cse231" },
    			 				  { "sail" , "r8", "m5" },
    			 				  { "sedan", "deportivo", "deportivo" }};
    	  
    	for (int i = 0; i < 3; i++) {
    		 
    		 
    			 contenedordetalleVehiculoViewModel.setMarca(arreglo[0][i]);
        		 contenedordetalleVehiculoViewModel.setModelo(arreglo[1][i]);
        		 contenedordetalleVehiculoViewModel.setPlaca(arreglo[2][i]);
        		 contenedordetalleVehiculoViewModel.setReferencia(arreglo[3][i]);
           	  	 contenedordetalleVehiculoViewModel.setTipovehiculo(arreglo[4][i]);
           	  	
           	  				
           	  	contenedorregistroVehiculoViewModel.registrarVehiculo();
    	}
    	  
//    	  contenedordetalleVehiculoViewModel.setMarca(textMarcaDetalleVehiculo.getText());
//    	  contenedordetalleVehiculoViewModel.setModelo(textModeloDetalleVehiculo.getText());
//    	  contenedordetalleVehiculoViewModel.setPlaca(textPlacaDetalleVehiculo.getText());
//    	  contenedordetalleVehiculoViewModel.setReferencia(textReferenciaDetalleVehiculo.getText());
//    	  contenedordetalleVehiculoViewModel.setTipovehiculo(textTipovehiculoDetalleVehiculo.getText());
    	 
    	//  contenedorregistroVehiculoViewModel.registrarVehiculo();
    	  mfm.salvar();
    	  contenedorregistroVehiculoViewModel.actualizarVentanaRegistroVehiculo();
    	  mfm.salvar();
    	  limpiarCampos();
      }

      public void cancelarAction ( String  event ){
limpiarCampos();
      }

      public void constructorContenedorRegistroVehiculoViewPart (){
             //semantics
      }

      public void syncModel (){
             //semantics
      }

      public void limpiarCampos (){
             textMarcaDetalleVehiculo.setText("");
    	  textModeloDetalleVehiculo.setText("");
    	  textPlacaDetalleVehiculo.setText("");
    	  textReferenciaDetalleVehiculo.setText("");
    	  textTipovehiculoDetalleVehiculo.setText("");
      }

}
