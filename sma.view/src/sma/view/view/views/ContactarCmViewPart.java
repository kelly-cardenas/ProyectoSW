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
public class ContactarCmViewPart  extends ViewPart {


        public static final String ID = "sma.view.views.ContactarCm";

		ModelFactoryModel mfm;
		UI ui;
		ModelFactory modelFactory;
		private DataBindingContext m_bindingContext;
		ContenedorContactarCmViewModel   contenedorcontactarCmViewModel;
		public Group groupUbicacionactual; 
		ContenedorUbicacionactualViewModel   contenedorubicacionactualViewModel;
		public Button btnAceptarUbicacionactual;
 		public Label lblPaisUbicacionactual; 
		public Label lblDepartamentoUbicacionactual; 
		public Label lblCiudadUbicacionactual; 
		public Text textPaisUbicacionactual; 
		public Text textDepartamentoUbicacionactual; 
		public Text textCiudadUbicacionactual; 
		public Group groupCmrecomendados; 
		ContenedorCmrecomendadosViewModel   contenedorcmrecomendadosViewModel;
		public Table tableListaCm;
 		public TableViewer tableViewerListaCm;
 		ListaCmViewModel   listaCmViewModelSeleccionado; 
		private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

		public ContactarCmViewPart() {
		  try {
		    mfm = ModelFactoryModel.getInstance();
		    mfm.setContactarCmViewPart(this);
		    cargarContenedores(); 
		    syncModel();
            constructorContenedorContactarCmViewPart();
          }
		   catch (Exception e) {
		     }
		  }

         public void cargarContenedores(){
            mfm 								= ModelFactoryModel.getInstance(); 
            contenedorcontactarCmViewModel = mfm.getTheContenedorContactarCmViewModel();
            contenedorubicacionactualViewModel = mfm.getTheContenedorUbicacionactualViewModel();
            contenedorcmrecomendadosViewModel = mfm.getTheContenedorCmrecomendadosViewModel();
      
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
		sc.setMinSize(container.computeSize(505, 433));
		formToolkit.paintBordersFor(container);

		groupUbicacionactual = new Group(container, SWT.NONE);
		groupUbicacionactual.setBounds(78,31,337,157);
		groupUbicacionactual.setText("ubicacion actual");
		groupUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupUbicacionactual);
		formToolkit.paintBordersFor(groupUbicacionactual);

		btnAceptarUbicacionactual = formToolkit.createButton(groupUbicacionactual,"Aceptar",SWT.NONE);
		btnAceptarUbicacionactual.addSelectionListener(new SelectionAdapter() {

		public void widgetSelected(SelectionEvent e) {
				//TODO Action ButtonAceptarde la view ContactarCm
				        
      aceptarAction ( "event" );

		 }
		});
		btnAceptarUbicacionactual.setBounds(115,102,56,21);

		btnAceptarUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblPaisUbicacionactual = formToolkit.createLabel(groupUbicacionactual,"Pais",SWT.NONE);
        lblPaisUbicacionactual.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblPaisUbicacionactual.setBounds(19,18,37,25);

        lblPaisUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblDepartamentoUbicacionactual = formToolkit.createLabel(groupUbicacionactual,"Departamento",SWT.NONE);
        lblDepartamentoUbicacionactual.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblDepartamentoUbicacionactual.setBounds(19,42,96,21);

        lblDepartamentoUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblCiudadUbicacionactual = formToolkit.createLabel(groupUbicacionactual,"Ciudad",SWT.NONE);
        lblCiudadUbicacionactual.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblCiudadUbicacionactual.setBounds(19,66,54,21);

        lblCiudadUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textPaisUbicacionactual = formToolkit.createText(groupUbicacionactual, "New Text", SWT.NONE);
		textPaisUbicacionactual.setText("");
		textPaisUbicacionactual.setBounds(149,19,32,21);

		textPaisUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textDepartamentoUbicacionactual = formToolkit.createText(groupUbicacionactual, "New Text", SWT.NONE);
		textDepartamentoUbicacionactual.setText("");
		textDepartamentoUbicacionactual.setBounds(149,43,96,21);

		textDepartamentoUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textCiudadUbicacionactual = formToolkit.createText(groupUbicacionactual, "New Text", SWT.NONE);
		textCiudadUbicacionactual.setText("");
		textCiudadUbicacionactual.setBounds(149,67,48,21);

		textCiudadUbicacionactual.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		groupCmrecomendados = new Group(container, SWT.NONE);
		groupCmrecomendados.setBounds(18,211,457,193);
		groupCmrecomendados.setText("cm recomendados");
		groupCmrecomendados.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupCmrecomendados);
		formToolkit.paintBordersFor(groupCmrecomendados);

		tableViewerListaCm = new TableViewer(groupCmrecomendados, SWT.BORDER | SWT.FULL_SELECTION);
		tableListaCm = tableViewerListaCm.getTable();
		tableListaCm.setLinesVisible(true);
		tableListaCm.setHeaderVisible(true);
		tableListaCm.setBounds(19,30,397,133);
		tableListaCm.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.paintBordersFor(tableListaCm);

		tableListaCm.addSelectionListener(new SelectionAdapter(){
		    public void widgetSelected(SelectionEvent e) {
		    //TODO ActionTable ViewtableListaCmde la viewContactarCm
		         listaCmViewModelSeleccionado  = (ListaCmViewModel)e.item.getData();
		  } 
          });
		TableViewerColumn  tableViewerColumn14Nombre = new TableViewerColumn(tableViewerListaCm, SWT.NONE);
		TableColumn tblclmn14Nombre = tableViewerColumn14Nombre.getColumn();
		tblclmn14Nombre.setWidth(100);
		tblclmn14Nombre .setText("nombre");

		TableViewerColumn  tableViewerColumn15Nombrerepresentante = new TableViewerColumn(tableViewerListaCm, SWT.NONE);
		TableColumn tblclmn15Nombrerepresentante = tableViewerColumn15Nombrerepresentante.getColumn();
		tblclmn15Nombrerepresentante.setWidth(100);
		tblclmn15Nombrerepresentante .setText("nombrerepresentante");

		TableViewerColumn  tableViewerColumn16Direccion = new TableViewerColumn(tableViewerListaCm, SWT.NONE);
		TableColumn tblclmn16Direccion = tableViewerColumn16Direccion.getColumn();
		tblclmn16Direccion.setWidth(100);
		tblclmn16Direccion .setText("direccion");

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
        IObservableValue observeTextPaisUbicacionactualObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPaisUbicacionactual);
        IObservableValue contenedorubicacionactualPaisUbicacionactualObserveValue = EMFObservables.observeValue(contenedorubicacionactualViewModel,ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS);
        bindingContext.bindValue(observeTextPaisUbicacionactualObserveWidget,contenedorubicacionactualPaisUbicacionactualObserveValue, null, null);
        //
        IObservableValue observeTextDepartamentoUbicacionactualObserveWidget = WidgetProperties.text(SWT.Modify).observe(textDepartamentoUbicacionactual);
        IObservableValue contenedorubicacionactualDepartamentoUbicacionactualObserveValue = EMFObservables.observeValue(contenedorubicacionactualViewModel,ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO);
        bindingContext.bindValue(observeTextDepartamentoUbicacionactualObserveWidget,contenedorubicacionactualDepartamentoUbicacionactualObserveValue, null, null);
        //
        IObservableValue observeTextCiudadUbicacionactualObserveWidget = WidgetProperties.text(SWT.Modify).observe(textCiudadUbicacionactual);
        IObservableValue contenedorubicacionactualCiudadUbicacionactualObserveValue = EMFObservables.observeValue(contenedorubicacionactualViewModel,ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD);
        bindingContext.bindValue(observeTextCiudadUbicacionactualObserveWidget,contenedorubicacionactualCiudadUbicacionactualObserveValue, null, null);
        //
        ObservableListContentProvider listContentProvider4 = new ObservableListContentProvider();
        IObservableMap[] observeMaps4= EMFObservables.observeMaps(listContentProvider4.getKnownElements(),
        new EStructuralFeature[]{ContenedorcontactarcmviewmodelPackage.Literals.LISTA_CM_VIEW_MODEL__NOMBRE,ContenedorcontactarcmviewmodelPackage.Literals.LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE,ContenedorcontactarcmviewmodelPackage.Literals.LISTA_CM_VIEW_MODEL__DIRECCION});
        tableViewerListaCm.setLabelProvider(new ObservableMapLabelProvider(observeMaps4));
        tableViewerListaCm.setContentProvider(listContentProvider4);

        //
        IObservableList observeList4= EMFObservables.observeList(Realm.getDefault(),contenedorcmrecomendadosViewModel,
        ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL);
        tableViewerListaCm.setInput(observeList4);
            //

         return bindingContext;
//
      }
      public void aceptarAction ( String  event ){
    	  System.out.println("viewpart - "+textDepartamentoUbicacionactual.getText());
    	  contenedorubicacionactualViewModel.setPais(textPaisUbicacionactual.getText());
    	  contenedorubicacionactualViewModel.setDepartamento(textDepartamentoUbicacionactual.getText());
    	  contenedorubicacionactualViewModel.setCiudad(textCiudadUbicacionactual.getText());
    	  
    	  contenedorcmrecomendadosViewModel.getListaListaCmViewModel().clear();
    	  contenedorcontactarCmViewModel.mostrarCmsCercanos();
    	  mfm.salvar();
      }

      public void constructorContenedorContactarCmViewPart (){
    	
    	  limpiarCampos();
    	  contenedorcmrecomendadosViewModel.getListaListaCmViewModel().clear();
      }

      public void syncModel (){
             //semantics
      }

      public void limpiarCampos (){
         
    	  textPaisUbicacionactual.setText("");
    	  textDepartamentoUbicacionactual.setText("");
    	  textCiudadUbicacionactual.setText("");
    	  
    	  contenedorubicacionactualViewModel.setCiudad("");
    	  contenedorubicacionactualViewModel.setDepartamento("");
    	  contenedorubicacionactualViewModel.setPais("");
    	  
      }

}
