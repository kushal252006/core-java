class Tablets {
    public Tablets() {
        this("Paracetamol");
        System.out.println("First constructor");
    }
public Tablets(String tabletName) {
this("Cipla", "Sun Pharma");
System.out.println("Second constructor");
System.out.println("Tablet Name: " + tabletName);
}
public Tablets(String company1, String company2) {
this(10, 20, 30);
System.out.println("Third constructor");
System.out.println("Company 1: " + company1);
System.out.println("Company 2: " + company2);
    }
public Tablets(int count1, int count2, int count3) {
this(25.5, 50.0, 75.5, 100.0);
System.out.println("Fourth constructor");
System.out.println("Tablet Count 1: " + count1);
System.out.println("Tablet Count 2: " + count2);
System.out.println("Tablet Count 3: " + count3);
}
public Tablets(double price1, double price2, double price3, double price4) {
this(true, false, true, true, false);
System.out.println("Fifth constructor");
System.out.println("Price 1: ₹" + price1);
System.out.println("Price 2: ₹" + price2);
System.out.println("Price 3: ₹" + price3);
System.out.println("Price 4: ₹" + price4);
}
public Tablets(boolean a, boolean b, boolean c, boolean d, boolean e) {
System.out.println("Last constructor");
System.out.println("Available in Medical 1: " + a);
System.out.println("Available in Medical 2: " + b);
System.out.println("Available in Medical 3: " + c);
System.out.println("Available in Medical 4: " + d);
System.out.println("Available in Medical 5: " + e);
}
}