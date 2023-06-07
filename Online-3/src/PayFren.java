public class PayFren extends MoneySystem {


    public PayFren(int ssn) {
        no = ssn;
        balance=10;
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
