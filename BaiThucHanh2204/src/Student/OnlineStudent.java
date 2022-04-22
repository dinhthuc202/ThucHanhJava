package Student;

public class OnlineStudent extends Student{
    public OnlineStudent (){
        HinhThucHoc = "Online";
    }
    
    public void intt2 ()
    {
        intt1();
        System.out.println("Hình thức học: " + HinhThucHoc);
    }
      
}
