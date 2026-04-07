class Cement {
    static void showCementDetails() {
        String cementType = "Portland Cement";
        System.out.println("Cement type is: " + cementType);
        displayWeight(50);
    }
    static void displayWeight(int bags) {
        System.out.println("Number of bags: " + bags);
        double grade = getCementGrade();
        System.out.println("Cement grade returned: " + grade);
    }
    static double getCementGrade() {
        double strengthGrade = 53.0;
        System.out.println("Cement strength grade: " + strengthGrade);
        return strengthGrade;
    }
}