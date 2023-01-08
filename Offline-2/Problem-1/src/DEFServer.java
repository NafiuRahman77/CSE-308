import java.util.ArrayList;
import java.util.List;

public class DEFServer extends Server{
    private List<Observer> observers=new ArrayList<Observer>();
    private int previousState;
    private int currentState=1;
    public DEFServer(){

    }

    public List<Observer> getObservers() {
        return observers;
    }
    @Override
    public int getPreviousState() {
        return previousState;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
    @Override
    public void setCurrentState(int currentState) {
        int prevState=this.currentState;
        this.previousState=prevState;
        this.currentState = currentState;
        notifyAllObservers();
    }
    public void register(Observer o){
        if(!observers.contains(o)) {
            observers.add(o);
        }
        else{

        }
    }

    @Override
    public void unregister(Observer o){
        if(observers.contains(o)) {
            observers.remove(o);
        }
        else{

        }
    }

    public void notifyAllObservers() {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update();
        }

    }
    @Override
    public int getCurrentState() {
        return currentState;
    }
}
