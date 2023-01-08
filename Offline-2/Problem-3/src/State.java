public abstract class State {
    public abstract int getChange() ;
    public abstract void choose();
    public abstract int dispense();
    public abstract void refund();
    public abstract void refill(int amount);


}
