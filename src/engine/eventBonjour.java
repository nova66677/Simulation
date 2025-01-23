package engine;

public class eventBonjour extends SimEvent{

    public eventBonjour() {}

    @Override
    public void Process() {
        System.out.println(this.entity.name + "dit : 'Bonjour'\n");
    }

    @Override
    public int compareTo(SimEvent o) {
        return this.date.compareTo(o.date);
    }
}
