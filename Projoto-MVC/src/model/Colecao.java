/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tales
 */
public class Colecao {
    private String nome;
    private String descricao;
    private String id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Colecao(String nome, String Descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Colecao,\n" + "nome=" + nome + ",\nDescriçao=" + descricao + ",\nid=" + id + '}';
    }


}
