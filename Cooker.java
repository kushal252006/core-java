class Cooker {
String brand;
int cookerId;
boolean isInductionCompatible;
double price;
public Cooker(String brand, int cookerId, boolean isInductionCompatible, double price) {
this.brand = brand;
this.cookerId = cookerId;
this.isInductionCompatible = isInductionCompatible;
this.price = price;
}
    public void get() {
        System.out.println("Brand: " + brand);
        System.out.println("Cooker ID: " + cookerId);
        System.out.println("Induction Support  : " + isInductionCompatible);
        System.out.println("Price: ₹" + price);
        System.out.println("????????????????????????????");
}
}