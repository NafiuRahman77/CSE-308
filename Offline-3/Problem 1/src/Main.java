public class Main {
    public static void main(String[] args) {
        ICrewmate cm=new Crewmate("Nafiu");
        IImposter imp=new Imposter("Jalal");
        ICrewmate imposterAdapter=new ImposterAdapter(imp, "Mashroor");
       // imp.speak();
        System.out.println(cm.getName());
        cm.speak();
        cm.cleanVent();
        cm.maintainReactor();
        cm.guardSpaceship();
        System.out.println(imposterAdapter.getName());
        imposterAdapter.speak();
        imposterAdapter.cleanVent();
        imposterAdapter.maintainReactor();
        imposterAdapter.guardSpaceship();
    }
}
