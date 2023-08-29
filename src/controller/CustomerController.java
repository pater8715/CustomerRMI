package controller;

import model.RemoteServicesCustomer;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.NotBoundException;
import javax.swing.DefaultListModel;
import view.CustomerGUI;
import java.rmi.RemoteException;
import java.util.ArrayList;
import model.RemoteServices;


public class CustomerController implements ActionListener  {
    
  //  private DefaultListModel<String> taskListModel;
    private DefaultListModel<String> empleadoListModel;
    private final CustomerGUI view;
    private final RemoteServices remoteServices;
    
    //controlador - metodo constructor
    public CustomerController(RemoteServices remoteServices, CustomerGUI view) {
        this.remoteServices = remoteServices;
        this.view = view;
        this.view.btnRealizarTarea.addActionListener((e) -> {
//            acciones();
        });
        
        this.view.jListEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                mostrarDatosEmpleado(e.getPoint());
            }
        });
        
    }
//metodo para iniciar la vista y la conexión 
    public void iniciarGUI() throws RemoteException {
        this.view.setTitle("Gestor de Tareas - Cliente");
        this.view.setVisible(true);
        this.empleadoListModel = new DefaultListModel<>();
        this.view.jListEmpleados.setModel(empleadoListModel);
    
    }
    
    
//    private void mostrarDatosEmpleado(Point location) {
//        int index = this.view.jListEmpleados.locationToIndex(location);
//        try {
//            String info = this.cliente.getServer().consultar(index);
//            this.view.jTexEmpleado.setText(info);
//        } catch (RemoteException e) {
//        }
//    }
    
//    private void acciones() {
//        int selectedIndex = this.view.jListTask.getSelectedIndex();
//        if (selectedIndex != -1) {
//            switch (selectedIndex) {
//                case 0 -> {
//                    try {
//                        listarEmpleados();
//                    } catch (RemoteException ex) {
//                        
//                    }
//                }
//                default -> {
//                    throw new AssertionError();
//                }
//            }
//            
//        }
//    }
    
//    private void listarEmpleados() throws RemoteException {
//        this.empleadoListModel.clear();
//        ArrayList<String> lista = this.cliente.getServer().listEmpleados();
//        for (String empleado : lista) {
//            this.empleadoListModel.addElement(empleado);
//            System.out.println(empleado);
//        }
//        this.view.jListEmpleados.setModel(this.empleadoListModel);
//    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
