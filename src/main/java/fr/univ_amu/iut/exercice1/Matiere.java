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
}

