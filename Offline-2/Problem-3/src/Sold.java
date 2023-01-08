public class Sold extends State{
    private VendingMachine machine;
    public Sold(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public int getChange() {
        return 0;
    }

    @Override
    public void choose() {
    }

    @Override public int dispense(){
        if(machine.getItemCount()==0){
           // machine.setState(new Idle(machine));
            System.out.println("No item left");
            return 0;
        }
        int remaining;
        if(machine.getBalance()>=10){
            remaining=machine.getBalance() - 10;
            machine.setBalance(0);
            machine.setItemCount(machine.getItemCount()-1);
            machine.setState(new Idle(machine));
            System.out.println("Item is dispensed and returned money : "+remaining);
        }
        else{
            remaining=0;
        }
        return remaining;

    }

    @Override
    public void refund() {

    }

    @Override
    public void refill(int amount) {
        System.out.println("Please finish purchase first then refill");
    }


}
