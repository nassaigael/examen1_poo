package nassai.example.Model;


import java.time.LocalDate;
import java.util.List;

public abstract class Match {
    private String id;
    private LocalDate date;
    private String endroit;
    private Combattant combattant1;
    private Combattant combattant2;

    // Constructeur
        public Match(String id, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.combattant1 = combattant1;
        this.combattant2 = combattant2;
    }

    // getters
    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }
    public String getEndroit() {
        return endroit;
    }

    public Combattant getCombattant1() {
        return combattant1;
    }

    public Combattant getCombattant2() {
        return combattant2;
    }    

    // toString
    @Override
    public String toString() {
        return "Match [id=" + id + ", date=" + date + ", endroit=" + endroit + ", lesDeuxCombatant=" + lesDeuxCombatant
                + "]";
    }
}
