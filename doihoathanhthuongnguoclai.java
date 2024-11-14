
public class doihoathanhthuongnguoclai {
    public static String chuyenDoiChu(String chuoi) {
        String ketQua = "";

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (Character.isUpperCase(kyTu)) {
                ketQua += Character.toLowerCase(kyTu);
            } else if (Character.isLowerCase(kyTu)) {
                ketQua += Character.toUpperCase(kyTu);
            } else {
                ketQua += kyTu;
            }
        }
        return ketQua;
    }

    public static void main(String[] args) {
        String chuoi = "Hello World";
        System.out.println("Chuoi sau khi chuyen đoi: " + chuyenDoiChu(chuoi));
    }
}
