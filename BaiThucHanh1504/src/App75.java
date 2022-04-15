import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhHoc;

public class App75 {
    public static void main(String [] args){
        HinhHoc hinhhoc = new HinhHoc();
        HinhTron hinhtron1 = new HinhTron();
        HinhTron hinhtron2 = new HinhTron();
        HinhChuNhat hinhchunhat = new HinhChuNhat();

        //Đếm số hình
        System.out.println("Có tất cả " + HinhTron.dem + " hình trong ứng dụng.");
    }
}
