public class ImposterAdapter extends ICrewmate {
    IImposter imp;
    public ImposterAdapter(IImposter imp, String name) {
        this.imp = imp;
        this.name=name;
    }
    @Override
    public void speak() {
        System.out.println("I am a crewmate!");
        imp.speak();
    }

    @Override
    public void cleanVent() {
        System.out.println("I am cleaning the vent");
        imp.cleanVent();
    }

    @Override
    public void maintainReactor() {
        System.out.println("I am maintaining reactor");
        imp.maintainReactor();
    }

    @Override
    public void guardSpaceship() {
        System.out.println("I am protecting the spaceship at any cost");
        imp.guardSpaceship();
    }
}
