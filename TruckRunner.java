class TruckRunner{
 public static void main(String[] args) {

 Truck t1 = new Truck("Tata Ace", 10001L, true, (byte)5, 15.5f);
   t1.display();
   Truck t2 = new Truck("Ashok Leyland", 10002L, false, (byte)10, 12.0f);
     t2.display();
        Truck t3 = new Truck("Mahindra Blazo", 10003L, true, (byte)8, 10.5f);
        t3.display();
    Truck t4 = new Truck("Eicher Pro", 10004L, false, (byte)6, 14.2f);
        t4.display();
     Truck t5 = new Truck("BharatBenz", 10005L, true, (byte)12, 9.8f);
        t5.display();
    }
}