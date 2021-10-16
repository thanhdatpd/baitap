import java.util.Scanner;

public class Bai3 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer n, m, max, min = 0;
        int mang1[][] = new int[100][100];

        // nhập ma trận
        n = Untils.nhapVaoMotSo("\nNhập số dòng của ma trận: ");
        m = Untils.nhapVaoMotSo("\nNhập số cột của ma trận: ");
        System.out.println("Bắt đầu nhập ma trận: ");
        mang1 = MangHandle.nhapMangHaiChieu(n, m);

        // in mảng 2 chiều
        System.out.println("\nMa trận đã nhập: ");
        MangHandle.xuatMangHaiChieu(mang1, n, m);

        // in max
        max = MangHandle.maxMangHaiChieu(mang1, n, m);
        System.out.println("\nPhần tử lớn nhất của ma trận là: " + max);

        // in min
        min = MangHandle.minMangHaiChieu(mang1, n, m);
        System.out.println("\nPhần tử bé nhất của ma trận là: " + min);

        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
