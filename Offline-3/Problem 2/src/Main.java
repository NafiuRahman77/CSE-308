import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Coffee> orderList=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        while(true){

            System.out.println("Press 1 to place new order");
            System.out.println("Press 2 to exit");
            int a=sc.nextInt();
            if(a==1){
                while(true){
                    System.out.println("Select your coffee options");
                    System.out.println(("1. Americano 2. Cappuccinno 3. Espresso 4. Mocha"));
                    System.out.println("Press 5 to finish order");
                    int b=sc.nextInt();
                    if(b==1){
                        Coffee coffee=new BlackCoffee();
                        coffee=new CoffeeBeans(coffee);
//                        System.out.println(coffee.getCost());
//                        System.out.println(coffee.getIngredients());
                        orderList.add(coffee);
                    }
                    else if(b==2){
                        Coffee coffee=new MilkCoffee();
                        coffee=new CinnamonPowder(coffee);
                        orderList.add(coffee);
                    }
                    else if(b==3){
                        Coffee coffee=new BlackCoffee();
                        coffee=new DairyCream(coffee);
                        orderList.add(coffee);
                    }
                    else if(b==4){
                        Coffee coffee=new MilkCoffee();
                        coffee=new ChocolateSauce(coffee);
                        orderList.add(coffee);
                    }
                    else if(b==5){
                        break;
                    }

                }
                System.out.println("The order is-");
                for(int i=0;i<orderList.size();i++){
                    System.out.println("Price is-");
                    System.out.println(orderList.get(i).getCost());
                    System.out.println("Added ingredient-");
                    System.out.println(orderList.get(i).getIngredients());
                }
                orderList.clear();
            }
            else{
                break;
            }
        }

    }
}
