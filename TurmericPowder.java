class TurmericPowder {
static void showProductDetails() {
String product = "Turmeric Powder";
System.out.println("Product is: " + product);
displayWeight(200);
}
static void displayWeight(int weight) {
System.out.println("Weight in grams: " + weight);
double qualityScore = getQualityScore();
System.out.println("Quality score returned: " + qualityScore);
}
static double getQualityScore() {
double score = 9.5;
System.out.println("Quality score of product: " + score);
return score;
}
}