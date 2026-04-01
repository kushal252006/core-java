class PlannetRunner{
public static void main(String[] args) {
        Plants pA = new Plants("Tulsi", 'H', true, (short)30, 50.0);
        pA.showPlant();

        Plants pB = new Plants("Rose", 'F', false, (short)20, 40.0);
        pB.showPlant();

        Plants pC = new Plants("Neem", 'T', true, (short)150, 100.0);
        pC.showPlant();

        Plants pD = new Plants("Aloe Vera", 'H', true, (short)25, 60.0);
        pD.showPlant();

        Plants pE = new Plants("Cactus", 'D', false, (short)15, 80.0);
        pE.showPlant();  }
}