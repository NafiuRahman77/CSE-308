public class ImposterAdapter implements ICrewmate {
    IImposter imp;

    public ImposterAdapter(IImposter imp) {
        this.imp = imp;
    }
    @Override
    public void speak() {
        imp.speak();
    }

    @Override
    public void cleanVent() {
        imp.cleanVent();
    }

    @Override
    public void maintainReactor() {
        imp.maintainReactor();
    }
}
