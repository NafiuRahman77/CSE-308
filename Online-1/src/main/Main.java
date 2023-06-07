package main;

import Builder.Builder;
import Builder.*;
import Director.Director;
import Shake.Shake;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Director director=new Director();
        String order="";
        LinkedList<Shake> products=new LinkedList<Shake>();
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
                    System.out.println("Choose a Shake");

                    System.out.println("1. Chocolate Syrup");
                    System.out.println("2. Coffee Syrup");
                    System.out.println("3. Zero Sugar");


                    order = scanner.next();
                    if (order.equalsIgnoreCase("E") && flag==0 ) {
                        System.out.println("You need to order something first Sir");
                    }
                    if (order.equalsIgnoreCase("E") && flag==1 ) {
                        break;
                    }

                    if (order.equalsIgnoreCase("1")) {
                        flag=1;
                        builder = new ChocolateSyrupBuilder();
                    } else if (order.equalsIgnoreCase("2")) {
                        flag=1;
                        builder = new CoffeeSyrupBuilder();
                    } else if (order.equalsIgnoreCase("3")) {
                        flag=1;
                        builder = new ZeroSugarBuilder();
                    }
                    if (order.equalsIgnoreCase("O")) {
                        flag = 0;
                        System.out.println("You can't order another Syrup");
                    }
                    if (flag == 1) {
                        director.construct(builder);
                        while (true) {
                            System.out.println("Press to order");
                            System.out.println("1. Candy");
                            System.out.println("2. Cookies");
                            System.out.println("3. Almond Milk ");

                            order = scanner.next();
                            if (order.equalsIgnoreCase("1")) {
                                director.addCandy("Candy");

                            } else if (order.equalsIgnoreCase("2")) {
                                director.addCookies("Cookies");
                            } else if (order.equalsIgnoreCase("3")) {
                                director.addAlmondMilk("Almond Milk");
                            } else if (order.equalsIgnoreCase("E")) {
                                Shake p=director.getShake();
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
    }
}
