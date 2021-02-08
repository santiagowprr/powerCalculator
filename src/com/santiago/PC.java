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
        int basePcPower = processorPower + restPower;   // power of PC without GPU

        for(int i=0; i<graphicsCard.getReadings().size(); i++){
            int currentPowerConsumed = this.graphicsCard.getReadings().get(i).getPowerConsumed();
            double currentHashrate = this.graphicsCard.getReadings().get(i).getHashrate();
            double currentProfitability = (currentHashrate * 2) / (basePcPower + (currentPowerConsumed * 2)); //  multiplying hashrate and power consumed by 2, cause there are 2 GPUs
            double bestProfitability = (bestReading.getHashrate()*2) / (basePcPower + (bestReading.getPowerConsumed() * 2));

            if (currentProfitability > bestProfitability){
                int powerLimit = this.graphicsCard.getReadings().get(i).getPowerLimit();
                int coreClock = this.graphicsCard.getReadings().get(i).getCoreClock();
                int memClock = this.graphicsCard.getReadings().get(i).getMemClock();
                bestReading.setPowerConsumed(currentPowerConsumed);
                bestReading.setHashrate(currentHashrate);
                bestReading.setPowerLimit(powerLimit);
                bestReading.setCoreClock(coreClock);
                bestReading.setMemClock(memClock);
            }
        }
        return bestReading;
    }
}
