
public class KiemTraMotChuoi {
    public static boolean laPalindrome(String chuoi) {
        int dau = 0;
        int cuoi = chuoi.length() - 1;

        while (dau < cuoi) {
            if (chuoi.charAt(dau) != chuoi.charAt(cuoi)) {
                return false;
            }
            dau++;
            cuoi--;
        }
        return true;
    }
    public static void main(String[] args) {
        String chuoi1 = "madam";
        String chuoi2 = "hello";

        System.out.println("Chuoi '" + chuoi1 + "' la chuoi đoi xung: " + laPalindrome(chuoi1));
        System.out.println("Chuoi '" + chuoi2 + "' là chuoi đoi xung: " + laPalindrome(chuoi2));
    }
}
