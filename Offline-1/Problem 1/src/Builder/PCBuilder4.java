package Builder;

import GraphicsCard.FourGB;
import GraphicsCard.TwoGB;
import PC.PC;
import Parts.CPU;
import Parts.HDD;
import Parts.Motherboard;
import Parts.DVDPlayer;
import Parts.Parts;
import Processor.Ryzen;
import RAM.Eight2666;
import RAM.Eight3200;

public class PCBuilder4 implements Builder{
    private PC pc=new PC();
    @Override
    public void addBase() {
        Parts cpu=new CPU();
        Parts hdd=new HDD();
        Parts motherboard=new Motherboard();
        Parts processor=new Ryzen();
        pc.addParts(cpu);
        pc.addParts(hdd);
        pc.addParts(motherboard);
        pc.addParts(processor);
        pc.addBase(cpu);
        pc.addBase(hdd);
        pc.addBase(motherboard);
        pc.addBase(processor);
        Parts dvdPlayer=new DVDPlayer();
        pc.addParts(dvdPlayer);
        pc.addBase(dvdPlayer);

    }


    @Override
    public void addGraphics(String s) {
        if(s.equalsIgnoreCase("4 GB")){
            Parts p=new FourGB();
            pc.addParts(p);
            pc.addCustomParts(p);
        }
        else if(s.equalsIgnoreCase("2 GB")){
            Parts p=new TwoGB();
            pc.addParts(p);
            pc.addCustomParts(p);
        }
    }

    @Override
    public void addRAM(String s) {
        if(s.equalsIgnoreCase("8 GB 2666")){
            Parts p=new Eight2666();
            pc.addParts(p);
            pc.addCustomParts(p);
        }
        else if(s.equalsIgnoreCase("8 GB 3200")){
            Parts p=new Eight3200();
            pc.addParts(p);
            pc.addCustomParts(p);
        }

    }
    @Override
    public PC getPC() {
        return pc;
    }
}
