public class Akash extends MoneySystem {


    public Akash(int nid) {
        balance=1000;
        no=nid;
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
