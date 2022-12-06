package Processor;

public class Corei9 extends Processor{
    public Corei9(){
        name="Core i9";
        price=65000;
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
