class Scooters {

    String brandName;
    long scooterId;
    boolean isElectric;
    double price;
    char rating;
    public Scooters(String s1, long s2, boolean s3, double s4, char s5) {
        brandName = s1;
        scooterId = s2;
        isElectric = s3;
        price = s4;
        rating = s5;
    }
    public void displayInfo() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Scooter ID: " + scooterId);
        System.out.println("Electric: " + isElectric);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("----------------------");
    }
}