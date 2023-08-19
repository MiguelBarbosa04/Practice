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
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Artist a1 = new Artist("Artista 1", "German", "1977-03-04");
        Artist[] artists = {a1};

        Author[] autores = new Author[4];
        autores[0] = new Author("Autor 1", 30, "Morada 1", 123456789, 987654321, true);
        autores[1] = new Author("Autor 2", 25);

        Track t1 = new Track(1, "Ho Hey", 90, "Lumineers", autores[0], 2);
        Track t2 = new Track(2, "Ho Hey", 105, "Lumineers", autores[1], 1);

        Track[] tracks = new Track[15];
        CD cd = new CD("The Lumineers", "The Lumineers", 195, 2012, "Dualtone Records", artists, tracks);
        cd.getTracks()[0] = t1;
        cd.getTracks()[14] = t2;

        System.out.println("CD: " + cd.getNomeCD());
        System.out.println("ANO: " + cd.getAnoLancamento());
        System.out.println("EDITORA: " + cd.getEditora());

        int nTracks = cd.getTracks().length;
        for (int i = 0; i < nTracks; i++) {
            Track t = cd.getTracks()[i];
            if (t != null) {
                System.out.println("MUSICA NÚMERO: " + t.getNumFaixa() + " com titulo: " + t.getNomeFaixa());
                System.out.println("SEGUNDOS: " + t.getDuracao());
                System.out.println("AUTOR: " + t.getNomeAutor());

                Author[] authors = t.getAuthor();
                if (authors != null) {
                    for (Author author : authors) {
                        System.out.println("INFORMAÇÕES DO AUTOR:");
                        System.out.println("NOME AUTOR: " + author.getNome());
                        System.out.println("IDADE: " + author.getIdade());
                        System.out.println("VENDEDOR: " + author.isVendedor());
                        // ... outros atributos do autor
                    }
                }
                System.out.println("-----------------------------");
            }
        }
    }
}
