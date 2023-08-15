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
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Artist a1 = new Artist("Artista 1", "German", "1977-03-04");
        Artist[] artists = {a1};

        Track t1 = new Track(1, "Ho Hey", 90, "Lumineers");
        Track t2 = new Track(2, "Ho Hey", 105, "Lumineers");

        Track[] tracks = new Track[15];
        CD cd = new CD("The Luminners", "The Lumineers", 195, 2012, "Dualtone Records", artists, tracks);
        cd.tracks[0] = t1;
        cd.tracks[14] = t2;

        System.out.println("CD: " + cd.getNomeCD());
        System.out.println("ANO: " + cd.getAnoLancamento());
        System.out.println("EDITORA: " + cd.getEditora());

        int nTracks = cd.tracks.length;
        for (int i = 0; i < nTracks; i++) {
            if (cd.tracks[i] != null) {
                Track t = cd.tracks[i];
                System.out.println("MUSICA NÚMERO: " + t.getNumFaixa() + " com titulo: " + t.getNomeFaixa());
                System.out.println("SEGUNDOS: " + t.getDuracao());
                System.out.println("AUTOR: " + t.getNomeAutor());
            }

        }
    }

}
