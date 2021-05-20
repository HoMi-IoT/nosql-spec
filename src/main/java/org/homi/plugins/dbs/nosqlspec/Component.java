package org.homi.plugins.dbs.nosqlspec;

import java.io.Serializable;

public interface Component extends Serializable{
	
	public default Class<?> getType(){
		return this.getClass();
	}
	
	public <R> R getValue();
	
	public String printComponent(int indent);
	public default String indent(int indent) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < indent; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
}
