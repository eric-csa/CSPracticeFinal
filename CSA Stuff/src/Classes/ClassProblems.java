package Classes;

public class ClassProblems {
    // For all problems, refer to the BigObject Class.

    // problem 1: Circle the following that do not throw a compile error.
    // A.
    //BigObject = new BigObject();
    // B.
    //BigObject b;
    // C.
    // BigObject c = new BigObject(0, 1);
    // D.
    //BigObject d = new BigObject(1, 2, 2.0);
    // problem 2: Determine the output of the following program.
    public void p2 () {
        BigObject a = new BigObject ();
        BigObject b = new BigObject(1, 2);
        a.printingPress(5);
        b.printingPress(1, 0);
    }
    // A.
    // 15
    //
}
