package Constructor;
public class Constructor2 {
    private String make;
    private String model;
    private int year;

    // Constructor to initialize make, model, and year
    public Constructor2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters and setters omitted for brevity

    public static void main(String[] args) {
        // Creating objects of Car class using constructor
    	Constructor2 car1 = new Constructor2("Toyota", "Camry", 2020);
    	Constructor2 car2 = new Constructor2("Honda", "Civic", 2019);

        // Accessing object properties
        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.year);
    }
}