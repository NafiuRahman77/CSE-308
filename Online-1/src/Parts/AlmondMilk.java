package Parts;

public class AlmondMilk extends Parts{
    public AlmondMilk(){
        price=60;
        name="Almond-milk";
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
