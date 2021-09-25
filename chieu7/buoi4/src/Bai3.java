import java.util.Scanner;

public class Bai3 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer k, n = 0;
        // int mang[];
        System.out.println("Bai 3: \n");
        System.out.print("Nhập số phần tử trong mảng: ");
        n = scan.nextInt();
        // int[] mang = MangHandle.nhapMang(n);
        System.out.print("\nNhập số k cần tìm trong mảng: ");
        k = scan.nextInt();
        // MangHandle.timPhanTu(mang, n, k);
        scan.close();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
