package sma.view.update.actions;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.IWorkbenchPart;
import sma.view.view.views.*;

import sma.view.model.*;

public class UpdateAction implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	public UpdateAction() {
		}

	public void run(IAction action) {
		try {
			ModelFactoryModel.getInstance().actualizarEstado("iniciar");
			IWorkbenchPage[] pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPages();
			for (IWorkbenchPage iWorkbenchPage : pages) {
			  for (IViewPart iWorkbenchPage2 : iWorkbenchPage.getViews()) {
					if(iWorkbenchPage2 instanceof CrudClienteViewPart) {
		            CrudClienteViewPart crudClienteViewPart = (CrudClienteViewPart)iWorkbenchPage2;
		            crudClienteViewPart.updateData();
		             ModelFactoryModel.getInstance().actualizarEstado("actualizar");
					}
					if(iWorkbenchPage2 instanceof CRUDCMViewPart) {
		            CRUDCMViewPart cRUDCMViewPart = (CRUDCMViewPart)iWorkbenchPage2;
		            cRUDCMViewPart.updateData();
		             ModelFactoryModel.getInstance().actualizarEstado("actualizar");
					}
					if(iWorkbenchPage2 instanceof RegistroVehiculoViewPart) {
		            RegistroVehiculoViewPart registroVehiculoViewPart = (RegistroVehiculoViewPart)iWorkbenchPage2;
		            registroVehiculoViewPart.updateData();
		             ModelFactoryModel.getInstance().actualizarEstado("actualizar");
					}
					if(iWorkbenchPage2 instanceof LoginViewPart) {
		            LoginViewPart loginViewPart = (LoginViewPart)iWorkbenchPage2;
		            loginViewPart.updateData();
		             ModelFactoryModel.getInstance().actualizarEstado("actualizar");
					}
					if(iWorkbenchPage2 instanceof EscaneoViewPart) {
		            EscaneoViewPart escaneoViewPart = (EscaneoViewPart)iWorkbenchPage2;
		            escaneoViewPart.updateData();
		             ModelFactoryModel.getInstance().actualizarEstado("actualizar");
					}
					if(iWorkbenchPage2 instanceof ContactarCmViewPart) {
		            ContactarCmViewPart contactarCmViewPart = (ContactarCmViewPart)iWorkbenchPage2;
		            contactarCmViewPart.updateData();
		             ModelFactoryModel.getInstance().actualizarEstado("actualizar");
					}
					if(iWorkbenchPage2 instanceof SolicitudVisitaViewPart) {
		            SolicitudVisitaViewPart solicitudVisitaViewPart = (SolicitudVisitaViewPart)iWorkbenchPage2;
		            solicitudVisitaViewPart.updateData();
		             ModelFactoryModel.getInstance().actualizarEstado("actualizar");
					}
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
   public void selectionChanged(IAction action, ISelection selection) {
   }

   public void dispose()  {
   }

   public void init(IWorkbenchWindow window) {
     this.window = window;
  }
   }

