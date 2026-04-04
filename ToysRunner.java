class ToysRunner {
    public static void main(String[] args) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Toys t1 = new Toys();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Toys t2 = new Toys("Car");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Toys t3 = new Toys("Doll", "Barbie");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Toys t4 = new Toys("Robot", "Lego", 1200);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Toys t5 = new Toys("Puzzle", "Funskool", 300, "Multi-color");
    }
}