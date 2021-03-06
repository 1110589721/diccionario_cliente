/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author ACER 53F4
 */
public class RedCliente {

    private DatagramSocket socket = null;
    private int puerto;
    private InetAddress destino;

    public RedCliente(InetAddress destino, int puerto) throws SocketException {
        this.destino = destino;
        this.puerto = puerto;

        socket = new DatagramSocket();
    }

    public byte[] trabajar(byte[] mensaje) throws IOException {
        enviarMensaje(mensaje);
        return recibirMensaje();
    }

    public void enviarMensaje(byte[] mensaje) throws IOException {
        byte[] hoja = new String(mensaje).getBytes();

        DatagramPacket sobre = new DatagramPacket(hoja, hoja.length, destino, puerto);

        socket.send(sobre);
    }

    public byte[] recibirMensaje() throws IOException {
        byte[] hoja = new byte[1000];

        DatagramPacket sobre = new DatagramPacket(hoja, hoja.length);

        socket.receive(sobre);

        return sobre.getData();
    }
    
    public void desactivar(){
        socket.close();
    }
}
