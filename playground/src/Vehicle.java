public abstract class Vehicle {
    private String color;
    private int year;
    private String make;
    private String model;

    public Vehicle(String color, int year, String make, String model) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public void drive() {
        System.out.println("Vehicle is moving");
    }

    public void stop() {
        System.out.println("Vehicle is stopped");
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}
