package fr.univamu.iut.exo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Parking  implements Iterable <Vehicule> {
    private ArrayList<Place> places;

    private Place chercherSuivant (LocalDate date){
        if(places.isEmpty())
            return null;
        Place resultat = null;
        LocalDate dateMin = LocalDate.MAX;
        for (Place p: places){
            if(!p.estLibre()){
                LocalDate dTmp = p.getVehiculeGaree().getDateArrivee();
                if(dTmp.isAfter(date) && dTmp.isBefore(dateMin)){
                    resultat = p;
                    dateMin = dTmp;
                }
            }
        }
        return resultat;
    }

    public Parking() {
        places = new ArrayList<Place>();
    }
    public void ajouter(Place place) {
        places.add(place);
    }
    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void garerVehicule (TriPlace tri, Vehicule v) {
        Place p;
        p = tri.trierPlace(places).first();
        assert p != null;
        p.affecterVehicule(v);
    }

    @Override
    public Iterator <Vehicule> iterator() {

        return new Iterator <Vehicule>() {
            int currentIndex;
            Place suivante = chercherSuivant (LocalDate.MIN);

            @Override
            public boolean hasNext() {
                return currentIndex < places.size() && places.get(currentIndex) != null;
            }

            @Override
            public Vehicule next() {
                suivante = chercherSuivant(suivante.getVehiculeGaree().getDateArrivee());
                assert suivante != null;
                return suivante.getVehiculeGaree();
            }
        };
    }
}
