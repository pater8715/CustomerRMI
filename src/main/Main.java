
package main;

import controller.CentralController;

public class Main {
    
 
    public static void main(String[] args) {
        CentralController centrallController = new CentralController();
        centrallController.start();
        
    }

 

//    public static void iniciarVistaP(int port, String ip) {
//        try {
//            cliente = new RemoteServicesCustomer(ip,port);
//            controlador = new CustomerController(vistaP, cliente);
//            controlador.iniciarGUI();
//
//            //System.out.println("Resultado"+customer.consultar(0));
//        } catch (RemoteException e) {
//        }
//
//    }

}
