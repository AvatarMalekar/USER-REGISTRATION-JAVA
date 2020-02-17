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
}
