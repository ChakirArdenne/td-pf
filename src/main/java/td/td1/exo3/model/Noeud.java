package td.td1.exo3.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T> & Comparable<T>> implements Arbre<T> {

	private final List<Arbre<T>> fils;

	public Noeud(final List<Arbre<T>> fils) {
		this.fils = fils;
	}

	@Override
	public int taille() {
		int rtr = 0;
		for (Arbre<T> arbre : fils) {
			rtr+= arbre.taille();
		}
		return rtr;
	}

	@Override
	public boolean contient(T val) {
		for (Arbre<T> f: fils) {
			if(f.contient(val)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Set<T> valeurs() {
		Set<T> rtr = new HashSet<>();
		for (final Arbre<T> arbre : fils) {
			rtr.addAll(arbre.valeurs());
		}
		return rtr;
	}

	@Override
	public T somme() {
		if (fils == null || fils.size() == 0){
			return null;
		}
		T rtr = fils.get(0).somme();
		for (int i = 1; i < fils.size(); i++) {
			rtr = rtr.ajouter(fils.get(i).somme());
		}
		return rtr;
	}

	@Override
	public T min() {
		if (fils == null || fils.size() == 0){
			return null;
		}
		T rtr = fils.get(0).somme();
		for (int i = 0; i < fils.size() ; i++) {

		}

		return rtr;
	}

	@Override
	public T max() {
		return null;
	}

	@Override
	public boolean estTrie() {
		return false;
	}
}
