package triage;

public class Coda {
	private Nodo head;
	private Nodo tail;

	public Coda() {
		head = null;
		tail = null;
	}

	private Nodo creaNodo(String persona, Rischio r, Nodo link) {
		Nodo p = new Nodo(persona, r);
		p.setLink(link);
		return p;
	}

	public void enqueue(String persona, Rischio r) {
		Nodo p = creaNodo(persona, r, null);
		if (head == null) {
			tail = p;
			head = tail;
		} else {
			tail.setLink(p);
			tail = p;
		}
	}

	public String dequeue() {
		Nodo p;
		if (head == null)
			return null;
		p = head;
		head = head.getLink();
		if (head == null)
			tail = null;
		return p.getInfo();
	}

}