package Taxii;

import java.util.Scanner;

public class Customer {
    String Cname,Cage;

    Scanner input=new Scanner(System.in);

    public String Cdetails(){
        System.out.print("Enter your name: ");
        Cname=input.next();

        System.out.print("Enter your age: ");
        Cage=input.next();

        return Cname;
    }

    public void display(String Cname){

        System.out.println("***********************");
        System.out.println("Welcome to Taxi service");
        System.out.println("***********************");
        System.out.println("\nWelcome "+Cname);
    }
}
