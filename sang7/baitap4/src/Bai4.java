import java.io.*;
import java.util.Scanner;

public class Bai4 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        String a, b;
        int count;

        System.out.println("Bai 4: ");
        a = Untils.nhapVaoMotChuoi("Nhập vào 1 chuỗi bất kì: ");
        b = Untils.nhapVaoMotChuoi("Nhập vào 1 kí tự bất kì: ");

        count = StringUntils.demLanXuatHien(a, b);
        System.out.printf("\nSố lần xuất hiện kí tự \"%s\" trong chuỗi\"%s\" là %d", b, a, count);

        scan.nextLine();

    }

    public static void main(String[] args) {
        main();
    }
}
