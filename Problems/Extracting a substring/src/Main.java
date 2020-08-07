import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var str = scanner.nextLine();
        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();

        System.out.println(str.substring(number1, number2 + 1));
    }
}