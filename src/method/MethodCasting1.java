package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        // printNumber(number); // double이 int보다 크기 때문에 오류 발생
        printNumber((int) number); // 명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
