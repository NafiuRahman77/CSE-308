import java.util.ArrayList;
import java.util.List;

public abstract class Server {
    private List<Observer> observers=new ArrayList<Observer>();
    private int previousState;
    private int currentState=1;
    public abstract int getPreviousState() ;
    public abstract void setCurrentState(int currentState);
    public abstract int getCurrentState();
    public abstract void register(Observer o);
    public abstract void unregister(Observer o);
}
