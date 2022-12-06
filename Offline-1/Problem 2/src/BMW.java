public class BMW extends  Car{
    BMW(){
        engine="Electric Engine";
        driveTrain="Rear-Wheel";
        country="Germany";
        color="black";
    }
    @Override
    void getEngine() {
        engine="Electric Engine";

    }

    @Override
    void getDriveTrain() {
        driveTrain="Rear-Wheel";
    }

    @Override
    void getCountry() {
        country="Germany";
    }

    @Override
    void getColor() {
        color="black";
    }

    @Override
    void printCar() {
        System.out.println("BMW");
        System.out.println("Engine: "+ engine);
        System.out.println("Drive Train: "+driveTrain);
        System.out.println("Country: "+ country);
        System.out.println("Color: "+color);

    }
}
