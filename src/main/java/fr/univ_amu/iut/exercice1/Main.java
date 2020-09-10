package fr.univ_amu.iut.exercice1;

public class Main {
    public static void main(String[] args) {
        Matiere uneMatière;
        System.out.println(" Tout va bien ! ");
        try {
            uneMatière = new Matiere(null, 2.0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }
    }
}