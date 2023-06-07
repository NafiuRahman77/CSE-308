public class Weather {
    private int temperature;
    private String state;
    private String severeState;

    public Weather(int temperature, String state, String severeState) {
        this.temperature = temperature;
        this.state = state;
        this.severeState = severeState;
    }

    public int getTemperature() {
        return  (int) (Math.random() * (temperature));
    }

    public String getState() {
        int rand=(int)(Math.random()*2);
        if(rand==0){
            state="sunny";
        }
        else if(rand==1){
            state="rainy";
        }
        else{
            state="snowy";
        }
        return state;
    }

    public String getSevereState() {
        int rand=(int)(Math.random()*2);
        if(rand==0){
            severeState="Possibility of snow";
        }
        else if(rand==1) {
            severeState="Possibility of heavy Snow";
        }
        else{
            severeState="";
        }

        return severeState;
    }
}
