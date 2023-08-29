package test;

import cliente.Customer;
import controller.ControllerCustomer;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import view.CustomerGUI;

public class testCustomer {

    private static CustomerGUI vistaP = new CustomerGUI();
    private static ControllerCustomer controlador;
    private static Customer cliente;

    public static void main(String[] args) {
        iniciarConfig();
    }

    public static void iniciarConfig() {
        int port = Integer.parseInt(JOptionPane.showInputDialog("ingrese el puerto del servidor"));
        String ip = JOptionPane.showInputDialog("Ingrese la direccion ip del Servidor");
        iniciarVistaP(port, ip);
    }

    public static void iniciarVistaP(int port, String ip) {
        try {
            cliente = new Customer(ip,port);
            controlador = new ControllerCustomer(vistaP, cliente);
            controlador.iniciarGUI();

            //System.out.println("Resultado"+customer.consultar(0));
        } catch (RemoteException e) {
        }

    }

}
