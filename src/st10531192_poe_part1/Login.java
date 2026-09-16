// Commit 3 - Username validation - ST10531192
package st10531192_poe_part1;

public class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellNumber;

    public Login() {
    }

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%^&*+].*");
    }

    public boolean checkCellPhoneNumber(String cell) {
        return cell.startsWith("+") && cell.length() == 12 && cell.matches("\\+\\d+");
    }

    public String registerUser(String firstName, String lastName, String username, String password, String cellNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;

        if (!checkUserName(username)) {
            return "Username is not correctly formatted";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted";
        }
        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell phone number incorrectly formatted";
        }
        return "User is registered successfully.";
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Welcome " + firstName + " " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
