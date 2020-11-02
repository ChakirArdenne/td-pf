package td.td1.exo3.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre {

	private final List<Arbre> fils;

	public Noeud(final List<Arbre> fils) {
		this.fils = fils;
	}

	@Override
	public int taille() {
		int rtr = 0;
		for (Arbre arbre : fils) {
			rtr+= arbre.taille();
		}
		return rtr;
	}

	@Override
	public boolean contient(Integer val) {
		for (Arbre f: fils) {
			if(f.contient(val)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Set<Integer> valeurs() {
		Set<Integer> rtr = new HashSet<>();
		for (final Arbre arbre : fils) {
			rtr.addAll(arbre.valeurs());
		}
		return rtr;
	}

	@Override
	public Integer somme() {
		int rtr = 0;
		if (fils == null || fils.size() == 0) {
			return null;
		}
		for (final Arbre arbre : fils) {
			rtr += arbre.somme();
		}
		return rtr;
	}

	@Override
	public Integer min() {
		int rtr = fils.get(0).min();
		for (int i = 1; i < fils.size(); i++) {
			int min = fils.get(i).min();
			if (min < rtr) {
				rtr = min;
			}
		}
		return rtr;
	}

	@Override
	public Integer max() {
		int rtr = fils.get(0).max();
		for (int i = 1; i < fils.size(); i++) {
			int max = fils.get(i).max();
			if (max > rtr) {
				rtr = max;
			}
		}
		return rtr;
	}

	@Override
	public boolean estTrie() {
		return conditionTrie1() && conditionTrie2();
	}

	private boolean conditionTrie1(){
		for (Arbre arbre : fils) {
			if(arbre.estTrie()) {
				return true;
			}
		}
		return false;
	}

	private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            final Arbre fj = fils.get(i+1);
                if (fi.max() > fj.min())
                    return false;
        }
        return rtr;
    }
}
