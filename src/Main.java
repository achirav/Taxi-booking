import Taxii.Customer;

public class Main {
    public static void main(String[] args) {

        Customer customerDetail=new Customer();

        System.out.println("***********************");
        System.out.println("Welcome to Taxi service");
        System.out.println("***********************");

        String disp=customerDetail.Cdetails();
        customerDetail.display(disp);
    }
}