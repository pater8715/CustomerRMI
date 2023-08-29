/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import model.RemoteServices;

/**
 *
 * @author Alberto Paternina
 */
public interface ConnectionListener {
    
    public void onConnectionEstablished(RemoteServices remoteServices, String rol);
    
}
