package org.homi.plugins.dbs.nosqlspec;

import java.io.Serializable;

public class Value<T extends Serializable> implements Component{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5357339591108099094L;
	private T value;
	public Value(T val){
		this.value = val;
	}
	
	
	@Override
	public <R> R getValue() {
		return (R) this.value;
	}


	@Override
	public String printComponent(int indent) {
		// TODO Auto-generated method stub
		return this.getValue().toString();
	}
	

}
