import java.util.Scanner;

public class Dollars {
    public static void main(String[] args)
    {
        int dollars;
        int twenties, tens, fives, ones, amount;
        final int Twenties = 20;
        final int Tens = 10;
        final int Fives = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of dollars ");
        dollars = input.nextInt();
        twenties = dollars / Twenties;
        amount = dollars - (twenties * Twenties);
        tens = amount / Tens;
        amount = amount - (tens * Tens);
        fives = amount / Fives;
        amount = amount - (fives * Fives);
        ones = amount;
        System.out.println("$" + dollars + " converted is "	+
                twenties + " $20s, " + tens + " $10s, " + fives +
                " $5s, and " + ones + " $1s");
    }
}
