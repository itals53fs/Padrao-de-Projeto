/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;

/**
 *
 * @author tales
 */
public class Arquivo {
private static FileWriter escrita = null;
private static JSONParser parser;
private static Scanner scan = new Scanner(System.in);
private static Gson gson = new Gson();
    
    public static String readFile(){
        String conteudo = "";
        try {
            FileReader arq = new FileReader("txt/data.json");
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
    
public static void puxarDados() {
      String linha;
      Colecao col = new Colecao();

            try {
                scan = new Scanner(new File("txt/data.json"));
            } catch (FileNotFoundException fileNotFoundException) {
                System.err.println("erro");
            }
            while (scan.hasNextLine()) {
                linha = scan.nextLine();
               
                col = gson.fromJson(linha, Colecao.class);
                Registro.incluirParaListar(col);
                
            }
       scan.close();
    }
     public  static void escrever(JSONObject json) throws IOException{
 
            try {
                Arquivo.escrita = new FileWriter("txt/data.json", true);
                Arquivo.escrita.write(json.toJSONString()+"\n");
                
                 Arquivo.escrita.close();
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
     
     public static void liparArquivo(){
            try {
           Arquivo.escrita = new FileWriter("txt/data.json");
           Arquivo.escrita.write("");

            Arquivo.escrita.close();
       } catch (IOException ex) {
           Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
     
     public static void enviarParaEscrita(){
        
         Registro reg = new Registro();
        JSONObject arqJson = new JSONObject();
            for(Colecao colecao: reg.getColecao()){
               arqJson.put("nome", colecao.getNome());
               arqJson.put("descricao", colecao.getDescricao());
               arqJson.put("id", colecao.getId());
            try {
                Arquivo.escrever(arqJson);
                
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
       }
       
}
