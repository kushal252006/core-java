class Plants {
    String plantName;
    char plantType;
    boolean isMedicinal;
    short height;
    double price;
public Plants(String p1, char p2, boolean p3, short p4, double p5) {
plantName = p1;
plantType = p2;
isMedicinal = p3;
height = p4;
price = p5;
    }
public void showPlant() {
System.out.println("Plant Name: " + plantName);
System.out.println("Plant Type: " + plantType);
System.out.println("Medicinal: " + isMedicinal);
System.out.println("Height: " + height);
System.out.println("Price: " + price);
System.out.println("----------------------");
    }
	}