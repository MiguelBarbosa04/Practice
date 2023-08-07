<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp04;

import pp_fp04.exchange.CurrencyRates;
import pp_fp04.book.Book;

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

        System.out.println("TOTAL CARRO (EM EURO): " + totalDespesas(User.expenses.carValues));
        System.out.println("Média carro (EM EURO): " + totalDespesas(User.expenses.carValues) / 31);

        System.out.println("TOTAL f0od (EM EURO): " + totalDespesas(User.expenses.foodValues));
        System.out.println("Média food (EM EURO): " + totalDespesas(User.expenses.foodValues) / 31);

        /////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////
        
        CurrencyRates currencyRates = new CurrencyRates(1.30030, 125.00000, 0.87290); // Supondo as taxas de câmbio

    
        double totalCarExpensesEuros = totalDespesas(User.expenses.carValues);
        double totalFoodExpensesEuros = totalDespesas(User.expenses.foodValues);

      
        double totalCarExpensesDollars = totalCarExpensesEuros * currencyRates.getEuroToDolar();
        double totalCarExpensesYen = totalCarExpensesEuros * currencyRates.getEuroToIene();
        double totalCarExpensesPounds = totalCarExpensesEuros * currencyRates.getEuroToGBP();

        double totalFoodExpensesDollars = totalFoodExpensesEuros * currencyRates.getEuroToDolar();
        double totalFoodExpensesYen = totalFoodExpensesEuros * currencyRates.getEuroToIene();
        double totalFoodExpensesPounds = totalFoodExpensesEuros * currencyRates.getEuroToGBP();

        System.out.println("TOTAL CARRO (EM DOLAR): " + totalCarExpensesDollars);
        System.out.println("Média carro (EM DOLAR): " +  totalCarExpensesDollars / 31);

    }

    public static double totalDespesas(double[] despesas) {

        double soma = 0;
        for (int i = 0; i < despesas.length; i++) {
            soma += despesas[i];
        }

        return soma;

    }

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp04;

import pp_fp04.exchange.CurrencyRates;

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

        System.out.println("TOTAL CARRO (EM EURO): " + totalDespesas(User.expenses.carValues));
        System.out.println("Média carro (EM EURO): " + totalDespesas(User.expenses.carValues) / 31);

        System.out.println("TOTAL f0od (EM EURO): " + totalDespesas(User.expenses.foodValues));
        System.out.println("Média food (EM EURO): " + totalDespesas(User.expenses.foodValues) / 31);

        /////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////
        
        CurrencyRates currencyRates = new CurrencyRates(1.30030, 125.00000, 0.87290); // Supondo as taxas de câmbio

    
        double totalCarExpensesEuros = totalDespesas(User.expenses.carValues);
        double totalFoodExpensesEuros = totalDespesas(User.expenses.foodValues);

      
        double totalCarExpensesDollars = totalCarExpensesEuros * currencyRates.getEuroToDolar();
        double totalCarExpensesYen = totalCarExpensesEuros * currencyRates.getEuroToIene();
        double totalCarExpensesPounds = totalCarExpensesEuros * currencyRates.getEuroToGBP();

        double totalFoodExpensesDollars = totalFoodExpensesEuros * currencyRates.getEuroToDolar();
        double totalFoodExpensesYen = totalFoodExpensesEuros * currencyRates.getEuroToIene();
        double totalFoodExpensesPounds = totalFoodExpensesEuros * currencyRates.getEuroToGBP();

        System.out.println("TOTAL CARRO (EM DOLAR): " + totalCarExpensesDollars);
        System.out.println("Média carro (EM DOLAR): " +  totalCarExpensesDollars / 31);

    }

    public static double totalDespesas(double[] despesas) {

        double soma = 0;
        for (int i = 0; i < despesas.length; i++) {
            soma += despesas[i];
        }

        return soma;

    }

}
>>>>>>> d2f7d7597db00be04761048e3a9c8f9ce1844ad0
