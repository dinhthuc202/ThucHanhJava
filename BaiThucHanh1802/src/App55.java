public class App55 {
    public static void main(String[] agrs) throws Exception{
        System.out.println("Cac so chia het cho 5 tu 0 den 20 la.");
        for(int n = 0; n <= 20; n++)
        {
            if(( n % 5 ) == 0) //Neu chia het cho 5 thi in ra
                System.out.println(n);
        }
    }
}