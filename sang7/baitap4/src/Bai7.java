import java.io.*;
import java.util.Scanner;

public class Bai7 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        String goc;

        System.out.println("Bai 7: ");
        goc = Untils.nhapVaoMotChuoi("Nhập chuỗi: ");

        goc = StringUntils.chuanHoa(goc);
        System.out.printf("\nChuỗi sau chuẩn hoá là: %s", goc);
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
