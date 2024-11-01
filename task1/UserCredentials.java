public class UserCredentials {
    private final String username;
    private final String password;

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValid() {
        return username != null && !username.isEmpty() &&
               password != null && !password.isEmpty();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
