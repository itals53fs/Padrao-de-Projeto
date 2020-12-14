/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tales
 */
public class Arquivo {
    
    public static String readFile(){
        String conteudo = "";
        try {
            FileReader arq = new FileReader("produto.txt");
            BufferedReader ler = new BufferedReader(arq);
            String linha = "";
            try {
                linha = ler.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = ler.readLine();
                }
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conteudo;
    }
    
    public static boolean writeFile(String texto){
        try {
            FileWriter arq = new FileWriter("produto.txt");
            PrintWriter escrever = new PrintWriter(arq);
            escrever.print(texto);
            escrever.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
