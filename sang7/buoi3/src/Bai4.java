import java.io.*;
import java.util.Scanner;

public class Bai4 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer a, b, kq = 0;
        char toanTu;

        System.out.println("Bai 4: Máy tính đơn giản");
        System.out.print("Nhập 2 số a b: ");
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.print("Nhập toán tử (+-*/%): ");

        toanTu = scan.next().charAt(0);

        System.out.printf("Phép tính: %d %c %d  \n", a, toanTu, b);

        switch (toanTu) {
            case '+':
                kq = a + b;
                break;
            case '-':
                kq = a - b;
                break;
            case '*':
                kq = a + b;
                break;
            case '/':
                kq = a / b;
                break;
            case '%':
                kq = a % b;
                break;
        }

        System.out.printf("Kết quả: %d \n\n", kq);

        scan.nextLine();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
