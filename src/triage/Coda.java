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

	public boolean isEmpty() {
		if (head == null) {
		return false;
		}else{
		return true;	
		}
	}
	public String toString() {
		Nodo p = head;
		String lista;
		if (p == tail) // coda di un solo elemento?
			lista = new String("head/tail->");
		else
			lista = new String("head->");
		if (p == null)
			return lista + "null";
		while (p != null) {
			lista = lista + "[" + p.getInfo().toString() + "|";
			if (p.getLink() == tail)
				lista = lista + "+]-(tail)->";
			else {
				if (p.getLink() == null)
					lista = lista + "null]";
				else
					lista = lista + "+]->";
			}
			p = p.getLink();
		}
		return lista;
	}

}