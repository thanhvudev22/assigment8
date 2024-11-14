
public class TimTuDaiNhatTrongMotChuoi {
    public static String timTuDaiNhat(String chuoi){
        int doDaiChuoi = chuoi.length();
        String tuDaiNhat = "";
        String tuHienTai = "";
        
        for(int i = 0; i < doDaiChuoi; i++){
            char kyTu = chuoi.charAt(i);
            
            if(kyTu != ' '){ 
                tuHienTai += kyTu;
            }else{
                if(tuHienTai.length() > tuDaiNhat.length()){
                    tuDaiNhat = tuHienTai;
                }
                tuHienTai = "";
            }
        }

        if(tuHienTai.length() > tuDaiNhat.length()){
            tuDaiNhat = tuHienTai;
        }
        
        return tuDaiNhat;
    }

    public static void main(String[] args){
        String chuoi = "I love programming";
        System.out.println("Tu dai nhat trong chuoi la: " + timTuDaiNhat(chuoi));
    }
}
