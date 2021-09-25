import java.util.Scanner;

public class MangHandle {

    private static boolean isSoNguyenTo(int so) {
        double soDB = (double) so;
        soDB = Math.sqrt(soDB);
        int rangeMax = (int) soDB;
        for (int i = 2; i <= rangeMax; i++) {
            if (so % i == 0)
                return false;
        }
        return true;
    }

    public static void timSoNguyenTo(int[] mang, int n) {
        System.out.print("\n\nCác số nguyên tố có trong mảng: ");
        for (int i = 0; i < n; i++) {
            if (isSoNguyenTo(mang[i]))
                System.out.printf(" %d ", mang[i]);
        }
        System.out.println("\n");
    }

    public static int[] nhapMang(int n) {
        Scanner sz = new Scanner(System.in);
        int mang[] = new int[100];
        System.out.println("Bắt đầu nhập phần tử: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử thứ %d = ", i);
            mang[i] = sz.nextInt();
        }
        System.out.println("Kết thúc nhập phần tử. \n");
        sz.close();
        return mang;
    }

    public static void xuatMang(int mang[], int n) {
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử thứ %d = %d \n", i, mang[i]);
        }
        System.out.println("");
    }

    public static int tinhTong(int mang[], int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += mang[i];
        }
        System.out.printf("\nTổng giá trị các phân tử trong mảng là %d \n", tong);
        System.out.println("");
        return tong;
    }

    public static void timMin(int mang[], int n) {
        int min = mang[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (min > mang[i]) {
                min = mang[i];
                index = i;
            }
        }
        System.out.printf("\nPhần tử bé nhất là: %d tại vị trí %d\n", min, index);
        System.out.println("");
    }

    public static void timMax(int mang[], int n) {
        int max = mang[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (max < mang[i]) {
                max = mang[i];
                index = i;
            }
        }
        System.out.printf("\nPhần tử lớn nhất là: %d tại vị trí %d\n", max, index);
        System.out.println("");
    }

    public static int viTriPhanTu(int mang[], int n, int timKiem) {

        for (int i = 0; i < n; i++) {
            if (mang[i] == timKiem) {
                return i;
            }
        }
        return -1;
    }

    public static void timPhanTu(int mang[], int n, int timKiem) {
        int vt = viTriPhanTu(mang, n, timKiem);
        if (vt != -1) {
            System.out.printf("\nTìm thấy %d trong mảng tại vị trí %d", timKiem, vt);
        } else {
            System.out.printf("\nKhông tìm thấy %d trong mảng!", timKiem);
        }
    }

    public static int[] xoaPhanTu(int mang[], int n, int phanTu) {
        int[] mangTemp = new int[n];

        int countXoa = 0;
        int countMangTraVe = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] == phanTu) {
                continue;
            } else {
                mangTemp[countMangTraVe] = mang[i];
                countMangTraVe++;
            }
        }
        int[] mangTraVe = new int[countXoa];
        for (int i = 0; i < countMangTraVe; i++) {
            mangTraVe[i] = mangTemp[i];
        }
        return mangTraVe;
    }

    public static int[] sapXep(int mang[], int n, int chieu) {

        for (int z = 0; z < n - 1; z++) {
            for (int x = z; x < n; x++) {
                if (chieu == 1) {
                    if (mang[z] > mang[x]) {
                        int temp = mang[z];
                        mang[z] = mang[x];
                        mang[x] = temp;
                    }
                } else {
                    if (mang[z] < mang[x]) {
                        int temp = mang[z];
                        mang[z] = mang[x];
                        mang[x] = temp;
                    }
                }

            }
        }
        return mang;
    }

}
