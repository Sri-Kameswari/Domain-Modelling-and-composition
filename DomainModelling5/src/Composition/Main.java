package Composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder = new Cylinder(5.0, 10.0);

        System.out.println(cylinder); // Calls toString()
        System.out.println("Base radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());

        cylinder.setRadius(7.0);
        cylinder.setHeight(15.0);

        System.out.println("Updated Cylinder: " + cylinder);
        System.out.println("Updated Volume: " + cylinder.getVolume());
	}

}
