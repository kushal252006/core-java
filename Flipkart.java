class Flipkart {
String itemName;
short itemCode;
boolean isDelivered;
long orderId;
float discount;
public Flipkart(String f1, short f2, boolean f3, long f4, float f5) {
itemName = f1;
itemCode = f2;
isDelivered = f3;
orderId = f4;
discount = f5;
}
    public void showInfo() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Delivered: " + isDelivered);
        System.out.println("Order ID: " + orderId);
        System.out.println("Discount: " + discount);
        System.out.println("----------------------");
    }
	}