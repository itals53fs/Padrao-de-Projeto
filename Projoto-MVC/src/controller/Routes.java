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
    public static boolean Savar(String nome, String preco){
        Colecao col = new Colecao(nome, preco);
       return Registro.incluirColecao(col);

    }
    
    public static String Listar() throws ParseException{
        return Registro.EnviarListaColecao();
    }
    
    public static boolean excluir(String id){
        return Registro.excluir(id);
    }
    
    public static boolean alterar(String id, String nome, String preco){
        return Registro.alterar(id, nome, preco);
    }
}
