public class Car{
    String carModel;
    String engineType;
    int noOfAirBags;
    int noOfDoors;

    // No-argument constructor. This explicit constructor prints a message when it is called.
    // If a class declares no constructors, the compiler provides a no-argument default constructor.
    Car(){
        System.err.println("This is default constructor");
    }

    // Parameterized constructor: initializes the fields from the supplied arguments.
    Car(String model, String engine, int airBag, int doors){
        this.carModel = model;
        this.engineType = engine;
        this.noOfAirBags = airBag;
        this.noOfDoors = doors;
    }

    // Copy constructor: initializes a new Car with the field values of another Car object.
    Car(Car otherCar){
        this.carModel = otherCar.carModel;
        this.engineType = otherCar.engineType;
        this.noOfAirBags = otherCar.noOfAirBags;
        this.noOfDoors = otherCar.noOfDoors;
    }

    public void startEngine(){
        System.out.println("Engine Starting");
    }

    public void shutDownEngine(){
        System.out.println("Engine Turning Off");
    }

    public void running(){
        System.out.println("Car Running");
    }
}
