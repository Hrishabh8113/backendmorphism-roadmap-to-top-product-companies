public class ClassObjectBasic {
    // A class is a blueprint that defines the data and behavior of its objects.
    // An object is an instance of a class. Here, each Car object has its own field values.
    // For example, Car is a class, and a particular Toyota car can be an object created from it.
    public static void main(String[] args) {

        // Method 1: create an object with the no-argument constructor, then assign its fields.
        Car carObj = new Car();
        carObj.carModel = "Tata Nexon";
        carObj.engineType = "Petrol";
        carObj.noOfAirBags = 6;
        carObj.noOfDoors = 4;

        System.out.println(carObj.carModel);
        System.out.println(carObj.engineType);
        System.out.println(carObj.noOfAirBags);
        System.out.println(carObj.noOfDoors);

        carObj.startEngine();
        carObj.running();
        carObj.shutDownEngine();

        // Method 2: create an object and initialize its fields with a parameterized constructor.
        Car carObj1 = new Car("Creta", "Petrol", 6, 4);

        System.out.println(carObj1.carModel);
        System.out.println(carObj1.engineType);
        System.out.println(carObj1.noOfAirBags);
        System.out.println(carObj1.noOfDoors);

        carObj1.startEngine();
        carObj1.running();
        carObj1.shutDownEngine();

        // Method 3: create a new object by copying the field values from carObj1.
        Car carObj2 = new Car(carObj1);

        System.out.println(carObj2.carModel);
        System.out.println(carObj2.engineType);
        System.out.println(carObj2.noOfAirBags);
        System.out.println(carObj2.noOfDoors);

        carObj2.startEngine();
        carObj2.running();
        carObj2.shutDownEngine();
    }
}
