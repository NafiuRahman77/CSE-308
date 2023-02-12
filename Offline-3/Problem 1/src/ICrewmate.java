public abstract class ICrewmate {
    String name;
    public abstract void speak();
    public abstract void cleanVent();
    public abstract void maintainReactor();
    public abstract void guardSpaceship();

    public String getName() {
        return name;
    }
}
