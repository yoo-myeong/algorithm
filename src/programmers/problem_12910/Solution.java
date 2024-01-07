package programmers.problem_12910;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {5,9,7,10}, 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(e -> e%divisor == 0).sorted().toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
