 class ProjectRunner{
 public static void main(String[] args) {
        Project p1 = new Project("Smart City", 9001L, 'A', 75.5f);
        Project p3 = new Project("AI Chatbot", 9003L, 'A', 45.3f);
        Project p4 = new Project("Health Tracker", 9004L, 'C', 80.2f);
        Project p5 = new Project();
        p1.showInfo();
        p3.showInfo();
        p4.showInfo();
        p5.showInfo();
    }
}