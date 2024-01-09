package programmers.problem_12903;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }

    public static String solution(String s) {
        String answer = "";

        int sliceLength;
        int sliceStartPoint = (s.length() -1) / 2;
        if (s.length() % 2 == 0) {
            sliceLength = 2;
        } else {
            sliceLength = 1;
        }

        answer = s.substring(sliceStartPoint, sliceStartPoint + sliceLength);

        return answer;
    }
}
