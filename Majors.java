import java.util.Scanner;

public class Majors {
    public enum majors {ACC, CHEM, CIS, ENG, HIS, PHYS}

    public static void main(String args[]){
        System.out.println("College majors are: ");
        for(majors m: majors.values()){
            System.out.println(m);
        }
        System.out.print("Enter a major: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equals("ACC") || input.equals("CIS")){
            System.out.println("Business Division");
        }
        else if(input.equals("CHEM") || input.equals("PHYS")){
            System.out.println("Science Division");
        }
        else if(input.equals("ENG") || input.equals("HIS")){
            System.out.println("Humanities Division");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}