package se.dsve.user;

public record UserCredentials(String password, String temporaryPassword) {
    public UserCredentials {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        if (temporaryPassword == null || temporaryPassword.isBlank()) {
            throw new IllegalArgumentException("Temporary password cannot be null or empty.");
        }
    }
}
