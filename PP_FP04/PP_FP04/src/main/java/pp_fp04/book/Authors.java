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
public class Authors {
    
    protected String acronimo;
    protected String nomeAutor;
    protected String nacionalidade;
    
    
    public Authors(String acronimo, String nomeAutor, String nacionalidade){
        
        this.acronimo = acronimo;
        this.nomeAutor = nomeAutor;
        this.nacionalidade = nacionalidade;
    }
    
    public String getAcronimo(){
        return acronimo;
    }
    public String getNomeAutor(){
        return nomeAutor;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    
   
}
