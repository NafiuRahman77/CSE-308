public class Main {
    public static void main(String[] args) {
        ICrewmate cm=new Crewmate();
        IImposter imp=new Imposter();
        ICrewmate imposterAdapter=new ImposterAdapter(imp);
       // imp.speak();
        cm.speak();
        cm.cleanVent();
        cm.maintainReactor();
        imposterAdapter.speak();
        imposterAdapter.cleanVent();
        imposterAdapter.maintainReactor();
    }
}
