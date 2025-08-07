package nassai.example.Model;

import java.time.LocalDate;

public class MatchAmicaux extends Match {
   
    public MatchAmicaux(String id, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2) {
        super(id, date, endroit, combattant1, combattant2);
    }

    public void terminer(){
        System.out.println("le match amical de : " + this.getCombattant1()+ " " + this.getCombattant2() + " est terminer");
    }
    
}
