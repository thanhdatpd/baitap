import java.io.*;
import java.util.Scanner;

public class Bai6 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        String goc, ten;

        System.out.println("Bai 6: ");
        goc = Untils.nhapVaoMotChuoi("Nhập đầy đủ họ tên: ");

        ten = StringUntils.tachTen(goc);
        System.out.printf("\nTên trong chuỗi\"%s\" là %s", goc, ten);
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
