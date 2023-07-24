/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp03;

/**
 *
 * @author Miguel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        ex1();
//        ex2Primos();
        //ex2Perfeitos();
        ex3();

    }

    public static void ex1() {
        int N = 3;
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {5, 6, 7}};
        int[][] B = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = A[j][i];
            }
        }

        System.out.println("A matriz transposta é :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(B[i][j] + ",");
            }
        }
    }

    public static void ex2Primos() {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i < vetor.length; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i + " é primo");
            }
        }
//i = 1
//
//Neste caso, i é igual a 1. O loop interno (for) não será executado porque j começa com 2, e a condição j < i já é falsa para j = 2. Portanto, primo permanece verdadeiro (true).
//A saída será: "1 é primo".
//i = 2
//
//Agora, i é igual a 2. O loop interno não será executado porque j começa com 2, e a condição j < i é falsa para j = 2. Portanto, primo permanece verdadeiro (true).
//A saída será: "2 é primo".
//i = 3
//
//Para i = 3, o loop interno será executado uma vez (com j = 2). 3 % 2 não é igual a 0, então primo permanece verdadeiro (true).
//A saída será: "3 é primo".
//i = 4
//
//Para i = 4, o loop interno será executado duas vezes (com j = 2 e j = 3). 4 % 2 é igual a 0, então primo é definido como falso (false) e não será impresso nada.
//i = 5
//
//Para i = 5, o loop interno será executado três vezes (com j = 2, j = 3 e j = 4). 5 % 2 não é igual a 0, 5 % 3 não é igual a 0 e 5 % 4 não é igual a 0, então primo permanece verdadeiro (true).
//A saída será: "5 é primo".
//i = 6
//
//Para i = 6, o loop interno será executado quatro vezes (com j = 2, j = 3, j = 4 e j = 5). 6 % 2 é igual a 0, então primo é definido como falso (false) e não será impresso nada.
//i = 7
//
//Para i = 7, o loop interno será executado cinco vezes (com j = 2, j = 3, j = 4, j = 5 e j = 6). 7 % 2 não é igual a 0, 7 % 3 não é igual a 0, 7 % 4 não é igual a 0, 7 % 5 não é igual a 0 e 7 % 6 não é igual a 0, então primo permanece verdadeiro (true).
//A saída será: "7 é primo".
//i = 8
//
//Para i = 8, o loop interno será executado seis vezes (com j = 2, j = 3, j = 4, j = 5, j = 6 e j = 7). 8 % 2 é igual a 0, então primo é definido como falso (false) e não será impresso nada.
//i = 9
//
//Para i = 9, o loop interno será executado sete vezes (com j = 2, j = 3, j = 4, j = 5, j = 6, j = 7 e j = 8). 9 % 2 não é igual a 0, 9 % 3 é igual a 0, então primo é definido como falso (false) e não será impresso nada.
//i = 10
//
//Para i = 10, o loop interno será executado oito vezes (com j = 2, j = 3, j = 4, j = 5, j = 6, j = 7, j = 8 e j = 9). 10 % 2 é igual a 0, então primo é definido como falso (false) e não será impresso nada.
    }

    public static void ex2Perfeitos() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < vetor.length; i++) {
            int divisorSum = 1;
            for (int j = 2; j <= vetor[i] / 2; j++) {
                if (vetor[i] % j == 0) {
                    divisorSum += j;
                }
            }

            if (divisorSum == vetor[i]) {
                System.out.println(vetor[i] + " é um número perfeito.");
            } else {
                System.out.println(vetor[i] + " não é um número perfeito.");
            }
        }
    }
//vetor[i] = 1
//
//O loop interno não será executado porque vetor[0] / 2 é igual a 0, então divisorSum continua sendo 1.
//A saída será: "1 is not a perfect number."
//vetor[i] = 2
//
//O loop interno não será executado porque vetor[1] / 2 é igual a 1, então divisorSum continua sendo 1.
//A saída será: "2 is not a perfect number."
//vetor[i] = 3
//
//O loop interno não será executado porque vetor[2] / 2 é igual a 1, então divisorSum continua sendo 1.
//A saída será: "3 is not a perfect number."
//vetor[i] = 4
//
//Para vetor[3] = 4, o loop interno será executado uma vez (com j = 2). 4 % 2 é igual a 0, então divisorSum é atualizado para 1 + 2 = 3.
//A saída será: "4 is not a perfect number."
//vetor[i] = 5
//
//O loop interno não será executado porque vetor[4] / 2 é igual a 2, então divisorSum continua sendo 1.
//A saída será: "5 is not a perfect number."
//vetor[i] = 6
//
//Para vetor[5] = 6, o loop interno será executado duas vezes (com j = 2 e j = 3). 6 % 2 é igual a 0 e 6 % 3 é igual a 0, então divisorSum é atualizado para 1 + 2 + 3 = 6.
//A saída será: "6 is a perfect number."
//vetor[i] = 7
//
//O loop interno não será executado porque vetor[6] / 2 é igual a 3, então divisorSum continua sendo 1.
//A saída será: "7 is not a perfect number."
//vetor[i] = 8
//
//Para vetor[7] = 8, o loop interno será executado duas vezes (com j = 2 e j = 3). 8 % 2 é igual a 0 e 8 % 3 não é igual a 0, então divisorSum é atualizado para 1 + 2 = 3.
//A saída será: "8 is not a perfect number."
//vetor[i] = 9
//
//Para vetor[8] = 9, o loop interno será executado duas vezes (com j = 2 e j = 3). 9 % 2 não é igual a 0 e 9 % 3 é igual a 0, então divisorSum é atualizado para 1 + 3 = 4.
//A saída será: "9 is not a perfect number."
//vetor[i] = 10
//
//Para vetor[9] = 10, o loop interno será executado duas vezes (com j = 2 e j = 3). 10 % 2 é igual a 0 e 10 % 3 não é igual a 0, então divisorSum é atualizado para 1 + 2 = 3.
//A saída será: "10 is not a perfect number."



}
