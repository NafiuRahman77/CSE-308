package Cooler;

public class CPUCooler extends Cooler{
    public CPUCooler(){
        name="CPU Cooler";
        price=36000;
    }
    @Override
    public String getName() {

        return name;
    }

    @Override
    public double getPrice() {
        return price;

    }
}
