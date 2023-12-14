package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요. (0입력시 종료) : ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println("입력한 모든 정수의 합은 " + sum + "입니다.\n프로그램을 종료합니다.");
    }
}
