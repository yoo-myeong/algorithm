package programmers.problem_12922;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int n) {
        String answer = "";

        answer = IntStream
                .range(0, n)
                .mapToObj(i -> {
                    if (i % 2 == 0) return '수';
                    else return '박';
                }).map(String::valueOf)
                .collect(Collectors.joining());

        return answer;
    }
}
