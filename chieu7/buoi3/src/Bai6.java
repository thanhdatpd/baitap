import java.io.*;
import java.util.Scanner;

public class Bai6 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer a = 0;
        Double thue = .0;
        System.out.println("Bai 6: Tính thuế thu nhập");
        System.out.print("Nhập thu nhập (vd: 12000000): ");
        a = scan.nextInt();

        if (a < 9000000) {
            thue = .0;

        } else if (a >= 9000000 && a < 15000000) {
            thue = (a - 9000000) * 0.15;

        } else if (a >= 15000000 && a < 30000000) {
            thue = 6000000 * 0.1 + (a - 15000000) * 0.15;

        } else {
            thue = 6000000 * 0.1 + 15000000 * 0.15 + (a - 30000000) * 0.2;
        }

        System.out.printf("Thuế phải trả: %.0f vnđ \n\n", thue);
        scan.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
