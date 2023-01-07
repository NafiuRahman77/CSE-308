import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Server ABC=new ABCServer();

        Scanner sc=new Scanner(System.in);
        int a;

            Observer premUser=new PremiumUser(ABC,1);
            Observer regUser=new RegularUser(ABC,2);
            ABC.register(premUser);
            ABC.register(regUser);

        while(true){
            System.out.println("Change state of server-");
            System.out.println("1.Operational");
            System.out.println("2.Partially down");
            System.out.println("3.Fully down");
             a=sc.nextInt();
            if(a==1 ){
                if(ABC.getCurrentState()!=1){
                ABC.setCurrentState(1);
                }
                else{
                    System.out.println("The server is already operational");
                }
            }
            else if(a==2 ){
                if(ABC.getCurrentState()!=2) {
                    ABC.setCurrentState(2);
                }
                else{
                    System.out.println("The server is already partially down");
                }
            }
            else if(a==3 ){
                if(ABC.getCurrentState()!=3) {
                    ABC.setCurrentState(3);
                }
                else{
                    System.out.println("The server is already fully down");
                }
            }
            else{
                System.out.println("Provide a valid input");
            }
        }


    }
}
