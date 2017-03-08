package triage;

public class Main {

	public static void main(String[] args) {
		Triage triage = new Triage();
		triage.add("Toni", Rischio.ROSSO);
		triage.add("Bepi", Rischio.VERDE);
		triage.add("Alex", Rischio.GIALLO);
		triage.add("Izzo", Rischio.ROSSO);
		triage.add("Van", Rischio.GIALLO);
		triage.Cura();
		triage.Escili();
	}
}
