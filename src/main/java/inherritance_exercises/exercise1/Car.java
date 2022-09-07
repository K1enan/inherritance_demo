package inherritance_exercises.exercise1;

public class Car extends Vehicle {

    int numberOfDoors = 4;
    int numberOfPassengers = 4;

    public Car() {
        super();
    }

    public Car(int vehicleId, String registrationNumber, String brand, int numberOfDoors, int numberOfPassengers) {
        super(vehicleId, registrationNumber, brand);
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Car(int vehicleId, String registrationNumber, String brand) {
        super(vehicleId, registrationNumber, brand);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String drive() {

        return "Car with brand: " + getBrand() + " ,Vehicle ID: " + getVehicleId() + " ,Registration Number: " + getRegistrationNumber() + " ,No of Doors: " + getNumberOfDoors() + " ,No of passengers: " + getNumberOfPassengers() + " is driving";
    }

}
