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

        BicycleManagement bikeManager = new BicycleManagement(21);

        MountainBicycle bike1 = new MountainBicycle(
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

        MountainBicycle bike2 = new MountainBicycle(
                5, // numberOfLights
                31, // numberOfGears
                "Blue", // mainColor
                26, // wheelSize
                BrakesEnum.HIDRÁULICOS, // brakeType
                MaterialEnum.CARBONO, // frameMaterial
                555.99, // price
                12, // stock
                9, // numberOfLights
                SuspensionEnum.DUPLA // suspension
        );

        StreetBicycle bike3 = new StreetBicycle(
                1, // ID
                18, // numberOfGears
                "Blue", // mainColor
                28, // wheelSize
                BrakesEnum.PINÇAS, // brakeType 
                MaterialEnum.ALUMÍNIO, // frameMaterial 
                799.99, // price
                12, // guarantee
                1, // handlebelt
                54, // frameSize
                "Observações sobre a bicicleta" // Observações
        );

        bike1.addBikeTool("garrafa de água");
        bike1.addBikeTool("kit reparação pneu");
        bike1.addBikeTool("conta-quilómetros");
        bike1.addBikeTool("alforje");
        bike1.addBikeTool("suporte para telemóvel");

        System.out.println("Utensílios antes da remoção:");
        for (String tool : bike1.getBikeTools()) {
            System.out.println(tool);
        }

        bike1.removeBikeTool("conta-quilómetros");

        bike1.listBikeTools();

        bike1.addBikeTool("conta-quilómetros");

        System.out.println("\nUtensílios após adicionar o conta-quilometros outra vez:");
        for (String tool : bike1.getBikeTools()) {
            if (tool != null) {
                System.out.println(tool);
            }
        }

        bike1.addBikeTool("alforje");
        System.out.println("\nUtensílios após adicionar o conta-quilometros outra vez:");
        for (String tool : bike1.getBikeTools()) {
            if (tool != null) {
                System.out.println(tool);
            }
        }
        bikeManager.addBicycle(bike1);
        bikeManager.addBicycle(bike2);
        bikeManager.addBicycle(bike3);
        bikeManager.listBicycle();
        bikeManager.listMountainBicycle();
    }

}
