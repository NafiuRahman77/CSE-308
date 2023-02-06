public class BlackCoffee extends Coffee{
    @Override
    public int getCost() {
        return getCupPrice()+30;
    }

    @Override
    public String getIngredients() {
        return "Coffee Beans , Water ";
    }
}
