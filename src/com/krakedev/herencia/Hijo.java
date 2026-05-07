package com.krakedev.herencia;

public class Hijo extends Padre {
	private int juguetes;

	public Hijo(int virtudes, int defectos, int juguetes) {
		super(virtudes, defectos); // SE CREA EL CONSTRUCTOR EN PADRE
		this.juguetes = juguetes;
	}

	@Override
	public String toString() {

		return "Padre [defectos=" + this.getDefectos() + ", virtudes=" + this.getVirtudes() + ", juguetes=" + juguetes
				+ "]";
	}
}
