package Builder;

import PC.PC;
import Parts.Parts;

public interface Builder {
    public abstract void addBase();
    public abstract void addGraphics(String s);
    public abstract void addRAM(String s);
    public abstract PC getPC();

}
