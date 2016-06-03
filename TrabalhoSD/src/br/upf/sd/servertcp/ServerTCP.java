/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.sd.servertcp;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author fabricio
 */
public class ServerTCP{
    

    public static void main(String[] args) {
        int porta = 2006;
        try {
            ServerSocket servidor = new ServerSocket(porta);
            System.out.println("servidor ouvindo a porta 2006");
            while (true) {
                Socket cliente = servidor.accept();
                System.out.println("cliente conectado: " + cliente.getInetAddress().getHostAddress());
                
                new ThreadCliente(cliente).start();

            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
    
   //http://www.devmedia.com.br/java-sockets-criando-comunicacoes-em-java/9465
    
}
