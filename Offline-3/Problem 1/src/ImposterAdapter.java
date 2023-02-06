public class ImposterAdapter implements ICrewmate {
    IImposter imp;

    public ImposterAdapter(IImposter imp) {
        this.imp = imp;
    }

    public void speak() {
        imp.speak();
    }
}
