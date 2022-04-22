package Customer;

import Person.Person;

public class Customer extends Person{
    private String Address;
    private String Tell;
    private String MaKH;
    private String KieuKH;

    public Customer()
    {
        KieuKH = "Normal";
    }

    public void nhapttCustomer()
    {
        nhaptt();
        System.out.print("Mã khách hàng: ");
        MaKH = sc.nextLine();
        System.out.print("Địa chỉ: ");
        Address = sc.nextLine();
        System.out.print("Số điện thoại: ");
        Tell = sc.nextLine();
    }

    public void inttCustomer()
    {
        intt();
        System.out.println("Loại khách hàng: " + KieuKH);
        System.out.println("Mã khách hàng: " + MaKH);
        System.out.println("Địa chỉ: " + Address);
        System.out.println("Số điện thoại: " + Tell);
    }

}
