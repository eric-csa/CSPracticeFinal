package Booleans;

public class BooleanProblems {
    // problem 1
    // Eric believes that a || b is equal to !(!a && b);
    // for which values of a and b will this not be true?
    // A. a = true, b = false
    // B. a = true, b = true
    // C. a = false, b = false
    // D. a =  false, b = true

    // problem 2.
    // Eric has invented a new logical operator, similar to && and ||, called ^.
    // a ^ b is true when:
    // a = true and b = false
    // a = false and b = true
    // a ^ b is false otherwise.
    // which of the following are equal to a ^ b?
    // A. !a || b
    // B. a != b
    // C. (a || b) && !(a && b)
    // D. (a && b) || (!a && b)

    // problem 3.
    // Condense the function into a single return statement. Select all answers that properly do so.
    public boolean p3 (int x, int y, int z) {
        if (x > 50) {
            return true;
        }
        if (x < 50) {
            if (y > 20) {
                return true;
            }
            else {
                if (z < 30) {
                     return false;
                }
            }
        }
        return false;
    }
    // A. return (x > 50) || (x < 50) && (y > 20)
    // B. return x != 50 && (x > 50) || (x < 50) && (y > 20)
    // C. return x != 50 || (x > 50) || (x < 50) && (y > 20)
    // D. return (x > 50) || (x < 50) && (y > 20) || (x < 50) && (y <= 20) && !(z < 30)
    // problem 4
    // determine the output of the following program.
    public void p4 () {
        String c = "i am a banana";

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == "a" || c.charAt(i) == "i") {
                System.out.print("a");
            }
        }
    }
    // A. iaaaaa
    // B. aaaaaa
    // C. aaaaa
    // D. There is an error in the code.
    // problem 5
    // Circle the boolean exprssions equivalent to (a || b) && a || (a && !c)?
    // A. a
    // B. a || b || !c
    // C. b || (a && !c)
    // D. !(a && b) && !(!a) || !(!a || !c)
    // problem 6
    // Eric deems a number "smashable" if the sum of the digits of the number is divisible by 9 and the number
    // has at least 6 digits.
    // Circle the following functions that correctly check if a number is smashable.
    public boolean p6A (int x) {
        return (x % 9 == 0) && (x > 99999);
    }
    public boolean p6B (int x) {
        int digitSum = 0;
        while (x > 0) {
            digitSum += x % 10;
            x /= 10;
        }
        return (digitSum % 9 == 0) && (x > 99999);
    }
    public boolean p6C (int x) {
        if (x > 99999) {
            return true;
        }
        if (x % 3 == 0) {
            x /= 3;
            if (x % 3 == 0) {
                return true;
            }
        }
        return false;
    }
    public boolean p6D (int x) {
        if (x < 99999) {
            return false;
        }
        return x % 9 == 0;
    }
}
