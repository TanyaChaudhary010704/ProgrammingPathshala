package SeperatingFiles;

public class Renaissance {
  public static void main(String[] args) {
    String userName = "tanya@gmail.com", password = "tanya123";
    UserCredentialValidator userCredentialValidator = new UserCredentialValidator(userName, password);
    ModulesRetriever modulesRetreiver = new ModulesRetriever();
    if (userCredentialValidator.validate()) {
      System.out.println("Valid User");
      System.out.println(modulesRetreiver.getModules());
    } else {
      System.out.println("Invalid user");
    }
  }
}