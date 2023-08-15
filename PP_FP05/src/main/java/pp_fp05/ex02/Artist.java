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
public class Artist {

    static int numElementos;

    private String nomeArtista;
    private String nacionalidade;
    private String data;

    public Artist(String nomeArtista, String nacionalidade, String data) {
        this.nomeArtista = nomeArtista;
        this.nacionalidade = nacionalidade;
        this.data = data;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getData() {
        return data;
    }

    public String getInfo() {
        return ("NOME ARTISTA:" + nomeArtista)
                + ("NACIONALIDADE:" + nacionalidade)
                + ("DATA:" + data);

    }
}
