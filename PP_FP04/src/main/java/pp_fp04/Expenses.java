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
public class Expenses {
    private static final int NUMBER_OF_DAYS = 31;//para o mês de março
    
    //Para despesas com o automóvel
    protected static int number1;
    
    //Vetor com o valor das despesas de automóvel durante o dia do mês
    //(o índice do vetor corresponde ao dia do mês)
    protected static double[] carValues = new double[NUMBER_OF_DAYS];
    protected static char[] descriptionCar = new char[]{'C','A','R'};
    
    //Para despesas alimentares
    protected static int number2;
    protected static double[] foodValues = new double[NUMBER_OF_DAYS];//em Euros
    protected static char[] descriptionfood = new char[]{'F','O','O','D'};
}
