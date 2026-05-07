package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class testArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Hija> hijas = new ArrayList<Hija>();

		Hija hija1 = new Hija();
		hija1.setDefectos(2);
		hija1.setVirtudes(4);

		Hija hija2 = new Hija();
		hija2.setDefectos(6);
		hija2.setVirtudes(1);

		Hija hija3 = new Hija();
		hija3.setDefectos(6);
		hija3.setVirtudes(1);

		hijas.add(hija1);
		hijas.add(hija2);
		hijas.add(hija3);

		System.out.println(hijas);
	}

}
