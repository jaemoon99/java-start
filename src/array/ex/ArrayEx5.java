package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int [] nums = new int[input.nextInt()];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
            sum += nums[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);

        double average = (double) sum / nums.length;
        System.out.println("입력한 정수의 평균: " + average);
    }
}
