package nassai.example.Model;

import java.time.LocalDate;
import java.util.List;

public class MatchOfficiels extends Match{

    public MatchOfficiels(String id, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2) {
        super(id, date, endroit, combattant1, combattant2);
    }

    public void terminer(int pointCombattant1, int pointCombattant2) {
        if (pointCombattant1 > pointCombattant2) {
            this.getCombattant1().setNombresVictoires();
            this.getCombattant2().setNombresDefaites();
        }else if (pointCombattant1 < pointCombattant2) {
            this.getCombattant2().setNombresVictoires();
            this.getCombattant1().setNombresDefaites();
        }else {
            this.getCombattant1().setNombresEgalite();
            this.getCombattant2().setNombresEgalite();
        }
    }

}
