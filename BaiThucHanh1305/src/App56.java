import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args){
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        //Thêm các phần tử vào HashSetString
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        
        //hiển thị các phần tử trong hashSetString
        System.out.println("Các phần tử trong HashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhập phần tử cần xóa: ");
        name = sc.nextLine();

        //Nếu phần tử cần xóa có tồn tại HashSetString thì sẽ thông báo xóa thành công
        //Và hiển thị các phần tử còn lại ngược lại thông báo xóa không thành công
        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong hashString: ");
            System.out.println(hashSetString);
        }
        else
        {
            System.out.println("Xóa không thành công!");
        }
        sc.close();
    }
}
