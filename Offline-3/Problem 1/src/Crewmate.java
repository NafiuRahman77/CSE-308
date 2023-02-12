public class Crewmate extends ICrewmate{

    public Crewmate(String name) {
        this.name=name;
    }

    public void speak() {
        System.out.println("I am a crewmate!");
    }
    public void cleanVent(){
        System.out.println("I am cleaning the vent");
    }
    public void maintainReactor(){
        System.out.println("I am maintaining reactor");
    }

    @Override
    public void guardSpaceship() {
        System.out.println("I am protecting the spaceship at any cost");
    }
}
