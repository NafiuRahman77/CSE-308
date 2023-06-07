package Parts;

public class Candy extends Parts{
    public Candy(){
        price=50;
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
