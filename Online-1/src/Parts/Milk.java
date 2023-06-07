package Parts;

public class Milk extends Parts{
    public Milk(){
        price=0;
        name="milk";
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
