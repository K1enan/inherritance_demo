package inherritance_exercises.exercise1;

public class Motorcycle extends Vehicle {

    String motorcycleType;

    public Motorcycle() {
        super();
    }

    public Motorcycle(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public Motorcycle(int vehicleId, String registrationNumber, String brand, String motorcycleType) {
        super(vehicleId, registrationNumber, brand);
        this.motorcycleType = motorcycleType;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public String drive() {
        return "Motorcycle with brand: " + getBrand() + " ,Vehicle ID: " + getVehicleId() + " ,Registration Number: " + getRegistrationNumber() + " ,Type: " + getMotorcycleType() + " is driving";
    }

}
