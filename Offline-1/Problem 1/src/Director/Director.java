package Director;

import Builder.Builder;
import PC.PC;

public class Director {
    Builder mybuilder;
    public void construct(Builder builder){
        mybuilder=builder;
        mybuilder.addBase();
    }
    public void addRam(String s){
        mybuilder.addRAM(s);

    }
    public void addGraphics(String s){
        mybuilder.addGraphics(s);
    }
    public PC getPC(){
        return mybuilder.getPC();
    }
}
