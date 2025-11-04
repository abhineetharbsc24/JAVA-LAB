// Demonstrates Inheritance, Method Overriding, and use of 'super' keyword

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Top Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int speed, int doors, int batteryCapacity) {
        super(brand, speed, doors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Tata", 180);
        Car c = new Car("Hyundai", 220, 4);
        ElectricCar e = new ElectricCar("Tesla", 250, 4, 100);

        System.out.println("Vehicle Details:");
        v.displayInfo();

        System.out.println("\nCar Details:");
        c.displayInfo();

        System.out.println("\nElectric Car Details:");
        e.displayInfo();
    }
}