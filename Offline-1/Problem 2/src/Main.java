import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Scanner sc=new Scanner(System.in);
        String continent;
        continent=sc.next();
        Car car=carFactory.getCar(continent);
        car.printCar();
    }
}
