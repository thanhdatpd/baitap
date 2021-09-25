public class StringUntils {

    public static int demLanXuatHien(String goc, String kitu) {

        int so = 0;
        for (int i = 0; i < goc.length(); i++) {
            if (goc.charAt(i) == kitu.charAt(0))
                so++;
        }
        return so;
    }

    public static int demLanXuatHienKyTuHoa(String goc) {

        int so = 0;
        for (int i = 0; i < goc.length(); i++) {
            if (Character.isUpperCase(goc.charAt(i)))
                so++;
        }
        return so;
    }

    public static String tachTen(String goc) {
        String so = "";
        goc = goc.trim();
        String l[] = goc.split(" ");
        so = l[l.length - 1];
        return so;
    }

    public static String chuanHoa(String goc) {
        String so = "";
        goc = goc.trim();
        String l[] = goc.split(" ");
        for (String a : l) {
            if (a.length() != 0)
                so += a + " ";
        }
        return so.trim();
    }

    public static String daoBit(String goc) {
        String so = "";

        String l[] = goc.split(" ");
        for (String a : l) {
            if (a == "0")
                so += "1";
            else {
                so += "0";
            }
        }
        return so;
    }

    public static String daoChuoi(String goc) {

        StringBuilder temp = new StringBuilder();
        temp.append(goc);
        temp.reverse();
        return temp.toString();
    }

    public static Boolean checkDoiXung(String goc) {

        if (goc.length() == 1)
            return true;
        for (int i = 0; i < goc.length() / 2; i++) {
            if (goc.charAt(i) != goc.charAt(goc.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
