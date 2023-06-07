package Parts;

public class Syrup extends Parts{
    Syrup(){
        price=0;
        name="syrup";
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
