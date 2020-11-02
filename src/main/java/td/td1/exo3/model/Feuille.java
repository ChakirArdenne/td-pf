package td.td1.exo3.model;

import java.util.Set;

public class Feuille implements Arbre {

	private final int valeur;
	
	public Feuille(final int valeur) {
		this.valeur = valeur;
	}

	@Override
	public int taille() {
		return 1;
	}

	@Override
	public boolean contient(Integer val) {
		return this.valeur == val;
	}

	@Override
	public Set<Integer> valeurs() {
		return Set.of(this.valeur);
	} 

	@Override
	public Integer somme() {
		return this.valeur;
	}

	@Override
	public Integer min() {
		return this.valeur;
	}

	@Override
	public Integer max() {
		return this.valeur;
	}

	@Override
	public boolean estTrie() {
		return true;
	}

}
