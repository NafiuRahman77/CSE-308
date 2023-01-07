import java.net.Socket;
import java.util.Scanner;

public class PremiumUser extends Observer{

    public PremiumUser(Server server, int id) {
        this.server=server;
        this.id=id;
        Scanner sc=new Scanner(System.in);
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getChoice(){
        return choice;
    }
    public void setChoice(String choice){
        this.choice=choice;
    }


    @Override
    public void update(){
        Scanner sc=new Scanner(System.in);
        String ch;
        int options;
        System.out.println("Currently notifying to Premium User id- "+ getId());
        if(getServer().getPreviousState()==1&&getServer().getCurrentState()==2){
            while(true) {
                System.out.println("1.Partially enjoy both ABC and DEF servers");
                System.out.println("2.Use DEF server fully");
                options = sc.nextInt();
                if (options == 1) {
                    setChoice("Partially using ABC");
                    break;
                } else if (options == 2) {
                    setChoice("Fully using DEF");
                    break;
                } else {
                    System.out.println("Invalid options, please choose a valid one");
                }
            }
        }
        else if(getServer().getPreviousState()==1&&getServer().getCurrentState()==3){
            System.out.println("Services are being provided by DEF server");
            setChoice("Fully using DEF");
        }
        else if(getServer().getPreviousState()==2&&getServer().getCurrentState()==1){
            setChoice("Operational");
        }
        else if(getServer().getPreviousState()==3&&getServer().getCurrentState()==1){
            setChoice("Operational");
        }
        else if(getServer().getPreviousState()==2&&getServer().getCurrentState()==3){
            if(getChoice().equalsIgnoreCase("Partially using ABC")) {
                System.out.println("Services are being provided by DEF server");
                setChoice("Fully using DEF");
            }
        }
        else if(getServer().getPreviousState()==3&&getServer().getCurrentState()==2){

        }

        if(getChoice().equalsIgnoreCase("Operational")) {
            System.out.println("Using ABC server");

        } else if(getChoice().equalsIgnoreCase("Partially using ABC") ) {
            System.out.println(" Using limited functionality from ABC server");

        } else if(getChoice().equalsIgnoreCase("Fully using DEF")) {
            System.out.println("Data copied to DEF server, DEF server running");

        }

    }
}
