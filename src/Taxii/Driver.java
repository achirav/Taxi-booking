package Taxii;

import java.util.Random;

public class Driver {
    int name,pin;

    String [] riders={"Sanath","Santha","lakmal","Sarath"};

    Random rand=new Random();

    public void driver(){

        name=rand.nextInt(riders.length);

        System.out.println("\nYour driver is "+riders[name]);

    }

    public int pin_detail(){
        pin=rand.nextInt(9999);
        System.out.print("\nYour pin is "+pin);

        return pin;
    }
}
