/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

/** 
 *
 * @author tales
 */
public class Registro {
    private static final List<Colecao> colecao = new ArrayList<Colecao>();
    private Scanner input = new Scanner(System.in);

    public static boolean incluirColecao(Colecao colecao){
        
        colecao.setId(Registro.colecao.size() +colecao.getNome());
        System.out.println(colecao.toString());
        Registro.colecao.add(colecao);
        Arquivo.enviarParaEscrita();
        return true;
    }
        public static boolean incluirParaListar(Colecao colecao){

        Registro.colecao.add(colecao);
        return true;
    }

    public String EnviarListaColecao() throws ParseException{
        Registro.colecao.clear();
        Arquivo.puxarDados();
        String value = "";
           for(int i =0;i<Registro.colecao.size(); i++){
              value += Registro.colecao.get(i).toString()+ "\n------------\n";
           }
                   
                   Registro.colecao.clear();
           return value;
       }
    public boolean excluir(String id){
        if(id.equals("")){
            return false;
        }
       Registro.colecao.clear();
        Arquivo.puxarDados();
       Arquivo.liparArquivo();
               for(int i =0;i<Registro.colecao.size(); i++){
              if(id.equals(Registro.colecao.get(i).getId()) ){
                   Registro.colecao.remove(i);
                Arquivo.enviarParaEscrita();
                Registro.colecao.clear();
              return true;
           }
    }
        Arquivo.enviarParaEscrita();

               return false;
    }
    public boolean alterar(String id, String nome, String preco){
       Registro.colecao.clear();
        Arquivo.puxarDados();
       Arquivo.liparArquivo();;
        for(int i =0;i<Registro.colecao.size(); i++){
            
            if(id.equals(Registro.colecao.get(i).getId()) ){
                   Registro.colecao.get(i).setNome(nome);
                   Registro.colecao.get(i).setDescricao(preco);
                   Arquivo.enviarParaEscrita();
                   Registro.colecao.clear();
                   return true;
              }
        }
        Arquivo.enviarParaEscrita();

        return false;
    }
    

    public void converterJson(){
        Colecao col = new Colecao();
         String arq = Arquivo.readFile();
        Gson gson = new Gson();
        col = gson.fromJson(arq, Colecao.class);
     }

    public List<Colecao> getColecao() {
        return colecao;
    }
}