package nassai.example.Model;

import java.time.LocalDate;

public class MatchPourUneTitre extends Match {

    public MatchPourUneTitre(String id, LocalDate date, String endroit, Combattant combattant1,
            Combattant combattant2) {
        super(id, date, endroit, combattant1, combattant2);
    }

    public void terminer(int pointCombattant1, int pointCombattant2, String titrePourGagnant) {
        if (pointCombattant1 > pointCombattant2) {
            this.getCombattant1().setNombresVictoires();
            this.getCombattant2().setNombresDefaites();
            this.getCombattant1().ajouterTitres(titrePourGagnant);
        } else if (pointCombattant1 < pointCombattant2) {
            this.getCombattant2().setNombresVictoires();
            this.getCombattant1().setNombresDefaites();
        } else {
            this.getCombattant1().setNombresEgalite();
            this.getCombattant2().setNombresEgalite();
            this.getCombattant2().ajouterTitres(titrePourGagnant);
        }
    }



}
