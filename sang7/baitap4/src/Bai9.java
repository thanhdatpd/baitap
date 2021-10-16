import java.io.*;
import java.util.Scanner;

public class Bai9 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        String goc;

        System.out.println("Bai 9: ");
        goc = Untils.nhapVaoMotChuoi("Nhập chuỗi: ");

        goc = StringUntils.daoChuoi(goc);
        System.out.printf("\nChuỗi sau đảo là: %s", goc);
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
