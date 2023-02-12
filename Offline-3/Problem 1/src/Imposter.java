public class Imposter extends IImposter{
    public Imposter(String name) {
        this.name=name;
    }

    @Override
    public void speak() {
        System.out.println("\u001B[31m"+"I am an Imposter"+"\u001B[0m");
    }
    @Override
    public void cleanVent(){
        System.out.println("\u001B[31m"+"I am actually passing through the vent instead of cleaning it"+"\u001B[0m");
    }
    @Override
    public void maintainReactor(){
        System.out.println("\u001B[31m"+"I am melting down the reactor instead of maintaining it"+"\u001B[0m");
    }

    @Override
    public void guardSpaceship() {
        System.out.println("\u001B[31m"+"I am actually killing crewmates inside the spaceship instead of guarding it"+"\u001B[0m");
    }
}
