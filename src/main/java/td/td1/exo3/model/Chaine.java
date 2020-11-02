package td.td1.exo3.model;

import java.util.Objects;

public class Chaine implements Sommable<Chaine> {

    private final String valeur;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chaine chaine = (Chaine) o;
        return valeur.equals(chaine.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valeur);
    }

    public Chaine(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public Chaine ajouter(Chaine other) {
        StringBuilder sb = new StringBuilder().append(this.valeur).append(other);
        return new Chaine(sb.toString());
    }

    @Override
    public Chaine zero() {
        return new Chaine("");
    }

}
