/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.text.ParseException;
import model.Colecao;
import model.Registro;
import view.CRUD;
/**
 *
 * @author tales
 */
public class Routes {
    Registro reg = new Registro();
    public boolean Savar(String nome, String descricao){
        
   
       Colecao col = new Colecao(nome, descricao);
       return reg.incluirColecao(col);

    }
    
    public String Listar() throws ParseException{
        
        return reg.EnviarListaColecao();
    }
    
    public boolean excluir(String id){
    
        return reg.excluir(id);
    }
    
    public boolean alterar(String id, String nome, String descricao){
   
        return reg.alterar(id, nome, descricao);
    }
    
    public static void main(String[] args){
            java.awt.EventQueue.invokeLater(() -> {
                new CRUD().setVisible(true);
            });
    }
}
