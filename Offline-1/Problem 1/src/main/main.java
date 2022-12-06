package main;

import Builder.PCBuilder1;
import Builder.PCBuilder2;
import Builder.PCBuilder3;
import Builder.PCBuilder4;
import Builder.Builder;
import Director.Director;
import PC.PC;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Director director=new Director();
        String order="";
        LinkedList<PC> products=new LinkedList<PC>();
         while(true){
            System.out.println("Press O to place a new order");
            System.out.println("Press E to exit ");
            order= scanner.next();
            if(order.equalsIgnoreCase("E")){
                break;
            }
            else if(order.equalsIgnoreCase("O")){

                outer:  while(true) {
                    int flag=0;
                    Builder builder = null;
                    System.out.println("Choose a PC");

                    System.out.println("1. Core i5");
                    System.out.println("2. Core i7");
                    System.out.println("3, Core i9");
                    System.out.println("4. Gaming PC");

                    order = scanner.next();
                    if (order.equalsIgnoreCase("E") && flag==0 ) {
                        System.out.println("You need to order something first Sir");
                    }
                    if (order.equalsIgnoreCase("E") && flag==1 ) {
                       break;
                    }

                    if (order.equalsIgnoreCase("1")) {
                        flag=1;
                        builder = new PCBuilder1();
                    } else if (order.equalsIgnoreCase("2")) {
                        flag=1;
                        builder = new PCBuilder2();
                    } else if (order.equalsIgnoreCase("3")) {
                        flag=1;
                        builder = new PCBuilder3();
                    } else if (order.equalsIgnoreCase("4")) {
                        flag=1;
                        builder = new PCBuilder4();
                    }
                    if (order.equalsIgnoreCase("O")) {
                        flag = 0;
                        System.out.println("You can't order another Pc");
                    }
                    if (flag == 1) {
                        director.construct(builder);
                        while (true) {
                            System.out.println("Press to order");
                            System.out.println("1. 8 GB RAM 2666MHz");
                            System.out.println("2. 8 GB RAM 3200MHz");
                            System.out.println("3. 2 GB Graphics Card ");
                            System.out.println("4. 4 GB Graphics Card");
                            order = scanner.next();
                            if (order.equalsIgnoreCase("1")) {
                                director.addRam("8 GB 2666");

                            } else if (order.equalsIgnoreCase("2")) {
                                director.addRam("8 GB 3200");
                            } else if (order.equalsIgnoreCase("3")) {
                                director.addGraphics("2 GB");
                            } else if (order.equalsIgnoreCase("2")) {
                                director.addGraphics("4 GB");
                            } else if (order.equalsIgnoreCase("E")) {
                                PC p=director.getPC();
                                products.add(p);
                                break outer;
                            }
                        }


                    }

                }
            }
        }
        System.out.println("---------------------------------------------------");
        for(int i=0;i<products.size();i++){
            products.get(i).show();
            System.out.println("-----------------------------------------------------");
        }
       /* Builder pc1builder=new PCBuilder1();
        director.construct(pc1builder);
        pc1builder.addGraphics("4 GB");
        pc1builder.addGraphics("4 GB");
        PC p1=pc1builder.getPC();
        System.out.println(p1.getPcPrice());
        p1.show();*/
    }

}
