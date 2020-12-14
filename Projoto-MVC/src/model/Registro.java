/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/** 
 *
 * @author tales
 */
public class Registro {
private  static final List<Colecao> colecao = new ArrayList<Colecao>();
public static boolean incluirColecao(Colecao colecao){
             try{
                 colecao.setId(Registro.colecao.size() +colecao.getNome());
                Registro.colecao.add(colecao);
                
            }catch(Exception e){
                return false;
            }
            return true;
}

    public static String EnviarListaColecao() throws ParseException{
        String value = "";
           for(int i =0;i<Registro.colecao.size(); i++){
              value += colecao.get(i).toString()+ "\n------------\n";
           }
           return value;
       }
    public static boolean excluir(String id){
               for(int i =0;i<Registro.colecao.size(); i++){
              if(id.equals(Registro.colecao.get(i).getId()) ){
                     Registro.colecao.remove(i);
              return true;
           }
    }
               return false;
    }
    public static boolean alterar(String id, String nome, String preco){
        for(int i =0;i<Registro.colecao.size(); i++){
            
            if(id.equals(Registro.colecao.get(i).getId()) ){
                   Registro.colecao.get(i).setNome(nome);
                   Registro.colecao.get(i).setDescricao(preco);
                   return true;
              }
        }
        return false;
    }
}