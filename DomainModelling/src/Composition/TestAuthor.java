package Composition;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("John Doe", "john.doe@example.com", 'M');
        System.out.println("Name: " + author.getName());
        author.setEmail("janedoe@example.com");
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        System.out.println("Author Details: " + author.toString());
	}

}
