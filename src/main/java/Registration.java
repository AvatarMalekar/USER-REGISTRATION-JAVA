public class Registration {
    final String NAME_CHECKER="^[A-Z]{1}[a-z]{2,}$";
    final String EMAIL_CHECKER="^[a-zA-Z]{3,}([0-9]{1,})?([-._+]{1}[0-9a-zA-Z]+)?[@]{1}[0-9a-zA-Z]{1,}[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]{2,4})?$";
    final String PHONE_NUMBER_CHECKER="^([0-9]{2,3}\\s?[0-9]{10})$";
    final String PASSWORD_PATTERN1="[A-Za-z0-9@#$%]{8,20}";
    final String PASSWORD_PATTERN2="(?=.*[A-Z])[A-Za-z0-9@#$%]{7,20}";
    final String PASSWORD_PATTERN3="(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@#$%]{8,20}";
    final String PASSWORD_PATTERN4= "(?=.*[0-10])(?=[^@|#|$|&|%]*[@|&|$|#|%][^@|#|$|&|%]*$)(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9@#$%]{8,20}";
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

    public boolean passwordPatternThree(String passwd3) {
        return passwd3.matches(PASSWORD_PATTERN3);
    }

    public boolean passwordPatternFour(String passwd4) {
        return passwd4.matches(PASSWORD_PATTERN4);
    }
}
