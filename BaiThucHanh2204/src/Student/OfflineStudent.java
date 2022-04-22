package Student;

public class OfflineStudent extends Student{
    protected String PhuongTienDiLai;

    public OfflineStudent (){
        HinhThucHoc = "Offline";
    }
    
    public void nhapttOff()
    {
        nhapttSudent();
        System.out.println("Phương tiện đi lại: ");
        PhuongTienDiLai = sc.nextLine();
    }
    public void inttOff()
    {
        inttStudent();
        System.out.println("Phương tiện đi lại: " + PhuongTienDiLai);
        System.out.println("Hình thức học: " + HinhThucHoc);
    }
}
