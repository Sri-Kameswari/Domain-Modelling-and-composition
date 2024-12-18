package Composition;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", 20);
        System.out.println(customer.toString());
        
        customer.setDiscount(25);
        System.out.println("Updated Discount: " + customer.getDiscount() + "%");
    }

}
