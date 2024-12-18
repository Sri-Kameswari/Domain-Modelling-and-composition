package Composition;

public class Invoice {
    
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        return "Invoice[ID=" + id + ", Customer=" + customer.toString() + ", Amount=" + amount + "]";
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", 20);
        Invoice invoice = new Invoice(101, customer, 1000.0);

        System.out.println(invoice.toString());
        System.out.println("Customer ID: " + invoice.getCustomerId());
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Customer Discount: " + invoice.getCustomerDiscount() + "%");
        System.out.println("Amount Before Discount: " + invoice.getAmount());
        System.out.println("Amount After Discount: " + invoice.getAmountAfterDiscount());
    }
}
