/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.ex02;

/**
 *
 * @author Miguel
 */
public class Track {

    private int numFaixa;
    private String nomeFaixa;
    private double duracao;
    private String nomeAutor;

    public Track(int numFaixa, String nomeFaixa, double duracao, String nomeAutor) {
        this.numFaixa = numFaixa;
        this.nomeFaixa = nomeFaixa;
        this.duracao = duracao;
        this.nomeAutor = nomeAutor;
    }

    public int getNumFaixa() {
        return numFaixa;
    }

    public String getNomeFaixa() {
        return nomeFaixa;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getInfo() {
        return ("NÚMERO DA FAIXA: " + numFaixa)
                + ("NOME DE FAIXA: " + nomeFaixa)
                + ("DURACAO: " + duracao)
                + ("NOME DO AUTOR: " + nomeAutor);
    }
}
