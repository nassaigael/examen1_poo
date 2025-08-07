package nassai.example.Model;

import java.time.LocalDate;
import java.util.List;

public class MatchOfficiels extends Match implements MatchInterface {

    public MatchOfficiels(String id, LocalDate date, String endroit, List<Combattant> lesDeuxCombatant) {
        super(id, date, endroit, lesDeuxCombatant);
    }

    

    @Override
    public void commencer(int pointCombattant1, int pointCombattant2) {
        if (pointCombattant1 > pointCombattant2) {
            
        }
    }



    @Override
    public void terminer() {
        
    }

}
