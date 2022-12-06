public class Tesla extends Car{
    Tesla(){
        engine="Electric Engine";
        driveTrain="All-Wheel";
        country="USA";
        color="white";
    }
    @Override
    void getEngine() {
        engine="Electric Engine";

    }

    @Override
    void getDriveTrain() {
        driveTrain="All-Wheel";

    }

    @Override
    void getCountry() {
        country="USA";

    }

    @Override
    void getColor() {
        color="white";
    }

    @Override
    void printCar() {
        System.out.println("Tesla");
        System.out.println("Engine: "+ engine);
        System.out.println("Drive Train: "+driveTrain);
        System.out.println("Country: "+ country);
        System.out.println("Color: "+color);

    }
}
