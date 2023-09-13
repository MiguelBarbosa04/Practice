/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikeStore;

import pp_fp07.bikeStore.enums.*;

/**
 *
 * @author Miguel
 */
public class BikeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MountainBicycle bike = new MountainBicycle(
                2, // numberOfLights
                21, // numberOfGears
                "Red", // mainColor
                26, // wheelSize
                BrakesEnum.HIDRÁULICOS, // brakeType
                MaterialEnum.CARBONO, // frameMaterial
                999.99, // price
                10, // stock
                5, // numberOfLights
                SuspensionEnum.DUPLA // suspension
        );

        bike.addBikeTool("garrafa de água");
        bike.addBikeTool("kit reparação pneu");
        bike.addBikeTool("conta-quilómetros");
        bike.addBikeTool("alforje");
        bike.addBikeTool("suporte para telemóvel");

        System.out.println("Utensílios antes da remoção:");
        for (String tool : bike.getBikeTools()) {
            System.out.println(tool);
        }

        bike.removeBikeTool("conta-quilómetros");

        bike.listBikeTools();

        bike.addBikeTool("conta-quilómetros");

        System.out.println("\nUtensílios após adicionar o conta-quilometros outra vez:");
        for (String tool : bike.getBikeTools()) {
            if (tool != null) {
                System.out.println(tool);
            }
        }

        bike.addBikeTool("alforje");
        System.out.println("\nUtensílios após adicionar o conta-quilometros outra vez:");
        for (String tool : bike.getBikeTools()) {
            if (tool != null) {
                System.out.println(tool);
            }
        }
    }

}
