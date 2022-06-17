import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int waterPerCup = 200;
        int milkPerCup = 50;
        int beansPerCup = 15;

        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(waterPerCup * cups + " ml of water");
        System.out.println(milkPerCup * cups + " ml of milk");
        System.out.println(beansPerCup * cups + " g of coffee beans");
    }
}