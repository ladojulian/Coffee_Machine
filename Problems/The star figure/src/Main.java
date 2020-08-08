import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        var matrix = new String[n][n];

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                if (i == j || i == n / 2 || j == n / 2 || i + j == n - 1) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
            }
        }

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}