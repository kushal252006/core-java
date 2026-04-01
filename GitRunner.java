class GitRunner{
public static void main(String[] args) {

GitHubLoginPage g1 = new GitHubLoginPage("kushal01", "kushal@gmail.com", 1001, true, 'A', 0.0);
g1.show();
GitHubLoginPage g2 = new GitHubLoginPage("madhu", "madhu@gmail.com", 1002, false, 'B', 8.0);
g2.show();
GitHubLoginPage g3 = new GitHubLoginPage("nikhil", "nikhil@gmail.com", 1003, true, 'A', 9.5);
g3.show();
GitHubLoginPage g4 = new GitHubLoginPage("revanth", "revanth@gmail.com", 1004, false, 'C', 6.0);
g4.show();
GitHubLoginPage g5 = new GitHubLoginPage("seena", "seena@gmail.com", 1005, true, 'B', 10.0);
g5.show();
GitHubLoginPage g6 = new GitHubLoginPage("niranjan", "niru@gmail.com", 1006, false, 'C', 6.5);
g6.show();
GitHubLoginPage g7 = new GitHubLoginPage("yogesh", "yogi@gmail.com", 1007, true, 'A', 10.8);
g7.show();
    }
}