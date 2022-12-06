package GraphicsCard;

public class TwoGB extends GraphicsCard{
    public TwoGB(){
        name="2 GB Graphics Card";
        price=6500;
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
