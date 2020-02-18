import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
    Registration registration=new Registration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean validFirstNameTrue = registration.firstName("Avatar");
        Assert.assertEquals(true,validFirstNameTrue);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean validFirstNameFalse=registration.firstName("abcd");
        Assert.assertEquals(false,validFirstNameFalse);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean validLastNameTrue = registration.lastName("Malekar");
        Assert.assertEquals(true,validLastNameTrue);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean validLastNameFalse=registration.lastName("dgkdga");
        Assert.assertEquals(false,validLastNameFalse);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean validEmailAddressTrue = registration.emailAddress("abc@gmail.com");
        Assert.assertEquals(true,validEmailAddressTrue);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnFalse() {
        boolean validEmailAddressFalse = registration.emailAddress("abc.@gmail.com");
        Assert.assertEquals(false,validEmailAddressFalse);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean validPhoneNumberTrue = registration.phoneNumber("91 9404442544");
        Assert.assertEquals(true,validPhoneNumberTrue);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnFalse() {
        boolean validPhoneNumberFalse = registration.phoneNumber("940442544");
        Assert.assertEquals(false,validPhoneNumberFalse);
    }

    @Test
    public void Password() {
        boolean validPasswordPatternOneTrue = registration.PasswordPatternOne("aAv@#$gd");
        Assert.assertEquals(true,validPasswordPatternOneTrue);
    }

    @Test
    public void givenPasswordPatternOne_WhenProper_ShouldReturnFalse() {
        boolean validPasswordPatternOneFalse = registration.PasswordPatternOne("avsgh");
        Assert.assertEquals(false,validPasswordPatternOneFalse);
    }

    @Test
    public void givenPasswordPatternTwo_WhenProper_ShouldReturnTrue() {
        boolean validPasswordPatternTwoTrue = registration.passwordPatternTwo("AdfbdA@A");
        Assert.assertEquals(true,validPasswordPatternTwoTrue);
    }

    @Test
    public void givenPasswordPatternTwo_WhenProper_ShouldReturnFalse() {
        boolean validPasswordPatternTwoFalse = registration.passwordPatternTwo("asdfghjr");
        Assert.assertEquals(false,validPasswordPatternTwoFalse);
    }

    @Test
    public void givenPasswordPatternThree_WhenProper_ShouldReturnTrue() {
        boolean validPasswordPatternThreeTrue = registration.passwordPatternThree("adA2fjaf");
        Assert.assertEquals(true,validPasswordPatternThreeTrue);
    }

    @Test
    public void givenPasswordPatternThree_WhenProper_ShouldReturnFalse() {
        boolean validPasswordPatternThreeFalse = registration.passwordPatternThree("asdjfdadj");
        Assert.assertEquals(false,validPasswordPatternThreeFalse);
    }

    @Test
    public void givenPasswordPatternFour_WhenProper_ShouldReturnTrue() {
        boolean validPasswordPatternFourTrue = registration.passwordPatternFour("asA1@ghab");
        Assert.assertEquals(true,validPasswordPatternFourTrue);
    }

    @Test
    public void givenPasswordPatternFour_WhenProper_ShouldReturnFalse() {
        boolean validPasswordPatternFourFalse = registration.passwordPatternFour("aadhd");
        Assert.assertEquals(false,validPasswordPatternFourFalse);
    }
}