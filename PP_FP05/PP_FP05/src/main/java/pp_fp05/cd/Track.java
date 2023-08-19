/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.cd;

/**
 *
 * @author Miguel
 */
public class Track {

    private int numFaixa;
    private String nomeFaixa;
    private double duracao;
    private String nomeAutor;
    private Author[] authors;
    private int numAutores;

    public Track(int numFaixa, String nomeFaixa, double duracao, String nomeAutor, Author authors, int numAutores) {
        this.numFaixa = numFaixa;
        this.nomeFaixa = nomeFaixa;
        this.duracao = duracao;
        this.nomeAutor = nomeAutor;
        this.authors = new Author[5];
        this.numAutores = 0;
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
    
     public Author[] getAuthor() {
        return authors;
    }

    public String getInfo() {
        String info = "Faixa: " + numFaixa + ", Nome: " + nomeFaixa + ", Duração: " + duracao + " segundos\n";
        info += "Autores:\n";
        for (int i = 0; i < numAutores; i++) {
            info += "- Nome: " + authors[i].getNome() + ", Idade: " + authors[i].getIdade() + "\n";
        }
        return info;
    }

}
