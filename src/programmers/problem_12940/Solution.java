package programmers.problem_12940;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
    }

    public static int[] solution(int n, int m) {
        int less = Math.min(n, m);
        int greater = Math.max(n, m);

        int min = IntStream.range(1, less + 1)
                .map(i -> 1 + (less - i))
                .filter(i -> less % i == 0 && greater % i == 0)
                .findAny().orElse(-1);

        int max = IntStream.range(greater, less * greater + 1)
                .filter(i -> i % greater == 0 && i % less == 0)
                .findAny()
                .orElse(-1);

        return new int[]{min, max};
    }
}
