package td.td1.exo3.model;

import java.util.Set;

public class Feuille<T> implements Arbre<T> {

	private final T valeur;
	
	public Feuille(final T valeur) {
		this.valeur = valeur;
	}

	@Override
	public int taille() {
		return 1;
	}

	@Override
	public boolean contient(T val) {
		return this.valeur == val;
	}

	@Override
	public Set<T> valeurs() {
		return Set.of(this.valeur);
	} 

}
