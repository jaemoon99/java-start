package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nums = new int[5];

        System.out.println(nums.length + "개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("입력한 정수의 합계: " + sum);

        double average = (double) sum / nums.length;
        System.out.println("입력한 정수의 평균: " + average);
    }
}
