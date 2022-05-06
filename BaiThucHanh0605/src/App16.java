import java.util.ArrayList;
public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayListString = new ArrayList<>();
        //Thêm các phương thức add()
        arrayListString.add("JAVA");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");

        System.out.println("Các phần tử có trong arrayListString là: ");
        for(int i=0;i < arrayListString.size();i++)
        {
            System.out.print(arrayListString.get(i)+"\t");
        }
    }
}
