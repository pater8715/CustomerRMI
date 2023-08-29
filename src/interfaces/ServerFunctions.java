package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import model.MenuItem;

public interface ServerFunctions extends Remote {

    public String consultar(int id) throws RemoteException;

    public ArrayList<String> listEmpleados() throws RemoteException;
    
    public MenuItem obtenerPorId(int id) throws RemoteException;
    
    public List<MenuItem> obtenerLista() throws RemoteException;
    
}
