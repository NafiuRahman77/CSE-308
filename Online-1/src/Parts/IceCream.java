package Parts;

public class IceCream extends Parts{
    IceCream(){
        price=0;
        name="ice-cream";
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
