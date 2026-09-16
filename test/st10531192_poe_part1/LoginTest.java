// ST10531192 - JUnit test cases - Final commit
package st10531192_poe_part1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    Login login = new Login();
    
    @Test
    public void testCheckUserNameCorrectlyFormatted() {
        assertTrue(login.checkUserName("kyl_1"));
    }
    
    @Test
    public void testCheckUserNameIncorrectlyFormatted() {
        assertFalse(login.checkUserName("kyle!!!!!!!"));
    }
    
    @Test
    public void testCheckPasswordComplexitySuccess() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testCheckPasswordComplexityFail() {
        assertFalse(login.checkPasswordComplexity("password"));
    }
    
    @Test
    public void testCheckCellPhoneNumberCorrect() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }
    
    @Test
    public void testCheckCellPhoneNumberIncorrect() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }
}S
