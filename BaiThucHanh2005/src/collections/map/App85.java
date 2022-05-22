package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App85 {
public static void main(String[] args) {
    //Khai báo 1 HashMap có tên là hashMap
    //Kiểu dữ liệu của key và valuelaf String
    HashMap<String, String> hashMap = new HashMap<>();

    //Them value vào trong hashMap với key tương ứng
    //Sử dụng phương thức put()
    //Đối số thứ nhất trong put là key có kiểu String
    //Đối số thứ hai là value có kiểu là String
    hashMap.put("CSLT", "Cơ sở lập trình");
    hashMap.put("C++", "C++");
    hashMap.put("C#", "C Sharp");
    hashMap.put("PHP", "PHP");
    hashMap.put("Java", "Java");

    //Tạo 1 Set có tên là setHashMap
    //Chứa toàn bộ các Entry (vừa key vừa value) của hashMap
    Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
    
    System.out.println("Các entry có trong setHasshMap: ");
    System.out.println(setHashMap);
   }
}