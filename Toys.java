class Toys {

    String toyName;
    String brand;
    int price;
    String color;

    Toys() {
        this("Teddy Bear");
        System.out.println("Toys Const 1");
    }

    Toys(String toyName) {
        this(toyName, "Funskool");
        System.out.println("Toys Const 2");
    }

    Toys(String toyName, String brand) {
        this(toyName, brand, 500);
        System.out.println("Toys Const 3");
    }

    Toys(String toyName, String brand, int price) {
        this(toyName, brand, price, "Brown");
        System.out.println("Toys Const 4");
    }

    Toys(String toyName, String brand, int price, String color) {
        this.toyName = toyName;
        this.brand = brand;
        this.price = price;
        this.color = color;

        System.out.println("Toys Const 5");
        System.out.println("toyName : " + this.toyName);
        System.out.println("brand : " + this.brand);
        System.out.println("price : " + this.price);
        System.out.println("color : " + this.color);
    }
}