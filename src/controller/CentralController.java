
package controller;

import model.RemoteServices;
import view.*;


public class CentralController {
    
    private RemoteServices remoteServices; 
    private AdminController adminController;
    private CustomerController customerController;
    private ServerConfigController serverConfigController;

    public CentralController() {
        this.remoteServices = new RemoteServices();
        //this.adminController = (new AdminGUI(), remoteServices);
        
        this.serverConfigController = new ServerConfigController( remoteServices , new ServerConfigGUI());
    }
    
    public void start(){
        this.serverConfigController.iniciar();
        if(this.remoteServices.getIp() != null){
            this.customerController = new CustomerController (this.serverConfigController.getConfigServer(), new CustomerGUI());
            
        }else{
            System.out.println("Esta vacio");
        }
    }
    
    
}
