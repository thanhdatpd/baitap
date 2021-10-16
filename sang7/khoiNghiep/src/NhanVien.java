import java.util.InputMismatchException;
import java.util.Scanner;

public class NhanVien {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private Double luong;
    private Integer soCon;

    public void nhapNhanVien() {

        try {

            Scanner scan = new Scanner(System.in);

            System.out.print("Họ tên nhân viên: ");
            hoTen = scan.nextLine();
            System.out.print("Ngày sinh: ");
            ngaySinh = scan.nextLine();
            System.out.print("Địa chỉ: ");
            diaChi = scan.nextLine();
            System.out.print("Lương: ");
            luong = scan.nextDouble();
            System.out.print("Số con: ");
            soCon = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Có lỗi khi nhập liệu!");
        }
    }

    public Double getLuong() {
        return luong;
    }

    public Integer getSoCon() {
        return soCon;
    }

    public void inNhanVien() {
        System.out.printf("%20s \t%10s \t%20s \t%10.1f \t%10d \n", hoTen, ngaySinh, diaChi, luong, soCon);
    }

}