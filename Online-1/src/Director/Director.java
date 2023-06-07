package Director;

import Builder.Builder;
import Shake.Shake;

public class Director {
    Builder mybuilder;
    public void construct(Builder builder){
        mybuilder=builder;
        mybuilder.addBase();
    }
    public void addCandy(String s){
        mybuilder.addCandy(s);

    }
    public void addCookies(String s){
        mybuilder.addCookies(s);
    }
    public void addAlmondMilk(String s){mybuilder.addAlmondMilk(s);}
    public Shake getShake(){
        return mybuilder.getShake();
    }
}
