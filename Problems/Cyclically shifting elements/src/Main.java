import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        for (var i = 0; i < numbers.length - 1; i++) {
            numbers[i + 1] = scanner.nextInt();
        }
        numbers[0] = scanner.nextInt();

        for (var i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}