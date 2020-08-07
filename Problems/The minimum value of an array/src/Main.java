import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var array = new int[scanner.nextInt()];

        var min = Integer.MAX_VALUE;
        for (var i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}