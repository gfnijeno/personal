public class Pet {
    String name;
    int trustlevel;
    int petlevel;
    boolean ishappy;

    public void petsentence() {
        System.out.println("Their pet's name is " + name + ". It's trust level is " + trustlevel + ". Out of 10, I would rate this pet " + petlevel + ". Is it true that this pet is happy? " + ishappy);
    }
}
