package interface_Car;

public class TaxiCar implements Car{
    public void Move(){
        System.out.println("Di chuyển.");
    }

    public void Stop(){
        System.out.println("Dừng lại.");
    }

    public void TurnRight(){
        System.out.println("Rẽ phải.");
    }

    public void TurnLeft(){
        System.out.println("Rẽ trái.");
    }

    public void Reverse(){
        System.out.println("Quay đầu.");
    }
}
