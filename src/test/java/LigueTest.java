import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions.*;

import nassai.example.Model.Combattant;
import nassai.example.Model.MatchAmicaux;
import nassai.example.Model.MatchOfficiels;
import nassai.example.Model.MatchPourUneTitre;

import org.junit.jupiter.api.Test;

public class LigueTest {

    private LocalDate date = LocalDate.now();

    @BeforeEach
    void setUp(){
        var c1 = new Combattant("01", "rakoto", "razanany", "beloha", 59.5);
        var c2 = new Combattant("01", "randria", "rabe", "Batata", 89.5);
        var matchAmical = new MatchAmicaux("01", date, "Mahamasina", c1, c2);
        var matchOfficiel = new MatchOfficiels("01", date,"Mahamasina", c1, c2);
        var matchPourUneTitre = new MatchPourUneTitre("01", date, "Mahamasina", c1, c2);
    }

}
