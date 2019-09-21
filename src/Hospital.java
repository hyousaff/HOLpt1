// Hamza Yousaf
// 9/20/2019
// Program displays a hospital list after getting data input from the user

import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter last name ");

        String s1 = input.nextLine();

        System.out.print("Enter first name ");

        String s2 = input.nextLine();

        System.out.print("Enter address ");

        String address = input.nextLine();

        System.out.print("Enter city ");

        String city = input.nextLine();

        System.out.print("Enter state ");

        String state = input.nextLine();

        System.out.print("Enter zip ");

        String zip = input.nextLine();

        System.out.print("Enter amount owed ");

        String amount = input.nextLine();

        System.out.print("Enter payment amount ");

        String payment = input.nextLine();

        System.out.print("Enter payment date ");

        String date = input.nextLine();

        System.out.printf("%80s\n", "XYZ Community Hospital");

        System.out.printf(String.format("%150s\n", "").replace(' ', '='));

        System.out.printf("%10s%30s%80s\n", "Name", "Address", "Payment Information");

        System.out.printf("%-8s %-12s %-30s %-15s %-5s %-10s %-15s %-15s %-15s \n", "Last", "First", "Address Line 1", "City", "State", "Zip", "Amount Owed",

                "Payment Amt.", "Payment Date");

        System.out.printf(String.format("%150s\n", "").replace(' ', '='));

        System.out.printf("%-8s %-12s %-30s %-15s %-5s %-10s %-15s %-15s %-15s \n", s1, s2, address, city, state, zip, amount, payment, date);

        input.close();

    }

}
