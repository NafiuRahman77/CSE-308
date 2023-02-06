public class CinnamonPowder extends CoffeeDecorator{
    public CinnamonPowder(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getCost() {
        return super.getCost()+50;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", "+"Cinnamon Powder";
    }
}
