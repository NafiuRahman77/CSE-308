package GraphicsCard;

public class FourGB extends GraphicsCard {
    public FourGB(){
        name="4 GB Graphics Card";
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
