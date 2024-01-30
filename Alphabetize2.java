import java.util.Scanner;

public class Alphabetize2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2, str3;

        System.out.print("Enter first string: ");
        str1 = scanner.next();

        System.out.print("Enter second string: ");
        str2 = scanner.next();

        System.out.print("Enter third string: ");
        str3 = scanner.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();
        
        if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0) {

        System.out.println(str1);

        if (str2.compareTo(str3) < 0) {
        System.out.println(str2);
        System.out.println(str3);
        } else {
        System.out.println(str3);
        System.out.println(str2);
                        }
                }

        else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0) {
        System.out.println(str2);
                      
        if (str1.compareTo(str3) < 0) {
        System.out.println(str1);
        System.out.println(str3);
        } else {
        System.out.println(str3);
        System.out.println(str1);
    }
        } else {
                    
        System.out.println(str3);

        if (str1.compareTo(str2) < 0) {
        System.out.println(str1);
        System.out.println(str2);
        } else {
        System.out.println(str2);
        System.out.println(str1);
                        }
                }
        }
}