import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        int sizeOfVinny = 80;
        int addCount = 2;
        int sizeOfHole = 95;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько горшков с мёдом съел Винни?");
        int countOfHoney = scanner.nextInt();
        sizeOfVinny += countOfHoney * addCount;
        if (sizeOfHole < sizeOfVinny) {
            System.out.println("Кто-то очень много ест!");
        } else {
            System.out.println("Всё обошлось.");
        }
    }

}
