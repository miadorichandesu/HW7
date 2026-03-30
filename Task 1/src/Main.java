import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество жабьих глаз:");
        toadEyesCount = scanner.nextInt();
        System.out.println("Введите количество слез вурдалака:");
        ghoulTearsCount = scanner.nextInt();
        System.out.println("Введите количество костей ворона:");
        ravenBonesCount = scanner.nextInt();
        System.out.println("Введите количество пельменей:");
        dumplingsCount = scanner.nextInt();

        boolean isCanMake = false;

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете изготовить элексир зоркости");
            isCanMake = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете изготовить элексир стойкости");
            isCanMake = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете изготовить элексир скрытности");
            isCanMake = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Вы можете изготовить запретный элексир");
            isCanMake = true;
        }
        if (!isCanMake) {
            System.out.println("Вы не можете изготовить ни одного элексира");
        }
    }
}
