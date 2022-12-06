package Processor;

public class Corei7 extends Processor{
    public Corei7(){
        name="Core i7";
        price=37000;
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
