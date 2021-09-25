
import java.util.Scanner;

public class Bai1 {

    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        int a, b, viTri;
        int[] mang = new int[100];
        System.out.println("Bai 1:");

        // nhập mảng
        a = Untils.nhapVaoMotSo("\nNhập số phần tử trong mảng: ");
        mang = MangHandle.nhapMang(a);

        // xuất các giá trị của mảng
        MangHandle.xuatMang(mang, a);

        // xắp xếp mảng: tăng dần
        mang = MangHandle.sapXep(mang, a, 1);
        System.out.print("\nMảng sau sắp xếp: ");
        MangHandle.xuatMang(mang, a);

        // tìm kiếm phần tử
        b = Untils.nhapVaoMotSo("\nNhập số cần tìm: ");
        viTri = MangHandle.viTriPhanTu(mang, a, b);

        if (viTri > -1) {
            System.out.println("Vị trí phần tử cần tìm:" + viTri);
        } else {
            System.out.println("Không tìm thấy phần tử cần tìm");
        }

        mang = MangHandle.thayThe(mang, a);
        System.out.print("\nMảng sau thay thế: ");
        MangHandle.xuatMang(mang, a);

        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
