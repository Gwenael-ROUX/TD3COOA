package fr.univamu.iut.exo2;

import java.util.Deque;
import java.util.Iterator;

public class ArbreBinaire <T> implements Iterable<T>{
    private ArbreBinaire <T> filsGauche = null;
    private ArbreBinaire <T> filsDroit = null;
    private ArbreBinaire <T> pere = null;
    private T contenu;

    public ArbreBinaire(ArbreBinaire<T> filsGauche, ArbreBinaire<T> filsDroit, T contenu) {
        this.filsGauche = filsGauche;
        this.filsDroit = filsDroit;
        this.contenu = contenu;

        if(filsGauche!=null){
            this.filsGauche.setPere(this);
        }
        if(filsDroit!=null){
            this.filsDroit.setPere(this);
        }
    }

    public ArbreBinaire<T> getFilsGauche() {
        return filsGauche;
    }

    public ArbreBinaire<T> getFilsDroit() {
        return filsDroit;
    }

    public ArbreBinaire<T> getPere() {
        return pere;
    }

    public T getContenu() {
        return contenu;
    }

    public void setFilsGauche(ArbreBinaire<T> filsGauche) {
        this.filsGauche = filsGauche;
    }

    public void setFilsDroit(ArbreBinaire<T> filsDroit) {
        this.filsDroit = filsDroit;
    }

    public void setPere(ArbreBinaire<T> pere) {
        this.pere = pere;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public ArbreBinaire <T> getPrim (){
        while (this.getPere() != null){
             = this.getPere();
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new  Iterator<T>() {
            private Deque pile;


            @Override
            public boolean hasNext() {
                if(getFilsGauche() != null){
                    return true;
                }
                else return getFilsDroit() != null;
            }

            @Override
            public T next() {
                if(getFilsGauche() != null && getFilsDroit() != null){
                    return getPere().getContenu();
                }
                else if(getFilsDroit() != null){
                    getFilsDroit()
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException;
            }
        };
    }
}
