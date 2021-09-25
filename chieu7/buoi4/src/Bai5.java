import java.io.*;
import java.util.Scanner;

public class Bai5 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer a = 0;
        String kq = "";
        System.out.println("Bai 5: Phân loại điểm");
        System.out.print("Nhập điểm: ");
        a = scan.nextInt();

        System.out.printf("Điểm đã nhập: %d  \n", a);

        switch (a) {
            case 0:
            case 1:
            case 2:
            case 3:
                kq = "Kém";
                break;
            case 4:
                kq = "Yếu";
                break;
            case 5:
            case 6:
                kq = "Trung bình";
                break;
            case 7:
            case 8:
                kq = "Khá";
                break;
            case 9:
            case 10:
                kq = "Giỏi";
                break;
        }

        System.out.printf("Kết quả: Xếp loại %s \n\n", kq);

        scan.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
