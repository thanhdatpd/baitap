import java.io.*;
import java.util.Scanner;

public class Bai2 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer a, n = 0;
        int[] mang = new int[100];
        System.out.println("Bai 2: \n");
        System.out.print("Nhập số phần tử trong mảng: ");
        n = scan.nextInt();
        mang = MangHandle.nhapMang(n);
        MangHandle.timMin(mang, n);
        MangHandle.timMax(mang, n);
        MangHandle.tinhTong(mang, n);
        MangHandle.timSoNguyenTo(mang, n);
        mang = MangHandle.sapXep(mang, n, 1);

        System.out.println("Mảng sau sắp xếp: ");
        MangHandle.xuatMang(mang, n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
