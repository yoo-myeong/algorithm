package programmers.problem_12935;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
    }

    public static int[] solution(int[] arr) {
        int minVal = Arrays.stream(arr).min().orElseThrow();

        int[] answer =  Arrays.stream(arr).filter(i -> i != minVal).toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
