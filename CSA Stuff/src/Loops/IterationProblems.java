//package Loops;
//
//public class IterationProblems {
//    // problem 1. Determine the output of the function
//    public void p1 () {
//        int x = 0;
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (j == 2) {
//                    continue;
//                }
//                x++;
//            }
//            x--;
//        }
//        System.out.println(x);
//    }
//    // A: 30
//    // B: 60
//    // C: 45
//    // D: The program has an error.
//    // problem 2. Determine the output of the function
//    public void p2 () {
//        int x = 0;
//        for (int i = 0; i < 69; i++) {
//            if (i % 2 == 0 || i + 4 > 54) {
//                x++;
//            }
//            x--;
//        }
//        System.out.println(x);
//    }
//    // A. 44
//    // B. -25
//    // C. -60
//    // D. 113
//    // E. The program has an error.
//    // problem 3. Determine the output of the function
//    public int p3 () {
//        String x = "";
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                i = 5;
//            }
//            x += "*";
//        }
//        System.out.println(x);
//        return x;
//        //return 0;
//    }
//    // A. **********
//    // B. *********
//    // C. ********
//    // D. The program has an error.
//    // problem 4. Determine the return value of the function
//    public int p4 () {
//        int x = 0;
//        int j = 0;
//
//        for (int i = j; i < 10; i++) {
//            for (int c = x; c < j; c++) {
//                x++;
//            }
//            j++;
//        }
//        return x;
//    }
//    // A. 9
//    // B. 10
//    // C. 11
//    // D. 54
//    // E. 55
//    // F. The program has an error.
//    // problem 5. Eric the programmer is trying to output this shape:
//    // ...***...
//    // .*******.
//    // *********
//    // .*******.
//    // ...***...
//    // Circle all of the functions that correctly output that shape.
//    public void p5A () {
//        int dots = 3;
//        for (int i = 0; i < 5; i++) {
//            int stars = 9 - dots * 2;
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            System.out.println();
//            if (i == 2) {
//                dots = 0;
//            }
//            dots -= 2;
//            if (i > 2) {
//                dots += 2;
//            }
//        }
//    }
//    public void p5B () {
//        int dots = 3;
//        for (int i = 0; i < 5; i++) {
//            int stars = 9 - dots * 2;
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            System.out.println();
//            if (i == 2) {
//                dots = 0;
//            }
//            else {
//                dots -= 2;
//                if (i > 2) {
//                    dots += 2;
//                }
//            }
//        }
//    }
//    public void p5C () {
//        int dots = 3;
//        for (int i = 0; i < 5; i++) {
//            int stars = 9 - dots * 2;
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            System.out.println();
//            if (i == 2) {
//                dots = 0;
//            }
//            else {
//                dots -= 2;
//                if (i > 2) {
//                    dots += 4;
//                }
//            }
//        }
//    }
//    public void p5D () {
//        int dots = 3;
//        for (int i = 0; i < 5; i++) {
//            int stars = 9 - dots * 2;
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < dots; j++) {
//                System.out.print(".");
//            }
//            System.out.println();
//            if (i == 1) {
//                dots = 0;
//            }
//            else if (i > 1) {
//                dots ++;
//                if (i > 2) {
//                    dots++;
//                }
//            }
//            else dots -= 2;
//        }
//    }
//    // problem 6
//    // Eric the programmer wants to output all the characters of a string i with spaces in between.
//    // For example: String abcdefg =
//    // a b c d e f g
//    // however, his function is not working. Identify all lines of code that prevent the function from running
//    // as intended.
//    public void p6 (String curString) {
//        for (int i = 0; i <= curString.length(); i++) {
//            System.out.println(curString.charAt(i) + " ");
//        }
//    }
//    // A. Line 1
//    // B. Line 2
//    // C. Line 3
//    // D. The function works as intended.
//    // problem 7. Identify the output of the while loop.
//    public void p7 () {
//        int x = 123456789;
//        int res = 0;
//        while (x >= 0) {
//             res += x % 10;
//             x /= 10;
//        }
//        System.out.println(res);
//    }
//    // A. 36
//    // B. The code will have a compile error.
//    // C. 28
//    // D. 45
//    // E. The code will have an infinite loop.
//    // problem 8. Circle all answers that will return the same value as the function given below.
//    public int p8 () {
//        int x = 1;
//        int res = 0;
//        while (x < 32) {
//            x *= 2;
//            res++;
//        }
//        return res;
//    }
//    // Answer Choices
//    public int p8A () {
//        int x = 32;
//        int res = 0;
//        while (x > 0) {
//            x /= 2;
//            res++;
//        }
//        return res;
//    }
//    public int p8B () {
//        int x = 1;
//        int res = -1;
//        while (x <= 32) {
//            x *= 2;
//            res++;
//        }
//        return res;
//    }
//    public void p8C () {
//        int x = 2;
//        int res = 0;
//        while (x <= 32) {
//            x *= 2;
//            res++;
//        }
//        return res;
//    }
//    public int p8D () {
//        int res = 0;
//        for (int i = 1; i < 32; i *= 2) {
//            res++;
//        }
//        return res;
//    }
//
//}
//
