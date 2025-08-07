package nassai.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Ligue {
    private final String nom;
    private List<Combattant> combattants;
    private List<Match> matchs;

    public Ligue(String nom, List<Combattant> combattants, List<Match> matchs) {
        this.nom = nom;
        this.combattants = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Combattant> getCombattants() {
        return combattants;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public void ajouterCombattant(Combattant combattant){
        combattants.add(combattant);
    }

    public void ajouterMatch(Match match){
        matchs.add(match);
    }


    
    
}
