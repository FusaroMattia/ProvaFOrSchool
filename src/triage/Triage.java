package triage;

public class Triage {
	Coda R1 = new Coda(); // Verde
	Coda R2 = new Coda(); // Giallo
	Coda R3 = new Coda(); // Rosso

	public void add(String persona, Rischio r) {
		if (r == Rischio.ROSSO) {
			R3.enqueue(persona, r);
		}
		if (r == Rischio.GIALLO) {
			R2.enqueue(persona, r);
		}
		if (r == Rischio.VERDE) {
			R1.enqueue(persona, r);
		}
	}

	public void Cura() {
		if (R3.isEmpty() != false) {
			R3.dequeue();
		} else {
			if (R2.isEmpty() != false) {
				R2.dequeue();
			} else {
				if (R1.isEmpty() != false) {
					R1.dequeue();
				}
			}
		}
	}

	public void Escili(){
		System.out.println("CODA VERDE");
		System.out.println(R1);
		System.out.println("CODA GIALLA");
		System.out.println(R2);
		System.out.println("CODA ROSSA");
		System.out.println(R3);
	}
	
}
