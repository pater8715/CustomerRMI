package model;

import interfaces.ConnectionServer;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import interfaces.ServerFunctions;
import java.rmi.AccessException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoteServices implements ConnectionServer {

    private Registry registry;
    private ServerFunctions server;
    private String ip;
    private int port;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    @Override
    public void conecction() throws RemoteException, AccessException {
        try {
            this.registry = LocateRegistry.getRegistry(getIp(), getPort());
            this.server = (ServerFunctions) this.registry.lookup("RMIServiceRegistry");
        } catch (RemoteException e) {

        } catch (NotBoundException ex) {
            Logger.getLogger(RemoteServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
       public ServerFunctions getServer() {
        return server;
    }
}
