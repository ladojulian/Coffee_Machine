import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var k = scanner.nextInt();

        System.out.println(k % n);
    }
}