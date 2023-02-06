public class ChocolateSauce extends CoffeeDecorator {
    public ChocolateSauce(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost()+60;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", "+"Chocolate Sauce";
    }
}
