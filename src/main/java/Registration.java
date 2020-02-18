public class Registration {
    String NAME_CHECKER="^[A-Z]{1}[a-z]{2,}$";
    String EMAIL_CHECKER="^[a-zA-Z]{3,}([0-9]{1,})?([-._+]{1}[0-9a-zA-Z]+)?[@]{1}[0-9a-zA-Z]{1,}[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]{2,4})?$";
    public boolean firstName(String fname) {
        return fname.matches(NAME_CHECKER);
    }

    public boolean lastName(String lname) {
        return lname.matches(NAME_CHECKER);
    }

    public boolean emailAddress(String email) {
        return email.matches(EMAIL_CHECKER);
    }
}
