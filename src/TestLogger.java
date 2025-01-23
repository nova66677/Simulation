import enstabretagne.base.logger.Logger;

public class TestLogger {
    public static void main(String[] args) {
        Logger.load();
        Logger.DataSimple("Test", "Nom","Prénom","Age");
        Logger.DataSimple("Test", "SKYWALKER","Anakin",30.0);
        Logger.Terminate();
    }
}
