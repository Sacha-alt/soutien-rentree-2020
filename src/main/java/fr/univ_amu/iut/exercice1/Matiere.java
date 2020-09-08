package fr.univ_amu.iut.exercice1;

public class Matiere {
    private String intitule;
    private double coeff;

    public Matiere(String intitule, double coeff) {
        if (intitule == null || intitule.isEmpty())
            throw new IllegalArgumentException("L'intitulé d'une matière ne peut être vide");

        this.intitule = intitule;
        this.coeff = coeff;
    }

    public String getIntitule() {
        return intitule;
    }

    public double getCoeff() {
        return coeff;
    }

    @Override
    public String toString() {
        return "Matiere : '" + intitule + "', coeff=" + coeff;
    }
}