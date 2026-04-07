class Security {
    static void showGuardDetails() {
String guardName = "Ramesh";
System.out.println("Guard name: " + guardName);
displayShiftHours(8);
    }

    static void displayShiftHours(int hours) {
System.out.println("Shift duration in hours: " + hours);
boolean isOnDuty = checkDutyStatus();
System.out.println("Is the guard on duty: " + isOnDuty);
}
static boolean checkDutyStatus() {
boolean dutyStatus = true;
System.out.println("Duty status: " + dutyStatus);
        return dutyStatus;
    }
}