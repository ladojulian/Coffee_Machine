import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        System.out.println(number > 0 && number < 10);
    }
}