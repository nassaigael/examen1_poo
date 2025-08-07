package nassai.example.Model;

import java.time.LocalDate;
import java.util.List;

public class MatchAmicaux extends Match {

    public MatchAmicaux(String id, LocalDate date, String endroit, List<Combattant> lesDeuxCombatant) {
        super(id, date, endroit, lesDeuxCombatant);
    }

    public void commencer(){
        System.out.println("le metch entre : " + this.getLesDeuxCombatant() + "est commencer");
        this.terminer();
    }
    
    public void terminer(){
        System.out.println("le match amical de : " +this.getLesDeuxCombatant()+" est terminer");
    }
    
}
