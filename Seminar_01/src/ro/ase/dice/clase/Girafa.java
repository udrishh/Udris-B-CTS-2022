package ro.ase.dice.clase;

public class Girafa extends Animal {

	public Girafa(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mananca(String mancare) {
		System.out.println("Girafa " + this.getNume() + " mananca " + mancare);
	}

}
