/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author Miguel
 */
public enum TamanhoEnumeration {
    PEQUENA, MÉDIA, FAMILIAR;

    public static String pizzaToString(TamanhoEnumeration tamanho) {
        switch (tamanho) {
            case PEQUENA:
                return "A pizza é pequena";

            case FAMILIAR:
                return "A pizza é familiar";

            default:
                return "A pizza é média";

        }
    }
}
