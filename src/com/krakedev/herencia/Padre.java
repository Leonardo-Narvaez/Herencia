package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;

	public int getDefectos() {
		return defectos;
	}

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}

	public int getVirtudes() {
		return virtudes;
	}

	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}

	public void imprimir() {
		System.out.println("Virtudes: " + virtudes);
		System.out.println("Defectos: " + defectos);
	}

	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}

	public Padre() {
		System.out.println("Soy el constructor vacio del padre");
	}

	public Padre(int virtudes, int defectos) {
		this.virtudes = virtudes;     //CONSTRUCTOR CREADO PARA SUPER(...)
		this.defectos = defectos;
	}

	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
	}

}
