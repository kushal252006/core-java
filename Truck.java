class Truck {
String modelName;
long truckNumber;
boolean isLoaded;
byte capacity;
float mileage;

public Truck(String t1, long t2, boolean t3, byte t4, float t5) {
modelName = t1;
truckNumber = t2;
isLoaded = t3;
capacity = t4;
mileage = t5;
}
	
    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Truck Number: " + truckNumber);
        System.out.println("Loaded: " + isLoaded);
        System.out.println("Capacity: " + capacity);
        System.out.println("Mileage: " + mileage);
        System.out.println("----------------------");
    }
}