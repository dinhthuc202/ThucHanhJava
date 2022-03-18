import java.util.Scanner;

public class Preson {
    String PresonID;
    String PresonName;
    String Address;
    boolean Gender;

    private static Scanner sc = new Scanner(System.in);

    void nhapPresonID()
    {
        System.out.print("Preson ID: ");
        PresonID = sc.nextLine();
    }
    void nhapPresonName(){
        System.out.print("Preson Name: ");
        PresonName = sc.nextLine();
    }
    void nhapAddress(){
        System.out.print("Address: ");
        Address = sc.nextLine();
    }
    void nhapGender(){
        System.out.print("Gender (Male - true | Female - false): ");
        Gender = sc.nextBoolean();
    }
    void intt()
    {
        System.out.print("Preson ID: " + PresonID);
        System.out.print("\nPreson Name: " + PresonName);

        if (Gender == true)
            System.out.print("\nGender: Male");
        else if (Gender == false) {
            System.out.print("\nGender: Female");
        }
        System.out.print("\nAddress: " + Address);
    }
}
