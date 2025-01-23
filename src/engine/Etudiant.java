package engine;

public class Etudiant extends EntiteSimulee {
    private final String genre;
    private final String film_pref;

    public Etudiant(SimuEngine engine, String name, String genre, String film_pref) {
        super(engine, name);
        this.genre = genre;
        this.film_pref = film_pref;
    }

    public void notifyEngine() {
        this.engine.addEntity(this);
    }

    private void sayHello() {
        System.out.println("Hello !");
    }
}
