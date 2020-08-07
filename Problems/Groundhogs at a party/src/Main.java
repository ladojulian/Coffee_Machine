import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var cups = scanner.nextInt();
        var isWeekend = scanner.nextBoolean();

        System.out.println((isWeekend && cups >= 15 && cups <= 25) ||
                (!isWeekend && cups >= 10 && cups <= 20));
    }
}