package Strings;
public class StringProblems {
    // problem 1:
    // Circle all true statement about strings.
    // A. Strings are immutable, meaning they cannot be changed once created.
    // B. Strings are a type of Object.
    // C. You cannot check if a String is greater than another String.
    // D. Strings can be used to store very very large numbers, such as 10^100000.
    // problem 2:
    // determine the output of the following code:
    public int p2 () {
        int res = 0;
        String eric = "ericisbadatcsa";
        for (int i = 0; i < eric.length(); i++) {
            for (int j = i + 1; j <= eric.length(); j++) {
                if (eric.substring(i, j).compareTo("zzz i am asleep") > 0) {
                    res++;
                }
            }
        }
        return res;
    }
    // A. 15
    // B. 5
    // C. 2
    // D. 3
    // E. 8
    // F. 0
    // G. There is an error in the program.
    // problem 3:
    // determine the output of the following code
    public void p3 () {
        for (char c = 'a'; c <= 'z'; c++) {
            if ((c - 'a') % 26 == 0) {
                System.out.print(c);
            }
        }
    }
    // A. abcdefghijklmnopqrstuvwyxz
    // B. a
    // C. az
    // D. The program will not output anything.
    // E. The program has a compile error.
    // problem 4:
    // determine the return value of StringMayhem("ssa");
    public String StringMayhem (String s) {
        String res = s;
        if (res.contains("a")) {
            res += s;
        }
        if (res.contains("sas")) {
            res += s;
        }
        if (res.indexOf("ssssasssaasasassasaasasasasasassasa") < 4) {
            res += s;
        }
        return res;
    }
    // A. ssa
    // B. ssassa
    // C. ssassassa
    // D. ssassassassa
    // E. The program has an error and will not run.
    // problem 5:
    // circle the programs that correctly determine if a String is in increasing order.
    // a String s is in increasing order if all characters are greater than the previous character.
    // for example: abcdego is increasing and abcdefe is not increasing aaaaa is also not increasing
    // Assume that s consists of only lowercase letters in the english alphabet.
    // A.
    public boolean isIncreasingStringA (String s) {
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            int b = s.charAt(i + 1) - 'a';
            if (a >= b) {
                return false;
            }
        }
        return true;
    }
    // B.
    public boolean isIncreasingStringB (String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int a = s.charAt(i) - 'a';
            int b = s.charAt(i + 1) - 'a';
            if (a >= b) {
                return true;
            }
        }
        return false;
    }
    // C.
    public boolean isIncreasingStringC (String s) {
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            int b = s.charAt(i - 1) - 'a';
            if (a <= b) {
                return false;
            }
        }
        return true;
    }
    public boolean isIncreasingStringD (String s) {
        for (int i = 1; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            int b = s.charAt(i - 1) - 'a';
            if (a <= b) {
                return false;
            }
        }
        return true;
    }

}
