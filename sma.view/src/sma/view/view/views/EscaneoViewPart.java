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
		public Group groupInformacionEmisionGases; 
		ContenedorInformacionEmisionGasesViewModel   contenedorinformacionEmisionGasesViewModel;
		public Text textGasesOfensivosInformacionEmisionGases; 
		public Label lblGasesnocivosInformacionEmisionGases; 
		public Text textGasesNocivosInformacionEmisionGases; 
		public Label lblGasesofensivosInformacionEmisionGases; 
		public Label lblEvaluaciongeneralemisionesInformacionEmisionGases; 
		public Text textEstadoVehiculoInformacionEmisionGases; 
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
            contenedorseleccionautoViewModel = mfm.getTheEscaneogetTheContenedorSeleccionautoViewModel();
            contenedorinformacionEmisionGasesViewModel = mfm.getTheEscaneogetTheContenedorInformacionEmisionGasesViewModel();
      
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
		sc.setMinSize(container.computeSize(529, 337));
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

		groupInformacionEmisionGases = new Group(container, SWT.NONE);
		groupInformacionEmisionGases.setBounds(18,163,481,145);
		groupInformacionEmisionGases.setText("Informacion Emision Gases");
		groupInformacionEmisionGases.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		formToolkit.adapt(groupInformacionEmisionGases);
		formToolkit.paintBordersFor(groupInformacionEmisionGases);

		textGasesOfensivosInformacionEmisionGases = formToolkit.createText(groupInformacionEmisionGases, "New Text", SWT.NONE);
		textGasesOfensivosInformacionEmisionGases.setText("");
		textGasesOfensivosInformacionEmisionGases.setBounds(379,31,37,21);

		textGasesOfensivosInformacionEmisionGases.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblGasesnocivosInformacionEmisionGases = formToolkit.createLabel(groupInformacionEmisionGases,"gases nocivos",SWT.NONE);
        lblGasesnocivosInformacionEmisionGases.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblGasesnocivosInformacionEmisionGases.setBounds(19,30,85,21);

        lblGasesnocivosInformacionEmisionGases.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textGasesNocivosInformacionEmisionGases = formToolkit.createText(groupInformacionEmisionGases, "New Text", SWT.NONE);
		textGasesNocivosInformacionEmisionGases.setText("");
		textGasesNocivosInformacionEmisionGases.setBounds(139,31,37,21);

		textGasesNocivosInformacionEmisionGases.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblGasesofensivosInformacionEmisionGases = formToolkit.createLabel(groupInformacionEmisionGases,"Gases ofensivos",SWT.NONE);
        lblGasesofensivosInformacionEmisionGases.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblGasesofensivosInformacionEmisionGases.setBounds(247,30,120,21);

        lblGasesofensivosInformacionEmisionGases.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

        lblEvaluaciongeneralemisionesInformacionEmisionGases = formToolkit.createLabel(groupInformacionEmisionGases,"Evaluacion general emisiones",SWT.NONE);
        lblEvaluaciongeneralemisionesInformacionEmisionGases.setForeground(SWTResourceManager.getColor(0, 0, 139)) ;
        lblEvaluaciongeneralemisionesInformacionEmisionGases.setBounds(79,78,157,21);

        lblEvaluaciongeneralemisionesInformacionEmisionGases.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

		textEstadoVehiculoInformacionEmisionGases = formToolkit.createText(groupInformacionEmisionGases, "New Text", SWT.NONE);
		textEstadoVehiculoInformacionEmisionGases.setText("");
		textEstadoVehiculoInformacionEmisionGases.setBounds(260,79,112,21);

		textEstadoVehiculoInformacionEmisionGases.setFont(SWTResourceManager.getFont("Segoe UI",10,SWT.NORMAL));

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
        IObservableValue observeTextPlacaVehiculoSeleccionautoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPlacaVehiculoSeleccionauto);
        IObservableValue contenedorseleccionautoPlacaVehiculoSeleccionautoObserveValue = EMFObservables.observeValue(contenedorseleccionautoViewModel,ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO);
        bindingContext.bindValue(observeTextPlacaVehiculoSeleccionautoObserveWidget,contenedorseleccionautoPlacaVehiculoSeleccionautoObserveValue, null, null);
        //
        IObservableValue observeTextGasesOfensivosInformacionEmisionGasesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textGasesOfensivosInformacionEmisionGases);
        IObservableValue contenedorinformacionEmisionGasesGasesOfensivosInformacionEmisionGasesObserveValue = EMFObservables.observeValue(contenedorinformacionEmisionGasesViewModel,ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS);
        bindingContext.bindValue(observeTextGasesOfensivosInformacionEmisionGasesObserveWidget,contenedorinformacionEmisionGasesGasesOfensivosInformacionEmisionGasesObserveValue, null, null);
        //
        IObservableValue observeTextGasesNocivosInformacionEmisionGasesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textGasesNocivosInformacionEmisionGases);
        IObservableValue contenedorinformacionEmisionGasesGasesNocivosInformacionEmisionGasesObserveValue = EMFObservables.observeValue(contenedorinformacionEmisionGasesViewModel,ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS);
        bindingContext.bindValue(observeTextGasesNocivosInformacionEmisionGasesObserveWidget,contenedorinformacionEmisionGasesGasesNocivosInformacionEmisionGasesObserveValue, null, null);
        //
        IObservableValue observeTextEstadoVehiculoInformacionEmisionGasesObserveWidget = WidgetProperties.text(SWT.Modify).observe(textEstadoVehiculoInformacionEmisionGases);
        IObservableValue contenedorinformacionEmisionGasesEstadoVehiculoInformacionEmisionGasesObserveValue = EMFObservables.observeValue(contenedorinformacionEmisionGasesViewModel,ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO);
        bindingContext.bindValue(observeTextEstadoVehiculoInformacionEmisionGasesObserveWidget,contenedorinformacionEmisionGasesEstadoVehiculoInformacionEmisionGasesObserveValue, null, null);
        //

         return bindingContext;
//
      }
      public void eSCANEARAction ( String  event ){
contenedorseleccionautoViewModel.setPlacavehiculo(textPlacaVehiculoSeleccionauto.getText());
		contenedorescaneoViewModel.realizarEscaneo();
      }

      public void constructorContenedorEscaneoViewPart (){
             // semantics
      }

      public void syncModel (){
             // semantics
      }

}
