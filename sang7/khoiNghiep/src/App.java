import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.List;

public class App {

    private static List<NhanVien> mangNV = new Vector<>();
    private static Scanner scan = new Scanner(System.in);

    public static void nhap() {
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Nhập nhân viên");
            System.out.println("Nhập nhân viên thứ " + (mangNV.size() + 1));

            NhanVien nv = new NhanVien();
            nv.nhapNhanVien();

            mangNV.add(nv);
            System.out.print("Bạn có muốn nhập tiếp(bấm enter để tiếp tục, 0 để thoát): ");
            String a = "";
            a = scan.nextLine();
            System.out.printf("a%sa  %d", a, a.length());
            if (a.length() == 0)
                continue;
            else {
                return;
            }
        }
    }

    public static void xuat() {
        Integer z = 0;
        System.out.println("Xuất nhân viên");

        System.out.printf("%20s \t%10s \t%20s \t%10s \t%10s \n", "Họ tên", "Ngày sinh", "Địa chỉ", "Lương", "Số con");

        for (int i = 0; i < mangNV.size(); i++) {
            // System.out.println("Nhân viên thứ " + (i + 1));
            mangNV.get(i).inNhanVien();
        }
        System.out.println("");

        z = scan.nextInt();

    }

    public static void xoa() {
        Integer z = 0;
        System.out.println("Danh sách nhân viên");

        System.out.printf("%20s \t%10s \t%20s \t%10s \t%10s \n", "Họ tên", "Ngày sinh", "Địa chỉ", "Lương", "Số con");

        for (int i = 0; i < mangNV.size(); i++) {
            // System.out.println("Nhân viên thứ " + (i + 1));
            mangNV.get(i).inNhanVien();
        }
        System.out.println("");

        z = scan.nextInt();

    }

    public static void tinhTong() {
        Integer a, tongSoCon = 0;
        ;
        Double tongLuong = 0.0;

        for (a = 0; a < mangNV.size(); a++) {
            tongSoCon += mangNV.get(a).getSoCon();
            tongLuong += mangNV.get(a).getLuong();
        }

        System.out.printf("\nTổng lương: %f \nTổng số con: %d \n", tongLuong, tongSoCon);
        String z = scan.nextLine();
        return;

    }

    public static void main(String[] args) throws Exception {
        Integer a;

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("1: Nhập nhân viên");
            System.out.println("2: In nhân viên");
            System.out.println("3: Tính tổng lương, tổng số con");
            System.out.println("0: Để thoát chương trình");
            System.out.print("Nhập lựa trọn (1,2,3,0): ");
            a = scan.nextInt();
            switch (a) {
                case 1:
                    nhap();
                    continue;
                case 2:
                    xuat();
                    continue;
                case 3:
                    tinhTong();
                    continue;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);

                    break;

            }
        }

    }
}
