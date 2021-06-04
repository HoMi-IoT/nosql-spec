package org.homi.plugins.dbs.nosqlspec.record;

import java.io.Serializable;

public class Value<T extends Serializable> implements IStorageComponent{
	
	private static final long serialVersionUID = -5357339591108099094L;
	private T value;
	
	public Value(T val){
		this.value = val;
	}
	
	public T getValue() {
		return value;
	}
	
	@Override
	public <R> R accept(IStorageComponentVisitor<R> qv) {
		return qv.visit(this);
	}

	
}
