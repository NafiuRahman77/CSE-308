public class Main {
    public static void main(String[] args) {
        Crewmate cm=new Crewmate();
        Imposter imp=new Imposter();
        ICrewmate imposterAdapter=new ImposterAdapter(imp);
       // imp.speak();
        imposterAdapter.speak();
    }
}
