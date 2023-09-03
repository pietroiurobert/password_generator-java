package pass.classes;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    private int length;
    private String cases; // Uppercase-only, Lowecase-only, Combined
    private boolean digits; // include numbers
    private String password = "";

    public Generator() {
        length = 4;
        cases = "Combined";
        digits = true;
    }

    public Generator(int length, String cases, boolean digits) {
        this.length = length;
        this.cases = cases;
        this.digits = digits;
    }

    public String generatePassword() {
        char x = 'A', y = 'a';
        ArrayList<Character> upper = new ArrayList<Character>();
        ArrayList<Character> lower = new ArrayList<Character>();

        for (int i = 0; i < 25; i++) { // 25 letters from the Alphabet
            upper.add((char) (x + i));
            lower.add((char) (y + i));
        }

        Random rand = new Random();

        // USING digits:

        if (this.digits == true) {
            int use_digits;
            if (cases.toLowerCase().equals("upper")) {
                for (int i = 0; i < length; i++) {
                    int randomIndex = rand.nextInt(upper.size());
                    use_digits = rand.nextInt(2); //0 - use digit, 1 - use letter
                    if (use_digits == 0)
                        password += rand.nextInt(10);
                    else
                        password += upper.get(randomIndex);
                }
                return password;
            } else if (cases.toLowerCase().equals("lower")) {
                for (int i = 0; i < length; i++) {
                    int randomIndex = rand.nextInt(upper.size());
                    use_digits = rand.nextInt(2); //0 - use digit, 1 - use letter
                    if (use_digits == 0)
                        password += rand.nextInt(10);
                    else
                        password += lower.get(randomIndex);
                }
                return password;
            } else if (cases.toLowerCase().equals("combined")) {
                for (int i = 0; i < length; i++) {
                    int randomIndex = rand.nextInt(upper.size());
                    int case_picker = rand.nextInt(2);
                    use_digits = rand.nextInt(2); //0 - use digit, 1 - use letter
                    if (use_digits == 0)
                        password += rand.nextInt(10);
                    else {
                        if (case_picker == 0)
                            password += upper.get(randomIndex);
                        else password += lower.get(randomIndex);
                    }
                }
                return password;
            }
        }

        // NOT using digits:

        else {
            if (cases.toLowerCase().equals("upper")) {
                for (int i = 0; i < length; i++) {
                    int randomIndex = rand.nextInt(upper.size());
                    password += upper.get(randomIndex);
                }
                return password;
            } else if (cases.toLowerCase().equals("lower")) {
                for (int i = 0; i < length; i++) {
                    int randomIndex = rand.nextInt(upper.size());

                    password += lower.get(randomIndex);
                }
                return password;
            } else if (cases.toLowerCase().equals("combined")) {
                for (int i = 0; i < length; i++) {
                    int randomIndex = rand.nextInt(upper.size());
                    int case_picker = rand.nextInt(2);

                    if (case_picker == 0)
                        password += upper.get(randomIndex);
                    else password += lower.get(randomIndex);
                }
            }
            return password;
        }
        return password;
    }
}