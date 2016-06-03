/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.sd.servertcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author fabricio
 */
public class ThreadCliente extends Thread{

    private Socket cliente;
    
    public ThreadCliente(Socket cliente) {
        this.cliente = cliente; 
    } 
        
    public void run() {
    try {
          //ObjectInputStream para receber o nome do arquivo
          ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
          DataOutputStream saida  = new DataOutputStream(cliente.getOutputStream());
          //Recebe o nome do arquivo
          String arquivo = (String)entrada.readObject();
          //Buffer de leitura dos bytes do arquivo
          byte buffer[] = new byte[512];
          //Leitura do arquivo solicitado
          FileInputStream file = new FileInputStream(arquivo);
          //DataInputStream para processar o arquivo solicitado
          DataInputStream arq = new DataInputStream(file);
          saida.flush();
          int leitura = arq.read(buffer);
          //Lendo os bytes do arquivo e enviando para o socket     

          while(leitura != - 1) {
            if(leitura != - 2) {
              saida.write(buffer,0,leitura);
            }
            leitura = arq.read(buffer);
          }

          System.out.println("Cliente atendido com sucesso: " + arquivo +
	        cliente.getRemoteSocketAddress().toString());

          entrada.close();
          saida.close();
          cliente.close();
    }

    catch(Exception e) {
       System.out.println("Excecao ocorrida na thread: " + e.getMessage());            
       try {
         cliente.close();   
       }

       catch(Exception ec) {}     
    }
  }
}

