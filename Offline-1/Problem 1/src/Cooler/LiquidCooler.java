package Cooler;

public class LiquidCooler extends Cooler{
    public LiquidCooler(){
        name="Liquid Cooler";
        price=17000;
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
