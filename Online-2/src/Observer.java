public class Observer {
    private static int idCount=1905001;
    protected int id;
    protected Server server;
    public Observer( Server server) {

        this.server = server;
        id=idCount;
        idCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void update(Weather w){
        System.out.println("Weather update for user "+ id);
        System.out.println("The temperature is "+ w.getTemperature()+ " degree Celsius");
        System.out.println("The weather condition is "+ w.getState());
        if(!w.getSevereState().equalsIgnoreCase("")){
            System.out.println(w.getSevereState());
        }
    }
}
