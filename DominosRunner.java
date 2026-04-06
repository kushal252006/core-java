class DominosRunner{
public static void main(String[] args) {
double cost = Dominos.orderDetails("Farmhouse");
System.out.println("Price for one pizza: " + cost);
double finalBill = Dominos.orderDetails("Farmhouse", cost, 3);
System.out.println("Total bill: " + finalBill);
}
}