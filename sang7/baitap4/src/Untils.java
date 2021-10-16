import java.util.Scanner;
import java.util.Random;

public class Untils {

    public static int nhapVaoMotSo(String title) {
        Scanner scan = new Scanner(System.in);
        System.out.print(title);
        int so = scan.nextInt();
        // scan.close();
        return so;
    }

    public static String nhapVaoMotChuoi(String title) {
        Scanner scan = new Scanner(System.in);
        System.out.print(title);
        String so = scan.nextLine();
        // scan.close();
        return so;
    }

    public static String nhapVaoMotKitu(String title) {
        Scanner scan = new Scanner(System.in);
        System.out.print(title);
        String so = String.valueOf(scan.next().charAt(0));
        return so;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int randInt(int min, int max) {
        Random generator = new Random();
        int randomNum = generator.nextInt((max - min) + 1) + min;
        return randomNum;
    }

}
