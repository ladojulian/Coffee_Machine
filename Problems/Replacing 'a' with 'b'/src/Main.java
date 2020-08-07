import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var str = scanner.next();

        System.out.println(str.replace('a', 'b'));
    }
}