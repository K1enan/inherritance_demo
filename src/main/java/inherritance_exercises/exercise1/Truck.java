package inherritance_exercises.exercise1;

public class Truck extends Vehicle {

    int maxSpeed = 180;
    int maxWeight = 80000;

    public Truck() {

        super();
    }

    public Truck(int maxSpeed, int maxWeight) {
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public Truck(int vehicleId, String registrationNumber, String brand, int maxSpeed, int maxWeight) {
        super(vehicleId, registrationNumber, brand);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String drive() {

        return "Truck with brand: " + getBrand() + " ,Vehicle ID: " + getVehicleId() + " ,Registration Number: " + getRegistrationNumber() + " ,MaxSpeed: " + getMaxSpeed() + " ,MaxWeight: " + getMaxWeight() + " is driving";
    }


}
