package programmers.problem_12948;

import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }

    public static String solution(String phone_number) {
        String answer = "";

        int length = phone_number.length();

        answer = IntStream.range(0, length)
                .map(i -> i < length - 4 ? '*' : phone_number.charAt(i))
                .mapToObj(Character::toString)
                .reduce("", (acc, cur) -> acc + cur);

        return answer;
    }
}
