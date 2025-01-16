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
    // 2
    // B.
    // 12
    // -1
    // C.
    // 15
    // -1
    // D.
    // 12
    // 2
    // E. There is an error in the program.

    // problem 3:
    // Circle all instances of BigObject that result in the method getWeirdA(5) returning a value greater than 10.
    // A. BigObject a = new BigObject (8);
    // B. BigObject b = new BigObject (6, 1);
    // C. BigObject c = new BigObject (0, 1, -4);
    // D. BigObject d = new BigObject (4, 3, 1);
    // E. BigObject e = new BigObject ();

    // problem 4:
    // There are 5 BigObjects below. Define a BigObject to be inferior if it is NOT GREATER than any of the other 4 objects. For example,
    // for BigObject a to be inferior, it must not be greater than BigObject b, c, d, and e.
    // Select the BigObject that is inferior, or state that there are no inferior big objects.
    // Refer to the isGreater method in the BigObject class.
    // A. BigObject a = new BigObject(2, 4, 12);
    // B. BigObject b = new BigObject(1, 5);
    // C. BigObject c = new BigObject(5, 5, 5);
    // D. BigObject d = new BigObject (7, 0, 7);
    // E. BigObject e = new BigObject ();
    // F. No BigObject is inferior.

    // problem 5:
    // Circle all of the BigObjects declared below that will cause the method iAmBroken to have a runtime error.
    // A. BigObject a = new BigObject ();
    // B. BigObject b = new BigObject (0.69, 2, 1);
    // C. BigObject c = new BigObject (0, 4);
    // D. BigObject d = new BigObject (2, 3, 3);
    // E. None of the declarations cause a runtime error.
    // problem 6:
    // Determine the output of the following program.
    public void p6 () {
        BigObject yipee = new BigObject();
        BigObject OhMy = new BigObject(6, 9, 4);
        System.out.println(yipee);
        System.out.println(OhMy);
    }
    // A.
    // 0 0 0
    // 6 9 4
    // B.
    // 0 0 0
    // 6/n 9 4
    // C.
    // 0
    // 0 0
    // 6 9 4
    // D.
    // 0/n 9 4
    // 6 0 0
    // E.
    // 0/n 0 0
    // 6 9 4
    // F. The program has an error.
    // problem 7.
    // Eric wants to add a new method to the BigObject class, getBigObjectCnt, which returns the count of all BigObject instances
    // that have been declared.
    // which of the following solutions is the BEST IMPLEMENTATION of the desired functionality?
    // A. Create a private variable initialized 0. Modify the constructors to additionally increment count by 1.
    // getBigObjectCnt will return count.
    // B. Create a private static variable count initialized to 0. Modify the constructors to additionally increment count by 1.
    // getBigObjectCnt will return count.
    // C. Create a private variable count initialized to 0. Modify the constructors to additionally increment count by 1.
    // getBigObjectCnt will return count. Additionally, make getBigObjectCnt a static method.
    // D. Create a private static variable count initialized to 0. Modify the constructors to additionally increment count by 1.
    // getBigObjectCnt will return count. Additionally, make getBigObjectCnt a static method.
}
