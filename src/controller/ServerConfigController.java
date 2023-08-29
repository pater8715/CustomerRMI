package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.RemoteServices;
import view.ServerConfigGUI;

public class ServerConfigController implements ActionListener {

    private final ServerConfigGUI viewConfig;
    private final RemoteServices configServer;

    public RemoteServices getConfigServer() {
        return configServer;
    }

    public ServerConfigController(RemoteServices configServer, ServerConfigGUI viewConfig) {
        this.viewConfig = viewConfig;
        this.configServer = configServer;
    

        this.viewConfig.jButton1.addActionListener((ActionEvent e) -> {
            saveConfigServer();
            
        });
    }

    public void iniciar() {
       this.viewConfig.setTitle("Configuración de Conexión");
       this.viewConfig.setVisible(true);
       
    }

    public void saveConfigServer() {
        this.configServer.setIp(this.viewConfig.txtIPServer.getText());
        this.configServer.setPort(Integer.parseInt(this.viewConfig.txtPortServer.getText()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
