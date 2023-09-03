package pass.main;

import pass.classes.Generator;

public class Main {
    public static void main(String[] args)
    {
        Generator obj1 = new Generator(15,"combined",true);
        Generator obj2 = new Generator(10,"upper",true);
        Generator obj3 = new Generator(5,"lower",false);
        String password1 = obj1.generatePassword();
        String password2 = obj2.generatePassword();
        String password3 = obj3.generatePassword();
        System.out.println(password1);
        System.out.println(password2);
        System.out.println(password3);
    }
}