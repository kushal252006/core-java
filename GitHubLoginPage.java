class GitHubLoginPage {

String username;
String email;
int userId;
boolean isLoggedIn;
char userType;
double accountBalance;    
public GitHubLoginPage(String username, String email, int userId,boolean isLoggedIn, char userType, double accountBalance) {
        this.username = username;
        this.email = email;
        this.userId = userId;
        this.isLoggedIn = isLoggedIn;
        this.userType = userType;
        this.accountBalance = accountBalance;
    }
    public void show() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("User ID: " + userId);
        System.out.println("Logged In:" + isLoggedIn);
        System.out.println("User Type: " + userType);
        System.out.println("Account Balance : ₹" + accountBalance);
        System.out.println("****************");
    }
}