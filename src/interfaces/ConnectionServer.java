package interfaces;

import java.rmi.RemoteException;

public interface ConnectionServer {

    public void conecction() throws RemoteException;

    public ServerFunctions getServer() throws RemoteException;
}
