import java.io.*;
import java.util.Scanner;

public class Bai12 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        Integer n, m, max, min = 0;
        int mang1[][] = new int[100][100];

        // nhập ma trận
        n = Untils.nhapVaoMotSo("\nNhập số dòng của ma trận: ");
        m = Untils.nhapVaoMotSo("\nNhập số cột của ma trận: ");
        System.out.println("Bắt đầu nhập ma trận: ");
        mang1 = MangHandle.nhapMangHaiChieu(n, m);

        System.out.println("\nMa trận đã nhập: ");
        MangHandle.xuatMangHaiChieu(mang1, n, m);

        mang1 = MangHandle.mangHaiChieuDaoBit(mang1, n, m);

        // in mảng 2 chiều
        System.out.println("\nMa trận sau khi đảo: ");
        MangHandle.xuatMangHaiChieu(mang1, n, m);
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
