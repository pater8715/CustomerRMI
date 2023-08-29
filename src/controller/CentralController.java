package controller;

import interfaces.ConnectionListener;
import model.RemoteServices;
import view.*;

public class CentralController implements ConnectionListener {

    private RemoteServices remoteServices;
    private AdminController adminController;
    private CustomerController customerController;
    private ServerConfigController serverConfigController;

    public CentralController() {
        this.remoteServices = new RemoteServices();
        this.serverConfigController = new ServerConfigController(remoteServices, new ServerConfigGUI());
    }

    public void start() {
        this.serverConfigController.iniciar();
       }

    @Override
    public void onConnectionEstablished(RemoteServices remoteServices, String rol) {
        this.remoteServices = remoteServices;
        switch (rol) {
            case "customer" -> {
                this.customerController = new CustomerController(remoteServices, new CustomerGUI());
                this.customerController.iniciarGUI();
            }
            default -> throw new AssertionError();
        }

    }

}
