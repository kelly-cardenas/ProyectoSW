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
import sma.ui.viewmodels.contenedorloginviewmodel.*;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.*;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.*;
import sma.ui.viewmodels.contenedorescaneoviewmodel.*;



public class ModelFactoryModel {

//------------------------------  Singleton ------------------------------------------------

// Clase estatica oculta. Tan solo se instanciara el singleton una vez

   private static class SingletonHolder {
       private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
   }

           // M�todo para obtener la instancia de nuestra clase

   public static ModelFactoryModel getInstance()  { 
       return SingletonHolder.eINSTANCE;
   }

   CrudClienteViewPart crudClienteViewPart = null;

   CRUDCMViewPart cRUDCMViewPart = null;

   RegistroVehiculoViewPart registroVehiculoViewPart = null;

   LoginViewPart loginViewPart = null;

   EscaneoViewPart escaneoViewPart = null;

   ContactarCmViewPart contactarCmViewPart = null;

   SolicitudVisitaViewPart solicitudVisitaViewPart = null;

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

   public LoginViewPart getLoginViewPart(){
       return  loginViewPart;
   }

  public void setLoginViewPart(LoginViewPart loginViewPart) {
      this.loginViewPart = loginViewPart ;
   }

   public EscaneoViewPart getEscaneoViewPart(){
       return  escaneoViewPart;
   }

  public void setEscaneoViewPart(EscaneoViewPart escaneoViewPart) {
      this.escaneoViewPart = escaneoViewPart ;
   }

   public ContactarCmViewPart getContactarCmViewPart(){
       return  contactarCmViewPart;
   }

  public void setContactarCmViewPart(ContactarCmViewPart contactarCmViewPart) {
      this.contactarCmViewPart = contactarCmViewPart ;
   }

   public SolicitudVisitaViewPart getSolicitudVisitaViewPart(){
       return  solicitudVisitaViewPart;
   }

  public void setSolicitudVisitaViewPart(SolicitudVisitaViewPart solicitudVisitaViewPart) {
      this.solicitudVisitaViewPart = solicitudVisitaViewPart ;
   }

     private String estado = "NOINICIALIZADO";
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
   public ContenedorDetalleClienteViewModel getTheCrudClientegetTheContenedorDetalleClienteViewModel() {
     return getTheContenedorCrudClienteViewModel().getTheContenedorDetalleClienteViewModel();
   }
   public ContenedorDatosPersonalesViewModel getTheCrudClientegetTheContenedorDatosPersonalesViewModel() {
     return getTheCrudClientegetTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel();
   }
   public ContenedorDatosdelacuentaViewModel getTheCrudClientegetTheContenedorDatosdelacuentaViewModel() {
     return getTheCrudClientegetTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel();
   }
   public ContenedorMaestroClienteViewModel getTheCrudClientegetTheContenedorMaestroClienteViewModel() {
     return getTheContenedorCrudClienteViewModel().getTheContenedorMaestroClienteViewModel();
   }
   public ContenedorCRUDCMViewModel getTheContenedorCRUDCMViewModel() {
     return getTheUI().getTheContenedorCRUDCMViewModel();
   }
   public ContenedorDetalleCMViewModel getTheCRUDCMgetTheContenedorDetalleCMViewModel() {
     return getTheContenedorCRUDCMViewModel().getTheContenedorDetalleCMViewModel();
   }
   public ContenedorInformacionCMViewModel getTheCRUDCMgetTheContenedorInformacionCMViewModel() {
     return getTheCRUDCMgetTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel();
   }
   public ContenedorUbicacionViewModel getTheCRUDCMgetTheContenedorUbicacionViewModel() {
     return getTheCRUDCMgetTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel();
   }
   public ContenedorMaestroCMViewModel getTheCRUDCMgetTheContenedorMaestroCMViewModel() {
     return getTheContenedorCRUDCMViewModel().getTheContenedorMaestroCMViewModel();
   }
   public ContenedorRegistroVehiculoViewModel getTheContenedorRegistroVehiculoViewModel() {
     return getTheUI().getTheContenedorRegistroVehiculoViewModel();
   }
   public ContenedorDetalleVehiculoViewModel getTheRegistroVehiculogetTheContenedorDetalleVehiculoViewModel() {
     return getTheContenedorRegistroVehiculoViewModel().getTheContenedorDetalleVehiculoViewModel();
   }
   public ContenedorVehiculosRegistradosViewModel getTheRegistroVehiculogetTheContenedorVehiculosRegistradosViewModel() {
     return getTheContenedorRegistroVehiculoViewModel().getTheContenedorVehiculosRegistradosViewModel();
   }
   public ContenedorLoginViewModel getTheContenedorLoginViewModel() {
     return getTheUI().getTheContenedorLoginViewModel();
   }
   public ContenedorDetalleLoginViewModel getTheLogingetTheContenedorDetalleLoginViewModel() {
     return getTheContenedorLoginViewModel().getTheContenedorDetalleLoginViewModel();
   }
   public ContenedorEscaneoViewModel getTheContenedorEscaneoViewModel() {
     return getTheUI().getTheContenedorEscaneoViewModel();
   }
   public ContenedorSeleccionautoViewModel getTheEscaneogetTheContenedorSeleccionautoViewModel() {
     return getTheContenedorEscaneoViewModel().getTheContenedorSeleccionautoViewModel();
   }
   public ContenedorInformacionEmisionGasesViewModel getTheEscaneogetTheContenedorInformacionEmisionGasesViewModel() {
     return getTheContenedorEscaneoViewModel().getTheContenedorInformacionEmisionGasesViewModel();
   }
   public ContenedorContactarCmViewModel getTheContenedorContactarCmViewModel() {
     return getTheUI().getTheContenedorContactarCmViewModel();
   }
   public ContenedorUbicacionactualViewModel getTheContactarCmgetTheContenedorUbicacionactualViewModel() {
     return getTheContenedorContactarCmViewModel().getTheContenedorUbicacionactualViewModel();
   }
   public ContenedorCmrecomendadosViewModel getTheContactarCmgetTheContenedorCmrecomendadosViewModel() {
     return getTheContenedorContactarCmViewModel().getTheContenedorCmrecomendadosViewModel();
   }
   public ContenedorSolicitudVisitaViewModel getTheContenedorSolicitudVisitaViewModel() {
     return getTheUI().getTheContenedorSolicitudVisitaViewModel();
   }
   public ContenedorDatosCmViewModel getTheSolicitudVisitagetTheContenedorDatosCmViewModel() {
     return getTheContenedorSolicitudVisitaViewModel().getTheContenedorDatosCmViewModel();
   }
   public ContenedorBusquedaViewModel getTheSolicitudVisitagetTheContenedorBusquedaViewModel() {
     return getTheContenedorSolicitudVisitaViewModel().getTheContenedorBusquedaViewModel();
   }
   public void actualizarEstado(String evento) {
	   if(this.estado.equals("NOINICIALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("ACTUALIZADO")) {
		   if(evento.equals("iniciar")) {
			   this.estado = "DESACTUALIZADO";
		   }
	   }
	   if(this.estado.equals("DESACTUALIZADO")) {
		   if(evento.equals("actualizar")) {
			   this.estado = "ACTUALIZADO";
		   }
	   }
   }

   public String getEstado() {
	   // TODO Auto-generated method stub
	   return estado;
   }

}