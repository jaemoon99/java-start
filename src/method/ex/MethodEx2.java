package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
    }

    public static void printMessage(String message, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}
