import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        var matrix = new int[n][n];

        var k = 0;
        for (var i = 0; i < n; i++) {
            for (var j = i; j < n; j++) {
                matrix[i][j] = k;
                matrix[j][i] = k;
                k++;
            }
            k = 0;
        }

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}