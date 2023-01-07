import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        VendingMachine vm=new VendingMachine();
//        vm.insert(5);
//        vm.insert(5);
//        //vm.choose();
//        int a=vm.dispense();
//        System.out.println(a);
//       vm.choose();
//        vm.dispense();
        Scanner sc=new Scanner(System.in);

        while(true){

            System.out.println("Press 1 to insert money");
            System.out.println("Press 2 to choose product");
            System.out.println("Press 3 to dispense product");
            int s=sc.nextInt();
            if(s==1){
                System.out.println("Enter the amount you wanna insert");
                int amount=sc.nextInt();
                vm.insert(amount);
            }
            else if(s==2){
                vm.choose();
            }
            else if(s==3){
                vm.dispense();
            }
            else{
                break;
            }

        }
    }
}
