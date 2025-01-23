package engine;

import enstabretagne.base.time.LogicalDateTime;


abstract public class SimEvent implements Comparable<SimEvent> {
    private LogicalDateTime date;
    private EntiteSimulee entity;

    public SimEvent() {
        this.date = "test"// Implementer la logique des dates
        this.entity = null;
    }

    public abstract void Process();
}
