import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.List;

public class App {

    private static List<NhanVien> mangNV = new Vector<>();
    private static Scanner scan = new Scanner(System.in);

    public static void waitEnter() {
        try {
            System.in.read();
        } catch (IOException e) {

        }
    }

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
        xapXep();
        System.out.println("Xuất nhân viên");

        System.out.printf("%5s %20s \t%10s \t%20s \t%10s \t%10s \n", "STT", "Họ tên", "Ngày sinh", "Địa chỉ", "Lương",
                "Số con");

        for (int i = 0; i < mangNV.size(); i++) {
            System.out.printf("%5d", i + 1);
            mangNV.get(i).inNhanVien();
        }
        System.out.println("");
    }

    public static void xapXep() {

        for (int i = 0; i < mangNV.size() - 1; i++) {
            for (int j = i + 1; j < mangNV.size(); j++) {
                if (mangNV.get(i).getLuong() > mangNV.get(j).getLuong()) {
                    NhanVien temp = mangNV.get(j);
                    mangNV.set(j, mangNV.get(i));
                    mangNV.set(i, temp);
                }
            }
        }
    }

    public static void xoa() {
        Integer z = 0, yesno = 0;

        while (true) {

            System.out.println("Xoá nhân viên");

            xuat();

            System.out.print("Chọn nhân viên muốn xoá (nhập STT hoặc nhập -1 để thoát): ");
            z = scan.nextInt();

            if (z == -1)
                return;

            if (z < 0 || z > mangNV.size()) {
                System.out.println("STT không hợp lệ, mời nhập lại!");
                waitEnter();
                continue;
            } else {
                System.out.print("Bạn có chắc muốn xoá nhân viên STT là " + z + "(1 có, 2 không): ");
                yesno = scan.nextInt();
                if (yesno == 1) {
                    mangNV.remove(z - 1);
                    continue;
                } else {
                    continue;
                }
            }

        }

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
        waitEnter();
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
            System.out.println("4: Xoá nhân viên");
            System.out.println("0: Để thoát chương trình");
            System.out.print("Nhập lựa trọn (1,2,3,0): ");
            a = scan.nextInt();
            switch (a) {
                case 1:
                    nhap();
                    continue;
                case 2:
                    xuat();
                    waitEnter();
                    continue;
                case 3:
                    tinhTong();
                    continue;
                case 4:
                    xoa();
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
