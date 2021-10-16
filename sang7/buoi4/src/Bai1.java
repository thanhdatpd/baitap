import java.io.*;
import java.util.Scanner;

public class Bai1 {

    public static int[][] mang = new int[100][100];
    public static int m = 0;
    public static int n = 0;

    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Double trungBinhCong = .0;
        Integer a, i, tong = 0, countTBC = 0;

        int[] mang = new int[100];
        System.out.println("Bai 1: Nhập mảng số nguyên, tính trung bình cộng chia hết cho 3,sắp xếp và in ra");
        System.out.print("Nhập số phần tử trong mảng: ");
        a = scan.nextInt();

        mang = MangHandle.nhapMang(a);

        for (i = 0; i < a; i++) {
            if (mang[i] % 3 == 0) {
                tong += mang[i];
                ++countTBC;
            }
        }
        trungBinhCong = tong / (double) countTBC;

        System.out.printf("Trung bình cộng chia hết cho 3 = %f \n", trungBinhCong);

        mang = MangHandle.sapXep(mang, a, 1);

        System.out.print("Mảng sau sắp xếp: ");

        MangHandle.xuatMang(mang, a);

        scan.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
