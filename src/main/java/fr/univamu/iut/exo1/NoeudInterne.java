package fr.univamu.iut.exo1;

public class NoeudInterne  extends Expression{
    private Expression premiereOperande;
    private Expression deuxiemeOperande;
    private char operateurBinaire;

    public NoeudInterne(Expression premiereOperande, Expression deuxiemeOperande, char operateurBinaire) {
        this.premiereOperande = premiereOperande;
        this.deuxiemeOperande = deuxiemeOperande;
        this.operateurBinaire = operateurBinaire;
    }

    public char getOperateurBinaire() {
        return operateurBinaire;
    }

    public void setOperateurBinaire(char operateurBinaire) {
        this.operateurBinaire = operateurBinaire;
    }


    @Override
    public double calculerValeur() {
        double resultat = 0;
        switch (this.getOperateurBinaire()){
            case '+':
                resultat = premiereOperande.calculerValeur()+deuxiemeOperande.calculerValeur();
                break;
            case '-':
                resultat = premiereOperande.calculerValeur()-deuxiemeOperande.calculerValeur();
                break;
            case '*':
                resultat = premiereOperande.calculerValeur()*deuxiemeOperande.calculerValeur();
                break;
            default:
                System.out.println("taper un caractère valable parmis ceci: \n + \n - \n *");
        }
        return resultat;
    }
}
