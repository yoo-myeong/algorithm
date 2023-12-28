package programmers.problem_12916;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        char[] charArr = s.toCharArray();

        int pCount = 0;
        int yCount = 0;

        for (char ch: charArr) {
            if (Character.toLowerCase(ch) == 'p') pCount++;
            else if (Character.toLowerCase(ch) == 'y') yCount++;
        }

        return pCount == yCount;
    }
}
