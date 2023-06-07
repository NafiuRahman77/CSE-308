import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<Observer> observers=new ArrayList<Observer>();
    private int previousTemperature ;
    private int currentTemperature =1;
    private Weather weather;
    public Server(Weather w){
        weather=w;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public int getpreviousTemperature () {
        return previousTemperature ;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void notifyWeather ( ) {
            notifyAllObservers(weather);

    }

    public void register(Observer o){
        if(!observers.contains(o)) {
            observers.add(o);
        }
        else{

        }
    }


    public void unregister(Observer o){
        if(observers.contains(o)) {
            observers.remove(o);
        }
        else{

        }
    }

    public void notifyAllObservers(Weather w) {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(w);
        }

    }
    
    public int getcurrentTemperature () {
        return currentTemperature ;
    }
}
