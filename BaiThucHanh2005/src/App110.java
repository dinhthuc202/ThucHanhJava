import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) throws Exception {
        int tmp;
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arrayListInt = new ArrayList<>();

        //Nhập số phần tử
        System.out.println("Nhập số phần tử của ArrayList: ");
        int sl = sc.nextInt();
        for(int i=0; i<sl;i++)
        {
            System.out.println("Nhập phần tử số " + (i+1) + " : ");
            tmp = sc.nextInt();
            arrayListInt.add(tmp);
        }
        //Tìm phần tử lớn nhất trong mảng
        //Sử dụng compareTo() để so sánh
        //Giả sử phần tử đầu tiên là lớn nhất
        int Max = arrayListInt.get(0);
        for(int i=0;i<arrayListInt.size();i++)
        {
            if(arrayListInt.get(i).compareTo(Max) > 0)
                Max = arrayListInt.get(i);
        }
        System.out.println("Phần tử lớn nhất trong arrListInt = " + Max);

        //Xóa khỏi mảng các giá trị bằng với giá trị nhập vào
        System.out.print("Nhập vào số nguyên cần xóa: ");
        ArrayList <Integer> Remove = new ArrayList<>();
        tmp = sc.nextInt();
        Remove.add(tmp);
        arrayListInt.removeAll(Remove);

        //Sắp xếp và in
        Collections.sort(arrayListInt);
        System.out.println("Các phần tử có trong arrayListInt là: ");
        for(int number : arrayListInt)
            System.out.print(number + "\t");
        sc.close();
    }
}
