import interface_Car.TaxiCar;

public class AppCar {
    public static void main(String[] args) throws Exception{
        TaxiCar c1 = new TaxiCar();
        c1.Move();
        c1.Stop();
        c1.TurnLeft();
        c1.TurnLeft();
        c1.Reverse();
    }
}