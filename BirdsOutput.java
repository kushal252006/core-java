 class BirdsOutput{
 public static void main(String[] args) {

        Birds bird1 = new Birds("Peacock", 'N', true, 150L, 4.5f);
        bird1.showBird();
Birds bird2 = new Birds("Penguin", 'A', false, 60L, 12.0f);
bird2.showBird();

Birds bird3 = new Birds("Parrot", 'D', true, 40L, 1.2f);
bird3.showBird();
Birds bird4 = new Birds("Ostrich", 'G', false, 200L, 90.0f);
bird4.showBird();

Birds bird5 = new Birds("Eagle", 'P', true, 180L, 6.8f);
bird5.showBird();
    }
}