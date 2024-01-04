package programmers.problem_12933;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        long answer = 0;

        String str = String.valueOf(n);
        Character[] chArr = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        int[] nums = new int[chArr.length];

        for (int i = 0; i< chArr.length; i ++) {
            nums[i] = (int) chArr[i];
        }

        Arrays.sort(chArr, Collections.reverseOrder());

        for (Character ch: chArr) {
            answer = answer * 10 + Character.getNumericValue(ch);
        }

        return answer;
    }
}
