package Student;
import Person.Person;

public class Student extends Person{
    private String Msv;
    private String Lop;
    public String HinhThucHoc;

    public void nhaptt1()
    {
        nhaptt();
        System.out.print("Mã sinh viên: ");
        Msv = sc.nextLine();
        System.out.print("Lớp: ");
        Lop = sc.nextLine();
    }

    public void intt1()
    {
        intt();
        System.out.print("Mã sinh viên: " + Msv);
        System.out.print("Lớp: " + Lop);
    }
}
