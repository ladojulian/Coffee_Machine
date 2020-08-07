package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

        /*System.out.println("Write how many cups of coffee you will need:");
        var scanner = new Scanner(System.in);

        var cups = scanner.nextInt();

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(cups * 200 +" ml of water");
        System.out.println(cups * 50 + " ml of milk");
        System.out.println(cups * 15 +" g of coffee beans");*/

        /*System.out.println("Write how many ml of water the coffee machine has:");
        var scanner = new Scanner(System.in);

        var water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        var milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        var coffeeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        var cups = scanner.nextInt();

        var waterCups = water / 200;
        var milkCups = milk / 50;
        var coffeeBeansCups = coffeeBeans / 15;

        var n = 0;
        if(waterCups <= milkCups && waterCups <= coffeeBeansCups) {
            n = waterCups;
        } else if(milkCups <= waterCups && milkCups <= coffeeBeansCups) {
            n = milkCups;
        } else {
            n = coffeeBeansCups;
        }

        if(n == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if(n < cups) {
            System.out.println("No, I can make only " + n + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (n - cups) +" more than that)");
        }*/

        var water = 400;
        var milk = 540;
        var coffeeBeans = 120;
        var cups = 9;
        var money = 550;

        var scanner = new Scanner(System.in);

        printOptions();
        var option = scanner.next();
        while (!option.equals("exit")) {
            switch(option) {
                case "remaining":
                    print(water, milk, coffeeBeans, cups, money);
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    var isBack = false;
                    var waterToUse = 0;
                    var milkToUse = 0;
                    var coffeeBeansToUse = 0;
                    var moneyToEarn = 0;
                    switch (scanner.next()) {
                        case "1":
                            waterToUse = 250;
                            coffeeBeansToUse = 16;
                            moneyToEarn = 4;
                            break;
                        case "2":
                            waterToUse = 350;
                            milkToUse = 75;
                            coffeeBeansToUse = 20;
                            moneyToEarn = 7;
                            break;
                        case "3":
                            waterToUse = 200;
                            milkToUse = 100;
                            coffeeBeansToUse = 12;
                            moneyToEarn = 6;
                            break;
                        case "back":
                            isBack = true;
                    }

                    if(!isBack) {
                        if (water < waterToUse) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < milkToUse) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeBeans < coffeeBeansToUse) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (cups == 0) {
                            System.out.println("Sorry, not enough disposable cups!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= waterToUse;
                            milk -= milkToUse;
                            coffeeBeans -= coffeeBeansToUse;
                            money += moneyToEarn;
                            cups--;
                        }
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    coffeeBeans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += scanner.nextInt();

                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money -= money;
            }

            printOptions();
            option = scanner.next();
        }
    }

    private static void print(int water, int milk, int coffeeBeans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    private static void printOptions() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }
}
