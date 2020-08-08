import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();
        var m = scanner.nextInt();

        var maxN = 0;
        var maxM = 0;
        var maxValue = Integer.MIN_VALUE;
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < m; j++) {
                var value = scanner.nextInt();
                if (value > maxValue) {
                    maxValue = value;
                    maxN = i;
                    maxM = j;
                }
            }
        }
        System.out.println(maxN + " " + maxM);
    }
}