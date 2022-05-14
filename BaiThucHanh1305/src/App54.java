import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args){
        int number;
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        //Thêm các phần tử vào HashSetInt
        hashSetInt.add(0);
        hashSetInt.add(3);
        hashSetInt.add(1);
        hashSetInt.add(4);
        hashSetInt.add(2);
        hashSetInt.add(8);
        
        
        //hiển thị các phần tử trong hashSetInt
        System.out.println("Các phần tử trong HashSetInt: ");
        System.out.println(hashSetInt);
        System.out.println("Nhập phần tử cần thêm: ");
        number = sc.nextInt();

        //Thêm một phần tử mới vào hasSetInt từ bàn phím
        //Nếu phần tử đo đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if(!hashSetInt.contains(number)){
            hashSetInt.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử còn lại trong hashSetInt: ");
            System.out.println(hashSetInt);
        }
        else
        {
            System.out.println("Phần tử " + number + " đã tồn tại!");
        }
        sc.close();
    }
}
