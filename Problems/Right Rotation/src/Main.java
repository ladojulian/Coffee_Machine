import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var numbers = scanner.nextLine().trim().split(" ");
        var numbersRotated = new String[numbers.length];

        var rotate = scanner.nextInt() % numbers.length;
        for (var i = 0; i < numbers.length - rotate; i++) {
            numbersRotated[i + rotate] = numbers[i];
        }

        for (var i = 0; i < rotate; i++) {
            numbersRotated[i] = numbers[numbers.length - rotate + i];
        }

        for (var i = 0; i < numbers.length; i++) {
            System.out.print(numbersRotated[i] + " ");
        }
    }
}