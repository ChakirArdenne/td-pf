package td.td1.exo3.model;

import java.util.Objects;

public class Entier implements Sommable<Entier> {

    private final int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public Entier ajouter(Entier other) {
        return new Entier(this.valeur + other.valeur);
    }

    @Override
    public Entier zero() {
        return new Entier(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entier entier = (Entier) o;
        return valeur == entier.valeur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valeur);
    }
}
