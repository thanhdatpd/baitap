import java.io.*;
import java.util.Scanner;

public class Bai1 {

    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Double a, b, x = .0;
        System.out.println("Bai 1: Giải phương trình bậc nhất");
        System.out.print("Nhập hệ số a b: ");
        a = scan.nextDouble();
        b = scan.nextDouble();

        System.out.printf("Phương trình %.3f x + %.3f = 0 \n", a, b);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Có vô số nghiệm");
            } else {
                System.out.println("Vô nghiệm");
            }
        } else {
            x = (-b) / a;
            System.out.printf("Có 1 nghiệm: %.3f \n\n", x);
        }

        // scan.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
