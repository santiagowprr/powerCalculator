package com.santiago;

import java.util.ArrayList;

public class GPU {
    private String name;
    private int price;
    private ArrayList<Reading> readings;

    public GPU() {
        this.name = "GTX 1060";
        this.price = 900;
        this.readings = new ArrayList<Reading>();
    }

    public boolean addReading(Reading reading){
        this.readings.add(reading);
        return true;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Reading> getReadings() {
        return readings;
    }
}
