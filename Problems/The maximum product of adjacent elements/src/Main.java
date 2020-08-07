import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        var product = 0;
        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (i != 0 && numbers[i] * numbers[i - 1] > product) {
                product = numbers[i] * numbers[i - 1];
            }
        }
        System.out.println(product);
    }
}