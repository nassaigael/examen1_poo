package nassai.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Combattant {
    private final String id;
    private final String nom;
    private final String prenom;
    private final String nomCombattant;
    private double poids;
    private int nombresVictoires;
    private int nombresEgalite;
    private int nombresDefaites;
    private final List<String> listeTitres;

    public Combattant(String id, String nom, String prenom, String nomCombattant, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.nombresVictoires = 0;
        this.nombresEgalite = 0;
        this.nombresDefaites = 0;
        this.listeTitres = new ArrayList<>();
    }

    // getters
    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }

    public double getPoids() {
        return poids;
    }

    public List<String> getListeTitres() {
        return listeTitres;
    }

    public int getNombresVictoires() {
        return nombresVictoires;
    }

    public int getNombresEgalite() {
        return nombresEgalite;
    }

    public int getNombresDefaites() {
        return nombresDefaites;
    }


    // Setters
    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setNombresVictoires() {
        this.nombresVictoires++;
    }

    public void setNombresEgalite() {
        this.nombresEgalite++;
    }

    public void setNombresDefaites() {
        this.nombresDefaites++;
    }

    public void ajouterTitres(String titre) {
        this.listeTitres.add(titre);
    }

    // toString
    @Override
    public String toString() {
        return "Combattant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nomCombattant=" + nomCombattant
                + ", poids=" + poids + ", listeTitres=" + listeTitres + "]";
    }

}
