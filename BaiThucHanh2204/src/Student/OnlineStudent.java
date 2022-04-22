package Student;

public class OnlineStudent extends Student{
    protected String ThietBiHoc;

    public OnlineStudent (){
        HinhThucHoc = "Online";
    }
    
    public void nhapttOn()
    {
        nhapttSudent();
        System.out.print("Thiết bị học: ");
        ThietBiHoc = sc.next();
    }
    public void inttOn()
    {
        inttStudent();
        System.out.print("Thiết bị học: "+ ThietBiHoc);
        System.out.println("Hình thức học: " + HinhThucHoc);
    }
      
}
