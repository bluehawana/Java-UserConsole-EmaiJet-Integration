package se.dsve.user;

public record User(String name, String email, String password, String temporaryPassword) {
    public String getPassword() {
        return this.password;
    }
    public String getTemporaryPassword() {
        return this.temporaryPassword;
    }
}




