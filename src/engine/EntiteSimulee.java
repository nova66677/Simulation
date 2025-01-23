package engine;

abstract public class EntiteSimulee implements Comparable <EntiteSimulee> {
    protected SimuEngine engine;
    protected String name;
    protected SimEvent event;

    public EntiteSimulee(SimuEngine engine, String name, SimEvent event ) {
        this.engine = engine;
        this.name = name;
        this.event = event;
        this.notifyEngine();
        this.addEvent(this.event);
    }

    public void notifyEngine() {
        this.engine.addEntity(this);
    }

    public int compareTo(EntiteSimulee other) {
        return this.name.compareTo(other.name);
    }

    protected void addEvent(SimEvent ev ) {
        // On attribue a l'entite un evenement SImEvent et on check si l'attribution a fonctionné
        this.event = ev;
        this.addEvent2Engine(this.event);
    }

    protected void addEvent2Engine(SimEvent ev) {
        this.engine.addEvent(ev);
    }
}
