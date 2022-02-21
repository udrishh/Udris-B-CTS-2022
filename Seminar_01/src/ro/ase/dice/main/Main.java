package ro.ase.dice.main;

import ro.ase.dice.clase.Girafa;
import ro.ase.dice.clase.IngrijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

public class Main {

	public static void main(String[] args) {
		IngrijitorZOO ingrijitorZoo = new IngrijitorZOO("Ingrijitor");
		
		Zebra z1 = new Zebra("Zebra1");
		Zebra z2 = new Zebra("Zebra2");
		
		Girafa g1 = new Girafa("Girafa1");
		Girafa g2 = new Girafa("Girafa2");
		
		ZOO zoo = new ZOO("Gradina Zoologica", ingrijitorZoo);
		
		zoo.adaugaAnimal(z1);
		zoo.adaugaAnimal(z2);
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		
		zoo.hranesteAnimale("iarba");
	}

}
