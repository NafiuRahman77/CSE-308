package PC;

import Parts.Parts;

import java.util.LinkedList;

public class PC {
   private LinkedList<Parts> parts=new LinkedList<Parts>();
    private LinkedList<Parts> baseParts=new LinkedList<Parts>();
    private LinkedList<Parts> customParts=new LinkedList<Parts>();
   private double price;
   public PC(){
       price=70000;
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
   public void show(){
       System.out.println("The PC parts are : ");
       for (int i=0;i<parts.size();i++){
           System.out.println(parts.get(i).getName());
       }
       System.out.println("Total cost of the Pc is: " + getPcPrice());
       System.out.println();
       double cost1=70000;
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
