import Getter_Settter.HinhTron;

public class App71 {
    public static void main(String [] args) throws Exception{
        HinhTron hinhtron = new HinhTron();

        //Set bán kính hình tròn qua setter
        hinhtron.setBanKinh(10);

        //Tính toán khác
        float chuVi = hinhtron.tinhChuVi();
        float dienTich = hinhtron.tinhDienTich();

        System.out.println("Chu vi hình tròn: " + chuVi + "; Và diện tích: " + dienTich);
    }
}
