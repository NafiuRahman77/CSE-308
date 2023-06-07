public abstract class MoneySystem {
    int balance;
    int no;
    public void send(int b){
        balance-=b;

    }

    public int getNo() {
        return no;
    }
    public int getBalance() {
        return balance;
    }
    public void receive(int b){
        balance+=b;
    }
}
