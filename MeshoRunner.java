 class MeshoRunner{
 public static void main(String[] args) {

        Mesho ms1 = new Mesho("Saree", (byte)11, false, 5, 4.5);
        ms1.displayDetails();

        Mesho ms2 = new Mesho("Kurti", (byte)12, true, 3, 4.0);
        ms2.displayDetails();

        Mesho ms3 = new Mesho("Shoes", (byte)13, false, 8, 3.8);
        ms3.displayDetails();

        Mesho ms4 = new Mesho("Bag", (byte)14, true, 2, 4.2);
        ms4.displayDetails();

        Mesho ms5 = new Mesho("Watch", (byte)15, false, 6, 4.6);
        ms5.displayDetails();
    }
}