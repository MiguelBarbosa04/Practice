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
public enum OrigemEnumeration {
    ANIMAL, VEGETAL, MINERAL;

    public static String origemToString(OrigemEnumeration origem) {
        switch (origem) {
            case VEGETAL:
                return "A pizza é vegetal";

            case MINERAL:
                return "A pizza é mineral";

            default:
                return "A pizza é animal";

        }
    }
}
