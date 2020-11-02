package td.td1.exo2.model;

public class PaireImpl<T,V> implements Paire<T,V> {

	private T first;
	private V second;

	public PaireImpl(T first, V second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public T fst() {
		return first;
	}

	@Override
	public V snd() {
		return second;
	}

	@Override
	public <U> Paire<U, V> changeFst(U element) {
		return new PaireImpl<>(element, second);
	}

	@Override
	public <U> Paire<T, U> changeSnd(U element) {
		return new PaireImpl<>(first, element);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("(").append(first).append(",").append(second)
			.append(")").append("::").append("Paire[")
			.append(first.getClass().getSimpleName())
			.append(",").append(second.getClass().getSimpleName()).append("]");
		return sb.toString();
	}
}
