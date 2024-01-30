import java.util.Scanner;

public class RetirementGoal {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many years until retirement? >>");
        int numYears = scnr.nextInt();
        while (numYears <= 0) {
            System.out.println("Years cannot be 0 or negative. Reenter years:");
            numYears = scnr.nextInt();
        }
        System.out.println("How much can you save annually?>>");
        int annualSavings = scnr.nextInt();
        while (annualSavings <= 0) {
            System.out.println("Amount cannot be 0 or negative. Reenter amount to save annually:");
            annualSavings = scnr.nextInt();
        }
        int finalAmount = annualSavings * numYears;
        System.out.printf("If you save $%d for %d years, you will have $%d\n", annualSavings, numYears, finalAmount);
    }
}
