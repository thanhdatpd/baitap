import java.io.*;
import java.util.Scanner;

public class Bai2 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Double a, b, c, delta, x = .0;

        System.out.println("Bai 2: Giải phương trình bậc 2");
        System.out.print("Nhập hệ số a b c: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        System.out.printf("Phương trình %.3fx^2 + %.3fx + %.3f = 0 \n", a, b, c);

        delta = Math.pow(b, 2) + (4 * a * c);

        if (a == 0) {
            System.out.printf("Có 1 nghiệm: %.3f \n\n", -c / b);
        } else if (delta > 0) {
            System.out.printf("Có 2 nghiệm:\n x1 = %.3f \n x2 = %.3f \n\n", (-b + Math.sqrt(delta)) / (2 * a),
                    (-b - Math.sqrt(delta)) / (2 * a));
        } else if (delta < 0) {
            System.out.println("Vô nghiệm");
        } else if (delta == 0) {
            System.out.printf("Có nghiệm kép : %.3f \n\n", -b / (2 * a));
        }
        scan.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
