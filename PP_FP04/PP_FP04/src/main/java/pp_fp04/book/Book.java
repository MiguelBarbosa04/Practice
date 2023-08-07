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
public class Book {

    protected String titulo;
    protected String editor;
    protected Authors autor1;
    protected Authors autor2;
    protected int ano; 
    protected int paginas;
    protected int cotacao1;
    protected int cotacao2;
    protected int cotacao3;

    
    
    public Book(String titulo, String editor, Authors autor1, Authors autor2, int ano,int paginas, int cotacao1, int cotacao2, int cotacao3 ){
        this.titulo = titulo;
        this.editor = editor;
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.ano = ano;
        this.paginas = paginas;
        this.cotacao1 = cotacao1;
        this.cotacao2 = cotacao2;
        this.cotacao3 = cotacao3;
        
    }
    public void printBookInfo() {
        System.out.println("Title: " + titulo);
        System.out.println("Editor: " + editor);
        System.out.println("Author 1: " + autor1.getNomeAutor() + "," + autor1.getNacionalidade() + "," + autor1.getAcronimo());
        System.out.println("Author 2: " + autor2.getNomeAutor()+ "," + autor2.getNacionalidade() + "," + autor2.getAcronimo());
        System.out.println("Year: " + ano);
        System.out.println("Pages: " + paginas);
        System.out.println("Critics Ratings: " + cotacao1 + ", " + cotacao2 + ", " + cotacao3);
    }
}
