package programmers.problem_12947;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static boolean solution(int x) {
        String str = String.valueOf(x);

        int sum = Arrays.stream(str.chars().toArray()).reduce(0, (acc, cur) -> acc + Character.getNumericValue(cur));
        System.out.println(sum);

        return x % sum == 0;
    }
}
