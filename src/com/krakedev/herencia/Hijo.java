package com.krakedev.herencia;

public class Hijo extends Padre {
	private int juguetes;

	public Hijo(int virtudes, int defectos, int juguetes) {
		super("Manolo", virtudes, defectos); // SE CREA EL CONSTRUCTOR EN PADRE
		this.juguetes = juguetes;
	}

	public Hijo() {
	}

	@Override
	public String toString() {

		return "Hijo [nombre= " + getNombre() + "defectos= " + getDefectos() + ", virtudes= " + getVirtudes()
				+ ", juguetes =" + juguetes + ", total Ahorrado " + getTotalAhorrado() + "]";
	}

	@Override
	public void ahorrar(double monto) {
		setTotalAhorrado(monto * 0.5);
	}
}
