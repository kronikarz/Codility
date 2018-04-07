package com.codility.Lesson2_Arrays.CyclicRotation;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int array[] = new int[2];
        int rotation = 1;

        for (int a : solution.solution(array, rotation)) {
            System.out.print(a + " ");
        }
    }
}