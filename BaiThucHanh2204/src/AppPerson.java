import Employee.FullTimeEmployee;
import Employee.PartTimeEmployee;
import Student.OfflineStudent;
import Student.OnlineStudent;
import Customer.Customer;
import Customer.VipCustomer;

public class AppPerson {
    public static void main(String[] args) throws Exception {

        OfflineStudent off1 = new OfflineStudent();
        off1.nhapttOff();
        System.out.println("\nIn thông tin.\n");
        off1.inttOff();

        OnlineStudent onl1 = new OnlineStudent();
        onl1.nhapttOn();
        System.out.println("\nIn thông tin.\n");
        onl1.inttOn();

        PartTimeEmployee pt1 = new PartTimeEmployee();
        pt1.nhapttPartTime();
        System.out.println("\nIn thông tin.\n");
        pt1.tinhLuong();
        pt1.inttPartTimne();

        FullTimeEmployee ft1 = new FullTimeEmployee();
        ft1.nhapttFullTime();
        System.out.println("\nIn thông tin.\n");
        ft1.tinhLuong();
        ft1.inttFullTime();

        Customer c1 = new Customer();
        c1.nhapttCustomer();
        System.out.println("\nIn thông tin.\n");
        c1.inttCustomer();

        VipCustomer V1 = new VipCustomer();
        V1.nhapttVipCustomer();
        System.out.println("\nIn thông tin.\n");
        V1.inttVipCustomer();
    }
}
