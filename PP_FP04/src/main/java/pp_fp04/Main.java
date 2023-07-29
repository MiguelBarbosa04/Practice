/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp04;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        User user1 = new User();
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'M', 'I', 'G'};
        user1.email = new char[]{'m', 'i', 'g', '@', 'g', '.', 'c'};

        Expenses expenses = new Expenses();
        User.expenses.carValues[0] = 200;
        User.expenses.foodValues[0] = 300;
        User.expenses.carValues[1] = 250;
        User.expenses.foodValues[1] = 400;
        User.expenses.carValues[2] = 500;
        User.expenses.foodValues[2] = 900;

        System.out.println("-----User 1-----");
        System.out.print("ID:");
        System.out.println(User.id);
        System.out.print("Name:");
        System.out.println(User.name);
        System.out.print("Email");
        System.out.println(User.email);
        System.out.print("Carro:");
        System.out.println(User.expenses.carValues[0]);
        System.out.print("Comida");
        System.out.println(User.expenses.foodValues[0]);

        System.out.println("TOTAL CARRO: " + totalDespesas(User.expenses.carValues));
        System.out.println("Média carro: " + totalDespesas(User.expenses.carValues) / 31);

        System.out.println("TOTAL f0od: " + totalDespesas(User.expenses.foodValues));
        System.out.println("Média food: " + totalDespesas(User.expenses.foodValues) / 31);
        
//         System.out.println("Expenses:");
//        System.out.println("Car Values:");
//        for (double carValue : expenses.getCarValues()) {
//            System.out.println(carValue);
//        }
//        System.out.println("Food Values:");
//        for (double foodValue : expenses.getFoodValues()) {
//            System.out.println(foodValue);
//        }
// MÉTODO ALTERNATIVO

    }

    public static double totalDespesas(double[] despesas) {

        double soma = 0;
        for (int i = 0; i < despesas.length; i++) {
            soma += despesas[i];
        }

        return soma;

    }

}
