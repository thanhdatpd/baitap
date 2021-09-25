import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class Bai11 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        Untils.clearScreen();

        System.out.println("Bai 11: ");

        Calendar calendar = Calendar.getInstance();

        System.out.printf("Ngày tháng năm hiện tại là: %d/%d/%d", calendar.get(Calendar.DATE),
                calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
        scan.nextLine();
    }

    public static void main(String[] args) {
        main();
    }
}
