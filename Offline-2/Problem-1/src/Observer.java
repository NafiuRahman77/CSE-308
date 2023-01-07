import java.net.Socket;

public abstract class Observer {
    protected Server server;
    protected int id;
    protected String choice;

    public abstract void update() ;
}
