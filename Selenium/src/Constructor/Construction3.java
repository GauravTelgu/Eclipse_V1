package Constructor;
public class Construction3 {
    private String make;
    private String model;
    private int year;

    // Constructor to initialize make, model, and year
    public Construction3(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        
        System.out.println(this.make + " " + this.model + " " + this.year);
       // System.out.println(this.model);
        //System.out.println(this.year);
        
    }

    // Getters and setters omitted for brevity

    public static void main(String[] args) {
        // Creating objects of Car class using constructor
    	new Construction3("Toyota", "Camry", 2020);
    	new Construction3("Honda", "Civic", 2019);

       
    }
}