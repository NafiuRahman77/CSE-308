public class Imposter implements IImposter{
    @Override
    public void speak() {
        System.out.println("I am an Imposter");
    }
    @Override
    public void cleanVent(){
        System.out.println("I am actually passing through the vent instead of cleaning it");
    }
    @Override
    public void maintainReactor(){
        System.out.println("I am melting down the reactor instead of maintaining it");
    }
}
