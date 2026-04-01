class BatsResult{
 public static void main(String[] args) {
Bats bA = new Bats("MRF", (short)101, true, (byte)20, 1.2);
bA.printDetails();
Bats bB = new Bats("SS", (short)102, false, (byte)10, 1.1);
bB.printDetails();
Bats bC = new Bats("Kookaburra", (short)103, true, (byte)15, 1.3);
bC.printDetails();
Bats bD = new Bats("SG", (short)104, true, (byte)25, 1.25);
bD.printDetails();
Bats bE = new Bats("Adidas", (short)105, false, (byte)8, 1.15);
bE.printDetails();
    }
}