public class VendingMachine {
    private State state;
    private int itemCount=1;
    private int balance;
    public VendingMachine(){
        this.state=new Idle(this);
    }

    public VendingMachine(State state) {
        this.state = state;
    }

    public VendingMachine(State state, int itemCount, int balance) {
        this.state = state;
        this.itemCount = itemCount;
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void insert(int c){
        balance+=c;
    }
    public void refill(int quantity){
        state.refill(quantity);
    }
    public void choose(){
         state.choose();
    }
    public int dispense(){ return state.dispense(); }
    public void refund(){
        state.refund();
    }

}
