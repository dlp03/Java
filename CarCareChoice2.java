import java.util.Scanner;
public class CarCareChoice2 {

   public static void main(String[] args) {

       Scanner scanner = null;
       try {
           scanner = new Scanner(System.in);

           System.out.println("Available Services:");
           System.out
                   .println(" oil change\n tire rotation\n battery check\n or brake inspection");
           System.out.print("Enter the choice:");
           String choiceOfService = scanner.nextLine();

           if ("oil change".contains(choiceOfService.substring(0, 3))) {
               System.out
                       .println("You Selected oil change and it price is $25");
           } else if ("tire rotation".contains(choiceOfService.substring(0, 3))) {
               System.out
                       .println("You Selected tire rotation and it price is $22");
           } else if ("battery check".contains(choiceOfService.substring(0, 3))) {
               System.out
                       .println("You Selected battery check and it price is $15");
           } else if ("brake inspection".contains(choiceOfService.substring(0, 3))) {
               System.out
                       .println("You Selected brake inspection and it price is $5");
           } else {
               System.out.println("Error! Invalid entry");
           }

       } catch (Exception e) {
          
       }
   }
}