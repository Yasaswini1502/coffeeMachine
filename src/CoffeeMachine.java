import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int waterPerCup = 200;
        int milkPerCup = 50;
        int coffeePerCup = 15;

        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner scanner = new Scanner(System.in);
        int hasWater = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int hasMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int hasCoffee = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();

        int howManyCupsWater = hasWater / waterPerCup;
        int howManyCupsMilk = hasMilk / milkPerCup;
        int howManyCupsCoffee = hasCoffee / coffeePerCup;
        int cupsCanMake = Math.min(Math.min(howManyCupsWater, howManyCupsMilk), howManyCupsCoffee);
        int howMoreCups = cupsCanMake - cupsNeeded;

        if (howMoreCups == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (howMoreCups > 0) {
            System.out.println("Yes, I can make that amount of coffee (and even " + howMoreCups + " more than that)");
        } else if (howMoreCups < 0) {
            System.out.println("No, I can make only " + cupsCanMake + " cup(s) of coffee");
        }
    }
}