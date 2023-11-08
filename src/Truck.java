public class Truck implements Vehicle, TruckVehicle {
    private String make;
    private String model;
    private int yearOfManufacture;
    private int cargoCapacity;
    private String transmissionType;
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    public int getCargoCapacity() {
        return this.cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getTransmissionType() {
        return this.transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
    public void printDetails() {
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year of Manufacture: " + getYearOfManufacture());
        System.out.println("Cargo Capacity: " + getCargoCapacity());
        System.out.println("Transmission Type: " + getTransmissionType());
    }
}
