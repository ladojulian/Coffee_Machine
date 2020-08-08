import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n = scanner.nextInt();

        var spiral = new int[n][n];

        var number = 1;
        var posI = 0;
        var iMin = 0;
        var iMax = n - 1;
        var posJ = 0;
        var jMin = 0;
        var jMax = n - 1;
        while(number <= n * n) {
            if (posI == iMin && posJ == jMin) {
                for (; posJ <= jMax; posJ++) {
                    if (spiral[posI][posJ] == 0) {
                        spiral[posI][posJ] = number;
                        number++;
                    }
                }
                posJ--;
                if (number != n + 1) {
                    jMin++;
                }
                continue;
            }

            if (posI == iMin && posJ == jMax) {
                for(; posI <= iMax; posI++) {
                    if (spiral[posI][posJ] == 0) {
                        spiral[posI][posJ] = number;
                        number++;
                    }
                }
                posI--;
                iMin++;
                continue;
            }

            if (posI == iMax && posJ == jMax) {
                for(; posJ >= jMin; posJ--) {
                    if (spiral[posI][posJ] == 0) {
                        spiral[posI][posJ] = number;
                        number++;
                    }
                }
                posJ++;
                jMax--;
                continue;
            }

            if (posI == iMax && posJ == jMin) {
                for(; posI >= iMin; posI--) {
                    if (spiral[posI][posJ] == 0) {
                        spiral[posI][posJ] = number;
                        number++;
                    }
                }
                posI++;
                iMax--;
            }
        }

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}