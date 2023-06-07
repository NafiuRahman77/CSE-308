public class Main {
    public static void main(String[] args) {
        MoneySystem akash=new Akash(1);
        MoneySystem payfren=new PayFren(1);
        Adapter a=new Adapter();
        a.transfer(akash,payfren,100);
    }
}
