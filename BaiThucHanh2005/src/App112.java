
import java.util.ArrayList;
import java.util.Scanner;

public class App112 {
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ThongTin = new ArrayList<>();
        int tmp = 1;

        do {
            System.out.println("Nhập thông tin sinh viên số " + tmp + " : ");
            SinhVien sv = new SinhVien();
            System.out.print("Tên: ");
            sv.setName(sc.nextLine());

            if(sv.getName().isEmpty())
                break;
            else
            {
                System.out.print("Điểm: ");
                sv.setDiem(sc.nextFloat());
                ThongTin.add(sv);
            }
            tmp++;
            sc.nextLine();
        } while (1>0);

        tmp = 0;
        System.out.println("Thông tin các sinh viên phải thi lại.");
        for(int i = 0;i < ThongTin.size(); i++)
        {
            if (ThongTin.get(i).getDiem()<=5) {
                tmp ++;
                ThongTin.get(i).In_Thong_Tin();
            }
        }
        System.out.println("Có " + tmp + " sinh viên phải thi lại.");

        float DiemMax = 0;//Điểm cao nhất
        for(int i = 0;i < ThongTin.size(); i++) //Tìm điểm cao nhất
            if (ThongTin.get(i).getDiem() > DiemMax)
                DiemMax = ThongTin.get(i).getDiem();
        
        System.out.println("\nCác sinh viên có điểm cao nhất: ");
        for (int i = 0 ;i < ThongTin.size(); i++)
            if(ThongTin.get(i).getDiem()==DiemMax)
                ThongTin.get(i).In_Thong_Tin();
        
        sc. close();
    }
}

class SinhVien{
    private String Name;
    private float Diem;

    public SinhVien(){
    }
    public String getName(){   
        return Name;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public float getDiem(){
        return Diem;
    }

    public void setDiem(Float Diem){
        this.Diem=Diem;
    }

    public void In_Thong_Tin(){
        System.out.println("Tên: " + getName());
        System.out.println("Điểm: " + getDiem());
    }
}
