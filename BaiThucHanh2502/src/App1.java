import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Tim UCLN cua a va b.");
      System.out.println("a= ");
      a = sc.nextInt();
      System.out.println("b= ");
      b = sc.nextInt();
      System.out.println("UCLN cua "+ a +" va "+ b +" la: "+UCLN(a,b));
      sc.close();
    }
    //------------------------------------
    public static int UCLN(int a, int b) {
        while (a*b != 0){ 
            if (a > b){
                a %= b; // a = a % b
            }else{
                b %= a;
            }
        }
        return a + b;
    }
}
