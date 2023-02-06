public class DairyCream extends CoffeeDecorator {
    public DairyCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost()+40;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", "+"Dairy Cream";
    }
}
