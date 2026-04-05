class Project {
    String projectTitle;
    long projectCode;
    char priorityLevel;
    float progressPercentage;    
	public Project(){};
    public Project(String projectTitle, long projectCode, char priorityLevel, float progressPercentage) {
        this.projectTitle = projectTitle;
        this.projectCode = projectCode;
        this.priorityLevel = priorityLevel;
        this.progressPercentage = progressPercentage;
    }
    public void showInfo() {
        System.out.println("Project Title   : " + projectTitle);
        System.out.println("Project Code    : " + projectCode);
        System.out.println("Priority Level  : " + priorityLevel);
        System.out.println("Progress        : " + progressPercentage + "%");
        System.out.println("---------------------------");
    }
}