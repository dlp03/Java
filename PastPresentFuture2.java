import java.time.LocalDate;
import java.util.Scanner;
public class PastPresentFuture2
{
public static void main(String args[])
{
int mo,da,yr;
LocalDate today=LocalDate.now();
Scanner input=new Scanner(System.in);

System.out.print("Enter a month >>");
mo=input.nextInt();
System.out.print("Enter a day >>");
da=input.nextInt();
System.out.print("Enter a year (four digits) >>");
yr=input.nextInt();

System.out.println(+mo+"/"+da+"/"+yr);

LocalDate inputDate=null;
try
{

inputDate = LocalDate.of(yr,mo,da);
  
}
catch(Exception ex)
{

System.out.println("You have made invalid entries, please try again !!");
System.exit(0);
}

System.out.print("The date you entered is ");
if(inputDate.isBefore(today))
System.out.println("in the past.");
else
if(inputDate.isAfter(today))
System.out.println("in the future.");
else
if(inputDate.equals(today))
System.out.println("the current date.");


}
}

