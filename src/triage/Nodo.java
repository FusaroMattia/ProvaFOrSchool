package triage;

public class Nodo {
	private Rischio rischio;
	private String info;
	private Nodo link;

	public Rischio getRischio() {
		return rischio;
	}

	public void setRischio(Rischio rischio) {
		this.rischio = rischio;
	}

	public Nodo(String oggetto, Rischio r) {
		info = new String(oggetto);
		rischio = r;
		link = null;
	}

	public void setInfo(String oggetto) {
		info = new String(oggetto);
	}

	public String getInfo() {
		return new String(info);
	}

	public void setLink(Nodo link) {
		this.link = link;
	}

	public Nodo getLink() {
		return link;
	}
}
