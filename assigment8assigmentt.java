
public class assigment8assigmentt {
    public static String daoNguoc(String chuoi) {
        String chuoiDaoNguoc = "";
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            chuoiDaoNguoc += chuoi.charAt(i);
        }
        return chuoiDaoNguoc;
    }
    
     public static void main(String[] args) {
        String chuoi = "hello";
        System.out.println("Chuoi sau khi đao nguoc: " + daoNguoc(chuoi));
    }
}
