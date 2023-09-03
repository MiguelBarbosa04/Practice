/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.TamanhoEnumeration;

/**
 *
 * @author Miguel
 */
public class Pizza {

    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoEnumeration tamanho;
    private int numeroIngredientes;
    private Ingrediente[] conjuntoIngredientes;

    public Pizza(int codigo, String nome, String descricao, double preco, TamanhoEnumeration tamanho, int numeroIngredientes, Ingrediente[] conjuntoIngredientes) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.numeroIngredientes = numeroIngredientes;
        this.conjuntoIngredientes = conjuntoIngredientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TamanhoEnumeration getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoEnumeration tamanho) {
        this.tamanho = tamanho;
    }

    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    public void setNumeroIngredientes(int numeroIngredientes) {
        this.numeroIngredientes = numeroIngredientes;
    }

    public Ingrediente[] getConjuntoIngredientes() {
        return conjuntoIngredientes;
    }

    public void setConjuntoIngredientes(Ingrediente[] conjuntoIngredientes) {
        this.conjuntoIngredientes = conjuntoIngredientes;
    }

}
