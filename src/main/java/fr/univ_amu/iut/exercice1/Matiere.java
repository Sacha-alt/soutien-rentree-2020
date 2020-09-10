package fr.univ_amu.iut.exercice1;

public class Matiere {
    private String IntituléMatière;
    private double Coeff;

    public Matiere(String intituléMatière, double Coeff) {
        this.IntituléMatière = intituléMatière;
        this.Coeff = Coeff;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "IntituléMatière='" + IntituléMatière + '\'' +
                ", Coeff=" + Coeff +
                '}';
    }
    public double getValeur() {
        return Coeff;
    }

    public String getIntitulé() {
        return IntituléMatière;
    }
}
class note {
    private double valeur;
    private  Matiere matiere;

    public note(double valeur, Matiere matiere) {
        this.valeur = valeur;
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "note{" +("matieregetIntitulé")+
                ", Matiere='" + matiere + "valeur=" + valeur +'\''+
                '}';
    }

    public double getValeur() {
        return valeur;
    }

    public String getMatière() {
        return matiere;
    }
}
