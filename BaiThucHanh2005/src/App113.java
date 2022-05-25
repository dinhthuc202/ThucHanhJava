import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App113 {
    public static void main(String[] args) throws Exception{
        String fruitName;
    int n;
    Scanner sc = new Scanner(System.in);
 
    // Tạo 1 HashSet có tên là hashSetFruits
    HashSet<String> hashSetFruits = new HashSet<String>();
     
    System.out.println("Nhập vào số phần tử của hashSetFruits: ");
    n = Integer.parseInt(sc.nextLine());   // hạn chế hiện tượng trôi lệnh
         
    System.out.println("Nhập vào tên các loại trái cây: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập tên loại trái cây thứ " + i + ": ");
        fruitName = sc.nextLine();
        hashSetFruits.add(fruitName);
    }
 
    // hiển thị số phần tử của hashSetFruits
    // sử dụng phương thức size()
    System.out.println("Số phần tử của hashSetFruits = " + hashSetFruits.size());
      
    // tìm loại trái cây
    System.out.println("Nhập tên loại trái cây cần tìm: ");
    String fruitSearch = sc.nextLine();
    if (hashSetFruits.contains(fruitSearch)) {
        System.out.println("Có trái cây " + fruitSearch + " trong hashSetFruits!");
    } else {
        System.out.println("Không tìm thấy " + fruitSearch);
    }
         
    // Xóa 1 loại trái cây bất kỳ trong HashSet đó và hiển thị các phần tử còn lại.
    System.out.println("Nhập vào tên loại trái cây cần xóa: ");
    String fruitDelete = sc.nextLine();
 
    if (hashSetFruits.contains(fruitDelete)) {
        hashSetFruits.remove(fruitSearch);
        System.out.println("Xóa thành công!");
        System.out.println("Các phần tử còn lại trong hashSetFruits: " + hashSetFruits);
    } else {
        System.out.println("Xóa không thành công!");
    }
         
    // Tạo 1 List mới có cùng kiểu dữ liệu với HashSet
    // và thêm các phần tử của List này.
    ArrayList<String> listFruits = new ArrayList<>();
    listFruits.add("Apple");
    listFruits.add("Banana");
    listFruits.add("Mango");
    listFruits.add("Apple");
 
    // thêm các phần tử của List này vào trong HashSet ban đầu 
    // và hiển thị lại HashSet này sử dụng Iterator.
    // sử dụng phương thức addAll()
    hashSetFruits.addAll(listFruits);
    System.out.println("Các phần tử có trong hashSetFruits sau khi thêm: ");
    Iterator<String> iterator = hashSetFruits.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }
         
    // Xóa các phần tử của List có trong HashSet và hiển thị lại HashSet
    // sử dụng phương thức removeAll()
    hashSetFruits.removeAll(listFruits);
    System.out.println("\nCác phần tử có trong hashSetFruits sau khi xóa: " + hashSetFruits);

    sc.close();
    }
}
