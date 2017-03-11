package edu.daos;

import java.util.Scanner;

public class Main {

	private static GenericDAO<String> lista;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int option = s.nextInt();
		
		if (option == 1) {
			lista = new StringDAOImpl();
		} else {
			lista = new StringDaoImplFailer();
		}
		lista.show();
		
		VistaDeUnDAO<String> vista = new VistaDeUnDAO<String>(lista);
		vista.show();
	}

}
