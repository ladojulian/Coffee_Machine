import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var companies = scanner.nextInt();
        var yearlyIncomes = new int[companies];

        for (var i = 0; i < companies; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }

        var max = 0D;
        var maxIndex = 0;
        for (var i = 0; i < companies; i++) {
            var tax = (double) yearlyIncomes[i] * scanner.nextInt() / 100;
            if (tax > max) {
                max = tax;
                maxIndex = i;
            }
        }

        System.out.println(maxIndex + 1);
    }
}