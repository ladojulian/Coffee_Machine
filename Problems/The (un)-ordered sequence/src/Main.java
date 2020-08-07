import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var currentNumber = scanner.nextInt();
        var nextOne = scanner.nextInt();
        var isDesc = true;
        var isAsc = true;
        while (nextOne != 0) {
            if (currentNumber < nextOne) {
                isDesc = false;
            }
            if (currentNumber > nextOne) {
                isAsc = false;
            }

            currentNumber = nextOne;
            nextOne = scanner.nextInt();
        }

        System.out.println(isAsc || isDesc);
    }
}