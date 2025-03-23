import Taxii.Customer;
import Taxii.Driver;
import Taxii.Ride;
import Taxii.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
            ride.pickup_meth();
            ride.drop_meth();
        } else {
            System.exit(0);
        }

        String out = driv.driver();
    }
}