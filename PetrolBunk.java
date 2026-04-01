class PetrolBunk {

String bunkName;
int bunkId;
boolean isOpen;
double petrolPrice;
float dieselPrice;
char grade;
long contactNumber;

public PetrolBunk(){};

public PetrolBunk(String bunkName, int bunkId, boolean isOpen,double petrolPrice, float dieselPrice,char grade, long contactNumber) {

        this.bunkName = bunkName;
        this.bunkId = bunkId;
        this.isOpen = isOpen;
        this.petrolPrice = petrolPrice;
        this.dieselPrice = dieselPrice;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }
    public void just() {
        System.out.println("Bunk Name: " + bunkName);
        System.out.println("Bunk ID: " + bunkId);
        System.out.println("Is Open: " + isOpen);
        System.out.println("Petrol Price   : ₹" + petrolPrice);
        System.out.println("Diesel Price   : ₹" + dieselPrice);
        System.out.println("Grade: " + grade);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("-----------------------------");
    }
}