import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer a;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            Untils.clearScreen();
            Scanner scan = new Scanner(System.in);
            System.out.println("Bài tập tuần 4: ");
            System.out.print("Nhập số bài (1,2,3...12): ");
            a = scan.nextInt();
            // scan.close();
            switch (a) {
                case 1:
                    Bai1.main();
                    break;
                case 2:
                    Bai2.main();
                    break;
                case 3:
                    Bai3.main();
                    break;
                case 4:
                    Bai4.main();
                    break;
                case 5:
                    Bai5.main();
                    break;
                case 6:
                    Bai6.main();
                    break;
                case 7:
                    Bai7.main();
                    break;
                default:
                    System.exit(0);

            }
        }

    }
}
