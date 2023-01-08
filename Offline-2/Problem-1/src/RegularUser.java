import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RegularUser extends Observer{

    public RegularUser(Server server) {
        this.server=server;
        this.id=idCount;
        idCount++;
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
        return this.choice;
    }
    public void setChoice(String choice){
        this.choice=choice;
    }
    @Override
    public void update(){
        Scanner sc=new Scanner(System.in);
        String ch;
        int options;
        System.out.println("Currently notifying to Regular User id- "+ getId());
        if(getServer().getPreviousState()==1&&getServer().getCurrentState()==2){
            while(true) {
                System.out.println("1.Continue Using limited functionality from ABC server");
                System.out.println("2.Pay 20$ per hour to enjoy full functionality taking service from DEF company");
                options = sc.nextInt();
                if (options == 1) {
                    setChoice("Partially using ABC");
                    defServer.register(this);
                    break;
                } else if (options == 2) {
                    setChoice("Fully using DEF");
                    defServer.register(this);
                    break;
                } else {
                    System.out.println("Invalid options, please choose a valid one");
                }
            }
        }
        else if(getServer().getPreviousState()==1&&getServer().getCurrentState()==3){
            while(true) {
                System.out.println("Do you want to use DEF server with 20$ per hour payment? Press 1 to accept, 2 to deny.");
                options = sc.nextInt();
                if (options == 1) {
                    setChoice("Fully using DEF");
                    defServer.register(this);
                    break;
                } else if (options == 2) {
                    setChoice("No services");
                    break;
                } else {
                    System.out.println("Invalid options, please choose a valid one");
                }
            }
        }
        else if(getServer().getPreviousState()==2&&getServer().getCurrentState()==1){
            if(getChoice().equalsIgnoreCase("Fully using DEF")){
                defServer.unregister(this);
                int rand=(int) (Math.random() * (20));
                while(rand==0) {
                   rand= (int) (Math.random() * (20));
                }
                System.out.println("Sending "+ rand*20 +" bill to the user ");
                setChoice("Fully using ABC");
            }
            else if(getChoice().equalsIgnoreCase("Partially using ABC")) {
                setChoice("Fully using ABC");
            }
        }
        else if(getServer().getPreviousState()==3&&getServer().getCurrentState()==1){
            if(getChoice().equalsIgnoreCase("Fully using DEF")) {
                defServer.unregister(this);
                System.out.println("Sending 100$ bill to the user ");
                setChoice("Fully using ABC");
            }
            else if(getChoice().equalsIgnoreCase("No services")) {
                setChoice("Fully using ABC");

            }
        }
        else if(getServer().getPreviousState()==2&&getServer().getCurrentState()==3){
            if(getChoice().equalsIgnoreCase("Partially using ABC")) {
                while(true) {
                    System.out.println("Do you want to use DEF server with 20$ per hour payment? Press 1 to accept, 2 to deny.");
                    options = sc.nextInt();
                    if (options == 1) {
                        setChoice("Fully using DEF");
                        defServer.register(this);
                        break;
                    } else if (options == 2) {
                        setChoice("No services");
                        break;
                    } else {
                        System.out.println("Invalid options, please choose a valid one");
                    }
                }
            }
            else if(getChoice().equalsIgnoreCase("Fully using DEF")) {
                System.out.println("User is already using the backup DEF server, no need to worry");
            }

        }
        else if(getServer().getPreviousState()==3&&getServer().getCurrentState()==2){
            if(getChoice().equalsIgnoreCase("No services")) {
                while(true) {
                    System.out.println("1.Continue Using limited functionality from ABC server");
                    System.out.println("2.Pay 20$ per hour to enjoy full functionality taking service from DEF company");
                    options = sc.nextInt();
                    if (options == 1) {
                        setChoice("Partially using ABC");
                        defServer.register(this);
                        break;
                    } else if (options == 2) {
                        setChoice("Fully using DEF");
                        defServer.register(this);
                        break;
                    } else {
                        System.out.println("Invalid options, please choose a valid one");
                    }
                }

            }
            else if(getChoice().equalsIgnoreCase("Fully using DEF")) {
                while(true) {
                    System.out.println("1.Continue Using DEF server");
                    System.out.println("2.Revert to partially using ABC and DEF servers");
                    options = sc.nextInt();
                    if (options == 1) {
                        setChoice("Fully using DEF");
                        defServer.register(this);
                        break;
                    } else if (options == 2) {
                        setChoice("Partially using ABC");
                        defServer.register(this);
                        break;
                    } else {
                        System.out.println("Invalid options, please choose a valid one");
                    }
                }
            }
        }

        if(getChoice().equalsIgnoreCase("Fully using ABC")) {
            System.out.println("Using ABC server");

        } else if(getChoice().equalsIgnoreCase("Partially using ABC") ) {
            System.out.println(" Using limited functionality from ABC server");

        } else if(getChoice().equalsIgnoreCase("Fully using DEF")) {
            System.out.println("Data copied to DEF server, DEF server running");

        } else if(getChoice().equalsIgnoreCase("No services")) {
            System.out.println("No service currently");

        }

    }

}
