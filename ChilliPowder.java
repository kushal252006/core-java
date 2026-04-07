class ChilliPowder {
    static void showProduct() {
String productName = "Chilli Powder";
System.out.println("Product name is: " + productName);
displayQuantity(250);
}

static void displayQuantity(int grams) {
System.out.println("Quantity in grams: " + grams);
String brandName = getBrandName();
System.out.println("Brand returned: " + brandName);
    }

    static String getBrandName() {
String brand = "SpiceKing";
System.out.println("Brand of product: " + brand);
return brand;
    }
}