// Parent class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        displayBrand();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.displayDetails();
    }
}
