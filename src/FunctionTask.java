import java.util.Scanner;

public class FunctionTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой длины волосы Рапунцель? Введи три числа чтобы угадать!");
        int answer1 = scanner.nextInt();
        int answer2 = scanner.nextInt();
        int answer3 = scanner.nextInt();
        if (checkAnswer(answer1) || checkAnswer(answer2) || checkAnswer(answer3)) {
            System.out.println("Принц победил!");
        } else {
            System.out.println("Не повезло");
        }
    }

    private static boolean checkAnswer(int answer) {
        return answer == 70;
    }

}
