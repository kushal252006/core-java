class MilkProducts {
String productName;
String brand;
double price;
int quantity;

MilkProducts() {
this("Milk");
System.out.println("MilkProducts Const 1");
}

MilkProducts(String productName) {
this(productName, "Amul");
System.out.println("MilkProducts Const 2");
}

MilkProducts(String productName, String brand) {
this(productName, brand, 50.0);
System.out.println("MilkProducts Const 3");
}

MilkProducts(String productName, String brand, double price) {
this(productName, brand, price, 1);
System.out.println("MilkProducts Const 4");
}

MilkProducts(String productName, String brand, double price, int quantity) {
this.productName = productName;
this.brand = brand;
this.price = price;
this.quantity = quantity; 
System.out.println("MilkProducts Const 5");
System.out.println("productName : " + this.productName);
System.out.println("brand : " + this.brand);
System.out.println("price : " + this.price);
System.out.println("quantity : " + this.quantity);
}
}