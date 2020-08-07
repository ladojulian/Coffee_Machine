import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var numbers = new int[scanner.nextInt()];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        var maxSequence = 1;
        var actualSequence = 1;
        for (var i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] <= numbers[i + 1]) {
                actualSequence++;
            } else {
                maxSequence = Math.max(maxSequence, actualSequence);
                actualSequence = 1;
            }
        }

        System.out.println(Math.max(maxSequence, actualSequence));
    }
}