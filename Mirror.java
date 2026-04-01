class Mirror {

String brand;
int mirrorId;
boolean isFramed;
float height;
char quality;
double price;
public Mirror(String brand, int mirrorId, boolean isFramed,
float height, char quality, double price) {

this.brand = brand;
this.mirrorId = mirrorId;
this.isFramed = isFramed;
this.height = height;
this.quality = quality;
this.price = price;
}
public void show() {
System.out.println("Brand: " + brand);
System.out.println("Mirror ID : " + mirrorId);
System.out.println("Framed: " + isFramed);
System.out.println("Height: " + height + " ft");
System.out.println("Quality: " + quality);
System.out.println("Price: ₹" + price);
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}
}