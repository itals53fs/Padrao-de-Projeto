/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.text.ParseException;
import model.Colecao;
import model.Registro;
/**
 *
 * @author tales
 */
public class Routes {
    public static boolean Savar(String nome, String descricao){
        
        Registro reg = new Registro();
        Colecao col = new Colecao(nome, descricao);
       return reg.incluirColecao(col);

    }
    
    public static String Listar() throws ParseException{
        Registro reg = new Registro();
        return reg.EnviarListaColecao();
    }
    
    public static boolean excluir(String id){
        Registro reg = new Registro();
        return reg.excluir(id);
    }
    
    public static boolean alterar(String id, String nome, String preco){
        Registro reg = new Registro();
        return reg.alterar(id, nome, preco);
    }
}
