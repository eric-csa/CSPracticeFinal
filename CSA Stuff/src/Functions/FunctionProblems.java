package Functions;

public class FunctionProblems {
    // problem 1
    // Which number is the function below least likely going to return out of the answer choices?
    public int randomBonanza() {
        int randRoll = (int) (Math.random() * 12) + 5;
        if (randRoll == 5) {
            randRoll = (int) (Math.random() * 12) + 5;
        }
        return randRoll;
    }
    // A. 16
    // B. 5
    // C. 10
    // D. 9
    // E. They all are returned with equal probability.

    // problem 2
    // determine the output of p2(6);
    public void p2 (int x) {
        if (x == 0) {
            return;
        }
        System.out.print(":)");
        p2(x - 1);
    }
    // A. Nothing will be printed.
    // B. :)
    // C. :):):):):):)
    // D. The code will have an infinite loop
    // E. The code will have a compile error
}
