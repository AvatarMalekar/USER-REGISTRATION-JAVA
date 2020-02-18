public class Registration {
    String NAME_CHECKER="^[A-Z]{1}[a-z]{2,}$";
    String EMAIL_CHECKER="^[a-zA-Z]{3,}([0-9]{1,})?([-._+]{1}[0-9a-zA-Z]+)?[@]{1}[0-9a-zA-Z]{1,}[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]{2,4})?$";
    String PHONE_NUMBER_CHECKER="^([0-9]{2,3}\\s?[0-9]{10})$";
    String PASSWORD_PATTERN1="[A-Za-z0-9@#$%]{8,20}";
    String PASSWORD_PATTERN2="[A-Z]{1}[A-Za-z0-9@#$%]{7,20}";
    public boolean firstName(String fname) {
        return fname.matches(NAME_CHECKER);
    }

    public boolean lastName(String lname) {
        return lname.matches(NAME_CHECKER);
    }

    public boolean emailAddress(String email) {
        return email.matches(EMAIL_CHECKER);
    }

    public boolean phoneNumber(String pnumber) {
        return pnumber.matches(PHONE_NUMBER_CHECKER);
    }

    public boolean PasswordPatternOne(String passwd) {
        return passwd.matches(PASSWORD_PATTERN1);
    }

    public boolean passwordPatternTwo(String passwd2) {
        return passwd2.matches(PASSWORD_PATTERN2);
    }
}
