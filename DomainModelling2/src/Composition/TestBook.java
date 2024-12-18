package Composition;

public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe", "john.doe@example.com", 'M');
        Author author2 = new Author("Jane Smith", "jane.smith@example.com", 'F');
        
        Author[] authors = {author1, author2};
        
        Book book1 = new Book("Java Programming", authors, 39.99);
        
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Book Price: " + book1.getPrice());
        System.out.println("Book Quantity: " + book1.getQty());
        
        book1.setPrice(49.99);
        book1.setQty(10);
        
        System.out.println("Updated Book Price: " + book1.getPrice());
        System.out.println("Updated Book Quantity: " + book1.getQty());
        
        System.out.println("Book Details: " + book1.toString());
        
        Book book2 = new Book("Advanced Java", authors, 59.99, 5);
        
        System.out.println("Book Details: " + book2.toString());
    }
}
