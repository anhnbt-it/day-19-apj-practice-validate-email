import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/29/2020
 * Time: 9:53 AM
 */
class ValidateEmailExampleTest {

    private ValidateEmailExample emailValidate = new ValidateEmailExample();

    @Test
    @DisplayName("a@gmail.com")
    void testA() {
        String regex = "a@gmail.com";
        boolean expected = true;
        boolean actual = emailValidate.validate(regex);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ab@yahoo.com")
    void testAB() {
        String regex = "ab@yahoo.com";
        boolean expected = true;
        boolean actual = emailValidate.validate(regex);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("abc@hotmail.com")
    void testABC() {
        String regex = "abc@hotmail.com";
        boolean expected = true;
        boolean actual = emailValidate.validate(regex);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("@gmail.com")
    void testNoUserName() {
        String regex = "@gmail.com";
        boolean expected = false;
        boolean actual = emailValidate.validate(regex);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ab@gmail.")
    void testNoCom() {
        String regex = "ab@gmail.";
        boolean expected = false;
        boolean actual = emailValidate.validate(regex);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("@#abc@gmail.com")
    void testSymbolUserName() {
        String regex = "@#abc@gmail.com";
        boolean expected = false;
        boolean actual = emailValidate.validate(regex);
        assertEquals(expected, actual);
    }

}