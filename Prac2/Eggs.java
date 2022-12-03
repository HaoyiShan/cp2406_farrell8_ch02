import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){
        int Dozen = 12;
        double PriceDozen = 3.25;
        double PriceIndividual = 0.45;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter the number of eggs >> ");
        int NumberEggs = inputDevice.nextInt();
        int NumberIndividual = NumberEggs % Dozen;
        int NumberDozen =  NumberEggs / Dozen;
        double total = (NumberDozen * PriceDozen) + (NumberIndividual * PriceIndividual);
        System.out.println("You ordered " + NumberEggs + " eggs. That's " + NumberDozen + " dozen at $3.25 per dozen and "
        + NumberIndividual + " loose eggs at 45 cents each for a total of $" + total + ".");
    }
}
