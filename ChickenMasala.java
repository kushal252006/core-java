class ChickenMasala {
    static void showDish() {
String dishName = "Chicken Masala";
System.out.println("Dish name is: " + dishName);
displaySpiceLevel(5);
}
static void displaySpiceLevel(int level) {
System.out.println("Spice level is: " + level);
        String chefName = getChefName();
System.out.println("Chef name returned: " + chefName);
    }

static String getChefName() {
String chef = "Ravi";
System.out.println("Chef preparing dish: " + chef);
        return chef;
    }
}