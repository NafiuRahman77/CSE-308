package Builder;

import Parts.Parts;
import Parts.Milk;
import Parts.Sugar;
import Parts.Cookies;
import Parts.AlmondMilk;
import Parts.Candy;
import Shake.Shake;

public class ZeroSugarBuilder implements Builder{
    private Shake shake=new Shake("ZeroSugar");
    @Override
    public void addBase() {
        Parts milk=new Milk();
        Parts sugar=new Sugar();
        shake.addParts(sugar);
        shake.addBase(milk);


    }

    @Override
    public void addCookies(String s) {
        Parts p=new Cookies();
        shake.addParts(p);
        shake.addCustomParts(p);

    }

    @Override
    public void addAlmondMilk(String s) {
        Parts p=new AlmondMilk();
        shake.addParts(p);
        shake.addCustomParts(p);

    }

    @Override
    public void addCandy(String s) {
        Parts p=new Candy();
        shake.addParts(p);
        shake.addCustomParts(p);

    }
    @Override
    public void removeMilk(){
        shake.removeMilk();
    }

    @Override
    public Shake getShake() {
        return shake;
    }
}
