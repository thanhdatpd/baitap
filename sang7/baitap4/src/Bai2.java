import java.io.*;
import java.util.Scanner;

public class Bai2 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer n, m, tong = 0;
        int mang1[][] = new int[100][100];
        int mang2[][] = new int[100][100];

        // nhập mảng
        n = Untils.nhapVaoMotSo("\nNhập số dòng của ma trận: ");
        m = Untils.nhapVaoMotSo("\nNhập số cột của ma trận: ");

        System.out.println("Bắt đầu nhập mảng 2 chiều A: ");
        mang1 = MangHandle.nhapMangHaiChieu(n, m);

        System.out.println("\nBắt đầu nhập mảng 2 chiều B: ");
        mang2 = MangHandle.nhapMangHaiChieu(n, m);

        // in mảng 2 chiều
        System.out.println("\nMa trận A: ");
        MangHandle.xuatMangHaiChieu(mang1, n, m);

        System.out.println("\nMa trận B: ");
        MangHandle.xuatMangHaiChieu(mang2, n, m);

        // tính tổng
        tong = MangHandle.TinhTongMangHaiChieu(mang1, n, m) + MangHandle.TinhTongMangHaiChieu(mang2, n, m);

        System.out.println("\n\nTổng của 2 ma trận là: " + tong);

        scan.nextLine();

    }

    public static void main(String[] args) {
        main();
    }
}
