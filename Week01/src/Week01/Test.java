package Week01;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        // write your code here\
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your password:\n");
        String password = input.next().trim();
        User user = new User(password);

        try
        {
            NSALoginController.hashUserPassword(user);

            System.out.format("\tPassword After Hash: %s\n", user.getPassword());
            System.out.format("\tHashed Password: %s\n", user.getHashedPassword());
            System.out.format("\tSalt: %s\n", user.getSalt());

        }catch(WeakPasswordException ex){
            System.out.println("Password rejected : " + ex.getMessage());

        }
        catch(Exception ex) {
            System.out.println("Something went wrong.");
        }


        System.out.print("Enter your password: ");
        password = input.next();
        user.setPassword(password);

        try {
            if(NSALoginController.verifyPassword(user))
                System.out.println("Login Successful!");
            else
                System.out.println("Login Failed!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }



    }
}
