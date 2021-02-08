package com.santiago;

public class PC {
    private int processorPower;
    private int restPower;
    private GPU graphicsCard;

    public PC(int processorPower, int restPower, GPU graphicsCard1) {
        this.processorPower = processorPower;
        this.restPower = restPower;
        this.graphicsCard = graphicsCard1;
    }

    public int getProcessorPower() {
        return processorPower;
    }

    public int getRestPower() {
        return restPower;
    }

    public GPU graphicsCard() {
        return graphicsCard;
    }

    public Reading calculateProfitableOption(){
        Reading bestReading = new Reading(0,0,0,0,0);
        for(int i=0; i<graphicsCard.getReadings().size(); i++){
            this.graphicsCard.getReadings().get(i);
        }
        return bestReading;
    }

}
