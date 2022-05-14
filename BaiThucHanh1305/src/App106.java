import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class App106 {
    public static void main(String[] args) {
        //Khai báo 1 TreeMap có tên là treeMap
        //Kiểu dữ liệu này là Integer
        //Và value là Character
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        //Thêm value vào trong treeMap với key tương ứng
        //Sử dụng phương thức put()
        //Đối số thứ nhất trong Put là key có kiểu lag Interger
        //Đối số thứ hai là value có kiểu là Character
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(8, 'E');

        //Tạo 1 set có tên là setTreeMap
        //Chứa toàn bộ các entry (vừa key vừa value) của treeMap
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        //Các entry trong setTreeMao sẽ được sắp xếp tắng dần theo key
        System.out.println("Các entry có trong setTreeMap: ");
        System.out.println(setTreeMap);
    }
}