package se.dsve.user;

public record User(String name, String email, String password) {
    public String getPassword() {
        return this.password;
    }
}
