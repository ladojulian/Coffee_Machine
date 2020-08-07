import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        var times = 0;
        var n = scanner.nextInt();
        for (var i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                times++;
            }
        }

        System.out.println(times);
    }
}