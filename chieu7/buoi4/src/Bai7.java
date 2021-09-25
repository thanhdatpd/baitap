import java.io.*;
import java.util.Scanner;

public class Bai7 {
    public static void main(Scanner scan) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer a, conlai, s500, s200, s100, s50, s20, s10 = 0;
        System.out.print("Bai 7: Nhập số tiền cần rút (bộ số của 10000): ");
        a = scan.nextInt();
        conlai = a;

        while (conlai >= 10000) {
            if (conlai / 500000 >= 1) {
                s500 = conlai / 500000;
                System.out.println("Số tờ 500.000: " + s500);
                conlai -= s500 * 500000;
                continue;
            }
            if (conlai / 200000 >= 1) {
                s200 = conlai / 200000;
                System.out.println("Số tờ 200.000: " + s200);
                conlai -= s200 * 200000;
                continue;
            }
            if (conlai / 100000 >= 1) {
                s100 = conlai / 100000;
                System.out.println("Số tờ 100.000: " + s100);
                conlai -= s100 * 100000;
                continue;
            }
            if (conlai / 50000 >= 1) {
                s50 = conlai / 50000;
                System.out.println("Số tờ 50.000: " + s50);
                conlai -= s50 * 50000;
                continue;
            }
            if (conlai / 20000 >= 1) {
                s20 = conlai / 20000;
                System.out.println("Số tờ 20.000: " + s20);
                conlai -= s20 * 20000;
                continue;
            }
            if (conlai / 10000 >= 1) {
                s10 = conlai / 10000;
                System.out.println("Số tờ 10.000: " + s10);
                conlai -= s10 * 10000;
                continue;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        main(scan);
    }
}
