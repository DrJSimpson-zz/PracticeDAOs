package edu.daos;

import java.util.ArrayList;
import java.util.List;

public class StringDAOImpl implements GenericDAO<String> {

	List<String> stringList;
	
	@Override
	public List<String> getAll() {
		return this.stringList;
	}

	@Override
	public List<String> getByID(String id) {
		List<String> toReturn = new ArrayList<String>();
		for (int i =0; i < stringList.size(); i++) {
			if (stringList.get(i).equals(id)) {
				toReturn.add(stringList.get(i));
			}
		}
		return toReturn;
	}

	@Override
	public boolean delete(String toDelete) {
		return false;
	}

	@Override
	public boolean add(String toAdd) {
		this.stringList.add(toAdd);
		return true;
	}

	@Override
	public void modify(String idkIfThisWorks) {
		// TODO hacerlo
		
	}

	@Override
	public void show() {
		for(String s : stringList) {
			System.out.println(s);
		}
	}

	public StringDAOImpl() {
		super();
		this.stringList = new ArrayList<String>();
		this.stringList.add("A");
		this.stringList.add("B");
		this.stringList.add("C");
		this.stringList.add("D");
		this.stringList.add("E");
		this.stringList.add("F");
		this.stringList.add("G");
		this.stringList.add("H");
	}
		
	
	
}
