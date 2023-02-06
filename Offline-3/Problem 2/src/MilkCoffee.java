public class MilkCoffee extends Coffee{
    @Override
    public int getCost() {
        return getCupPrice()+50;
    }

    @Override
    public String getIngredients() {
        return "Coffee Beans , Milk ";
    }
}
