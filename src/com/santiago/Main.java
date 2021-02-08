package com.santiago;

import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("calculator");
        System.out.println("Insert Processor power");
        int processorPower = scanner.nextInt();

        System.out.println("Insert power of the rest of hardware");
        int restPower = scanner.nextInt();

        GPU grafa1 = new GPU();

        PC komp = new PC(processorPower, restPower, grafa1);

        System.out.println("What do you want to do?\n" +
                "1 - Insert new reading\n" +
                "2 - Find the most profitable option" +
                "0 - exit");
        int userChoice = scanner.nextInt();

        while (userChoice != 0) {
            if (userChoice == 1) {
                System.out.println("Power Consumed in W:");
                int powerConsumed = scanner.nextInt();

                System.out.println("Hashrate in MH/s:");
                int hashrate = scanner.nextInt();

                System.out.println("Insert data from Afterburner:\n");

                System.out.println("Power Limit in %:");
                int powerLimit = scanner.nextInt();

                System.out.println("Core Clock in MHz:");
                int coreClock = scanner.nextInt();

                System.out.println("Memory Clock in MHz:");
                int memClock = scanner.nextInt();


                Reading reading = new Reading(powerConsumed, hashrate, powerLimit, coreClock, memClock);
                grafa1.addReading(reading);

            } else {
                Reading bestReading = komp.calculateProfitableOption();
                System.out.println("The best option is:\n" +
                        "Hashrate: " + bestReading.getHashrate() +
                        "Power Consumption: " + bestReading.getPowerConsumed() +
                        "Power Limit: " + bestReading.getPowerLimit() +
                        "Core Clock: " + bestReading.getCoreClock() +
                        "Memory Clock: " + bestReading.getMemClock());
            }
        }
    }
}
