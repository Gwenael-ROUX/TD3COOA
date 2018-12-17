package fr.univamu.iut.exo1;

public class Nombre extends Expression {
    private double valeur;

    public Nombre(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public double calculerValeur() {
        return this.getValeur();
    }
}
