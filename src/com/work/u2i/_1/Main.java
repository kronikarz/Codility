package com.work.u2i._1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int array[] = new int[]{};
        System.out.println("test 1: " + solution.solution(array));

        array = new int[]{2, 2, 3, 4, 5, 5, 2, 2, 1, 1, 2, 5}; //4
        System.out.println("test 2: " + solution.solution(array));

        array = new int[]{1, 2, 1, 2, 1, 0}; //5
        System.out.println("test 3: " + solution.solution(array));

        array = new int[]{-2, -4, -5, -6, -5, -10, -10, 11}; //5
        System.out.println("test 4: " + solution.solution(array));

        array = new int[]{1, 2, 2, 2, 1}; //3
        System.out.println("test 5: " + solution.solution(array));

        array = new int[]{1, 1, 1, 2, 1, 1}; //3
        System.out.println("test 6: " + solution.solution(array));

        array = new int[]{2, 2, 2, 1, 1}; //2
        System.out.println("test 7: " + solution.solution(array));

        array = new int[]{1, 1, 1, 1};//1
        System.out.println("test 8: " + solution.solution(array));

        array = new int[]{1, 2, 1}; //3
        System.out.println("test 9: " + solution.solution(array));

        array = new int[]{1, 1, 2}; //2
        System.out.println("test 10: " + solution.solution(array));

        array = new int[]{1, 1}; //1
        System.out.println("test 11: " + solution.solution(array));

        array = new int[]{1, 2}; //2
        System.out.println("test 11: " + solution.solution(array));

        array = new int[]{1}; //1
        System.out.println("test 11: " + solution.solution(array));
    }
}