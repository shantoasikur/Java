import java.util.Scanner;

public class OnlineExam {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String username, password;
        
        // Login
        System.out.println("Enter your username:");
        username = sc.nextLine();
        System.out.println("Enter your password:");
        password = sc.nextLine();
        
        // Check login credentials (in this example, username = "user" and password = "pass")
        if (!username.equals("user") || !password.equals("pass")) {
            System.out.println("Invalid login credentials. Exiting program.");
            return;
        }
        
        // Update profile and password
        System.out.println("Would you like to update your profile or password? Enter 'p' for profile or 'pass' for password:");
        String option = sc.nextLine();
        if (option.equals("p")) {
            System.out.println("Enter your new profile information:");
            // Update profile
        } else if (option.equals("pass")) {
            System.out.println("Enter your new password:");
            // Update password
        }
        
        // Selecting answers for MCQs
        System.out.println("Select the correct answer:");
        System.out.println("1) Option 1");
        System.out.println("2) Option 2");
        System.out.println("3) Option 3");
        int answer = sc.nextInt();
        // Check answer and provide feedback
        
        // Writing answers to questions
        System.out.println("Enter your answer:");
        String essayAnswer = sc.nextLine();
        // Save answer
        
        // Closing session and Logout
        System.out.println("Are you sure you want to close the session? Enter 'y' for yes or 'n' for no:");
        String closeOption = sc.nextLine();
        if (closeOption.equals("y")) {
            System.out.println("Logging out. Goodbye!");
        } else {
            // Continue session
        }
        
    }
    
}
