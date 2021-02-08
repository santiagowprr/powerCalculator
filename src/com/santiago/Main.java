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
        System.out.println(grafa1.getName());

        PC komp = new PC(processorPower, restPower, grafa1);

        int userChoice = 10;

        while (userChoice != 0) {
            System.out.println("What do you want to do?\n" +
                    "1 - Insert new reading\n" +
                    "2 - Find the most profitable option" +
                    "0 - exit");
            userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("Power Consumed in W:");
                int userPowerConsumed = scanner.nextInt();

                System.out.println("Hashrate in MH/s:");
                double userHashrate = scanner.nextDouble();

                System.out.println("Insert data from Afterburner:\n");

                System.out.println("Power Limit in %:");
                int userPowerLimit = scanner.nextInt();

                System.out.println("Core Clock in MHz:");
                int userCoreClock = scanner.nextInt();

                System.out.println("Memory Clock in MHz:");
                int userMemClock = scanner.nextInt();


                Reading reading = new Reading(userPowerConsumed, userHashrate, userPowerLimit, userCoreClock, userMemClock);
                System.out.println(reading.getHashrate());
                if (grafa1.addReading(reading)){
                    System.out.println("Reading added successfully!");
                }

            } else {
                Reading bestReading = komp.calculateProfitableOption();
                System.out.println("The best option is:\n" +
                        "\nHashrate: " + bestReading.getHashrate() +
                        "\nPower Consumption: " + bestReading.getPowerConsumed() +
                        "\nPower Limit: " + bestReading.getPowerLimit() +
                        "\nCore Clock: " + bestReading.getCoreClock() +
                        "\nMemory Clock: " + bestReading.getMemClock());
            }
        }
    }
}
