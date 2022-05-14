import java.util.LinkedHashMap;
import java.util.Set;
public class App95 {
    public static void main(String args[]) {
        //init linkedHashMap
        LinkedHashMap<Integer , String> linkedHashMap = new LinkedHashMap<Integer , String>();

        //add elements to linkedHashMap
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(2, "PHP");
        linkedHashMap.put(4, "Python");
        //Show LinkedHashMap before remove
        System.out.println("Before remove:");
        show(linkedHashMap);
        //Remove element
        linkedHashMap.remove(2);
        //Show linkedHashMap after remove
        System.out.println("After remove:");
        //Show hashMap
        show(linkedHashMap);

    }
    //Show HashMap
    public static void show(LinkedHashMap<Integer , String>  linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));  
        }
    }
}