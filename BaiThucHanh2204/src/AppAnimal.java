import abstract_Animal.Tiger;


public class AppAnimal {
    public static void main(String[] args) throws Exception{
        System.out.println("Tiger");

        Tiger obj = new Tiger();
        obj.Eat();
        obj.Sleep();
        obj.Walk();
        obj.Run();
        obj.Roar();
    }
}
