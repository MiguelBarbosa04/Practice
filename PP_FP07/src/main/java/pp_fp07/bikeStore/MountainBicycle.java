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
public class MountainBicycle extends Bicycle {

    private int numberOfLights;
    private SuspensionEnum suspension;
    private String[] bikeTools;
    private int bikeToolsCount;

    public MountainBicycle(int numerOfLights, SuspensionEnum suspension) {
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        this.bikeTools = new String[5];
        this.bikeToolsCount = 0;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public SuspensionEnum GetSuspension() {
        return suspension;
    }

    public String[] getBikeTools() {
        return bikeTools;
    }

    public boolean addBikeTool(String tool) {
        if (bikeToolsCount < 5) {

            for (int i = 0; i < bikeToolsCount; i++) {
                if (bikeTools[i].equals(tool)) {
                    return false;
                }
            }
            bikeTools[bikeToolsCount] = tool;
            bikeToolsCount++;
            return true;
        } else {
            System.out.println("Limite máximo de 5 ferramentas atingigo");
            return false;
        }
    }
    
//Estamos dentro do loop for que percorre o array bikeTools, e chegamos a um ponto onde encontramos um utensílio que corresponde ao utensílio que desejamos remover. Vamos chamar esse utensílio de "utensílio encontrado".
//Agora, precisamos remover esse utensílio da lista e garantir que não haja nenhum espaço vazio deixado para trás. Para fazer isso, precisamos mover todos os utensílios que estão à direita do "utensílio encontrado" uma posição à esquerda para preencher o espaço deixado pela remoção.
//Imagine o array bikeTools da seguinte forma antes da remoção:
//bikeTools: ["garrafa de água", "kit reparação pneu", "conta-quilómetros", "alforje", "suporte para telemóvel"]
//Agora, suponhamos que queremos remover o "conta-quilómetros", que está na posição 2 (lembrando que os índices de array geralmente começam em 0).
//O loop for começa na posição 2 (índice 2) e percorre o restante dos elementos:
//Na primeira iteração, j é igual a 2. Nós copiamos o elemento na posição 3 ("alforje") para a posição 2, substituindo o "conta-quilómetros". Agora, o array fica assim:
//bikeTools: ["garrafa de água", "kit reparação pneu", "alforje", "alforje", "suporte para telemóvel"]
//Na segunda iteração, j é igual a 3. Nós copiamos o elemento na posição 4 ("suporte para telemóvel") para a posição 3, substituindo o "alforje" duplicado:
//bikeTools: ["garrafa de água", "kit reparação pneu", "suporte para telemóvel", "alforje", "suporte para telemóvel"]
//Finalmente, definimos o último elemento como nulo para indicar que não há mais utensílios na última posição:
//bikeTools: ["garrafa de água", "kit reparação pneu", "suporte para telemóvel", "alforje", null]
//Agora, o "conta-quilómetros" foi removido, e não há espaços vazios deixados para trás no array. O contador toolCount também é decrementado para refletir a remoção bem-sucedida do utensílio.

    public void removeBikeTool(String tool) {
        for (int i = 0; i < bikeToolsCount; i++) {
            if (bikeTools[i] != null && bikeTools[i].equals(tool)) {
                // Move todos os utensílios à direita do utensílio removido
                for (int j = i; j < bikeToolsCount - 1; j++) {
                    bikeTools[j] = bikeTools[j + 1];
                }
                bikeTools[bikeToolsCount - 1] = null; // Define o último elemento como nulo
                bikeToolsCount--;
                return; // Utensílio removido com sucesso
            }
        }

    }
}
