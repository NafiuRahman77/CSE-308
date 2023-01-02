public class Refund extends State{
    private VendingMachine machine;
    public Refund(VendingMachine machine){
        this.machine = machine;
    }
    @Override
    public int getChange() {
        return 0;
    }

    @Override
    public void choose() {

    }

    @Override
    public int dispense() {
        return 0;
    }

    @Override
    public void refund() {
        int remaining=machine.getBalance() ;
        machine.setBalance(0);
        machine.setState(new Idle(machine));
        System.out.println("Money is refunded : "+remaining);

    }
}
