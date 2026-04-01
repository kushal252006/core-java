class Birds {
String birdName;
char category;
boolean canFly;
long wingSpan;
float weight;

    public Birds(String b1, char b2, boolean b3, long b4, float b5) {
        birdName = b1;
        category = b2;
        canFly = b3;
        wingSpan = b4;
        weight = b5;
    }

public void showBird() {
System.out.println("Bird Name: " + birdName);
System.out.println("Category: " + category);
        System.out.println("Can Fly: " + canFly);
System.out.println("Wing Span: " + wingSpan);
System.out.println("Weight: " + weight);
        System.out.println("----------------------");
    }
}