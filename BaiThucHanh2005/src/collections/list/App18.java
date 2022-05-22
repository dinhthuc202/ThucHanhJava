package collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[]args)throws Exception
    {
        ArrayList<Float> arrayListFloat = new ArrayList<>();

        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.26f);
        arrayListFloat.add(1.02f);
        arrayListFloat.add(9.3f);

        Iterator<Float> iterator = arrayListFloat.iterator();
        System.out.println("Các phần tử có trong arrayListFloat là: ");
        while(iterator.hasNext())
            System.out.print(iterator.next() + "\t");
    }
}