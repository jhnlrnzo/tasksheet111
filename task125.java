public class task125{
    public static void main(String[] args) {
        Vehicle kotse = new Vehicle("Toyota", "Camry", 2022, 4);
        kotse.displayDetails();
    }
}
class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Car Details: \n" + "Make: " + make + "\nModel: " + model + "\nYear: "+ year);
    }
}
class Vehicle extends Car{
    private int numberOfDoors;
    public Vehicle(String make, String model, int year,int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayDetails(){
        displayInfo();
        System.out.println("\nNumber of Doors: " + numberOfDoors);
    }
}

