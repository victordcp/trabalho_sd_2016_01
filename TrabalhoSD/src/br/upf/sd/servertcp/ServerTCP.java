/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.sd.servertcp;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author fabricio
 */
public class ServerTCP {

    public static void main(String[] args) throws Exception{
        int porta = 2010;
        int recebido;
        int exit = 1;        
        
        ServerSocket ss = new ServerSocket(porta);
        System.out.println("server socket criado");
        Socket s = ss.accept();
        System.out.println("conexao aceita");
        
        while (exit == 1) {
            System.out.println("entrou no while");
            ObjectInputStream recebe = new ObjectInputStream(s.getInputStream());
            recebido = recebe.readInt();
            System.out.println("recebeu valor: " + recebido);
            
            
        }
    }
}
