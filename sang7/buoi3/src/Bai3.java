import java.io.*;
import java.util.Scanner;

public class Bai3 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer a, gia = 0;

        System.out.println("Bai 3: Tinh số điện");
        System.out.print("Nhập số điện đã sử dụng: ");
        a = scan.nextInt();

        if (a < 50) {
            gia = a * 1000;
        } else {
            gia = 50 * 1000 + (a - 50) * 1000;
        }

        System.out.printf("Số tiền phải trả: %d vnđ \n\n", gia);
        scan.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
