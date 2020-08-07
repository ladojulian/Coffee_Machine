import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var durationDays = scanner.nextInt();
        var foodCostPerDay = scanner.nextInt();
        var flightCost = scanner.nextInt();
        var nightHotelCost = scanner.nextInt();

        System.out.println(flightCost * 2 + durationDays * foodCostPerDay + (durationDays - 1) * nightHotelCost);
    }
}