
public class TachCacChuoi {
    public static String[] tachTuTrongChuoi(String chuoi) {
        return chuoi.split(" ");
    }

    public static void main(String[] args) {
        String chuoi = "Duy Tan university";
        String[] tu = tachTuTrongChuoi(chuoi);

        System.out.println("Cac tu trong chuoi:");
        for (String t : tu) {
            System.out.println(t);
        }
    }
}
