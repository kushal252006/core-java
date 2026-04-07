class Sheep {
    static void showSheepDetails() {
        String breed = "Merino";
        System.out.println("Sheep breed: " + breed);
        displayAge(3);
    }
    static void displayAge(int age) {
        System.out.println("Age in years: " + age);
        double woolWeight = getWoolWeight();
        System.out.println("Wool weight returned: " + woolWeight + " kg");
    }
    static double getWoolWeight() {
        double weight = 5.5;
        System.out.println("Wool produced: " + weight + " kg");
        return weight;
    }
}