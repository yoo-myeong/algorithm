package programmers.problem_12928;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        solution(12);
    }

    public static int solution(int n) {
        int answer = 0;

        int start = 1;
        int end = n;
        List<Integer> nums = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (n % i == 0 ) nums.add(i);
        }
//        System.out.println(nums);

        answer = nums.stream().reduce(0, Integer::sum);

        return answer;
    }
}