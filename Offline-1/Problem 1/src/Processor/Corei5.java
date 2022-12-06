package Processor;

public class Corei5 extends Processor {
    public Corei5(){
        name="Core i5";
        price=20000;
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
