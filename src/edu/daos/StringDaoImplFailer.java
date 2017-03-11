package edu.daos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringDaoImplFailer implements GenericDAO<String> {

	List<String> list;
	
	@Override
	public List<String> getAll() {
		return list;
	}

	@Override
	public List<String> getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String toDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(String toAdd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modify(String idkIfThisWorks) {
		//TODO
	}

	@Override
	public void show() {
		System.out.println("No jodas no lo quiero hacer");
	}

	public StringDaoImplFailer() {
		super();
		this.list = new LinkedList<String>();
		list.add("No");
		list.add("Jodas");
		list.add("pls");
	}
	
    	

}
