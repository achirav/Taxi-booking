package Taxii;

import java.util.Scanner;

public class Ride {
    String pickup,destination;

    Scanner dest=new Scanner(System.in);

    public void pickup_meth(){
        System.out.print("Set your pickup location: "); //take details of pickup loaction
        pickup=dest.next();
    }

    public void drop_meth(){
        System.out.print("Set your drop location: "); //take details of drop loacation
        destination=dest.next();
    }



}
