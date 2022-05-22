package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App87
{
    public static void main(String[] agrs ) {
        HashMap<String,String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg","Quảng Ngãi");
        hashMapCity.put("QN", "Quảng Nam");
        //Trong trường hợp này ta thấy
        //key của Quảng Nam và Quảng Ninh đều là QN
        //Nên chương trình sẽ thêm vào trong hashMapCity value đứng sau(Tức là Quảng Ninh)
        hashMapCity.put("QN","Quảng Ninh");
        hashMapCity.put("HCM","Thành Phố Hồ Chí Minh");

        System.out.println("Danh sách các thành phố trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        //Lấy thành phố có mã QNg và hiển thị tên thành phố
        System.out.println("QNg: " + hashMapCity.get("QNg"));

        //Lấy thành phố có mã NT
        //Vì trong hashMapCity không có thành phố nào có mx là NT
        //Nên sẽ hiển thị giá trị NULL
        System.out.println("NT: " + hashMapCity.get("NT"));

        //Để kiểm tra xem 1 value có trong HashMap hay không
        //Ta dùng phương thức constainsValue()
        if (hashMapCity.containsValue("Thành phố Hồ Chí Minh ")){ 
            System.out.println("có Thành phố Hồ Chí Minh trong hashMapCity");
        }
    }
}