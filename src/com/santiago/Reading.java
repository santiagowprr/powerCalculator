package com.santiago;

public class Reading {
    private int powerConsumed;
    private double hashrate;
    private int powerLimit;
    private int coreClock;
    private int memClock;

    public Reading(int powerConsumed, double hashrate, int powerLimit, int coreClock, int memClock) {
        this.powerConsumed = powerConsumed;
        this.hashrate = hashrate;
        this.powerLimit = powerLimit;
        this.coreClock = coreClock;
        this.memClock = memClock;
    }

    public int getPowerConsumed() {
        return powerConsumed;
    }

    public double getHashrate() {
        return hashrate;
    }

    public int getPowerLimit() {
        return powerLimit;
    }

    public int getCoreClock() {
        return coreClock;
    }

    public int getMemClock() {
        return memClock;
    }

    public void setPowerConsumed(int powerConsumed) {
        this.powerConsumed = powerConsumed;
    }

    public void setHashrate(double hashrate) {
        this.hashrate = hashrate;
    }

    public void setPowerLimit(int powerLimit) {
        this.powerLimit = powerLimit;
    }

    public void setCoreClock(int coreClock) {
        this.coreClock = coreClock;
    }

    public void setMemClock(int memClock) {
        this.memClock = memClock;
    }
}
