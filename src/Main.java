import Taxii.Customer;
import Taxii.Driver;
import Taxii.Ride;
import Taxii.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int user_pin;
        String vehciletype = "";


        Scanner inpt = new Scanner(System.in);

        Customer customerDetail = new Customer();
        Ride ride = new Ride();
        Driver driv = new Driver();


        System.out.println("***********************");
        System.out.println("Welcome to Taxi service");
        System.out.println("***********************\n");

        String disp = customerDetail.Cdetails();
        customerDetail.display(disp);

        System.out.print("Do you need a ride? ");
        String answr = inpt.next();


        if (answr.equalsIgnoreCase("y")) {
            System.out.print("Choose vehicle for ride: ");
            vehciletype=inpt.next();
            customerDetail.payment();
            ride.pickup_meth();
            ride.drop_meth();
        } else {
            System.exit(0);
        }

        driv.driver();
        System.out.println("You chose : "+vehciletype);

        int driver_pin= driv.pin_detail();
        System.out.println("\n***********************");
        System.out.println("Driver's POV");
        System.out.println("***********************");
        System.out.print("\nEnter driver's pin: ");
        user_pin=inpt.nextInt();
        System.out.println("\n***********************");

        while (true){
            if (user_pin == driver_pin) {
                System.out.print("Journey Begin!! Enjoy your ride!!");
                break;
            } else {
                System.out.print("Wrong Input!! Enter again: ");
                user_pin=inpt.nextInt();
                continue;
            }
        }
    }
}