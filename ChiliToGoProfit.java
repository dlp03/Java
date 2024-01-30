import java.util.Scanner;
class ChiliToGoProfit
{
  public static void main(String[] args) {
        final double ADULT_PRICE = 7;
       final double CHILD_PRICE = 4;
       int adultMeals;
       int childMeals;
       double totalAdult, totalChild, grandTotal;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter number of adult meals ordered >> ");
       adultMeals = input.nextInt();
       System.out.print("Enter number of child meals ordered >> ");
       childMeals = input.nextInt();
       totalAdult = adultMeals * ADULT_PRICE;
       totalChild = childMeals * CHILD_PRICE;
       grandTotal = totalAdult + totalChild;
       
       double adultProfit=totalAdult-adultMeals*4.35;
       
       double childProfit=totalChild-childMeals*3.10;
       
       System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
       System.out.println(" Total is " + totalAdult);
       System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + " each.");
       System.out.println(" Total is " + totalChild);
       
       System.out.println("Grand total for all meals is " + grandTotal);
       
       System.out.println("Total Adult meals profit : "+adultProfit);
       
       System.out.println("Total Child meals profit : "+childProfit);
       
       System.out.println("Grand profit : "+(adultProfit+childProfit));
   }
}