package Parts;

public class Cookies extends Parts{
    public Cookies(){
        price=40;
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
