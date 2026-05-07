package com.krakedev.herencia;

public class Hija extends Padre {

	public void escucharBadBunny() {
		System.out.println("Escuchando esta musica horrible");
	}

	@Override
	public String toString() {
		return "Hija [nombre= " + getNombre() + "defectos= " + getDefectos() + ", virtudes= " + getVirtudes()
				+ ", total Ahorrado " + getTotalAhorrado() + "]";
	}

}
