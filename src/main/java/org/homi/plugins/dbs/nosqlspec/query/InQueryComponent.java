package org.homi.plugins.dbs.nosqlspec.query;

import java.io.Serializable;

public class InQueryComponent<T extends Serializable & Comparable<T>> implements IQueryComponent {

	private static final long serialVersionUID = 3389941163845985649L;

	private String key;
	private T[] values;

	public InQueryComponent(String key, T[] values) {
		this.key = key;
		this.values = values;
	}
	
	public String getKey() {
		return key;
	}
	
	public T[] getValues() {
		return values;
	}
	
	public T[] getQueryComponents() {
		return values;
	}
	
	@Override
	public <R> R accept(IQueryVisitor<R> qv) {
		return qv.visit(this);
	}

}
