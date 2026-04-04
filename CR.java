class CR {

    String crName;
    int crId;
    char grade;
	float salary;
	public CR(){};
    
    public CR(String crName, int crId, char grade, float salary) {
        this.crName = crName;
        this.crId = crId;
        this.grade = grade;
        this.salary = salary;
    }
	public CR(String leaderName, int crId, char grade) {
        this.crName = crName;
        this.crId = crId;
        this.grade = grade;
		}
    public CR(String crName) {
        this.crName = crName;
		}
    public void display() {
        System.out.println("Leader Name: " + crName);
        System.out.println("Leader ID: " + crId);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: " + salary);
        System.out.println("00000000000000000000000000000000000000000");
    }
    }