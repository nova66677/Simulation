package engine;

import enstabretagne.base.time.LogicalDateTime;

import java.util.List;

public class Event_Bonjour extends SimEvent{

    public Event_Bonjour(LogicalDateTime date, EntiteSimulee entity) {
        super(date, entity);
    }

    @Override
    public void Process() {
        System.out.println("Bonjour");
    }
}
