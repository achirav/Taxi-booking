package Taxii;

import java.util.Random;
import java.util.Scanner;

public class Customer {
    String Cname;
    int age, x, otp;
    long phone;

    Scanner input = new Scanner(System.in);

    public String Cdetails() {
        System.out.print("Enter your name: ");
        Cname = input.next();

        System.out.print("Enter your phone number: ");
        phone = input.nextLong();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        return Cname;
    }

    public void payment(){
        String pay;
        System.out.print("Cash or Card?");
        pay=input.next();
        System.out.print("Payment: "+pay);
    }

    public void display(String Cname) {

        if (age > 18) {
            System.out.println("\nLoading app......");
            System.out.println("***********************");
            System.out.println("\nWelcome " + Cname + " for our Taxi Service!\n");
            System.out.println("***********************");

            Random random = new Random();
            x = random.nextInt(9999);
            System.out.print("your OTP is : " + x);

            while (true) {
                System.out.print("\nEnter your OTP to access: ");
                otp = input.nextInt();

                if (x == otp) {
                    System.out.println("You have access!!\n");
                    break;
                } else {
                    System.out.println("Wrong OTP, Enter again! ");
                }
            }

        } else {
            System.out.println("Access denied ");
        }
    }
}
