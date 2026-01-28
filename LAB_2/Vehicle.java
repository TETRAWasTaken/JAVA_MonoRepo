public class Vehicle {
    
    // Defining the attributes of the Vehicle class
    public String make; // Make of the vehicle
    public String model; // Model of the vehicle
    public String color; // Color of the vehicle
    public double price; // Price of the vehicle 
    public float enginePower; // Engine power in HP
    private int noOfWheels; // Number of wheels
    private int noOfCylinders; // Number of cylinders
    private String mfgCode; // Manufacturing number
    private boolean manual; // Manual transmission or not

    public String getMfgCode() { // Getter method for mfgCode
        return mfgCode;
    }

    public void setMfgCode(String mfgCode) { // Setter method for mfgCode
        this.mfgCode = mfgCode;
    }

    public int getNoOfCylinders() { // Getter method for noOfCylinders
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) { // Setter method for noOfCylinders
        this.noOfCylinders = noOfCylinders;
    }

    // Default constructor
    public Vehicle() { 
        make = "BMW";
        model = "GT3";
        color = "Black";
        price = 150000.00;
        enginePower = 450.5f;
        noOfWheels = 4;
        noOfCylinders = 6;
        mfgCode = "BMW2024GT3";
    }

    // Parameterized constructors                                                       
    public Vehicle(String bMake, String mName, String c, double p) {                    
        make = bMake;
        model = mName;
        color = c;
        price = p;
    }

    public Vehicle(String c, double p, boolean a) {
        color = c;
        price = p;
        manual = a;
    }

    public Vehicle(Vehicle v) {
        this.make = v.make;
        model =v.model;
        price =v.price;
    }


    // Generic methods
    public void drive() {
        System.out.println("The vehicle has been started.");

    }

    public void stop() {
        System.out.println("The vehicle has been stopped.");
    }

    public float calculateMileage(float distance, float fuelConsumed) {
        return distance / fuelConsumed; // Mileage in km/l
    }
}
