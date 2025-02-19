//package Assignment6;
/*2)A security system needs to protect its authentication mechanism to prevent tampering. 
Implement a final class named SecuritySystem that includes a method authenticateUser(String username, String password),
 which verifies user credentials.
  Then, attempt to create a subclass AdvancedSecurity that tries to extends SecuritySystem and override authenticateUser().
   Observe the compilation error and explain why a final class cannot be inherited. 
   In the main() method, create an instance of SecuritySystem and use the authenticateUser() method to validate login credentials. 
   This will demonstrate how the final keyword enforces security by preventing unauthorized modifications to authentication logic.*/
final class SecuritySystem{
    public void authenticateUser(String username,String password){
        if ("Ishita".equals(username) && "ish123".equals(password)) {
            System.out.println("Authentication successful. Access iss granted.");
        } else {
            System.out.println("Authenticatiom failed.Invalid credentials.");
        }
    }
}
/*class AdvancedSecurity extends SecuritySystem{
    @Override
    public void authenticateUser(String username,String password){
        System.out.println("Name: " + username + "Passwoed: " +password);
    }
}*/

   public class q2 {
    public static void main(String[] args) {
        SecuritySystem s =new SecuritySystem();
        s.authenticateUser("Ishita", "ish123");
        s.authenticateUser("XYZ", "0000");
    }
}
