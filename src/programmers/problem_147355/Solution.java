package programmers.problem_147355;

import java.util.stream.LongStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("500220839878", "7"));
    }

    public static long solution(String t, String p) {
        var answer = LongStream.range(0, t.length() - p.length() + 1).reduce(0, (acc, cur) -> {
            String sliced = t.substring((int) cur, (int) (cur + p.length()));

            if (Long.parseLong(p) >= Long.parseLong(sliced)) acc ++;

            return acc;
        });

        return answer;
    }
}
