public class CoffeeBeans extends CoffeeDecorator{
    public CoffeeBeans(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost()+30;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", "+"Additional Grinded Coffee Beans";
    }
}
