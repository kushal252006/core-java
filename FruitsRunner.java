class FruitsRunner{
public static void main(String[] args) {
        Fruits fOne = new Fruits("Apple", (byte)21, true, (short)50, 120.5);
        fOne.displayFruit();

        Fruits fTwo = new Fruits("Banana", (byte)22, true, (short)100, 40.0);
        fTwo.displayFruit();

        Fruits fThree = new Fruits("Mango", (byte)23, false, (short)30, 150.0);
        fThree.displayFruit();

        Fruits fFour = new Fruits("Orange", (byte)24, true, (short)60, 80.0);
        fFour.displayFruit();

        Fruits fFive = new Fruits("Grapes", (byte)25, false, (short)45, 90.0);
        fFive.displayFruit();
    }
}