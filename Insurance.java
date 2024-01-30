import java.util.Scanner;

public class Insurance
{
public static int premium(int curr, int birth)
{
int age = curr - birth;
       int decades = age/10;
      
       return (decades+15)*20;
}
   public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
      
       System.out.print("Enter current year: ");
       int curr = sc.nextInt();
      
       System.out.print("Enter birth year: ");
       int birth = sc.nextInt();
      
      
       System.out.println("$"+premium(curr, birth));
      
      
      
   }
}
