import java.util.Scanner;

public class VariablesAndCalculations {

    public static void main(String[] args) {
        double litersForOneSquareMeter = 0.1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая ширина у комнаты?");
        int width = scanner.nextInt();
        System.out.println("Какая длина у комнаты?");
        int length = scanner.nextInt();
        int area = width * length;
        double paintAmount = area / litersForOneSquareMeter;
        System.out.println("Чтобы покрасить такую комнату нужно " + paintAmount + " л. краски!");
    }

}
