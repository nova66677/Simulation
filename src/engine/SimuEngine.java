package engine;

import enstabretagne.base.time.LogicalDuration;
import enstabretagne.simulation.basics.SortedList;

public class SimuEngine {
    private final LogicalDuration temps;
    private SortedList <SimEvent> L_event;
    private SortedList <EntiteSimulee> L_entities;

    public SimuEngine(LogicalDuration temps, SortedList <SimEvent> L_event, SortedList <EntiteSimulee> L_entities) {
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
