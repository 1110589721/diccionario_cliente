/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actores;

import Gui.Diccionario;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import redes.RedCliente;
import org.json.simple.JSONObject;    


/**
 *
 * @author ACER 53F4
 */
public class Cliente {

    private RedCliente redCliente;

    public Cliente()throws SocketException, UnknownHostException 
    {
        InetAddress servidor = InetAddress.getByName("127.0.0.1");
        
        redCliente = new RedCliente(servidor, 4400);
    }
    
//    public String procesar(String mensaje){
//        try {
//            byte[] respuesta = redCliente.trabajar(mensaje.getBytes());            
//            return new String(respuesta);
//        } catch (IOException ex) {
//            System.out.println("<<No se pudo enviar el mensaje: " + ex.getMessage());
//        }
//        return null;
//    }
    
    public String procesar(JSONObject mensaje){        
        try {
            byte[] respuesta = redCliente.trabajar(mensaje.toString().getBytes("UTF-8"));       
            return new String(respuesta);
        } catch (IOException ex) {
            System.out.println("<<No se pudo enviar el mensaje: " + ex.getMessage());
        }
        return null;
    }
}
