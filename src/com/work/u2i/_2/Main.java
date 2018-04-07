package com.work.u2i._2;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int array[] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("test 1: " + solution.solution(array));

        array = new int[]{5, -2, 3, 8, 6}; //3
        System.out.println("test 1: " + solution.solution(array));

        array = new int[]{-5, -5, -5, -42, 6, 12}; //4
        System.out.println("test 2: " + solution.solution(array));

        array = new int[]{0, 5, -1, 4, 5, 6, 12}; //5 - {0,5,-1,4,5}
        System.out.println("test 5: " + solution.solution(array));

        array = new int[]{0, 5, -1, 4, 5, 6, 12, 15, -3, 55, 66, 44}; //9
        System.out.println("test 5: " + solution.solution(array));
    }
}
