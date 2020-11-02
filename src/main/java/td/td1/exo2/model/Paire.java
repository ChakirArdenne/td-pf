package td.td1.exo2.model;

public interface Paire<T,V> {
	T fst();
	V snd();
	<U> Paire<U,V> changeFst(U element);
	<U>	Paire<T,U> changeSnd(U element);
}
