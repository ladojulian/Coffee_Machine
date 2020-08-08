import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();

        var matrix = new int[n][n];

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        var k = 1;
        for (var i = 0; i < n - 1; i++) {
            for (var j = k; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}