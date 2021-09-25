import java.io.*;
import java.util.Scanner;

public class Bai5 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();
        String a, b;
        int count;

        System.out.println("Bai 5: ");
        a = Untils.nhapVaoMotChuoi("Nhập vào 1 chuỗi bất kì: ");

        count = StringUntils.demLanXuatHienKyTuHoa(a);
        System.out.printf("\nSố lần xuất hiện kí tự in hoa trong chuỗi \"%s\" là %d", a, count);
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
