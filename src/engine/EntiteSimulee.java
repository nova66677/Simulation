package engine;

abstract public class EntiteSimulee implements Comparable <EntiteSimulee> {
    protected SimuEngine engine;
    protected String name;
    protected SimEvent event;

    public EntiteSimulee(SimuEngine engine, String name ) {
        this.engine = engine;
        this.name = name;
        this.event = null;
    }

    public int compareTo(EntiteSimulee other) {
        return this.name.compareTo(other.name);
    }

    protected int addEvent(SimEvent ev ) {
        // On attribue a l'entite un evenement SImEvent et on check si l'attribution a fonctionné
        this.event = ev;
        if (this.event != null) {
            return 0;
        } else {
            return 1;
        }
    }

    protected void addEvent2Engine(SimEvent ev) {
        this.engine.addEvent(ev);
    }
}
