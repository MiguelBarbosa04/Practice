/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.OrigemEnumeration;

/**
 *
 * @author Miguel
 */
public class Ingrediente {

    private int codigo;
    private String nome;
    private OrigemEnumeration origem;
    private int numeroCalorias;

    public Ingrediente(int codigo, String nome, OrigemEnumeration origem, int numeroCalorias) {

        this.codigo = codigo;
        this.nome = nome;
        this.origem = origem;
        this.numeroCalorias = numeroCalorias;
    }
//////////GETTERS//////////

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public OrigemEnumeration getOrigem() {
        return origem;
    }

    public int getNumeroCalorias() {
        return numeroCalorias;
    }
//////////SETTERS//////////

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public void setOrigem(OrigemEnumeration origem) {
        this.origem = origem;
    }

    public void setNumeroCalorias(int numeroCalorias) {
        this.numeroCalorias = numeroCalorias;
    }
}
