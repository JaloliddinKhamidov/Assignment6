public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("---------------------");
        car.setMake("Toyota");
        car.setModel("CHR");
        car.setYearOfManufacture(2020);
        car.setNumberOfDoors(4);
        car.setFuelType("Petrol");
        car.printDetails();

        Motorcycle motorcycle = new Motorcycle();
        System.out.println("---------------------");
        motorcycle.setMake("Yamaha");
        motorcycle.setModel("CBR");
        motorcycle.setYearOfManufacture(2019);
        motorcycle.setNumberOfWheels(2);
        motorcycle.setType("Sport");
        motorcycle.printDetails();

        Truck truck = new Truck();
        System.out.println("---------------------");
        truck.setMake("Ford");
        truck.setModel("F-150");
        truck.setYearOfManufacture(2021);
        truck.setCargoCapacity(2);
        truck.setTransmissionType("Automatic");
        truck.printDetails();
    }
}