package Getter_Settter;

public class SinhVien {
    private String Ten;
    private String Tuoi;
    
    public String getTen(){
        return Ten;
    }

    public void setTen(String Ten){
        if (Ten == null || Ten.isEmpty()) {
            //Nếu biến Ten chưa khởi tạo thì mang giá trị null
            //Thì lưu với tên là "Không biết"
            this.Ten = "Không biết";
        } else {
            this.Ten = Ten;
        }
    }

    public String getTuoi(){
        if (Integer.valueOf(Tuoi) != -1) {
            //Tuổi hợp lệ 
            return Tuoi;
        } else {
            return "Tuổi không hợp lệ";
        }
    }

    public void setTuoi(int Tuoi){
        //Kiểm tra tuổi có hợp lý không, Nếu đúng lưu vào, Nếu không trả về -1 và không lưu
        if(Tuoi > 18){
            this.Tuoi = String.valueOf(Tuoi);
        }
        else{
            this.Tuoi = String.valueOf(-1);
        }
    }
}
