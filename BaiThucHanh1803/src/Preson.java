import java.util.Scanner;

public class Preson {
    String PresonID;
    String PresonName;
    String Address;
    boolean Gender;

    void nhapPresonID()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Preson ID: ");
        PresonID = sc.nextLine();
    }
    void nhapPresonName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Preson Name: ");
        PresonName = sc.nextLine();
    }
    void nhapAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Address: ");
        Address = sc.nextLine();
    }
    void nhapGender(){
        Scanner sc = new Scanner(System.in);
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
