package Builder;

import Shake.Shake;

public interface Builder {
    public abstract void addBase();
    public abstract void addCookies(String s);
    public abstract void addAlmondMilk(String s);
    public abstract void addCandy(String s);
    public abstract void removeMilk();
    public abstract Shake getShake();
}