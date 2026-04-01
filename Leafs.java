class Leafs {

    String leafType;
int leafId;
boolean isMedicinal;
double size;
    public Leafs(String leafType, int leafId, boolean isMedicinal, double size) {
        this.leafType = leafType;
        this.leafId = leafId;
        this.isMedicinal = isMedicinal;
        this.size = size;
    }
public void show() {
System.out.println("Leaf Type: " + leafType);
System.out.println("Leaf ID: " + leafId);
System.out.println("Medicinal: " + isMedicinal);
System.out.println("Size (cm): " + size);
System.out.println("{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}}}}}");
    }
}