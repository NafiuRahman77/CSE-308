package Parts;

public class Sugar extends Parts{
    public Sugar(){
        price=0;
        name="sugar";
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
