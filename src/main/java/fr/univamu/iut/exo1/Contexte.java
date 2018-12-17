package fr.univamu.iut.exo1;

import java.util.ArrayList;

public class Contexte {
    private TriPlace t;
    public void effectuerTri(ArrayList<Place> places) {
        t.trierPlace(places);
    }
    public void changerTri(TriPlace typeTri) {
        t = typeTri;
    }
    public TriPlace retournerTri() {
        return t;
    }
}
