import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number = scanner.nextInt();

        var hundreds = number / 100;
        var tens = (number - hundreds * 100) / 10;
        var unit = number - hundreds * 100 - tens * 10;

        System.out.println(hundreds + tens + unit);
    }
}