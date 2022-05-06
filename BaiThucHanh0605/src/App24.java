import java.util.ArrayList;
import java.util.Scanner;
public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number ; //phần tử của mảng

        System.out.println("Nhập số phần tử của ArrayList: ");
        int n = sc.nextInt();
        //Nhập và thêm phần tử cho ArrayList
        for (int i = 0; i < n ; i++) {
            System.out.println("Nhập phần tử thứ "+ i +" :");
            number = sc.nextInt();
            arrayListInteger.add(number);
        }

        //Tìm phần tử lớn nhất trong mảng sử dụng phương thức compareTo()
        //Giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
        int max = arrayListInteger.get(0);
        
        for(int i = 1; i<arrayListInteger.size();i++)
        {
            //Nếu kết quả của phép so sánh này lớn hơn 0
            //Tức biến max nhỏ hơn phần tử hiện tại vị trí thứ i trong arrayList
            //thì gán max = phần tử tại vị trí i
            //Và đó chính là phần tử lớn nhất
            if(arrayListInteger.get(i).compareTo(max) > 0){
                max = arrayListInteger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arrayListInteger = " + max);
        sc.close();
    }
}
