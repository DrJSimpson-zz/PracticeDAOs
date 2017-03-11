package edu.daos;

import java.util.List;

public interface GenericDAO<T> {
	public List<T> getAll();
	public List<T> getByID(String id);
	public boolean delete(T toDelete);
	public boolean add(T toAdd);
	public void modify(T idkIfThisWorks);
	public void show();
}
