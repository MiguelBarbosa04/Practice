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
public class Bicycle {

    private int id;
    private int numberOfGears;
    private String mainColor;
    private int wheelSize;
    private BrakesEnum brakes;
    private MaterialEnum material;
    private double price;
    private int guarantee;
    private static int countID = 0;

    public Bicycle(int id, int numberOfGears, String mainColor, int wheelSize, BrakesEnum brakes, MaterialEnum material, double price, int guarantee) {
        this.id = countID++;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guarantee = guarantee;

    }

    public int getId() {
        return id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public BrakesEnum getBrakes() {
        return brakes;
    }

    public MaterialEnum getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    public int GetGuarantee() {
        return guarantee;
    }

    public void SetNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void SetMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public void SetWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void SetBrakes(BrakesEnum brakes) {
        this.brakes = brakes;
    }

    public void SetMaterial(MaterialEnum material) {
        this.material = material;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public void SetGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }
}
