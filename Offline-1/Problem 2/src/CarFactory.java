public class CarFactory {
    public Car getCar(String carType){
        if(carType==null){
            return null;
        }
        else{
            if(carType.equalsIgnoreCase("Asia")){
                return new Toyota();
            }
            if(carType.equalsIgnoreCase("Europe")){
                return new BMW();
            }
            if(carType.equalsIgnoreCase("America")){
                return new Tesla();
            }
        }
        return null;
    }
}
