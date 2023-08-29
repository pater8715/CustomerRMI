package interfaces;

import java.rmi.RemoteException;

public interface WindowsObserver {

    public void onWindowsClosed(ServerFunctions getServer) throws RemoteException;

}
