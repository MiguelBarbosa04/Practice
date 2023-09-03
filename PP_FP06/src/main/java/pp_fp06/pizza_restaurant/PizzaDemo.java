/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.TamanhoEnumeration;
import pp_fp06.pizza_restaurant.enums.OrigemEnumeration;
/**
 *
 * @author Miguel
 */
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Criar ingredientes
        Ingrediente queijo = new Ingrediente(1, "Queijo", OrigemEnumeration.ANIMAL, 100);
        Ingrediente tomate = new Ingrediente(2, "Tomate", OrigemEnumeration.VEGETAL, 20);
        Ingrediente presunto = new Ingrediente(3, "Presunto", OrigemEnumeration.ANIMAL, 150);

        // Criar pizzas
        Ingrediente[] ingredientesPizza1 = {queijo, tomate};
        Pizza pizza1 = new Pizza(1, "Margherita", "Pizza de queijo e tomate", 10.99, TamanhoEnumeration.MÉDIA, 2, ingredientesPizza1);

        Ingrediente[] ingredientesPizza2 = {queijo, presunto, tomate};
        Pizza pizza2 = new Pizza(2, "Presunto e Queijo", "Pizza com presunto, queijo e tomate", 12.99, TamanhoEnumeration.MÉDIA, 3, ingredientesPizza2);

        // Imprimir informações das pizzas
        imprimirPizza(pizza1);
        imprimirPizza(pizza2);
    }

    public static void imprimirPizza(Pizza pizza) {
        System.out.println("Nome: " + pizza.getNome());
        System.out.println("Descrição: " + pizza.getDescricao());
        System.out.println("Preço: " + pizza.getPreco());
        System.out.println("Tamanho: " + pizza.getTamanho());
        System.out.println("Número de Ingredientes: " + pizza.getNumeroIngredientes());
        System.out.println("Ingredientes:");

        Ingrediente[] ingredientes = pizza.getConjuntoIngredientes();
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("- " + ingrediente.getNome() + " (" + ingrediente.getOrigem() + ")");
        }

        System.out.println();
    }
}
