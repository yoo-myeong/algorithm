package programmers.problem_12950;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int xlength = arr1.length;
        int ylength = arr1[0].length;

        int[][] answer = new int[xlength][ylength];

        for (int i = 0; i < xlength; i++) {
            for (int j = 0; j < ylength; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
