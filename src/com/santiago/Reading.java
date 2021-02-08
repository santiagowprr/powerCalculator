package com.santiago;

public class Reading {
    private int powerConsumed;
    private int hashrate;
    private int powerLimit;
    private int coreClock;
    private int memClock;

    public Reading(int powerConsumed, int hashrate, int powerLimit, int coreClock, int memClock) {
        this.powerConsumed = powerConsumed;
        this.hashrate = hashrate;
        this.powerLimit = powerLimit;
        this.coreClock = coreClock;
        this.memClock = memClock;
    }

    public int getPowerConsumed() {
        return powerConsumed;
    }

    public int getHashrate() {
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
}
