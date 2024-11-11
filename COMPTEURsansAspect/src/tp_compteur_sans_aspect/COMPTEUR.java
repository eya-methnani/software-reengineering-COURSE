package tp_compteur_sans_aspect;

public class COMPTEUR {
	private int val;

	public COMPTEUR(int val) {
		//super();
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Compteur [val=" + val + "]";
	}
	public void incrementer(int pas) {
		val+= pas;
	}
	public void decrementer(int pas) {
		val-= pas;
	}
}