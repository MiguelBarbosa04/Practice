/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp02;

/**
 *
 * @author Miguel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[] frase = {'e', 'u', ' ',
            's', 'o', 'u', ' ',
            'a', 'l', 'l', 'u', 'n', 'o'};

        for (int i = 0; i < frase.length; i++) {

            System.out.println(frase[i]);
        }

        int matriz[][] = {{11, 7, 333}, {-20, -23, 63}, {-22, 501, 10000}};

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                soma += matriz[i][j];
            }
        }

        System.out.println("A soma de todos os elemtos é:" + soma);

        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};

        int resultado = 1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 0) {
                resultado *= lista[i];
            }
        }

        System.out.println("O resutlado é:" + resultado);

        int count = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < 0) {
                count++;
            }
        }

        System.out.println("O número de elementos negativos é: " + count);

        int maior = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > maior) {
                maior = lista[i];
            }

        }

        System.out.println("O número maior é : " + maior);

        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};

        int pos = 0;
        int count2 = 0;
        int count3 = 0;

        while (pos < nome.length && nome[pos] != ' ') {
            pos++;
        }

        for (int i = pos; i < nome.length; i++) {
            System.out.println(nome[i]);
        }

        for (int i = 0; i < pos; i++) {
            System.out.println(nome[i]);

        }

        for (int i = 0; i < 10; i++) {
            if (nome[i] == 'a' || nome[i] == 'e'
                    || nome[i] == 'i' || nome[i] == 'o'
                    || nome[i] == 'u'
                    || nome[i] == 'A' || nome[i] == 'E'
                    || nome[i] == 'I' || nome[i] == 'O'
                    || nome[i] == 'U') {

                count2++;
            }
        }

        System.out.println("O número de vogais:" + count2);

//       if ( args.length != 2 ) {
//           
//           System.out.println("Uso: java NomeFormato <primeiro_nome> <ultimo_nome>");
//           return;
//       }
//       
//       String primeiroNome = args[0];
//       String ultimoNome = args[1];
//       
//       String nomeFormatado = ultimoNome + "," + primeiroNome;
//       System.out.println(nomeFormatado);
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};

        int tamanhoA = listaA.length;
        int tamanhoB = listaB.length;
        int tamanhoC = tamanhoA + tamanhoB;
        int[] listaC = new int[tamanhoC];
        int[] listaD = new int[tamanhoA];

        for (int i = 0; i < tamanhoA; i++) {
            listaC[i] = listaA[i];
        }

        for (int i = 0; i < tamanhoB; i++) {
            listaC[tamanhoA + i] = listaB[i];
        }

        System.out.println("o Vetor é:");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.println(listaC[i] + " ");
        }

        int repetidos = 0;

        for (int i = 0; i < tamanhoC; i++) {
            for (int j = i + 1; j < tamanhoC; j++) {
                if (listaC[i] == listaC[j]) {
                    repetidos++;
                }

            }
        }
        System.out.println("O vetor C tem " + repetidos + " elmentos repetidos");

        ////////////////////////////////////////////
        ////////////////////////////////////////////
        ////////////////////////////////////////////
        int contadorDiferentes = 0;

     
        for (int i = 0; i < tamanhoA; i++) {
           
            boolean encontradoEmListaB = true;
            for (int j = 0; j < tamanhoB; j++) {
                if (listaA[i] == listaB[j]) {
                    encontradoEmListaB = false;
                    break; 
                }
            }
            if (encontradoEmListaB) {
                listaD[contadorDiferentes] = listaA[i];
                contadorDiferentes++;
            }
        }

        System.out.print("O vetor D é ");
        for (int i = 0; i < contadorDiferentes; i++) {
            System.out.print(listaD[i] + " ");
        }
   

    }
}
