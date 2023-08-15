/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diferencas_Variaveis_instancia_e_de_classe;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class VarClasseInstancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String equipa;
        String selecao;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);

        System.out.println("Qual é a tua equipa? ");
        equipa = texto.nextLine();
        System.out.println("Qual é a tua selecao? ");
        selecao = texto.nextLine();

        torcida.setEquipa(equipa); // Porto
        torcida.setSelecao(selecao); //Portugal
        torcida.mostraEquipa();
        torcida.mostraSelecao();

        Futebol torcida2 = new Futebol();
        torcida2.mostraEquipa();//Null // A variavel "equipa"  é uma variavel de instacia, não define a equipa da torcidade2 por isso a resposta dá "Null"
        torcida2.mostraSelecao();// Portugal

        torcida2.setSelecao("Brasil");
        torcida.mostraSelecao();//Brasil  
        torcida2.mostraSelecao(); //Brasil
        //É sempre Brasil porque a variavel "selecao" é uma variavel de classe
    }

}
