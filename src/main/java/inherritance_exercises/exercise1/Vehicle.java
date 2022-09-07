package inherritance_exercises.exercise1;

public abstract class Vehicle {

    String brand = "Volvo";
    String registrationNumber = "ABC123";
    int vehicleId = 1;

    public Vehicle() {

    }

    public Vehicle(int vehicleId, String registrationNumber, String brand) {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract String drive();

}
