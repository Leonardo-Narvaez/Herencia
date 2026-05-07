package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre padre = new Padre("Manolo", 6, 7);
		padre.ahorrar(958.36);
		System.out.println(padre);

		Hija hija = new Hija();
		hija.ahorrar(958.36);
		hija.setNombre("Sofia");
		System.out.println(hija);

		Hijo hijo = new Hijo();
		hijo.ahorrar(958.36);
		hijo.setNombre("Rasputio");
		System.out.println(hijo);

	}

}
