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
public class MountainBikeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MountainBicycle bike = new MountainBicycle(2, SuspensionEnum.SIMPLES);

        // Adiciona alguns utensílios
        bike.addBikeTool("garrafa de água");
        bike.addBikeTool("kit reparação pneu");
        bike.addBikeTool("conta-quilómetros");
        bike.addBikeTool("alforje");
        bike.addBikeTool("suporte para telemóvel");

        // Exibe os utensílios antes da remoção
        System.out.println("Utensílios antes da remoção:");
        for (String tool : bike.getBikeTools()) {
            System.out.println(tool);
        }

        // Remove um utensílio
        bike.removeBikeTool("conta-quilómetros");

        // Exibe os utensílios após a remoção
        System.out.println("\nUtensílios após a remoção:");
        for (String tool : bike.getBikeTools()) {
            if (tool != null) {
                System.out.println(tool);
            }
        }
        
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
