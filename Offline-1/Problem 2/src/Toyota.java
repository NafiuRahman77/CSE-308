public class Toyota extends Car{
    Toyota(){
        engine="Hydrogen Fuel Cell";
        driveTrain="Rear-Wheel ";
        country="Japan";
        color="red";

    }
    @Override
    void getEngine() {
        engine="Hydrogen Fuel Cell";
    }

    @Override
    void getDriveTrain() {
        driveTrain="Rear-Wheel ";

    }

    @Override
    void getCountry() {
        country="Japan";

    }

    @Override
    void getColor() {
        color="red";
    }

    @Override
    void printCar() {
        System.out.println("Toyota");
        System.out.println("Engine: "+ engine);
        System.out.println("Drive Train: "+driveTrain);
        System.out.println("Country: "+ country);
        System.out.println("Color: "+color);

    }
}
