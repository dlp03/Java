import java.util.Scanner;

public class ShadyRestRoom {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("(1) Queen bed");
                System.out.println("(2) King bed");
                System.out.println("(3) Suite with a king bed and pull-out couch");
                System.out.print("Enter Selection (1, 2 , or 3) >> ");
                int ch = sc.nextInt();
                int price = 0;
                if (ch == 1) {
                        System.out.print("You selected Queen bed ");
                        price = 125;
                } else if (ch == 2) {
                        System.out.print("You selected King bed ");
                        price = 139;
                } else if (ch == 3) {
                        System.out.print("You selected King bed and pull-out couch");
                        price = 165;
                } else {
                        System.out.println("You selected an invalid option $0");
                        return;
                }
                System.out.println("$" + price);
        }
}
