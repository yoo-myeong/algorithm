package programmers.problem_12932;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        String str = String.valueOf(n);

        int length = str.length();

        int[] answer = new int[length];

        for (int i = 0; i < length; i ++) {
            answer[i] = Character.getNumericValue(str.charAt(length - i - 1));
        }

        return answer;
    }
}
