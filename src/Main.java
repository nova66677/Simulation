import enstabretagne.base.time.LogicalDateTime;
import enstabretagne.base.time.LogicalDuration;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Exercice 4.2

        LogicalDateTime maDate = LogicalDateTime.LogicalDateFrom("24/01/2024 10:34:47.6789");
        System.out.println("maDate = " + maDate);
        LogicalDuration maDuree = LogicalDuration.ofMinutes(15);
        maDuree = maDuree.add(LogicalDuration.ofSeconds(12));
        maDuree = maDuree.add(LogicalDuration.ofMillis(670));

        System.out.println("maDuree = " + maDuree);
        LogicalDateTime nouvelleDate =  maDate.add(maDuree);
        System.out.println("On ajoute maDuree à maDate");
        System.out.println("maDate = " + nouvelleDate);

    }
}