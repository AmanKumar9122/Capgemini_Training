// using two stack implementing a chrome browser with back and forward button
// 1. open the page 
// 2. go forward
// 3. go back
// 4. exit

import java.util.Scanner;
import java.util.Stack;

public class ChromeBrowser {
    public static void main(String[] args) {
        Stack<String> forwardStack = new Stack<>();
        Stack<String> backStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String currentPage = "home";
        while (true) {
            System.out.println("Current page: " + currentPage);
            System.out.println("1. Open page");
            System.out.println("2. Go forward");
            System.out.println("3. Go back");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the url of the page to open");
                    String url = sc.nextLine();
                    backStack.push(currentPage);
                    currentPage = url;
                    forwardStack.clear();
                    break;
                case 2:
                    if (!forwardStack.isEmpty()) {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                    } else {
                        System.out.println("No forward page available");
                    }
                    break;
                case 3:
                    if (!backStack.isEmpty()) {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                    } else {
                        System.out.println("No back page available");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
}
