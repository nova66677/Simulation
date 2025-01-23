package engine;

import enstabretagne.base.time.LogicalDateTime;

import java.util.List;

abstract public class SimEvent implements Comparable<SimEvent> {
    private LogicalDateTime date;
    private EntiteSimulee entity;

    public SimEvent (LogicalDateTime date, EntiteSimulee entity) {
        this.date = date;
        this.entity = entity;
    }

    public abstract void Process();

}
