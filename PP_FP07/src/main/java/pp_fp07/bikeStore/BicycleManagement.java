/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikeStore;

/**
 *
 * @author Miguel
 */
public class BicycleManagement {

    private Bicycle[] bicycles;
    private int capacity; //Capacidade máxima de armazenamento 
    private int count;

    public BicycleManagement(int capacity) {

        this.capacity = 1;
        this.count = 0;
        this.bicycles = new Bicycle[capacity];
    }

    public void updateCapacity() {
        if (count == capacity) {
            capacity *= 2;
            System.out.println("A capacidade de armazenamento foi autalizada para o drobro " + capacity * 2);
        }
    }

    public void addBicycle(Bicycle bicycle) {
        updateCapacity();
        if (count < capacity) {
            bicycles[count++] = bicycle;
            System.out.println("Bike adicionada com sucesso");
        } else {
            System.out.println("Capacidade de armazenamento cheio");
        }

    }

    public void removeBicycle(int bicycleId) {
        for (int i = 0; i < count; i++) {
            if (bicycles[i].getId() == bicycleId) {
                bicycles[i] = null;
                count--;
                System.out.println("Bike removida com sucesso");
                break; // Interrompe a iteração após remover a bicicleta
            } else {
                System.out.println("Bike com o ID" + bicycleId + " não encontrada");
            }
        }

    }

    public void listBicycle() {
        System.out.println("Informação das bikes registadas:");
        for (int i = 0; i < count; i++) {
            Bicycle bicycle = bicycles[i];
            String bikeType;
            if (bicycle instanceof MountainBicycle) {
                bikeType = "Mountain";
            } else {
                bikeType = "Street";
            }
            System.out.println("ID: " + bicycles[i].getId() + ", Tipo: " + bikeType);
        }
    }

    public void listMountainBicycle() {
        System.out.println("Bicicletas de montanha;");
        for (int i = 0; i < count; i++) {
            if (bicycles[i] instanceof MountainBicycle) {
                String bikeType = "Mountain";
                System.out.println("ID: " + bicycles[i].getId() + ", Tipo: " + bikeType);
            }
        }
    }

}
