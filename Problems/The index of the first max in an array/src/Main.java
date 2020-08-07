import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        var max = Integer.MIN_VALUE;
        var index = 0;
        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > max) {
                index = i;
                max = numbers[i];
            }
        }

        System.out.println(index);
    }
}