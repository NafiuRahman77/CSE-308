public class Idle extends State{
    private VendingMachine machine;
    public Idle(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public int getChange() {
        return 0;
    }

    @Override public void choose()
    {   int amount=0;
        if(machine.getItemCount() >= 1 && machine.getBalance()>=10){
            System.out.println("One item is chosen");
            machine.setState(new Sold(machine));
        }

        else if(machine.getBalance()<10){
            amount=10-machine.getBalance();
            System.out.println("Insufficient amount, Please give "+amount+" more");
        }
        else{
            System.out.println("Everything is sold out, Please try later");
            machine.setState(new Refund(machine));
            machine.refund();
        }

    }

    @Override
    public int dispense() {
        return 0;
    }

    @Override
    public void refund() {

    }
}

