package Composition;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main Street");
        System.out.println(person); 

        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());

        person.setAddress("456 Elm Street");
        System.out.println("Updated Address: " + person.getAddress());
        System.out.println(person); 
        
        Student student = new Student("Alice Smith", "789 Oak Avenue", "Computer Science", 2024, 15000.50);

        System.out.println(student); // Calls toString()
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());
        System.out.println("Fee: " + student.getFee());

        student.setProgram("Mathematics");
        student.setYear(2025);
        student.setFee(16000.75);
        
        System.out.println("Updated Student: " + student);
        
        Staff staff = new Staff("John Doe", "123 Maple Lane", "ABC High School", 50000.75);

        System.out.println(staff); // Calls toString()
        System.out.println("School: " + staff.getSchool());
        System.out.println("Pay: " + staff.getPay());

        staff.setSchool("XYZ International School");
        staff.setPay(55000.25);
        
        System.out.println("Updated Staff: " + staff);
    }

}
