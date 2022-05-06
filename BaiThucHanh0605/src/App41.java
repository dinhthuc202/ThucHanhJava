import java.util.Scanner;
import java.util.LinkedList;

public class App41 {
    public static void main(String[] args )throws Exception{
        Scanner sc = new Scanner(System.in);

        //khai báo 1 danh sách liên kết
        //lưu trữ các tháng trong năm
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.println("Nhap vao chi so phan tu can lay: ");
        int index = sc.nextInt();
        //kiểm tra nếu chỉ số hơn hược bằng 0
        //và nhỏ hơn kích thước của linkedList - 1 thì mới lấy
        //ngược lại thông báo lỗi
        if((index<0)||(index >(linkedList.size() - 1)))
        {
            System.out.println("Chi so can lay phai lon hon 0 va nho hon" + (linkedList.size()-1));
        }else{
            //truy cập phần tử có chỉ số index trong linkedList
            //vì linkedList có kiểu là String
            //nếu các phần tử con của nó cũng có kiểu dữ liệu là String
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = "+index+" trong linkedList là "+node);
        }

        //truy cập phần tử đầu tiên trong danh sách
        //sử dụng phương thức getLast()
        String firstNode = linkedList.getFirst();

        //truy cập phần tử đầu tiên trong danh sách
        //sử dụng phương thức getLast()
        String lastNode = linkedList.getLast();

        System.out.println("\nPhan tu dau tien trong danh sach la "+firstNode+"; Phan tu cuoi cung trong danh sach la "+lastNode);
        sc.close();
    }
}