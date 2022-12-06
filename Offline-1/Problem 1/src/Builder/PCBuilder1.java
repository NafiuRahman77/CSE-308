package Builder;

import Cooler.CPUCooler;
import GraphicsCard.FourGB;
import GraphicsCard.TwoGB;
import PC.PC;
import Parts.CPU;
import Parts.HDD;
import Parts.Motherboard;
import Parts.Parts;
import Processor.Corei5;
import RAM.Eight2666;
import RAM.Eight3200;

public class PCBuilder1 implements Builder{
    private PC pc=new PC();
    @Override
    public void addBase() {
        Parts cpu=new CPU();
        Parts hdd=new HDD();
        Parts motherboard=new Motherboard();
        Parts processor=new Corei5();
        pc.addParts(cpu);
        pc.addParts(hdd);
        pc.addParts(motherboard);
        pc.addParts(processor);
        pc.addBase(cpu);
        pc.addBase(hdd);
        pc.addBase(motherboard);
        pc.addBase(processor);

        Parts cpuCooler=new CPUCooler();
        pc.addParts(new CPUCooler());
        pc.addBase(cpuCooler);


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
