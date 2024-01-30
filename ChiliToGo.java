import java.util.Scanner;

class ChiliToGo{ 
    public static void main(String[] args) {
        
        double adult_meal = 7.0;
        double child_meal = 4.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of adult meals offered >> ");
        int num_adult = sc.nextInt();
        System.out.print("Enter number of child meals offered >> ");
        int num_child = sc.nextInt();

        double adult_meal_price = num_adult * adult_meal;
        double child_meal_price = num_child * child_meal;
        double grand_total = adult_meal_price + child_meal_price;

        System.out.println(num_adult+" adult meals were ordered at "+adult_meal+" each.");
        System.out.println("\tTotal is "+adult_meal_price);
        System.out.println(num_child+" child meals were ordered at "+child_meal+" each.");
        System.out.println("\tTotal is "+child_meal_price);
        System.out.print("Grand total for all meals is "+grand_total);
    }
}