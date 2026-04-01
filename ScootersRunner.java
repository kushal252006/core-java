class ScootersRunner{
 public static void main(String[] args) {

Scooters sc1 = new Scooters("Ola", 30001L, true, 95000.0, 'A');
sc1.displayInfo();
Scooters sc2 = new Scooters("Honda", 30002L, false, 85000.0, 'B');
sc2.displayInfo();
Scooters sc3 = new Scooters("TVS", 30003L, false, 78000.0, 'A');
sc3.displayInfo();
Scooters sc4 = new Scooters("Ather", 30004L, true, 120000.0, 'A');
sc4.displayInfo();
Scooters sc5 = new Scooters("Suzuki", 30005L, false, 90000.0, 'B');
sc5.displayInfo();
    }
}