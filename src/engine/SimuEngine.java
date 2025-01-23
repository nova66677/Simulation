package engine;

import enstabretagne.base.time.LogicalDuration;
import enstabretagne.simulation.basics.SortedList;

public class SimuEngine {
    private final LogicalDuration temps;
    protected SortedList <SimEvent> L_event;
    protected SortedList <EntiteSimulee> L_entities;

    public SimuEngine(LogicalDuration temps) {
        this.L_event = new SortedList<>();
        this.L_entities = new SortedList<>();
        this.temps = temps;
    }

    public void addEntity(EntiteSimulee entity) {
        this.L_entities.add(entity);
    }

    protected void addEvent(SimEvent event) {
        this.L_event.add(event);
    }
}
