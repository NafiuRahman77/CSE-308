public abstract class CoffeeDecorator extends Coffee{
    Coffee coffee;
    public CoffeeDecorator(Coffee c) {
        this.coffee=c;
    }
    public int getCost() {
        return this.coffee.getCost();
    }

    public String getIngredients() {
        return this.coffee.getIngredients();
    }
}
