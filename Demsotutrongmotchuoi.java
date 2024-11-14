
public class Demsotutrongmotchuoi {
    public static int demSoTu(String chuoi){
        int doDai = chuoi.length();
        int soTu = 0;
        boolean trongTu = false;

        for(int i = 0; i < doDai; i++){
            if(chuoi.charAt(i) != ' '){
                if(!trongTu){
                    soTu++;
                    trongTu = true;
                }
            }else{
                trongTu = false;
            }
        }
        return soTu;
    }

    public static void main(String[] args){
        String chuoi = "Duy Tan University ";
        System.out.println("Chuỗi \"" + chuoi + "\" có " + demSoTu(chuoi) + " từ.");
    }
}
