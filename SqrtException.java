import java.util.Scanner;
import java.lang.Math;
public class SqrtException {
public static void main(String[] args) {
try {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int n=sc.nextInt();
Float sqrt= (float)Math.sqrt(n);
if(sqrt.isNaN())
throw new ArithmeticException();
System.out.printf("Result is %.4f\n",sqrt);
}
catch(ArithmeticException e)
{
System.out.println ("Can't take square root of negative number");
}
  
}
}
