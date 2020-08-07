import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var length = scanner.nextInt();

        var previousNumber = scanner.nextInt();
        var inOrder = true;
        for (var i = 1; i < length; i++) {
            var actualNumber = scanner.nextInt();
            if (previousNumber > actualNumber) {
                inOrder = false;
                break;
            }
            previousNumber = actualNumber;
        }

        System.out.println(inOrder);
    }
}