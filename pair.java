package Homework6;

public class pair<F, S> {

	private F fisrt;
	private S second;

	public pair(F fisrt, S second) {
		super();
		this.fisrt = fisrt;
		this.second = second;
	}

	public F getFisrt() {
		return fisrt;
	}

	public void setFisrt(F fisrt) {
		this.fisrt = fisrt;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "pair [fisrt=" + fisrt + ", second=" + second + "]";
	}

}
