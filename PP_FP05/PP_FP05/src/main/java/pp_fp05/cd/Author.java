/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.cd;

public class Author {

    private String nome;
    private int idade;
    private String morada;
    private int nif;
    private double nib;
    private boolean vendedor;

    public Author(String nome, int idade, String morada, int nif, double nib, boolean vendedor) {
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
        this.nif = nif;
        this.nib = nib;
        this.vendedor = vendedor;
    }

    public Author(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.vendedor = false; // Definir como gratuito por padrão
    }

    // Getters para os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMorada() {
        return morada;
    }

    public int getNif() {
        return nif;
    }

    public double getNib() {
        return nib;
    }

    public boolean isVendedor() {
        return vendedor;
    }
}
