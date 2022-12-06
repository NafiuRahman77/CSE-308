package Processor;

public class Ryzen extends Processor{
    public Ryzen(){
        name="Ryzen 7 5700X";
        price=7600;
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
