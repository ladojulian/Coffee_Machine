import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        var sum = 0;
        var number = scanner.nextInt();
        for (var i = 0; i < numbers.length; i++) {
            if (numbers[i] > number) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}