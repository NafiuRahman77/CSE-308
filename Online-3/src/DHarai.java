public class DHarai extends MoneySystem {


    public DHarai(int kojin) {
        no = kojin;
        balance=1500;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void send(int b){
        balance-=b;

    }
    public void receive(int b){
        balance+=b;
    }
}
