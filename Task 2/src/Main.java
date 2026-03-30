public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i ++) {
            if (i % 2 == 0) {
                System.out.println("Уволен айтишник с айди " + i);
            }
        }

        /* или
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Уволен айтишник с айди " + i);
        }
         */

        int i = 2;
        while (i % 2 == 0) {
            System.out.println("Уволен айтишник с айди " + i);
            i += 2;
            if (i >= 101) {
                break;
            }
        }

        /* или
        while (i <= 100) {
    System.out.println("Уволен айтишник с айди " + i);
    i += 2;
        }
         */
    }
}
