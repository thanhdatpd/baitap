import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer a;
        Scanner scan = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            System.out.print("Nhập số bài (1,2,3,4,5,6): ");
            a = scan.nextInt();
            switch (a) {
                case 1:
                    Bai1.main(scan);
                    break;
                case 2:
                    Bai2.main(scan);
                    break;
                case 3:
                    Bai3.main(scan);
                    break;
                case 4:
                    Bai4.main(scan);
                    break;
                case 5:
                    Bai5.main(scan);
                    break;
                case 6:
                    Bai6.main(scan);
                    break;
                case 7:
                    Bai7.main(scan);
                    break;
                default:
                    System.exit(0);

            }
        }

    }
}
