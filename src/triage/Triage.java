package triage;

public class Triage {
	Coda R1 = new Coda(); // Verde
	Coda R2 = new Coda(); // Giallo
	Coda R3 = new Coda(); // Rosso

	
	public void add(String persona,Rischio r){
		if(r == Rischio.ROSSO){
			R3.enqueue(persona, r);
		}
		if(r == Rischio.GIALLO){
			R2.enqueue(persona, r);
		}
        if(r == Rischio.VERDE){
        	R1.enqueue(persona, r);
		}
	}
	public void Cura(){
		 
	}
}
