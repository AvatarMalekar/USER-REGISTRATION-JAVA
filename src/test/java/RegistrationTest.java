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
}
