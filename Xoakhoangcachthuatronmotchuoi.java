
public class Xoakhoangcachthuatronmotchuoi {
     public static String xoaKhoangTrangThua(String chuoi) {
        int doDai = chuoi.length();
        String ketQua = "";
        boolean trongTu = false;

        for (int i = 0; i < doDai; i++) {
            char kyTu = chuoi.charAt(i);
            if (kyTu != ' ') {
                ketQua += kyTu;
                trongTu = true;
            } else if (trongTu) {
                ketQua += " ";
                trongTu = false;
            }
        }
        if (ketQua.endsWith(" ")) {
            ketQua = ketQua.substring(0, ketQua.length() - 1);
        }
        
        return ketQua;
    }

    public static void main(String[] args) {
        String chuoi = "   Hello     World   ";
        System.out.println("Chuoi sau khi xoa khoang trang thua: \"" + xoaKhoangTrangThua(chuoi) + "\"");
    }
}
