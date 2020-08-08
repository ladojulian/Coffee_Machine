import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n =  scanner.nextInt();
        var number = n * n;

        var sudoku = new int [number][number];
        for (var i = 0; i < number; i++) {
            for (var j = 0; j < number; j++) {
                sudoku[i][j] = scanner.nextInt();
                if (sudoku[i][j] > number) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        var foundIt = false;
        for (var i = 0; i < number; i++) {
            for (var k = 1; k <= number; k++) {
                for (var j = 0; j < number; j++) {
                    if (sudoku[i][j] == k && !foundIt) {
                        foundIt = true;
                    } else if (sudoku[i][j] == k && foundIt) {
                        System.out.println("NO");
                        return;
                    }
                }
                foundIt = false;
            }
        }

        for (var j = 0; j < number; j++) {
            foundIt = false;
            for (var k = 1; k <= number; k++) {
                for (var i = 0; i < number; i++) {
                    if (sudoku[i][j] == k) {
                        if (foundIt) {
                            System.out.println("NO");
                            return;
                        } else {
                            foundIt = true;
                        }
                    }
                }
                foundIt = false;
            }
        }

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n; j++) {
                var array = new int [number];
                var q = 0;
                for (var o = n * i; o < n * i + n; o++) {
                    for (var p = n * j; p < n * j + n; p++) {
                        array[q] = sudoku[o][p];
                        q++;
                    }
                }

                foundIt = false;
                for (var k = 1; k <= number; k++) {
                    for (var a : array) {
                        if (a == k) {
                            if (foundIt) {
                                System.out.println("NO");
                                return;
                            } else {
                                foundIt = true;
                            }
                        }
                    }
                    foundIt = false;
                }
            }
        }

        System.out.println("YES");
    }
}