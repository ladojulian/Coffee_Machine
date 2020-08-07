import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        var f = 1L;
        for (; n != 0; n--) {
            f *= n;
        }
        return f;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}