package pass.main;

import pass.classes.Generator;

public class Main {
    public static void main(String[] args)
    {
        // Example of usage

        // 1. create a new object with our desired options as parameters (length;  uppercase only/lowercase only/combined;  include digits)
        Generator obj1 = new Generator(15,"combined",true);
        Generator obj2 = new Generator(10,"upper",true);
        Generator obj3 = new Generator(5,"lower",false);

        // 2. call the generatePassword() function and store the returned string in a variable
        String password1 = obj1.generatePassword();
        String password2 = obj2.generatePassword();
        String password3 = obj3.generatePassword();

        // 3. display the password (string) to the console
        System.out.println(password1);
        System.out.println(password2);
        System.out.println(password3);
    }
}
