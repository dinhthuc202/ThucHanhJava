package collections.list;

import java.util.LinkedList;

public class App38_39 {
    public static void main(String[]args)throws Exception{
        //khai báo 1 LinkedList có tên là list
        //có kiểu là String
        LinkedList<String> list = new LinkedList<String>();
        //Add object to list 
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("vi du su dung thuc addAll()");
        System.out.println("---------------------------");
        //thêm các phần tử của list vào listA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("----------------------------------------");
        //khởi tạo listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        //xóa những phần tử không thuôc listB khỏi list
        list.removeAll(listB);
        System.out.print("listB");
        showList(list);
    }
    public static void showList(LinkedList<String> list)
    {
        //Show list through for-each
        for(String obj : list)
        {
            System.out.print("\t"+obj+", ");
        }
        System.out.println();
    }
}
