package Shake;

import java.util.LinkedList;
import Parts.Parts;

public class Shake {
    private LinkedList<Parts> parts=new LinkedList<Parts>();
    private LinkedList<Parts> baseParts=new LinkedList<Parts>();
    private LinkedList<Parts> customParts=new LinkedList<Parts>();
    private double price;
    private String name ;
    public Shake(String s){
        if(s.equalsIgnoreCase("ChocolateShake") || s.equalsIgnoreCase("CoffeeShake")) {
            price = 240;
            name=s;
        }
        else{
            price=230;
            name=s;
        }
    }
    public void addPrice(Parts part){
        price+=part.getPrice();
    }
    public void addBase(Parts part){
        baseParts.add(part);
    }
    public void addParts(Parts part){
        parts.add(part);
        price+=part.getPrice();
    }
    public void addCustomParts(Parts part){
        customParts.add(part);
    }
    public double getPcPrice(){
        return price;
    }
    public void removeMilk(){
        for (int i=0;i<parts.size();i++){
           if(parts.get(i).getName().equalsIgnoreCase("milk")){
               parts.remove(i);

           }
        }
        for (int i=0;i<baseParts.size();i++){
            if(baseParts.get(i).getName().equalsIgnoreCase("milk")){
                baseParts.remove(i);

            }
        }
    }
    public void show(){
        System.out.println("The PC parts are : ");
        for (int i=0;i<parts.size();i++){
            System.out.println(parts.get(i).getName());
        }
        System.out.println("Total cost of the Pc is: " + getPcPrice());
        System.out.println();
        double cost1;
        if(name.equalsIgnoreCase("ChocolateShake") || name.equalsIgnoreCase("CoffeeShake")){
    cost1=240;
        }
        else{
            cost1=230;
        }
        System.out.println("The PC base parts are : ");
        for (int i=0;i<baseParts.size();i++){
            cost1+=baseParts.get(i).getPrice();
            System.out.println(baseParts.get(i).getName()+": "+ baseParts.get(i).getPrice());
        }

        System.out.println("Total price of base parts: " + cost1);
        cost1=0;
        System.out.println("The PC added components are");
        for (int i=0;i<customParts.size();i++){
            cost1+=customParts.get(i).getPrice();
            System.out.println(customParts.get(i).getName()+": "+ customParts.get(i).getPrice());
        }
        System.out.println("Total price of added components: " + cost1);


    }
}
