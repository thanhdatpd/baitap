import java.io.*;
import java.util.Scanner;

public class Bai10 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        String goc;
        Boolean check;

        System.out.println("Bai 10: ");
        goc = Untils.nhapVaoMotChuoi("Nhập chuỗi: ");

        check = StringUntils.checkDoiXung(goc);
        if (check) {
            System.out.printf("\nChuỗi \"%s\" là chuỗi đối xứng\n", goc);
        } else {
            System.out.printf("\nChuỗi \"%s\" không phải là chuỗi đối xứng\n", goc);
        }
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
