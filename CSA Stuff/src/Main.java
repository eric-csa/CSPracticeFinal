import java.util.ArrayList;

public class Main {
    public static int nestingRecursion (int i) {
        if (i == 0) {
            return 0;
        }
        System.out.println(5);

        nestingRecursion(nestingRecursion(i - 1));

        return i;
    }
    public static int tripleNest (int i) {
        if (i == 0) {
            return 0;
        }
        System.out.println(5);

        tripleNest(tripleNest(tripleNest(i - 1)));

        return i;
    }
    public static int p6 (int n) {
        if (n % 3 == 0) {
            return p6(n + 1);
        }
        if (n <= 0) {
            return 0;
        }
        return p6(n - 1);
    }
    public static void p7 (ArrayList<Integer>[] graph, int prev, int cur) {
        System.out.println(cur);
        for (int i : graph[cur]) {
            if (i == prev) {
                return;
            }
            p7(graph, cur, i);
        }
    }
    public static int p8 (int a, int b) {
        if (b == 1) {
            return a;
        }
        if (b == 0) {
            return 1;
        }
        int res = p8(a, b / 2);

        res = res * res;

        if (b % 2 == 1) {
            res *= a;
        }
        return res;
    }
    public static int p9 (int[] nums, int n) {
        if (n >= nums.length) {
            return 0;
        }
        return nums[n] + p9(nums, n + 1) - p9(nums, n + 2);
    }
    public static int p10 (int n) {
        if (n % 3 == 0) {
            return n;
        }

        return p10(p10(n + 5) / 2);
    }
    public static void p11 (ArrayList<Integer> nums, int i) {
        if (i > 0) {
            System.out.println(nums);
        }

        if (i == nums.size() - 1) {
            return;
        }
        p11(nums, i + 1);
        for (int j = i + 1; j < nums.size(); j++) {
            int temp = nums.get(i);
            int temp2 = nums.get(j);
            nums.set(i, temp2);
            nums.set(j, temp);

            p11(nums, i + 1);

            nums.set(i, temp);
            nums.set(j, temp2);
        }
        //System.out.println("After: " + nums);
    }

    // FRQS: (Going from easiest to hardest)
    // EASY: Write a method that finds the range of the array, which is maxElement - minElement. Your solution must use recursion, you may add
    // additional methods as needed, and modify the parameters. Do not worry about input validation
    // Input: range(nums) when nums = [1, 2, 3, 4, 5] output: 4
    // Input: range(nums) when nums = [2, 4, -3, 6, 1] output: 9

    // Write a method that prints a number as its hexadecimal form. Your solution must use recursion. Assume the number is always positive
    // Input: hex(n) when n = 126 output: 7E
    // Input: hex(n) when n = 256 output: 100
    // Input: hex(n) when n = 1424 output: 590

    // Write a method that successfully prints out this sequence: 1, 1, 2, 4, 6, 12, 18, 36, 54, 90, 180
    // 0 indexed sequence. The ith element of the sequence should be: 1 if i < 2
    // the sum of the 2 previous values of the sequence if i is odd
    // and the sum of the 3 previous values of the sequence is i is even
    // your method must use recursion.
    // input: recurse(10) output: 1 1 2 4 6 12 18 36 54 90 180
    // input: recurse (3) output: 1 1 2 4
    // HARDER:
    // write a method that succesfully sorts a list and returns the sorted list. Your solution must use recursion
    // input: sort(nums) when nums = [3, 4, 1, 2] return: [1, 2, 3, 4]
    // input: sort(nums) when nums = [5, 6, 7, 1, 2, 3] return: [1, 2, 3, 5, 6, 7]
    // you may modify the parameters of the function as needed, and add additional methods, although it is not needed.
    // Do not worry about time or space complexity



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        p11(list, 0);
    }
}