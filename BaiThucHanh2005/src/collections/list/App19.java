package collections.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String []args) throws Exception{
        ArrayList<Character> arrayListChar = new ArrayList<>();

        arrayListChar.add('a');
        arrayListChar.add('e');
        arrayListChar.add('b');
        arrayListChar.add('c');

        ListIterator<Character> listIterator = arrayListChar.listIterator();

        System.out.print("Các phần tử có trong arrayListChar là: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }
    }
}
