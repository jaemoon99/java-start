package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 조회 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int menu = scanner.nextInt();
            int amount;

            switch (menu) {
                case 1:
                    System.out.print("입금할 금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금할 금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = widthdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다, 다시 입력해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int widthdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }
}
