package engine;

import enstabretagne.simulation.basics.SortedList;

public class Etudiant extends EntiteSimulee {
    private final String genre;
    private final String film_pref;
    private SortedList <Etudiant> L_amis;

    public Etudiant(SimuEngine engine, String name, String genre, String film_pref) {
        super(engine, name, new eventBonjour());
        this.genre = genre;
        this.film_pref = film_pref;
    }

    private void sayHello() {
        System.out.println("Hello !");
        for (Etudiant et : this.engine.L_entities) {
            if (et.film_pref.equals(this.film_pref)) {
                System.out.println(this.name + "a trouvé un ami ! : " + et.name);
                this.L_amis.add(et);
            }
        }
        this.engine.addEvent(new eventBonjour());
    }
}
