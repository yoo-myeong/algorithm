package programmers.problem_12919;

import java.util.Objects;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

    public static String solution(String[] seoul) {
        int index = IntStream.range(0, seoul.length).filter(i -> Objects.equals(seoul[i], "Kim")).findFirst().orElseThrow();

        return "김서방은 " + String.valueOf(index) + "에 있다";
    }
}
