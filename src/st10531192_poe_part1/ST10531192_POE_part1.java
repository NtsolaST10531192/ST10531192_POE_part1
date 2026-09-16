package st10531192_poe_part1;

import java.util.Scanner;

public class ST10531192_POE_part1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("=== Registration ===");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // a. Username - WHILE LOOP
        System.out.print("Enter Username (must contain _ and <=5 chars): ");
        String username = scanner.nextLine();
        while (!login.checkUserName(username)) {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            System.out.print("Enter Username (must contain _ and <=5 chars): ");
            username = scanner.nextLine();
        }
        System.out.println("Username successfully captured");

        // b. Password - WHILE LOOP
        System.out.print("Enter Password (8+ chars, Capital, Number, Special): ");
        String password = scanner.nextLine();
        while (!login.checkPasswordComplexity(password)) {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            System.out.print("Enter Password (8+ chars, Capital, Number, Special): ");
            password = scanner.nextLine();
        }
        System.out.println("Password successfully captured");

        // c. Cell Phone - WHILE LOOP
        System.out.print("Enter Cell Phone Number (with international code e.g. +27681104197): ");
        String cellNumber = scanner.nextLine();
        while (!login.checkCellPhoneNumber(cellNumber)) {
            System.out.println("Cell phone number is incorrectly formatted or does not contain an international code, please correct the number and try again.");
            System.out.print("Enter Cell Phone Number (with international code e.g. +27681104197): ");
            cellNumber = scanner.nextLine();
        }
        System.out.println("Cell phone number successfully added.");

        // Register
        System.out.println(login.registerUser(firstName, lastName, username, password, cellNumber));

        // === LOGIN - WHILE LOOP
        System.out.println("\n== Login ==");
       boolean loggedIn = false;
while (!loggedIn) {
    System.out.print("Enter Username: ");
    String loginUsername = scanner.nextLine();
    System.out.print("Enter Password: ");
    String loginPassword = scanner.nextLine();

    if (login.loginUser(loginUsername, loginPassword)) {
        System.out.println(login.returnLoginStatus(loginUsername, loginPassword));
        loggedIn = true;
    } else {
        System.out.println("Username or password incorrect, please try again.");
    }
}
        
        scanner.close();
    }
}