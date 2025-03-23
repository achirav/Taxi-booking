package Taxii;

import java.util.Random;

public class Driver {
    int name;

    String [] riders={"Sanath","Santha","lakmal","Sarath"};

    Random rand=new Random();

    public String driver(){

        name=rand.nextInt(riders.length);

        System.out.println("Your driver is "+riders[name]);

        return riders[name];
    }
}
