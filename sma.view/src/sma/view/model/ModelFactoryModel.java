package sma.view.model;
import sma.*;
import sma.view.view.views.*;
import sma.domain.*;
import sma.domain.reparacionvehiculo.*;
import sma.domain.automatizacionrevision.*;
import sma.ui.*;
import sma.ui.viewmodels.*;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.*;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.*;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.*;



public class ModelFactoryModel {

//------------------------------  Singleton ------------------------------------------------

// Clase estatica oculta. Tan solo se instanciara el singleton una vez

   private static class SingletonHolder {
       private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
   }

           // Método para obtener la instancia de nuestra clase

   public static ModelFactoryModel getInstance()  { 
       return SingletonHolder.eINSTANCE;
   }

   CrudClienteViewPart crudClienteViewPart = null;

   CRUDCMViewPart cRUDCMViewPart = null;

   RegistroVehiculoViewPart registroVehiculoViewPart = null;

   public CrudClienteViewPart getCrudClienteViewPart(){
       return  crudClienteViewPart;
   }

  public void setCrudClienteViewPart(CrudClienteViewPart crudClienteViewPart) {
      this.crudClienteViewPart = crudClienteViewPart ;
   }

   public CRUDCMViewPart getCRUDCMViewPart(){
       return  cRUDCMViewPart;
   }

  public void setCRUDCMViewPart(CRUDCMViewPart cRUDCMViewPart) {
      this.cRUDCMViewPart = cRUDCMViewPart ;
   }

   public RegistroVehiculoViewPart getRegistroVehiculoViewPart(){
       return  registroVehiculoViewPart;
   }

  public void setRegistroVehiculoViewPart(RegistroVehiculoViewPart registroVehiculoViewPart) {
      this.registroVehiculoViewPart = registroVehiculoViewPart ;
   }

   ModelFactory modelFactory = smaFactory.eINSTANCE.createModelFactory();

   static String URL = "/test/src/model/model.sma";
               
   public ModelFactoryModel() {
        ModelFactory tempModelFactory = modelFactory;
        modelFactory = modelFactory.cargar(URL);
        modelFactory.implementarModelo();
        modelFactory.salvar(URL);
   }

   public ModelFactory getFactoryModel() {
     return modelFactory;
   }
   public void salvar(){
        modelFactory.salvar(URL);
  }

    public void cargar(){
       modelFactory = modelFactory.cargar(URL);
  }
   public UI getTheUI() {
     // TODO Auto-generated method stub
	     return modelFactory.getTheUI();
   }

   public Domain getTheDomain() {
   	// TODO Auto-generated method stub
   	return modelFactory.getTheDomain();
   }
   public ContenedorCrudClienteViewModel getTheContenedorCrudClienteViewModel() {
     return getTheUI().getTheContenedorCrudClienteViewModel();
   }
   public ContenedorDetalleClienteViewModel getTheContenedorDetalleClienteViewModel() {
     return getTheContenedorCrudClienteViewModel().getTheContenedorDetalleClienteViewModel();
   }
   public ContenedorDatosPersonalesViewModel getTheContenedorDatosPersonalesViewModel() {
     return getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel();
   }
   public ContenedorDatosdelacuentaViewModel getTheContenedorDatosdelacuentaViewModel() {
     return getTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel();
   }
   public ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel() {
     return getTheContenedorCrudClienteViewModel().getTheContenedorMaestroClienteViewModel();
   }
   public ContenedorCRUDCMViewModel getTheContenedorCRUDCMViewModel() {
     return getTheUI().getTheContenedorCRUDCMViewModel();
   }
   public ContenedorDetalleCMViewModel getTheContenedorDetalleCMViewModel() {
     return getTheContenedorCRUDCMViewModel().getTheContenedorDetalleCMViewModel();
   }
   public ContenedorInformacionCMViewModel getTheContenedorInformacionCMViewModel() {
     return getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel();
   }
   public ContenedorUbicacionViewModel getTheContenedorUbicacionViewModel() {
     return getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel();
   }
   public ContenedorMaestroCMViewModel getTheContenedorMaestroCMViewModel() {
     return getTheContenedorCRUDCMViewModel().getTheContenedorMaestroCMViewModel();
   }
   public ContenedorRegistroVehiculoViewModel getTheContenedorRegistroVehiculoViewModel() {
     return getTheUI().getTheContenedorRegistroVehiculoViewModel();
   }
   public ContenedorDetalleVehiculoViewModel getTheContenedorDetalleVehiculoViewModel() {
     return getTheContenedorRegistroVehiculoViewModel().getTheContenedorDetalleVehiculoViewModel();
   }
   public ContenedorVehiculosRegistradosViewModel getTheContenedorVehiculosRegistradosViewModel() {
     return getTheContenedorRegistroVehiculoViewModel().getTheContenedorVehiculosRegistradosViewModel();
   }

}