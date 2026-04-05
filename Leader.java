class Leader {

    String leaderName;
    int leaderId;
    char grade;
    float salary;
    boolean isActive;
    public Leader(String leaderName, int leaderId, char grade, float salary, boolean isActive) {
        this.leaderName = leaderName;
        this.leaderId = leaderId;
        this.grade = grade;
        this.salary = salary;
        this.isActive = isActive;
    }
    public void display() {
        System.out.println("Leader Name: " + leaderName);
        System.out.println("Leader ID: " + leaderId);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + salary);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("---------------------------");
    }
    }