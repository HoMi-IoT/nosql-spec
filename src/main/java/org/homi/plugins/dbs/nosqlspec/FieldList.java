package org.homi.plugins.dbs.nosqlspec;

import java.util.ArrayList;
import java.util.List;

public class FieldList implements Component{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3897006711473584124L;
	private List<Component> list;

	
	public FieldList() {
		
		list = new ArrayList<Component>();
	}
	
	public void addComponent(Component c) {
		this.list.add(c);
	}

	@Override
	public <R> R getValue() {
		// TODO Auto-generated method stub
		return (R) list;
	}

	@Override
	public String printComponent(int indent) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("[\n");
		for(Component c : list) {
			sb.append(this.indent(indent) + c.printComponent(indent+1) + ", \n" );
		}
		sb.append(this.indent(indent)+"]");
		return sb.toString();
	}
	

}
