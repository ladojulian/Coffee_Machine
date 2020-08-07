import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        var n = scanner.nextInt();
        var m = scanner.nextInt();

        var occurNext = true;
        for (var i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] == n && numbers[i + 1] == m) ||
                    (numbers[i] == m && numbers[i + 1] == n)) {
                occurNext = false;
                break;
            }
        }

        System.out.println(occurNext);
    }
}