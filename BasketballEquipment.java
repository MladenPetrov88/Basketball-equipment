import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax * 0.60;
        double equip = shoes * 0.80;
        double ball = equip / 4;
        double accessories = ball / 5;
        double totalPrice = tax + shoes + equip + ball + accessories;

        System.out.printf("%.2f", totalPrice);
    }
}
