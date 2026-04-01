class RiceRunner{
public static void main(String[] args) {
        Rice rOne = new Rice("Basmati", 701, true, 5.5f, 600L);
        rOne.printRice();
        Rice rTwo = new Rice("Sona Masoori", 702, false, 10.0f, 1200L);
        rTwo.printRice();
        Rice rThree = new Rice("Brown Rice", 703, true, 7.5f, 900L);
        rThree.printRice();
        Rice rFour = new Rice("Ponni", 704, false, 8.0f, 850L);
        rFour.printRice();
        Rice rFive = new Rice("Jasmine", 705, true, 6.0f, 950L);
        rFive.printRice();
    }
}