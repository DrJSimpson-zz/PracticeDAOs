package edu.daos;

public class VistaDeUnDAO<T> {
	GenericDAO<T> data;
	
	public void show() {
		for (T dato : data.getAll()) {
			if (dato.equals("B")) {
				System.out.println("OMG ENCONTRE UNA B");
			}
			System.out.println("--------------------------");
			dato.toString();
		}
	}

	public VistaDeUnDAO(GenericDAO<T> data) {
		super();
		this.data = data;
	}
	
	
}
