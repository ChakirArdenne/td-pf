package td.td1.exo2.main;

import td.td1.exo2.model.Paire;
import td.td1.exo2.model.PaireImpl;

public class Main {
	public static void main(String[] args) {
		Paire<Integer,String> p1 = new PaireImpl<>(1,"un");
		System.out.println(p1.toString());

		Paire<Double,String> p2 = p1.changeFst(1.2);
		System.out.println(p2.toString());

		Paire<Double,Paire<Integer,String>> p3 = p2.changeSnd(p1);
		System.out.println(p3.toString());
	}
}
