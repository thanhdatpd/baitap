import java.io.*;
import java.util.Scanner;

public class Bai8 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        String goc;

        System.out.println("Bai 8: ");
        goc = Untils.nhapVaoMotChuoi("Nhập sâu gồm (0 và 1): ");

        goc = StringUntils.daoBit(goc);
        System.out.printf("\nChuỗi sau đảo 0 và 1 là: %s", goc);
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
