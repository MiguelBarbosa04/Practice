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
public class StreetBicycle extends Bicycle {

    private int handlebelt;
    private int frameSize;
    private String observations;
    private BrakesEnum CARBONO;
    private MaterialEnum HIDRÁULICOS;

    public StreetBicycle(int id, int numberOfGears, String mainColor, int wheelSize, BrakesEnum brakes, MaterialEnum material, double price, int guarantee, int handlebelt, int frameSize, String observations) {
        super(id, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        
        if (observations.length() <= 50) {
            this.observations = observations;
        } else {
            this.observations = observations.substring(0, 50);
        }
    }

    public int getHandlebelt() {
        return handlebelt;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public String getObservations() {
        return observations;
    }

    public void setHandleBelt(int handlebelt) {
        this.handlebelt = handlebelt;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

}
