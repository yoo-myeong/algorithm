package programmers.problem_12937;

public class Solution {

    enum NumberType {
        Even,
        Odd
    }

    public static void main(String[] args) {
        String result = solution(3);
        System.out.println(result);
    }
    public static String solution(int num) {
        if (num % 2 == 0) return NumberType.Even.toString();
        else return NumberType.Odd.toString();
    }
}
