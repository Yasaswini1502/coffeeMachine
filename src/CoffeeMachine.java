import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATER_AT_START = 400;
    private static final int MILK_AT_START = 540;
    private static final int COFFEE_AT_START = 120;
    private static final int CUPS_AT_START = 9;
    private static final int MONEY_AT_START = 550;

    private static final int CUPS_LEFT = 8;
    private static final int MONEY_LEFT = 0;

    public static void main(String[] args) {
        printMachineState(WATER_AT_START, MILK_AT_START, COFFEE_AT_START, CUPS_AT_START, MONEY_AT_START);
        System.out.println();
        System.out.println("Write action (buy, fill, take):");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        switch (action) {
            case "take":
                take();
                break;
            case "fill":
                fill(scanner);
                break;
            case "buy":
                buy(scanner);
                break;
            default:
                break;
        }
    }

    private static void take() {
        System.out.println("I gave you $" + MONEY_AT_START);
        System.out.println();
        printMachineState(WATER_AT_START, MILK_AT_START, COFFEE_AT_START, CUPS_AT_START, MONEY_LEFT);
    }

    private static void fill(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        addWater = WATER_AT_START + addWater;
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        addMilk = MILK_AT_START + addMilk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffee = scanner.nextInt();
        addCoffee = COFFEE_AT_START + addCoffee;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = scanner.nextInt();
        addCups = CUPS_AT_START + addCups;
        System.out.println();
        printMachineState(addWater, addMilk, addCoffee, addCups, MONEY_AT_START);
    }

    private static void buy(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int coffeeType = scanner.nextInt();
        switch (coffeeType) {
            case 1:
                espresso();
                break;
            case 2:
                latte();
                break;
            case 3:
                cappuccino();
                break;
            default:
                break;
        }
    }

    private static void printMachineState(int water, int milk, int coffee, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    private static void espresso() {
        int waterNeed = 250;
        int milkNeed = 0;
        int coffeeNeed = 16;
        int cost = 4;

        printCoffee(waterNeed, milkNeed, coffeeNeed, cost);
    }

    private static void latte() {
        int waterNeed = 350;
        int milkNeed = 75;
        int coffeeNeed = 20;
        int cost = 7;

        printCoffee(waterNeed, milkNeed, coffeeNeed, cost);
    }

    private static void cappuccino() {
        int waterNeed = 200;
        int milkNeed = 100;
        int coffeeNeed = 12;
        int cost = 6;

        printCoffee(waterNeed, milkNeed, coffeeNeed, cost);
    }

    private static void printCoffee(int waterNeed, int milkNeed, int coffeeNeed, int cost) {
        int waterLeft = WATER_AT_START - waterNeed;
        int milkLeft = MILK_AT_START - milkNeed;
        int coffeeLeft = COFFEE_AT_START - coffeeNeed;
        int moneyLeft = MONEY_AT_START + cost;

        System.out.println();
        printMachineState(waterLeft, milkLeft, coffeeLeft, CUPS_LEFT, moneyLeft);
    }
}