import java.util.Scanner;
import java.util.LinkedList;

public class App111 {
    public static void main(String[]args) throws Exception{
        int tmp;
        int dem=0;
        int tong=0;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedListiInteger = new LinkedList<>();
        System.out.print("Nhập số phần tử của LinkList: ");
        int sl = sc.nextInt();
        for(int i=0; i<sl;i++)
        {
            System.out.println("Nhập phần tử số " + (i+1) + " : ");
            tmp = sc.nextInt();
            linkedListiInteger.add(tmp);
        }
        for(int i=0;i<linkedListiInteger.size();i++)
        {
            if(linkedListiInteger.get(i)%2==0)
            {
                tong = tong + linkedListiInteger.get(i);
                dem++;
            }
        }
        int tbc_so_chan = tong/dem;
        System.out.print("Trung bình cộng các số chẵn trong LinkedList là: " + tbc_so_chan);
        sc.close();
    }
}
