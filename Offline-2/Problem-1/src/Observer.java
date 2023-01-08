import java.net.Socket;

public abstract class Observer {
    protected Server server;
    protected Server defServer=new DEFServer(); //backup
    protected int id;
    protected String choice;
    protected static int idCount=1905001;

    public abstract void update() ;
}
