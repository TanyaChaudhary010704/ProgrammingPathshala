package SeperatingFiles;

public class UserCredentialValidator {
  public final String username;
  public final String password;

  public UserCredentialValidator(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public boolean validate() {
    return true;
  }

  private boolean isPresentInUserTable() {
    return true;
  }
}
