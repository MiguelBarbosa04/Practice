/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diferencas_Variaveis_instancia_e_de_classe;

/**
 *
 * @author Miguel
 */
public class Futebol {

    private String nomeEquipa; // var de instancia -- Cada objeto vai ter um nome de Time diferente
    private static String nomeSelecao; // var de classe -- Os objetos vão ter a mesma Selecao

    public void setEquipa(String equipa) {
        nomeEquipa = equipa;
    }

    public String getEquipa() {
        return nomeEquipa;
    }

    public void setSelecao(String selecao) {
        nomeSelecao = selecao;
    }

    public String getSelecao() {
        return nomeSelecao;
    }

    public void mostraEquipa() {
        System.out.printf("A sua equipa é : %s ", getEquipa());
    }

    public void mostraSelecao() {
        System.out.printf("A sua Seleção é : %s ", getSelecao());
    }
}
