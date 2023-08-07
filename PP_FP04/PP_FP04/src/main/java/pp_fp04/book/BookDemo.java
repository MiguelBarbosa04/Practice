/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp04.book;

/**
 *
 * @author Miguel
 */
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Authors autor1 = new Authors("ABC", "Miguel", "Portugues");
        Authors autor2 = new Authors("XYZ", "Barbosa", "Espanhol");

        Book book = new Book("Livro fixe", "Miguel B.", autor1, autor2, 2023, 300, 7, 8, 9);

        book.printBookInfo();
    }

}
