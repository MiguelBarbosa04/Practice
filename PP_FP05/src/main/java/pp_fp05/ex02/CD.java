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
public class CD {

    private String banda;
    private String nomeCD;
    private int tempo;
    private int anoLancamento;
    private String editora;
    private Artist[] elementos;
    Track[] tracks;

    public CD(String banda, String nomeCD, int tempo, int anoLancamento, String editora, Artist[] elementos, Track[] tracks) {

        this.banda = banda;
        this.nomeCD = nomeCD;
        this.tempo = tempo;
        this.anoLancamento = anoLancamento;
        this.editora = editora;
        this.elementos = elementos;
        this.tracks = tracks;
    }

    public String getBanda() {
        return banda;
    }

    public String getNomeCD() {
        return nomeCD;
    }

    public double getTempo() {
        return tempo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getEditora() {
        return editora;
    }

    public Artist[] getelementos() {
        return elementos;
    }

    public Track[] getTracks() {
        return tracks;
    }

    public void getCDInfo() {
        System.out.println("CD: " + nomeCD);
        System.out.println("BANDA: " + banda);
        System.out.println("TEMPO: " + tempo);
        System.out.println("ANO DE LANÇAMENTO: " + anoLancamento);
        System.out.println("EDITORA: " + editora);
        System.out.println("ELEMENTOS: ");
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != null) {
                System.out.println(elementos[i].getInfo());
            }
        }

        System.out.println("MUSICAS: ");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println(tracks[i].getInfo());
            }
        }

    }
}
