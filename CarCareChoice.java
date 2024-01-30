import java.util.Scanner;
public class CarCareChoice {

   public static void main(String[] args) {

       Scanner scanner = null;
       try {
           scanner = new Scanner(System.in);

           System.out.println("Available Services:");
           System.out
                   .println(" oil change\n tire rotation\n battery check\n or brake inspection");
           System.out.print("Enter the choice:");
           String choiceOfService = scanner.nextLine();

           if ("oil change".equals(choiceOfService)) {
               System.out.println("You Selected " + choiceOfService
                       + " and it price is $25");
           } else if ("tire rotation".equals(choiceOfService)) {
               System.out.println("You Selected " + choiceOfService
                       + " and it price is $22");
           } else if ("battery check".equals(choiceOfService)) {
               System.out.println("You Selected " + choiceOfService
                       + " and it price is $15");
           } else if ("brake inspection".equals(choiceOfService)) {
               System.out.println("You Selected " + choiceOfService
                       + " and it price is $5");
           } else {
               System.out.println("Error! Invalid entry");
           }

       } catch (Exception e) {
       
       }
   }
}