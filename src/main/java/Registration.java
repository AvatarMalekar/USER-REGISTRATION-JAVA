public class Registration {
    String NAME_CHECKER="^[A-Z]{1}[a-z]{2,}$";
    public boolean firstName(String fname) {
        return fname.matches(NAME_CHECKER);
    }
}
