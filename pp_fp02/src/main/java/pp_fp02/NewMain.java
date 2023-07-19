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

        // Percorre listaA para encontrar elementos diferentes de listaB
        for (int i = 0; i < tamanhoA; i++) {
            // Inicialmente, assume que o elemento não está em listaB
            boolean encontradoEmListaB = false;

            // Percorre listaB para verificar se o elemento está presente
            for (int j = 0; j < tamanhoB; j++) {
                if (listaA[i] == listaB[j]) {
                    encontradoEmListaB = true;
                    break; // Encontrou o elemento em listaB, não precisa continuar procurando
                }
            }

            // Se o elemento não foi encontrado em listaB, adiciona ao vetor listaD
            if (!encontradoEmListaB) {
                listaD[contadorDiferentes] = listaA[i];
                contadorDiferentes++;
            }
        }

        // Cria um novo vetor com o tamanho exato da quantidade de elementos diferentes
        int[] novoVetorD = new int[contadorDiferentes];

        // Copia os elementos de listaD para o novo vetor
        for (int i = 0; i < contadorDiferentes; i++) {
            novoVetorD[i] = listaD[i];
        }

        // Imprime o vetor novoVetorD
        System.out.print("O vetor D é ");
        for (int i = 0; i < contadorDiferentes; i++) {
            System.out.print(novoVetorD[i] + " ");
        }

//Utilizamos uma variável contadorDiferentes para acompanhar a quantidade de elementos diferentes encontrados em listaA em relação a listaB.
//Em seguida, o programa inicia um loop for que percorre todos os elementos do vetor listaA.
//Para cada elemento de listaA, declaramos uma variável booleana encontradoEmListaB e a inicializamos como false. Essa variável será utilizada para indicar se o elemento atual de listaA está presente em listaB.
//Dentro do loop for aninhado, percorremos o vetor listaB para verificar se o elemento atual de listaA está presente em listaB. 
//Se encontrarmos um elemento igual em listaB, alteramos o valor de encontradoEmListaB para true e usamos o comando break para interromper a busca, pois não precisamos continuar procurando.
//Após o loop interno, verificamos se encontradoEmListaB ainda é false. Isso indica que o elemento atual de listaA não foi encontrado em listaB, portanto, é diferente de todos os elementos em listaB. 
//Nesse caso, adicionamos o elemento ao vetor listaD na posição contadorDiferentes, que nos ajuda a acompanhar o próximo índice disponível no vetor listaD, e incrementamos contadorDiferentes.
//Após percorrer o vetor listaA, criamos um novo vetor chamado novoVetorD com tamanho exato da quantidade de elementos diferentes encontrados. 
//Em seguida, copiamos os elementos de listaD para novoVetorD, garantindo que o novo vetor contenha apenas os elementos diferentes encontrados em listaA em relação a listaB.
//Por fim, o programa imprime o vetor novoVetorD, que é o resultado final com os elementos de listaA que não se encontram em listaB.
//A saída será uma sequência de elementos do vetor novoVetorD, mostrando os elementos de listaA que não estão presentes em listaB. 
    }
}
