package Composition;

public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe", "john.doe@example.com", 'M');

        Book book1 = new Book("Java Programming", author1, 39.99);
        
        System.out.println("Testing Getters (Book 1):");
        System.out.println("Book Name: " + book1.getName()); 
        System.out.println("Author: " + book1.getAuthor()); 
        System.out.println("Price: " + book1.getPrice()); 
        System.out.println("Quantity: " + book1.getQty()); 

        book1.setPrice(29.99);
        book1.setQty(100);

        System.out.println("\nTesting Setters (Book 1):");
        System.out.println("Updated Price: " + book1.getPrice()); 
        System.out.println("Updated Quantity: " + book1.getQty()); 

        System.out.println("\nTesting toString (Book 1):");
        System.out.println(book1.toString()); 

        Author author2 = new Author("Alice Smith", "alice.smith@example.com", 'F');
        Book book2 = new Book("Advanced Java", author2, 49.99, 200);

        System.out.println("\nTesting Getters and toString (Book 2):");
        System.out.println("Book Name: " + book2.getName()); 
        System.out.println("Author: " + book2.getAuthor()); 
        System.out.println("Price: " + book2.getPrice()); 
        System.out.println("Quantity: " + book2.getQty()); 

        System.out.println("\nTesting toString (Book 2):");
        System.out.println(book2.toString()); 
    }
}

