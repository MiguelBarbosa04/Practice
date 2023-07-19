/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp01;

/**
 *
 * @author Miguel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        boolean canITakeHisMoney;
//        int hisBalance = 5;
//        long myBalance = 4;
//        hisBalance += 8;
//        canITakeHisMoney = hisBalance >  myBalance;
//        canITakeHisMoney = canITakeHisMoney & (hisBalance >=3);
//        System.out.println(canITakeHisMoney);
//        int v = 0;
//        
//        v++; // v = 1
//        
//        int amount = v++; //amount igual a 1    v = 2
//        System.out.println(++v + "" + amount); // v = 3  e o amount é 1
//        System.out.println(v); // v = 3
//        int v = 0;// v = 0
//        
//        v++; // v = 1
//        
//         System.out.println(v); // v = 1
//        
//        int amount = ++v; //amount igual a 2    v = 2
//        System.out.println(++v + "" + amount); // v = 3  e o amount é 2
//        System.out.println(v); // v = 3
//        int a = 5; //a = 5
//        int b = ++a; // b = 6 e a = 6
//        System.out.println(a);
//        System.out.println(b);
//
//        int c = a++; // c = 6  e a = 7
//        System.out.println(a);
//        System.out.println(c);
//
//        int d = ++a; // d = 8 a = 8
//        System.out.println(a);
//        System.out.println(d);
//    long a = 0;
//    System.out.println(a);
//    
//    a = 3;
//     System.out.println(a);
//     
//     boolean b = false;
//     System.out.println(b);
        int num1 = 5; // num1 = 5

        int prenum1 = ++num1; // num1 = 6 prenum1 = 6

        System.out.println("O valor de num1 é:" + num1);
        System.out.println("O valor de prenum1 é:" + prenum1);

        int num2 = 10; //num2 = 10
        int posnum2 = num2++; // posnum2 = 10 e num2 = 11

        System.out.println("O valor de num2 é:" + num2);
        System.out.println("O valor de posnum2 é:" + posnum2);

        int num3 = 7; // num3 = 7
        int resultado = ++num3; // resultado = 8 num3 = 8

        System.out.println("O valor de num3 é:" + num3);
        System.out.println("O valor de resultado é:" + resultado);
        
        
        int count= 0 ;
        int i;
        for(i = 0; i < 5; i++){
            ++count;
            System.out.println("O count2 no passo " + (i + 1) + "é :" + count);
        }
        
        
        int count2 = 0;
        for(i = 0; i < 5; i++){
            count2++;
            System.out.println("O count2 no passo " + (i + 1) + "é :" + count2);
        }
    }

}
