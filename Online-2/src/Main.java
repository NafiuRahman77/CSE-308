import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Weather w=new Weather(20,"sunny","");
        Server s=new Server(w);
        Observer o1=new Observer(s);
        Observer o2=new Observer(s);
        Observer o3=new Observer(s);
        s.register(o1);
        s.register(o2);
        s.register(o3);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Press 1 to get weather update");
            System.out.println("Press 2 to exit");
            int a=sc.nextInt();
            if(a==1){
                s.notifyWeather();
            }
            else{
                break;
            }
        }

    }
}
