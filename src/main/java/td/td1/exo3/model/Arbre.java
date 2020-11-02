package td.td1.exo3.model;

import java.util.Set;

public interface Arbre<T extends Sommable<T>> {

	int taille(); // nombre de valeurs
	boolean contient(final T val); // vrai si val est contenue dans l'arbre, faux sinon
	Set<T> valeurs(); // ensemble des valeurs différentes dans l'arbre
	T somme();
}
