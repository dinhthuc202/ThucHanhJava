package Student;

public class OfflineStudent extends Student{
    public OfflineStudent (){
        HinhThucHoc = "Offline";
    }
    
    public void intt2()
    {
        intt1();
        System.out.println("Hình thức học: " + HinhThucHoc);
    }
}
