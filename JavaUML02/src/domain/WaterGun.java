package domain;

import helper.Utils;

public class WaterGun {
    private byte barrel;
    private byte water;

    void fill() {
        setBarrel((byte)Utils.random());
        setWater((byte)Utils.random());
    }
    
    boolean shoot() {
        return getBarrel() == getWater();
    }
    
    void next() {
        if (getBarrel() == 6) {
            setBarrel((byte)1);
        } else {
            setBarrel((byte)barrel++);
        }
    }
    
    // constructors
    public WaterGun() {
    }

    public WaterGun(byte barrel, byte water) {
        this.barrel = barrel;
        this.water = water;
    }
    
    // getters & setters
    public byte getBarrel() {
        return barrel;
    }

    public void setBarrel(byte barrel) {
        this.barrel = barrel;
    }

    public byte getWater() {
        return water;
    }

    public void setWater(byte water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "WaterGun{" + "barrel=" + barrel + ", water=" + water + '}';
    }   
    
}
